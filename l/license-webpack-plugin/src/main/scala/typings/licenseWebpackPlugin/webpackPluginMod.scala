package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.webpackCompilerMod.WebpackCompiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackPluginMod {
  
  trait WebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: WebpackCompiler): Unit
  }
  object WebpackPlugin {
    
    inline def apply(apply: WebpackCompiler => Unit): WebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[WebpackPlugin]
    }
    
    extension [Self <: WebpackPlugin](x: Self) {
      
      inline def setApply(value: WebpackCompiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
}
