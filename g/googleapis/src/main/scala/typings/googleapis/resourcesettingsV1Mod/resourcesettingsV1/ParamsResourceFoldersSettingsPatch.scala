package typings.googleapis.resourcesettingsV1Mod.resourcesettingsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersSettingsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the setting. Must be in one of the following forms: * `projects/{project_number\}/settings/{setting_name\}` * `folders/{folder_id\}/settings/{setting_name\}` * `organizations/{organization_id\}/settings/{setting_name\}` For example, "/projects/123/settings/gcp-enableMyFeature"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudResourcesettingsV1Setting] = js.undefined
}
object ParamsResourceFoldersSettingsPatch {
  
  inline def apply(): ParamsResourceFoldersSettingsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersSettingsPatch]
  }
  
  extension [Self <: ParamsResourceFoldersSettingsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudResourcesettingsV1Setting): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
