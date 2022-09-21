package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsScriptTypeAddOnEntryPoint extends StObject {
  
  /**
    * The add-on's required list of supported container types.
    */
  var addOnType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The add-on's optional description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The add-on's optional help URL.
    */
  var helpUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The add-on's required post install tip URL.
    */
  var postInstallTipUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The add-on's optional report issue URL.
    */
  var reportIssueUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The add-on's required title.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsScriptTypeAddOnEntryPoint {
  
  inline def apply(): SchemaGoogleAppsScriptTypeAddOnEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeAddOnEntryPoint]
  }
  
  extension [Self <: SchemaGoogleAppsScriptTypeAddOnEntryPoint](x: Self) {
    
    inline def setAddOnType(value: String): Self = StObject.set(x, "addOnType", value.asInstanceOf[js.Any])
    
    inline def setAddOnTypeNull: Self = StObject.set(x, "addOnType", null)
    
    inline def setAddOnTypeUndefined: Self = StObject.set(x, "addOnType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHelpUrl(value: String): Self = StObject.set(x, "helpUrl", value.asInstanceOf[js.Any])
    
    inline def setHelpUrlNull: Self = StObject.set(x, "helpUrl", null)
    
    inline def setHelpUrlUndefined: Self = StObject.set(x, "helpUrl", js.undefined)
    
    inline def setPostInstallTipUrl(value: String): Self = StObject.set(x, "postInstallTipUrl", value.asInstanceOf[js.Any])
    
    inline def setPostInstallTipUrlNull: Self = StObject.set(x, "postInstallTipUrl", null)
    
    inline def setPostInstallTipUrlUndefined: Self = StObject.set(x, "postInstallTipUrl", js.undefined)
    
    inline def setReportIssueUrl(value: String): Self = StObject.set(x, "reportIssueUrl", value.asInstanceOf[js.Any])
    
    inline def setReportIssueUrlNull: Self = StObject.set(x, "reportIssueUrl", null)
    
    inline def setReportIssueUrlUndefined: Self = StObject.set(x, "reportIssueUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
