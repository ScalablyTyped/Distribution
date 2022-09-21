package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountActiveAdSummary extends StObject {
  
  /**
    * ID of the account.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ads that have been activated for the account
    */
  var activeAds: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum number of active ads allowed for the account.
    */
  var activeAdsLimitTier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ads that can be activated for the account.
    */
  var availableAds: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountActiveAdSummary".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountActiveAdSummary {
  
  inline def apply(): SchemaAccountActiveAdSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountActiveAdSummary]
  }
  
  extension [Self <: SchemaAccountActiveAdSummary](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setActiveAds(value: String): Self = StObject.set(x, "activeAds", value.asInstanceOf[js.Any])
    
    inline def setActiveAdsLimitTier(value: String): Self = StObject.set(x, "activeAdsLimitTier", value.asInstanceOf[js.Any])
    
    inline def setActiveAdsLimitTierNull: Self = StObject.set(x, "activeAdsLimitTier", null)
    
    inline def setActiveAdsLimitTierUndefined: Self = StObject.set(x, "activeAdsLimitTier", js.undefined)
    
    inline def setActiveAdsNull: Self = StObject.set(x, "activeAds", null)
    
    inline def setActiveAdsUndefined: Self = StObject.set(x, "activeAds", js.undefined)
    
    inline def setAvailableAds(value: String): Self = StObject.set(x, "availableAds", value.asInstanceOf[js.Any])
    
    inline def setAvailableAdsNull: Self = StObject.set(x, "availableAds", null)
    
    inline def setAvailableAdsUndefined: Self = StObject.set(x, "availableAds", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
