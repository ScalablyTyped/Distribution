package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An API executable entry point.
  */
trait SchemaGoogleAppsScriptTypeExecutionApiEntryPoint extends StObject {
  
  /**
    * The entry point&#39;s configuration.
    */
  var entryPointConfig: js.UndefOr[SchemaGoogleAppsScriptTypeExecutionApiConfig] = js.undefined
}
object SchemaGoogleAppsScriptTypeExecutionApiEntryPoint {
  
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeExecutionApiEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeExecutionApiEntryPoint]
  }
  
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeExecutionApiEntryPointMutableBuilder[Self <: SchemaGoogleAppsScriptTypeExecutionApiEntryPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntryPointConfig(value: SchemaGoogleAppsScriptTypeExecutionApiConfig): Self = StObject.set(x, "entryPointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPointConfigUndefined: Self = StObject.set(x, "entryPointConfig", js.undefined)
  }
}
