package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGuestpoliciesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Unique name of the resource in this project using one of the following forms: `projects/{project_number\}/guestPolicies/{guest_policy_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGuestPolicy] = js.undefined
  
  /**
    * Field mask that controls which fields of the guest policy should be updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGuestpoliciesPatch {
  
  inline def apply(): ParamsResourceProjectsGuestpoliciesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGuestpoliciesPatch]
  }
  
  extension [Self <: ParamsResourceProjectsGuestpoliciesPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGuestPolicy): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
