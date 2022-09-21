package typings.karmaJsdomLauncher

import typings.jsdom.mod.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait ConfigOptions extends StObject {
    
    /**
      * Launcher for jsdom configuration
      */
    var jsdomLauncher: js.UndefOr[JsdomLauncherOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setJsdomLauncher(value: JsdomLauncherOptions): Self = StObject.set(x, "jsdomLauncher", value.asInstanceOf[js.Any])
      
      inline def setJsdomLauncherUndefined: Self = StObject.set(x, "jsdomLauncher", js.undefined)
    }
  }
  
  trait JsdomLauncherOptions extends StObject {
    
    /**
      * You can pass options directly to jsdom as shown below.
      * See jsdom's own documentation for all supported options.
      */
    var jsdom: ConstructorOptions
  }
  object JsdomLauncherOptions {
    
    inline def apply(jsdom: ConstructorOptions): JsdomLauncherOptions = {
      val __obj = js.Dynamic.literal(jsdom = jsdom.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsdomLauncherOptions]
    }
    
    extension [Self <: JsdomLauncherOptions](x: Self) {
      
      inline def setJsdom(value: ConstructorOptions): Self = StObject.set(x, "jsdom", value.asInstanceOf[js.Any])
    }
  }
}
