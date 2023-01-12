package typings.hapiGlue

import typings.hapiGlue.mod.PluginObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Plugins extends StObject {
    
    var plugins: js.Array[PluginObject | String]
  }
  object Plugins {
    
    inline def apply(plugins: js.Array[PluginObject | String]): Plugins = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugins]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
      
      inline def setPlugins(value: js.Array[PluginObject | String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: (PluginObject | String)*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
}
