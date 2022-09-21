package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StringDictionary
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.off
import typings.winston.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggingMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/logging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("matrix-appservice-bridge/lib/components/logging", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("matrix-appservice-bridge/lib/components/logging", "default.configure")
    @js.native
    def configure: js.Function1[/* config */ LoggerConfig, Unit] = js.native
    inline def configure(config: LoggerConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def configure_=(x: js.Function1[/* config */ LoggerConfig, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configure")(x.asInstanceOf[js.Any])
    
    inline def configured(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("configured")().asInstanceOf[Boolean]
    @JSImport("matrix-appservice-bridge/lib/components/logging", "default.configured")
    @js.native
    def configured_Fdefault: js.Function0[Boolean] = js.native
    
    inline def configured_Fdefault_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configured")(x.asInstanceOf[js.Any])
    
    @JSImport("matrix-appservice-bridge/lib/components/logging", "default.get")
    @js.native
    def get: js.Function1[/* name */ String, LogWrapper] = js.native
    inline def get(name: String): LogWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[LogWrapper]
    inline def get_=(x: js.Function1[/* name */ String, LogWrapper]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("matrix-appservice-bridge/lib/components/logging", "LogWrapper")
  @js.native
  open class LogWrapper () extends StObject {
    
    def debug(messageParts: MessagePart*): Unit = js.native
    
    def drain(): Unit = js.native
    
    def error(messageParts: MessagePart*): Unit = js.native
    
    /* private */ var formatParts: Any = js.native
    
    def info(messageParts: MessagePart*): Unit = js.native
    
    /* private */ var log: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var messages: Any = js.native
    
    def setLogger(logger: Logger): Unit = js.native
    
    def warn(messageParts: MessagePart*): Unit = js.native
  }
  
  inline def configure(config: LoggerConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def configured(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("configured")().asInstanceOf[Boolean]
  
  inline def get(name: String): LogWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[LogWrapper]
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.debug
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.info
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.warn
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.error
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def debug: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.debug = "debug".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.debug]
    
    inline def error: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.error = "error".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.error]
    
    inline def info: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.info = "info".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.info]
    
    inline def warn: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.warn = "warn".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.warn]
  }
  
  trait LoggerConfig extends StObject {
    
    var console: js.UndefOr[LogLevel | off] = js.undefined
    
    var fileDatePattern: js.UndefOr[String] = js.undefined
    
    var files: js.UndefOr[StringDictionary[LogLevel | off]] = js.undefined
    
    var maxFiles: js.UndefOr[Double] = js.undefined
    
    var timestampFormat: js.UndefOr[String] = js.undefined
  }
  object LoggerConfig {
    
    inline def apply(): LoggerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerConfig]
    }
    
    extension [Self <: LoggerConfig](x: Self) {
      
      inline def setConsole(value: LogLevel | off): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setFileDatePattern(value: String): Self = StObject.set(x, "fileDatePattern", value.asInstanceOf[js.Any])
      
      inline def setFileDatePatternUndefined: Self = StObject.set(x, "fileDatePattern", js.undefined)
      
      inline def setFiles(value: StringDictionary[LogLevel | off]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      inline def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
      
      inline def setTimestampFormat(value: String): Self = StObject.set(x, "timestampFormat", value.asInstanceOf[js.Any])
      
      inline def setTimestampFormatUndefined: Self = StObject.set(x, "timestampFormat", js.undefined)
    }
  }
  
  type MessagePart = Any
}
