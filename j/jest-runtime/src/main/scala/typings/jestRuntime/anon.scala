package typings.jestRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Console extends StObject {
    
    var console: js.UndefOr[typings.std.Console] = js.undefined
    
    var maxWorkers: Double
    
    var watch: js.UndefOr[Boolean] = js.undefined
    
    var watchman: Boolean
  }
  object Console {
    
    inline def apply(maxWorkers: Double, watchman: Boolean): Console = {
      val __obj = js.Dynamic.literal(maxWorkers = maxWorkers.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
      __obj.asInstanceOf[Console]
    }
    
    extension [Self <: Console](x: Self) {
      
      inline def setConsole(value: typings.std.Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
      
      inline def setWatchman(value: Boolean): Self = StObject.set(x, "watchman", value.asInstanceOf[js.Any])
    }
  }
  
  trait Virtual extends StObject {
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object Virtual {
    
    inline def apply(): Virtual = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Virtual]
    }
    
    extension [Self <: Virtual](x: Self) {
      
      inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
}
