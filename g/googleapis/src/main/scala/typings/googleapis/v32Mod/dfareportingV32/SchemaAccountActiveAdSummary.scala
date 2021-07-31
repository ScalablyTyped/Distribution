package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gets a summary of active ads in an account.
  */
trait SchemaAccountActiveAdSummary extends StObject {
  
  /**
    * ID of the account.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Ads that have been activated for the account
    */
  var activeAds: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of active ads allowed for the account.
    */
  var activeAdsLimitTier: js.UndefOr[String] = js.undefined
  
  /**
    * Ads that can be activated for the account.
    */
  var availableAds: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountActiveAdSummary&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaAccountActiveAdSummary {
  
  @scala.inline
  def apply(): SchemaAccountActiveAdSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountActiveAdSummary]
  }
  
  @scala.inline
  implicit class SchemaAccountActiveAdSummaryMutableBuilder[Self <: SchemaAccountActiveAdSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setActiveAds(value: String): Self = StObject.set(x, "activeAds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveAdsLimitTier(value: String): Self = StObject.set(x, "activeAdsLimitTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveAdsLimitTierUndefined: Self = StObject.set(x, "activeAdsLimitTier", js.undefined)
    
    @scala.inline
    def setActiveAdsUndefined: Self = StObject.set(x, "activeAds", js.undefined)
    
    @scala.inline
    def setAvailableAds(value: String): Self = StObject.set(x, "availableAds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableAdsUndefined: Self = StObject.set(x, "availableAds", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
