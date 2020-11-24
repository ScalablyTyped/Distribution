package typings.jupyterlabLogconsole

import typings.jupyterlabLogconsole.loggerMod.LogOutputModel.IOptions
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/logconsole", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ILoggerRegistry: Token[typings.jupyterlabLogconsole.tokensMod.ILoggerRegistry] = js.native
  
  @js.native
  class LogConsolePanel protected ()
    extends typings.jupyterlabLogconsole.widgetMod.LogConsolePanel {
    /**
      * Construct a LogConsolePanel instance.
      *
      * @param loggerRegistry - The logger registry that provides
      * logs to be displayed.
      */
    def this(loggerRegistry: typings.jupyterlabLogconsole.tokensMod.ILoggerRegistry) = this()
  }
  
  @js.native
  class LogOutputModel protected ()
    extends typings.jupyterlabLogconsole.loggerMod.LogOutputModel {
    /**
      * Construct a LogOutputModel.
      *
      * @param options - The model initialization options.
      */
    def this(options: IOptions) = this()
  }
  /**
    * Log Output Model namespace that defines initialization options.
    */
  @js.native
  object LogOutputModel extends js.Object
  
  @js.native
  class Logger protected ()
    extends typings.jupyterlabLogconsole.loggerMod.Logger {
    /**
      * Construct a Logger.
      *
      * @param source - The name of the log source.
      */
    def this(options: typings.jupyterlabLogconsole.loggerMod.Logger.IOptions) = this()
  }
  
  @js.native
  class LoggerOutputAreaModel protected ()
    extends typings.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel {
    def this(hasMaxLengthOptions: typings.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel.IOptions) = this()
  }
  
  @js.native
  class LoggerRegistry protected ()
    extends typings.jupyterlabLogconsole.registryMod.LoggerRegistry {
    /**
      * Construct a LoggerRegistry.
      *
      * @param defaultRendermime - Default rendermime to render outputs
      * with when logger is not supplied with one.
      */
    def this(options: typings.jupyterlabLogconsole.registryMod.LoggerRegistry.IOptions) = this()
  }
  
  @js.native
  class ScrollingWidget[T /* <: Widget */] protected ()
    extends typings.jupyterlabLogconsole.widgetMod.ScrollingWidget[T] {
    def this(hasContentOptions: typings.jupyterlabLogconsole.widgetMod.ScrollingWidget.IOptions[T]) = this()
  }
}
