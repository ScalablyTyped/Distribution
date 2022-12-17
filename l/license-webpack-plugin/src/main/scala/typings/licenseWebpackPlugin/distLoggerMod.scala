package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.distConstructedStatsMod.ConstructedStats
import typings.licenseWebpackPlugin.distWebpackCompilationMod.WebpackCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoggerMod {
  
  @JSImport("license-webpack-plugin/dist/Logger", "Logger")
  @js.native
  open class Logger protected () extends StObject {
    def this(stats: ConstructedStats) = this()
    
    def error(compilation: WebpackCompilation, message: String): Unit = js.native
    
    /* private */ var stats: Any = js.native
    
    def warn(compilation: WebpackCompilation, message: String): Unit = js.native
  }
  object Logger {
    
    @JSImport("license-webpack-plugin/dist/Logger", "Logger")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("license-webpack-plugin/dist/Logger", "Logger.LOG_PREFIX")
    @js.native
    def LOG_PREFIX: Any = js.native
    inline def LOG_PREFIX_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG_PREFIX")(x.asInstanceOf[js.Any])
  }
}
