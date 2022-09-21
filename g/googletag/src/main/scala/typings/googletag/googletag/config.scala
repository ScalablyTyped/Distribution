package typings.googletag.googletag

import typings.googletag.anon.AuctionSignals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the namespace that GPT uses for `config`.
  */
object config {
  
  /**
    * An object representing a single component auction in a on-device ad auction.
    *
    * **Experimental**: This feature may be changed or removed in a future release.
    *
    * **See also**
    * - [FLEDGE: Sellers Run On-Device Auctions](https://github.com/WICG/turtledove/blob/main/FLEDGE.md#2-sellers-run-on-device-auctions)
    */
  trait ComponentAuctionConfig extends StObject {
    
    /**
      * An auction configuration object for this component auction.
      *
      * If this value is set to `null`, any existing configuration for the specified `configKey` will be deleted.
      *
      * **Example**
      * ```
      * var componentAuctionConfig = {
      *   seller: 'https://testSeller.com', // should be https and the same as
      *                                     // decisionLogicUrl's origin
      *   decisionLogicUrl: 'https://testSeller.com/ssp/decision-logic.js',
      *   interestGroupBuyers: [
      *     'https://example-buyer.com',
      *   ],
      *   auctionSignals: {auction_signals: 'auction_signals'},
      *   sellerSignals: {seller_signals: 'seller_signals'},
      *   perBuyerSignals: {
      *     // listed on interestGroupBuyers
      *     'https://example-buyer.com': {
      *       per_buyer_signals: 'per_buyer_signals',
      *     },
      *   },
      * };
      *
      * var auctionSlot = googletag.defineSlot('/1234567/example', [160, 600]);
      *
      * // To add configKey to the component auction:
      * auctionSlot.setConfig({
      *   componentAuction: [{
      *      configKey: 'https://testSeller.com',
      *      auctionConfig: componentAuctionConfig
      *   }]
      * });
      *
      * // To remove configKey from the component auction:
      * auctionSlot.setConfig({
      *   componentAuction: [{
      *      configKey: 'https://testSeller.com',
      *      auctionConfig: null
      *   }]
      * });
      * ```
      *
      * **See also**
      * - [FLEDGE: Initiating an On-Device Auction](https://github.com/WICG/turtledove/blob/main/FLEDGE.md#21-initiating-an-on-device-auction)
      */
    var auctionConfig: AuctionSignals | Null
    
    /**
      * The configuration key associated with this component auction.
      *
      * This value must be non-empty and should be unique.
      * If two {@link ComponentAuctionConfig} objects share the same configKey value, the last to be set will overwrite prior configurations.
      */
    var configKey: String
  }
  object ComponentAuctionConfig {
    
    inline def apply(configKey: String): ComponentAuctionConfig = {
      val __obj = js.Dynamic.literal(configKey = configKey.asInstanceOf[js.Any], auctionConfig = null)
      __obj.asInstanceOf[ComponentAuctionConfig]
    }
    
    extension [Self <: ComponentAuctionConfig](x: Self) {
      
      inline def setAuctionConfig(value: AuctionSignals): Self = StObject.set(x, "auctionConfig", value.asInstanceOf[js.Any])
      
      inline def setAuctionConfigNull: Self = StObject.set(x, "auctionConfig", null)
      
      inline def setConfigKey(value: String): Self = StObject.set(x, "configKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait SlotSettingsConfig extends StObject {
    
    /**
      * An array of component auctions to be included in an on-device ad auction.
      *
      * **Experimental**: This feature may be changed or removed in a future release.
      */
    var componentAuction: js.UndefOr[js.Array[ComponentAuctionConfig]] = js.undefined
  }
  object SlotSettingsConfig {
    
    inline def apply(): SlotSettingsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlotSettingsConfig]
    }
    
    extension [Self <: SlotSettingsConfig](x: Self) {
      
      inline def setComponentAuction(value: js.Array[ComponentAuctionConfig]): Self = StObject.set(x, "componentAuction", value.asInstanceOf[js.Any])
      
      inline def setComponentAuctionUndefined: Self = StObject.set(x, "componentAuction", js.undefined)
      
      inline def setComponentAuctionVarargs(value: ComponentAuctionConfig*): Self = StObject.set(x, "componentAuction", js.Array(value*))
    }
  }
}
