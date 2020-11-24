package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerRegisterPluginObject[T] extends ServerRegisterOptions {
  
  /**
    * options passed to the plugin during registration.
    */
  var options: js.UndefOr[T] = js.native
  
  /**
    * a plugin object.
    */
  var plugin: Plugin[T] = js.native
}
object ServerRegisterPluginObject {
  
  @scala.inline
  def apply[T](plugin: Plugin[T]): ServerRegisterPluginObject[T] = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRegisterPluginObject[T]]
  }
  
  @scala.inline
  implicit class ServerRegisterPluginObjectOps[Self <: ServerRegisterPluginObject[_], T] (val x: Self with ServerRegisterPluginObject[T]) extends AnyVal {
    
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
    def setPlugin(value: Plugin[T]): Self = this.set("plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: T): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
