package typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility extends StObject {
  
  /**
    * An entry in the eligibilities map specifies an eligibility for a particular SLI for the given instance. The SLI key in the name must be a valid SLI name specified in the Eligibility Exporter binary flags otherwise an error will be emitted by Eligibility Exporter and the oncaller will be alerted. If an SLI has been defined in the binary flags but the eligibilities map does not contain it, the corresponding SLI time series will not be emitted by the Eligibility Exporter. This ensures a smooth rollout and compatibility between the data produced by different versions of the Eligibility Exporters. If eligibilities map contains a key for an SLI which has not been declared in the binary flags, there will be an error message emitted in the Eligibility Exporter log and the metric for the SLI in question will not be emitted.
    */
  var eligibilities: js.UndefOr[
    StringDictionary[SchemaGoogleCloudSaasacceleratorManagementProvidersV1SloEligibility] | Null
  ] = js.undefined
}
object SchemaGoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility {
  
  inline def apply(): SchemaGoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility]
  }
  
  extension [Self <: SchemaGoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility](x: Self) {
    
    inline def setEligibilities(value: StringDictionary[SchemaGoogleCloudSaasacceleratorManagementProvidersV1SloEligibility]): Self = StObject.set(x, "eligibilities", value.asInstanceOf[js.Any])
    
    inline def setEligibilitiesNull: Self = StObject.set(x, "eligibilities", null)
    
    inline def setEligibilitiesUndefined: Self = StObject.set(x, "eligibilities", js.undefined)
  }
}
