package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerRegisterPluginObject[T]
  extends StObject
     with ServerRegisterOptions {
  
  /**
    * options passed to the plugin during registration.
    */
  var options: js.UndefOr[T] = js.undefined
  
  /**
    * a plugin object.
    */
  var plugin: Plugin[T]
}
object ServerRegisterPluginObject {
  
  @scala.inline
  def apply[T](plugin: Plugin[T]): ServerRegisterPluginObject[T] = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRegisterPluginObject[T]]
  }
  
  @scala.inline
  implicit class ServerRegisterPluginObjectMutableBuilder[Self <: ServerRegisterPluginObject[?], T] (val x: Self & ServerRegisterPluginObject[T]) extends AnyVal {
    
    @scala.inline
    def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPlugin(value: Plugin[T]): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
  }
}
