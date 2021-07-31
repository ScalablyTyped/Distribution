package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * API executable entry point configuration.
  */
trait SchemaGoogleAppsScriptTypeExecutionApiConfig extends StObject {
  
  /**
    * Who has permission to run the API executable.
    */
  var access: js.UndefOr[String] = js.undefined
}
object SchemaGoogleAppsScriptTypeExecutionApiConfig {
  
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeExecutionApiConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeExecutionApiConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeExecutionApiConfigMutableBuilder[Self <: SchemaGoogleAppsScriptTypeExecutionApiConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
  }
}
