package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ServerRegisterPluginObjectMutableBuilder[Self <: ServerRegisterPluginObject[_], T] (val x: Self with ServerRegisterPluginObject[T]) extends AnyVal {
    
    @scala.inline
    def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPlugin(value: Plugin[T]): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
  }
}
