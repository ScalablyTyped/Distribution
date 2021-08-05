package typings.less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PluginManager extends StObject {
    
    var pluginManager: typings.less.Less.PluginManager
  }
  object PluginManager {
    
    inline def apply(pluginManager: typings.less.Less.PluginManager): PluginManager = {
      val __obj = js.Dynamic.literal(pluginManager = pluginManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginManager]
    }
    
    extension [Self <: PluginManager](x: Self) {
      
      inline def setPluginManager(value: typings.less.Less.PluginManager): Self = StObject.set(x, "pluginManager", value.asInstanceOf[js.Any])
    }
  }
}
