package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSourcesFindingsSetmute
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the finding. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/{organization_id\}/sources/{source_id\}/finding/{finding_id\}", "folders/{folder_id\}/sources/{source_id\}/finding/{finding_id\}", "projects/{project_id\}/sources/{source_id\}/finding/{finding_id\}".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSetMuteRequest] = js.undefined
}
object ParamsResourceProjectsSourcesFindingsSetmute {
  
  inline def apply(): ParamsResourceProjectsSourcesFindingsSetmute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSourcesFindingsSetmute]
  }
  
  extension [Self <: ParamsResourceProjectsSourcesFindingsSetmute](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaSetMuteRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
