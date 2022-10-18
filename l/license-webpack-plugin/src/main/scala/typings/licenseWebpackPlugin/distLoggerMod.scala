package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.distWebpackCompilationMod.WebpackCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoggerMod {
  
  trait Logger extends StObject {
    
    def error(compilation: WebpackCompilation, message: String): Unit
    
    /* private */ var stats: Any
    
    def warn(compilation: WebpackCompilation, message: String): Unit
  }
  object Logger {
    
    inline def apply(
      error: (WebpackCompilation, String) => Unit,
      stats: Any,
      warn: (WebpackCompilation, String) => Unit
    ): Logger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction2(error), stats = stats.asInstanceOf[js.Any], warn = js.Any.fromFunction2(warn))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setError(value: (WebpackCompilation, String) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setStats(value: Any): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: (WebpackCompilation, String) => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
    }
  }
}
