package typings.jupyterlabLogconsole

import typings.jupyterlabLogconsole.libLoggerMod.Logger.IOptions
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/logconsole", "ILoggerRegistry")
  @js.native
  val ILoggerRegistry: Token[typings.jupyterlabLogconsole.libTokensMod.ILoggerRegistry] = js.native
  
  @JSImport("@jupyterlab/logconsole", "LogConsolePanel")
  @js.native
  open class LogConsolePanel protected ()
    extends typings.jupyterlabLogconsole.libWidgetMod.LogConsolePanel {
    /**
      * Construct a LogConsolePanel instance.
      *
      * @param loggerRegistry - The logger registry that provides
      * logs to be displayed.
      */
    def this(loggerRegistry: typings.jupyterlabLogconsole.libTokensMod.ILoggerRegistry) = this()
    def this(loggerRegistry: typings.jupyterlabLogconsole.libTokensMod.ILoggerRegistry, translator: ITranslator) = this()
  }
  
  @JSImport("@jupyterlab/logconsole", "Logger")
  @js.native
  open class Logger protected ()
    extends typings.jupyterlabLogconsole.libLoggerMod.Logger {
    /**
      * Construct a Logger.
      *
      * @param source - The name of the log source.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/logconsole", "LoggerOutputAreaModel")
  @js.native
  open class LoggerOutputAreaModel protected ()
    extends typings.jupyterlabLogconsole.libLoggerMod.LoggerOutputAreaModel {
    def this(param0: typings.jupyterlabLogconsole.libLoggerMod.LoggerOutputAreaModel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/logconsole", "LoggerRegistry")
  @js.native
  open class LoggerRegistry protected ()
    extends typings.jupyterlabLogconsole.libRegistryMod.LoggerRegistry {
    /**
      * Construct a LoggerRegistry.
      *
      * @param defaultRendermime - Default rendermime to render outputs
      * with when logger is not supplied with one.
      */
    def this(options: typings.jupyterlabLogconsole.libRegistryMod.LoggerRegistry.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/logconsole", "ScrollingWidget")
  @js.native
  open class ScrollingWidget[T /* <: Widget */] protected ()
    extends typings.jupyterlabLogconsole.libWidgetMod.ScrollingWidget[T] {
    def this(param0: typings.jupyterlabLogconsole.libWidgetMod.ScrollingWidget.IOptions[T]) = this()
  }
}
