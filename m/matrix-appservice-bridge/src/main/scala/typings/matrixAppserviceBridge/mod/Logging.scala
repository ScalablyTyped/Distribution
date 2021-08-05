package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.loggingMod.LoggerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Logging {
  
  @JSImport("matrix-appservice-bridge", "Logging")
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("matrix-appservice-bridge", "Logging.default")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("matrix-appservice-bridge", "Logging.default.configure")
    @js.native
    def configure: js.Function1[/* config */ LoggerConfig, Unit] = js.native
    inline def configure(config: LoggerConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def configure_=(x: js.Function1[/* config */ LoggerConfig, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configure")(x.asInstanceOf[js.Any])
    
    inline def configured(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("configured")().asInstanceOf[Boolean]
    @JSImport("matrix-appservice-bridge", "Logging.default.configured")
    @js.native
    def configured_Fdefault: js.Function0[Boolean] = js.native
    
    inline def configured_Fdefault_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configured")(x.asInstanceOf[js.Any])
    
    @JSImport("matrix-appservice-bridge", "Logging.default.get")
    @js.native
    def get: js.Function1[/* name */ String, typings.matrixAppserviceBridge.loggingMod.LogWrapper] = js.native
    inline def get(name: String): typings.matrixAppserviceBridge.loggingMod.LogWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[typings.matrixAppserviceBridge.loggingMod.LogWrapper]
    inline def get_=(x: js.Function1[/* name */ String, typings.matrixAppserviceBridge.loggingMod.LogWrapper]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("matrix-appservice-bridge", "Logging.LogWrapper")
  @js.native
  class LogWrapper ()
    extends typings.matrixAppserviceBridge.loggingMod.LogWrapper
  
  inline def configure(config: LoggerConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def configured(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("configured")().asInstanceOf[Boolean]
  
  inline def get(name: String): typings.matrixAppserviceBridge.loggingMod.LogWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[typings.matrixAppserviceBridge.loggingMod.LogWrapper]
}
