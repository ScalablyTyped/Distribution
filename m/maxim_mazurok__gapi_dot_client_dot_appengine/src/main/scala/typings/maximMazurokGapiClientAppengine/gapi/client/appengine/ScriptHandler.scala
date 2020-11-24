package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptHandler extends js.Object {
  
  /** Path to the script from the application root directory. */
  var scriptPath: js.UndefOr[String] = js.native
}
object ScriptHandler {
  
  @scala.inline
  def apply(): ScriptHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptHandler]
  }
  
  @scala.inline
  implicit class ScriptHandlerOps[Self <: ScriptHandler] (val x: Self) extends AnyVal {
    
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
    def setScriptPath(value: String): Self = this.set("scriptPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptPath: Self = this.set("scriptPath", js.undefined)
  }
}
