package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StringDictionary
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.debug
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.error
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.info
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.off
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.warn
import typings.winston.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggingMod {
  
  object default {
    
    @JSImport("matrix-appservice-bridge/lib/components/logging", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("matrix-appservice-bridge/lib/components/logging", "default.configure")
    @js.native
    def configure: js.Function1[/* config */ LoggerConfig, Unit] = js.native
    @JSImport("matrix-appservice-bridge/lib/components/logging", "default.configure")
    @js.native
    def configure(config: LoggerConfig): Unit = js.native
    @scala.inline
    def configure_=(x: js.Function1[/* config */ LoggerConfig, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configure")(x.asInstanceOf[js.Any])
    
    @JSImport("matrix-appservice-bridge/lib/components/logging", "default.configured")
    @js.native
    def configured(): Boolean = js.native
    @JSImport("matrix-appservice-bridge/lib/components/logging", "default.configured")
    @js.native
    def configured_Fdefault: js.Function0[Boolean] = js.native
    
    @scala.inline
    def configured_Fdefault_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configured")(x.asInstanceOf[js.Any])
    
    @JSImport("matrix-appservice-bridge/lib/components/logging", "default.get")
    @js.native
    def get: js.Function1[/* name */ String, LogWrapper] = js.native
    @JSImport("matrix-appservice-bridge/lib/components/logging", "default.get")
    @js.native
    def get(name: String): LogWrapper = js.native
    @scala.inline
    def get_=(x: js.Function1[/* name */ String, LogWrapper]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("matrix-appservice-bridge/lib/components/logging", "LogWrapper")
  @js.native
  class LogWrapper () extends StObject {
    
    def debug(messageParts: MessagePart*): Unit = js.native
    
    def drain(): Unit = js.native
    
    def error(messageParts: MessagePart*): Unit = js.native
    
    var formatParts: js.Any = js.native
    
    def info(messageParts: MessagePart*): Unit = js.native
    
    var log: js.Any = js.native
    
    var logger: js.Any = js.native
    
    var messages: js.Any = js.native
    
    def setLogger(logger: Logger): Unit = js.native
    
    def warn(messageParts: MessagePart*): Unit = js.native
  }
  
  @JSImport("matrix-appservice-bridge/lib/components/logging", "configure")
  @js.native
  def configure(config: LoggerConfig): Unit = js.native
  
  @JSImport("matrix-appservice-bridge/lib/components/logging", "configured")
  @js.native
  def configured(): Boolean = js.native
  
  @JSImport("matrix-appservice-bridge/lib/components/logging", "get")
  @js.native
  def get(name: String): LogWrapper = js.native
  
  @js.native
  trait LoggerConfig extends StObject {
    
    var console: js.UndefOr[error | warn | info | debug | off] = js.native
    
    var fileDatePattern: js.UndefOr[String] = js.native
    
    var files: js.UndefOr[StringDictionary[error | warn | info | debug | off]] = js.native
    
    var maxFiles: js.UndefOr[Double] = js.native
    
    var timestampFormat: js.UndefOr[String] = js.native
  }
  object LoggerConfig {
    
    @scala.inline
    def apply(): LoggerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerConfig]
    }
    
    @scala.inline
    implicit class LoggerConfigMutableBuilder[Self <: LoggerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsole(value: error | warn | info | debug | off): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      @scala.inline
      def setFileDatePattern(value: String): Self = StObject.set(x, "fileDatePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileDatePatternUndefined: Self = StObject.set(x, "fileDatePattern", js.undefined)
      
      @scala.inline
      def setFiles(value: StringDictionary[error | warn | info | debug | off]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
      
      @scala.inline
      def setTimestampFormat(value: String): Self = StObject.set(x, "timestampFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampFormatUndefined: Self = StObject.set(x, "timestampFormat", js.undefined)
    }
  }
  
  type MessagePart = js.Any
}
