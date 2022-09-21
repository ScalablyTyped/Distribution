package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersUpdatewebsecurityscannersettings
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the WebSecurityScannerSettings. Formats: * organizations/{organization\}/webSecurityScannerSettings * folders/{folder\}/webSecurityScannerSettings * projects/{project\}/webSecurityScannerSettings
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaWebSecurityScannerSettings] = js.undefined
  
  /**
    * The list of fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersUpdatewebsecurityscannersettings {
  
  inline def apply(): ParamsResourceFoldersUpdatewebsecurityscannersettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersUpdatewebsecurityscannersettings]
  }
  
  extension [Self <: ParamsResourceFoldersUpdatewebsecurityscannersettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaWebSecurityScannerSettings): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
