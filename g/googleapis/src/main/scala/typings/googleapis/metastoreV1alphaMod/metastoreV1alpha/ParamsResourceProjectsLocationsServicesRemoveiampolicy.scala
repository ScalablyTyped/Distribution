package typings.googleapis.metastoreV1alphaMod.metastoreV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServicesRemoveiampolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRemoveIamPolicyRequest] = js.undefined
  
  /**
    * Required. The relative resource name of the dataplane resource to remove IAM policy, in the following form:projects/{project_id\}/locations/{location_id\}/services/{service_id\}/databases/{database_id\} or projects/{project_id\}/locations/{location_id\}/services/{service_id\}/databases/{database_id\}/tables/{table_id\}.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsServicesRemoveiampolicy {
  
  inline def apply(): ParamsResourceProjectsLocationsServicesRemoveiampolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServicesRemoveiampolicy]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServicesRemoveiampolicy](x: Self) {
    
    inline def setRequestBody(value: SchemaRemoveIamPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
