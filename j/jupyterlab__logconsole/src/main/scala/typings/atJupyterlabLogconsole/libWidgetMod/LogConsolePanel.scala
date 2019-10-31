package typings.atJupyterlabLogconsole.libWidgetMod

import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.source
import typings.atJupyterlabLogconsole.libTokensMod.ILogger
import typings.atJupyterlabLogconsole.libTokensMod.ILoggerRegistry
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.StackedPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/logconsole/lib/widget", "LogConsolePanel")
@js.native
class LogConsolePanel protected () extends StackedPanel {
  /**
    * Construct a LogConsolePanel instance.
    *
    * @param loggerRegistry - The logger registry that provides
    * logs to be displayed.
    */
  def this(loggerRegistry: ILoggerRegistry) = this()
  var _bindLoggerSignals: js.Any = js.native
  var _handlePlaceholder: js.Any = js.native
  var _loggerRegistry: js.Any = js.native
  var _loggersWatched: js.Any = js.native
  var _outputAreas: js.Any = js.native
  var _placeholder: js.Any = js.native
  var _showOutputFromSource: js.Any = js.native
  var _source: js.Any = js.native
  var _sourceChanged: js.Any = js.native
  var _sourceDisplayed: js.Any = js.native
  var _updateOutputAreas: js.Any = js.native
  /**
    * The current logger.
    */
  val logger: ILogger | Null = js.native
  /**
    * The logger registry providing the logs.
    */
  val loggerRegistry: ILoggerRegistry = js.native
  /**
    * The log source displayed
    */
  var source: String | Null = js.native
  /**
    * Signal for source changes
    */
  val sourceChanged: ISignal[this.type, IChangedArgs[String | Null, source]] = js.native
  /**
    * Signal for source changes
    */
  val sourceDisplayed: ISignal[this.type, ISourceDisplayed] = js.native
  /**
    * The source version displayed.
    */
  val sourceVersion: Double | Null = js.native
}

