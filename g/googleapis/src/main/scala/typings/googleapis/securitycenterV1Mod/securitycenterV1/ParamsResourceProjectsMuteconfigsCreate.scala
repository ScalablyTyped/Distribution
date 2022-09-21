package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsMuteconfigsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Unique identifier provided by the client within the parent scope. It must consist of lower case letters, numbers, and hyphen, with the first character a letter, the last a letter or a number, and a 63 character maximum.
    */
  var muteConfigId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name of the new mute configs's parent. Its format is "organizations/[organization_id]", "folders/[folder_id]", or "projects/[project_id]".
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudSecuritycenterV1MuteConfig] = js.undefined
}
object ParamsResourceProjectsMuteconfigsCreate {
  
  inline def apply(): ParamsResourceProjectsMuteconfigsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsMuteconfigsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsMuteconfigsCreate](x: Self) {
    
    inline def setMuteConfigId(value: String): Self = StObject.set(x, "muteConfigId", value.asInstanceOf[js.Any])
    
    inline def setMuteConfigIdUndefined: Self = StObject.set(x, "muteConfigId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudSecuritycenterV1MuteConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
