package typings.atJupyterlabLogconsole

import typings.atJupyterlabLogconsole.libLoggerMod.LogOutputModel.IOptions
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/logconsole", JSImport.Namespace)
@js.native
object atJupyterlabLogconsoleMod extends js.Object {
  @js.native
  class LogConsolePanel protected ()
    extends typings.atJupyterlabLogconsole.libWidgetMod.LogConsolePanel {
    /**
      * Construct a LogConsolePanel instance.
      *
      * @param loggerRegistry - The logger registry that provides
      * logs to be displayed.
      */
    def this(loggerRegistry: typings.atJupyterlabLogconsole.libTokensMod.ILoggerRegistry) = this()
  }
  
  @js.native
  class LogOutputModel protected ()
    extends typings.atJupyterlabLogconsole.libLoggerMod.LogOutputModel {
    /**
      * Construct a LogOutputModel.
      *
      * @param options - The model initialization options.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class Logger protected ()
    extends typings.atJupyterlabLogconsole.libLoggerMod.Logger {
    /**
      * Construct a Logger.
      *
      * @param source - The name of the log source.
      */
    def this(options: typings.atJupyterlabLogconsole.libLoggerMod.Logger.IOptions) = this()
  }
  
  @js.native
  class LoggerOutputAreaModel protected ()
    extends typings.atJupyterlabLogconsole.libLoggerMod.LoggerOutputAreaModel {
    def this(hasMaxLengthOptions: typings.atJupyterlabLogconsole.libLoggerMod.LoggerOutputAreaModel.IOptions) = this()
  }
  
  @js.native
  class LoggerRegistry protected ()
    extends typings.atJupyterlabLogconsole.libRegistryMod.LoggerRegistry {
    /**
      * Construct a LoggerRegistry.
      *
      * @param defaultRendermime - Default rendermime to render outputs
      * with when logger is not supplied with one.
      */
    def this(options: typings.atJupyterlabLogconsole.libRegistryMod.LoggerRegistry.IOptions) = this()
  }
  
  @js.native
  class ScrollingWidget[T /* <: Widget */] protected ()
    extends typings.atJupyterlabLogconsole.libWidgetMod.ScrollingWidget[T] {
    def this(hasContentOptions: typings.atJupyterlabLogconsole.libWidgetMod.ScrollingWidget.IOptions[T]) = this()
  }
  
  val ILoggerRegistry: Token[typings.atJupyterlabLogconsole.libTokensMod.ILoggerRegistry] = js.native
  /**
    * Log Output Model namespace that defines initialization options.
    */
  @js.native
  object LogOutputModel extends js.Object
  
}

