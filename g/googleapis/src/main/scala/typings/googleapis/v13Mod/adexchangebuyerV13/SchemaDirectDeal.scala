package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration data for an Ad Exchange direct deal.
  */
trait SchemaDirectDeal extends StObject {
  
  /**
    * The account id of the buyer this deal is for.
    */
  var accountId: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the advertiser this deal is for.
    */
  var advertiser: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the publisher for this deal is eligible for alcohol ads.
    */
  var allowsAlcohol: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The account id that this deal was negotiated for. It is either the buyer
    * or the client that this deal was negotiated on behalf of.
    */
  var buyerAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The currency code that applies to the fixed_cpm value. If not set then
    * assumed to be USD.
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * The deal type such as programmatic reservation or fixed price and so on.
    */
  var dealTier: js.UndefOr[String] = js.undefined
  
  /**
    * End time for when this deal stops being active. If not set then this deal
    * is valid until manually disabled by the publisher. In seconds since the
    * epoch.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * The fixed price for this direct deal. In cpm micros of currency according
    * to currency_code. If set, then this deal is eligible for the fixed price
    * tier of buying (highest priority, pay exactly the configured fixed
    * price).
    */
  var fixedCpm: js.UndefOr[String] = js.undefined
  
  /**
    * Deal id.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Deal name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum price for this direct deal. In cpm micros of currency
    * according to currency_code. If set, then this deal is eligible for the
    * private exchange tier of buying (below fixed price priority, run as a
    * second price auction).
    */
  var privateExchangeMinCpm: js.UndefOr[String] = js.undefined
  
  /**
    * If true, the publisher has opted to have their blocks ignored when a
    * creative is bid with for this deal.
    */
  var publisherBlocksOverriden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the publisher offering this direct deal.
    */
  var sellerNetwork: js.UndefOr[String] = js.undefined
  
  /**
    * Start time for when this deal becomes active. If not set then this deal
    * is active immediately upon creation. In seconds since the epoch.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object SchemaDirectDeal {
  
  inline def apply(): SchemaDirectDeal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectDeal]
  }
  
  extension [Self <: SchemaDirectDeal](x: Self) {
    
    inline def setAccountId(value: Double): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdvertiser(value: String): Self = StObject.set(x, "advertiser", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserUndefined: Self = StObject.set(x, "advertiser", js.undefined)
    
    inline def setAllowsAlcohol(value: Boolean): Self = StObject.set(x, "allowsAlcohol", value.asInstanceOf[js.Any])
    
    inline def setAllowsAlcoholUndefined: Self = StObject.set(x, "allowsAlcohol", js.undefined)
    
    inline def setBuyerAccountId(value: String): Self = StObject.set(x, "buyerAccountId", value.asInstanceOf[js.Any])
    
    inline def setBuyerAccountIdUndefined: Self = StObject.set(x, "buyerAccountId", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setDealTier(value: String): Self = StObject.set(x, "dealTier", value.asInstanceOf[js.Any])
    
    inline def setDealTierUndefined: Self = StObject.set(x, "dealTier", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFixedCpm(value: String): Self = StObject.set(x, "fixedCpm", value.asInstanceOf[js.Any])
    
    inline def setFixedCpmUndefined: Self = StObject.set(x, "fixedCpm", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrivateExchangeMinCpm(value: String): Self = StObject.set(x, "privateExchangeMinCpm", value.asInstanceOf[js.Any])
    
    inline def setPrivateExchangeMinCpmUndefined: Self = StObject.set(x, "privateExchangeMinCpm", js.undefined)
    
    inline def setPublisherBlocksOverriden(value: Boolean): Self = StObject.set(x, "publisherBlocksOverriden", value.asInstanceOf[js.Any])
    
    inline def setPublisherBlocksOverridenUndefined: Self = StObject.set(x, "publisherBlocksOverriden", js.undefined)
    
    inline def setSellerNetwork(value: String): Self = StObject.set(x, "sellerNetwork", value.asInstanceOf[js.Any])
    
    inline def setSellerNetworkUndefined: Self = StObject.set(x, "sellerNetwork", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
