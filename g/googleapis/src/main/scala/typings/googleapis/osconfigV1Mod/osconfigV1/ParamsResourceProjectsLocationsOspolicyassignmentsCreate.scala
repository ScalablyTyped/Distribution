package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsOspolicyassignmentsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The logical name of the OS policy assignment in the project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
    */
  var osPolicyAssignmentId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource name in the form: projects/{project\}/locations/{location\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaOSPolicyAssignment] = js.undefined
}
object ParamsResourceProjectsLocationsOspolicyassignmentsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsOspolicyassignmentsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsOspolicyassignmentsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsOspolicyassignmentsCreate](x: Self) {
    
    inline def setOsPolicyAssignmentId(value: String): Self = StObject.set(x, "osPolicyAssignmentId", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyAssignmentIdUndefined: Self = StObject.set(x, "osPolicyAssignmentId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaOSPolicyAssignment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
