package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGuestpoliciesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The logical name of the guest policy in the project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
    */
  var guestPolicyId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the parent using one of the following forms: `projects/{project_number\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGuestPolicy] = js.undefined
}
object ParamsResourceProjectsGuestpoliciesCreate {
  
  inline def apply(): ParamsResourceProjectsGuestpoliciesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGuestpoliciesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsGuestpoliciesCreate](x: Self) {
    
    inline def setGuestPolicyId(value: String): Self = StObject.set(x, "guestPolicyId", value.asInstanceOf[js.Any])
    
    inline def setGuestPolicyIdUndefined: Self = StObject.set(x, "guestPolicyId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGuestPolicy): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
