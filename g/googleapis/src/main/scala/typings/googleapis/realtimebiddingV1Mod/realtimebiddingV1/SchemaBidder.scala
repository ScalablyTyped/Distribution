package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBidder extends StObject {
  
  /**
    * Output only. A flag to bypass pretargeting for private auctions and preferred deals. When true, bid requests from these nonguaranteed deals will always be sent. When false, bid requests will be subject to regular pretargeting configurations. Programmatic Guaranteed deals will always be sent to the bidder, regardless of the value for this flag. Auction packages are not impacted by this value and are subject to the regular pretargeting configurations.
    */
  var bypassNonguaranteedDealsPretargeting: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The buyer's network ID used for cookie matching. This ID corresponds to the `google_nid` parameter in the URL used in cookie match requests. Refer to https://developers.google.com/authorized-buyers/rtb/cookie-guide for further information.
    */
  var cookieMatchingNetworkId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The base URL used in cookie match requests. Refer to https://developers.google.com/authorized-buyers/rtb/cookie-guide for further information.
    */
  var cookieMatchingUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The billing ID for the deals pretargeting config. This billing ID is sent on the bid request for guaranteed and nonguaranteed deals matched in pretargeting.
    */
  var dealsBillingId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Name of the bidder resource that must follow the pattern `bidders/{bidderAccountId\}`, where `{bidderAccountId\}` is the account ID of the bidder whose information is to be received. One can get their account ID on the Authorized Buyers or Open Bidding UI, or by contacting their Google account manager.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaBidder {
  
  inline def apply(): SchemaBidder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBidder]
  }
  
  extension [Self <: SchemaBidder](x: Self) {
    
    inline def setBypassNonguaranteedDealsPretargeting(value: Boolean): Self = StObject.set(x, "bypassNonguaranteedDealsPretargeting", value.asInstanceOf[js.Any])
    
    inline def setBypassNonguaranteedDealsPretargetingNull: Self = StObject.set(x, "bypassNonguaranteedDealsPretargeting", null)
    
    inline def setBypassNonguaranteedDealsPretargetingUndefined: Self = StObject.set(x, "bypassNonguaranteedDealsPretargeting", js.undefined)
    
    inline def setCookieMatchingNetworkId(value: String): Self = StObject.set(x, "cookieMatchingNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCookieMatchingNetworkIdNull: Self = StObject.set(x, "cookieMatchingNetworkId", null)
    
    inline def setCookieMatchingNetworkIdUndefined: Self = StObject.set(x, "cookieMatchingNetworkId", js.undefined)
    
    inline def setCookieMatchingUrl(value: String): Self = StObject.set(x, "cookieMatchingUrl", value.asInstanceOf[js.Any])
    
    inline def setCookieMatchingUrlNull: Self = StObject.set(x, "cookieMatchingUrl", null)
    
    inline def setCookieMatchingUrlUndefined: Self = StObject.set(x, "cookieMatchingUrl", js.undefined)
    
    inline def setDealsBillingId(value: String): Self = StObject.set(x, "dealsBillingId", value.asInstanceOf[js.Any])
    
    inline def setDealsBillingIdNull: Self = StObject.set(x, "dealsBillingId", null)
    
    inline def setDealsBillingIdUndefined: Self = StObject.set(x, "dealsBillingId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
