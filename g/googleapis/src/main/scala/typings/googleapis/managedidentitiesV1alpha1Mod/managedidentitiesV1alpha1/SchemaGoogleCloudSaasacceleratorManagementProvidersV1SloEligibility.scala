package typings.googleapis.managedidentitiesV1alpha1Mod.managedidentitiesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSaasacceleratorManagementProvidersV1SloEligibility extends StObject {
  
  /**
    * Whether an instance is eligible or ineligible.
    */
  var eligible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * User-defined reason for the current value of instance eligibility. Usually, this can be directly mapped to the internal state. An empty reason is allowed.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudSaasacceleratorManagementProvidersV1SloEligibility {
  
  inline def apply(): SchemaGoogleCloudSaasacceleratorManagementProvidersV1SloEligibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSaasacceleratorManagementProvidersV1SloEligibility]
  }
  
  extension [Self <: SchemaGoogleCloudSaasacceleratorManagementProvidersV1SloEligibility](x: Self) {
    
    inline def setEligible(value: Boolean): Self = StObject.set(x, "eligible", value.asInstanceOf[js.Any])
    
    inline def setEligibleNull: Self = StObject.set(x, "eligible", null)
    
    inline def setEligibleUndefined: Self = StObject.set(x, "eligible", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
