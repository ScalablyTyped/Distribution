package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedProductTaxAndComplianceSettings extends StObject {
  
  /**
    * Digital content or service classification for products distributed to users in the European Economic Area (EEA). The withdrawal regime under EEA consumer laws depends on this
    * classification. Refer to the [Help Center article](https://support.google.com/googleplay/android-developer/answer/10463498) for more information.
    */
  var eeaWithdrawalRightType: js.UndefOr[String] = js.undefined
  
  /** A mapping from region code to tax rate details. The keys are region codes as defined by Unicode's "CLDR". */
  var taxRateInfoByRegionCode: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.androidpublisher.gapi.client.androidpublisher.RegionalTaxRateInfo} */ js.Any
  ] = js.undefined
}
object ManagedProductTaxAndComplianceSettings {
  
  inline def apply(): ManagedProductTaxAndComplianceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedProductTaxAndComplianceSettings]
  }
  
  extension [Self <: ManagedProductTaxAndComplianceSettings](x: Self) {
    
    inline def setEeaWithdrawalRightType(value: String): Self = StObject.set(x, "eeaWithdrawalRightType", value.asInstanceOf[js.Any])
    
    inline def setEeaWithdrawalRightTypeUndefined: Self = StObject.set(x, "eeaWithdrawalRightType", js.undefined)
    
    inline def setTaxRateInfoByRegionCode(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.androidpublisher.gapi.client.androidpublisher.RegionalTaxRateInfo} */ js.Any
    ): Self = StObject.set(x, "taxRateInfoByRegionCode", value.asInstanceOf[js.Any])
    
    inline def setTaxRateInfoByRegionCodeUndefined: Self = StObject.set(x, "taxRateInfoByRegionCode", js.undefined)
  }
}
