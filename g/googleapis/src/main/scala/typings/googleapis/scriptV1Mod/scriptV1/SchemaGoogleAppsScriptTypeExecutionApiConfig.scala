package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * API executable entry point configuration.
  */
@js.native
trait SchemaGoogleAppsScriptTypeExecutionApiConfig extends js.Object {
  
  /**
    * Who has permission to run the API executable.
    */
  var access: js.UndefOr[String] = js.native
}
object SchemaGoogleAppsScriptTypeExecutionApiConfig {
  
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeExecutionApiConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeExecutionApiConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeExecutionApiConfigOps[Self <: SchemaGoogleAppsScriptTypeExecutionApiConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccess(value: String): Self = this.set("access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
  }
}
