package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.anon.Compilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackCompilerMod {
  
  trait WebpackCompiler extends StObject {
    
    var context: String
    
    var hooks: Compilation
    
    var inputFileSystem: Any
    
    def isChild(): Boolean
    
    var plugin: js.UndefOr[js.Function2[/* phase */ String, /* callback */ js.Function, Unit]] = js.undefined
  }
  object WebpackCompiler {
    
    inline def apply(context: String, hooks: Compilation, inputFileSystem: Any, isChild: () => Boolean): WebpackCompiler = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], inputFileSystem = inputFileSystem.asInstanceOf[js.Any], isChild = js.Any.fromFunction0(isChild))
      __obj.asInstanceOf[WebpackCompiler]
    }
    
    extension [Self <: WebpackCompiler](x: Self) {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setHooks(value: Compilation): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setInputFileSystem(value: Any): Self = StObject.set(x, "inputFileSystem", value.asInstanceOf[js.Any])
      
      inline def setIsChild(value: () => Boolean): Self = StObject.set(x, "isChild", js.Any.fromFunction0(value))
      
      inline def setPlugin(value: (/* phase */ String, /* callback */ js.Function) => Unit): Self = StObject.set(x, "plugin", js.Any.fromFunction2(value))
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    }
  }
}
