package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionalTaxRateInfo extends StObject {
  
  /** You must tell us if your app contains streaming products to correctly charge US state and local sales tax. Field only supported in United States. */
  var eligibleForStreamingServiceTaxRate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Tax tier to specify reduced tax rate. Developers who sell digital news, magazines, newspapers, books, or audiobooks in various regions may be eligible for reduced tax rates. [Learn
    * more](https://support.google.com/googleplay/android-developer/answer/10463498).
    */
  var taxTier: js.UndefOr[String] = js.undefined
}
object RegionalTaxRateInfo {
  
  inline def apply(): RegionalTaxRateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionalTaxRateInfo]
  }
  
  extension [Self <: RegionalTaxRateInfo](x: Self) {
    
    inline def setEligibleForStreamingServiceTaxRate(value: Boolean): Self = StObject.set(x, "eligibleForStreamingServiceTaxRate", value.asInstanceOf[js.Any])
    
    inline def setEligibleForStreamingServiceTaxRateUndefined: Self = StObject.set(x, "eligibleForStreamingServiceTaxRate", js.undefined)
    
    inline def setTaxTier(value: String): Self = StObject.set(x, "taxTier", value.asInstanceOf[js.Any])
    
    inline def setTaxTierUndefined: Self = StObject.set(x, "taxTier", js.undefined)
  }
}
