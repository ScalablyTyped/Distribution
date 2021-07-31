package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A configuration that defines how a deployment is accessed externally.
  */
trait SchemaEntryPoint extends StObject {
  
  /**
    * Add-on properties.
    */
  var addOn: js.UndefOr[SchemaGoogleAppsScriptTypeAddOnEntryPoint] = js.undefined
  
  /**
    * The type of the entry point.
    */
  var entryPointType: js.UndefOr[String] = js.undefined
  
  /**
    * An entry point specification for Apps Script API execution calls.
    */
  var executionApi: js.UndefOr[SchemaGoogleAppsScriptTypeExecutionApiEntryPoint] = js.undefined
  
  /**
    * An entry point specification for web apps.
    */
  var webApp: js.UndefOr[SchemaGoogleAppsScriptTypeWebAppEntryPoint] = js.undefined
}
object SchemaEntryPoint {
  
  @scala.inline
  def apply(): SchemaEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntryPoint]
  }
  
  @scala.inline
  implicit class SchemaEntryPointMutableBuilder[Self <: SchemaEntryPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOn(value: SchemaGoogleAppsScriptTypeAddOnEntryPoint): Self = StObject.set(x, "addOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnUndefined: Self = StObject.set(x, "addOn", js.undefined)
    
    @scala.inline
    def setEntryPointType(value: String): Self = StObject.set(x, "entryPointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPointTypeUndefined: Self = StObject.set(x, "entryPointType", js.undefined)
    
    @scala.inline
    def setExecutionApi(value: SchemaGoogleAppsScriptTypeExecutionApiEntryPoint): Self = StObject.set(x, "executionApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionApiUndefined: Self = StObject.set(x, "executionApi", js.undefined)
    
    @scala.inline
    def setWebApp(value: SchemaGoogleAppsScriptTypeWebAppEntryPoint): Self = StObject.set(x, "webApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAppUndefined: Self = StObject.set(x, "webApp", js.undefined)
  }
}
