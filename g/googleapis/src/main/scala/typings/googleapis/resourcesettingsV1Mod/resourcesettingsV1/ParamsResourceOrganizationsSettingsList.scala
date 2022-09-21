package typings.googleapis.resourcesettingsV1Mod.resourcesettingsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsSettingsList
  extends StObject
     with StandardParameters {
  
  /**
    * Unused. The size of the page to be returned.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Unused. A page token used to retrieve the next page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The project, folder, or organization that is the parent resource for this setting. Must be in one of the following forms: * `projects/{project_number\}` * `projects/{project_id\}` * `folders/{folder_id\}` * `organizations/{organization_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The SettingView for this request.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsSettingsList {
  
  inline def apply(): ParamsResourceOrganizationsSettingsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsSettingsList]
  }
  
  extension [Self <: ParamsResourceOrganizationsSettingsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
