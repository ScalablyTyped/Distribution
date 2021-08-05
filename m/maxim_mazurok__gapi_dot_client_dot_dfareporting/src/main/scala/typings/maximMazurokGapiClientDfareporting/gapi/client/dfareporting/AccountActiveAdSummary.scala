package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountActiveAdSummary extends StObject {
  
  /** ID of the account. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Ads that have been activated for the account */
  var activeAds: js.UndefOr[String] = js.undefined
  
  /** Maximum number of active ads allowed for the account. */
  var activeAdsLimitTier: js.UndefOr[String] = js.undefined
  
  /** Ads that can be activated for the account. */
  var availableAds: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountActiveAdSummary". */
  var kind: js.UndefOr[String] = js.undefined
}
object AccountActiveAdSummary {
  
  inline def apply(): AccountActiveAdSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountActiveAdSummary]
  }
  
  extension [Self <: AccountActiveAdSummary](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setActiveAds(value: String): Self = StObject.set(x, "activeAds", value.asInstanceOf[js.Any])
    
    inline def setActiveAdsLimitTier(value: String): Self = StObject.set(x, "activeAdsLimitTier", value.asInstanceOf[js.Any])
    
    inline def setActiveAdsLimitTierUndefined: Self = StObject.set(x, "activeAdsLimitTier", js.undefined)
    
    inline def setActiveAdsUndefined: Self = StObject.set(x, "activeAds", js.undefined)
    
    inline def setAvailableAds(value: String): Self = StObject.set(x, "availableAds", value.asInstanceOf[js.Any])
    
    inline def setAvailableAdsUndefined: Self = StObject.set(x, "availableAds", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
