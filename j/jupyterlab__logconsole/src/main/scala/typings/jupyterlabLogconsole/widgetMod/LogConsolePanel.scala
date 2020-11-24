package typings.jupyterlabLogconsole.widgetMod

import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.source
import typings.jupyterlabLogconsole.tokensMod.ILogger
import typings.jupyterlabLogconsole.tokensMod.ILoggerRegistry
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.StackedPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def logger: ILogger | Null = js.native
  
  /**
    * The logger registry providing the logs.
    */
  def loggerRegistry: ILoggerRegistry = js.native
  
  /**
    * The log source displayed
    */
  def source: String | Null = js.native
  
  /**
    * Signal for source changes
    */
  def sourceChanged: ISignal[this.type, IChangedArgs[String | Null, String | Null, source]] = js.native
  
  /**
    * Signal for source changes
    */
  def sourceDisplayed: ISignal[this.type, ISourceDisplayed] = js.native
  
  /**
    * The source version displayed.
    */
  def sourceVersion: Double | Null = js.native
  
  def source_=(name: String | Null): Unit = js.native
}
