package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsBigqueryexportsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Unique identifier provided by the client within the parent scope. It must consist of lower case letters, numbers, and hyphen, with the first character a letter, the last a letter or a number, and a 63 character maximum.
    */
  var bigQueryExportId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name of the new big query export's parent. Its format is "organizations/[organization_id]", "folders/[folder_id]", or "projects/[project_id]".
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudSecuritycenterV1BigQueryExport] = js.undefined
}
object ParamsResourceOrganizationsBigqueryexportsCreate {
  
  inline def apply(): ParamsResourceOrganizationsBigqueryexportsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsBigqueryexportsCreate]
  }
  
  extension [Self <: ParamsResourceOrganizationsBigqueryexportsCreate](x: Self) {
    
    inline def setBigQueryExportId(value: String): Self = StObject.set(x, "bigQueryExportId", value.asInstanceOf[js.Any])
    
    inline def setBigQueryExportIdUndefined: Self = StObject.set(x, "bigQueryExportId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudSecuritycenterV1BigQueryExport): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
