package typings.jupyterlabLogconsole.loggerMod

import typings.jupyterlabLogconsole.loggerMod.Logger.IOptions
import typings.jupyterlabLogconsole.tokensMod.IContentChange
import typings.jupyterlabLogconsole.tokensMod.ILogger
import typings.jupyterlabLogconsole.tokensMod.IStateChange
import typings.jupyterlabLogconsole.tokensMod.LogLevel
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/logconsole/lib/logger", "Logger")
@js.native
class Logger_ protected () extends ILogger {
  /**
    * Construct a Logger.
    *
    * @param source - The name of the log source.
    */
  def this(options: IOptions) = this()
  
  var _contentChanged: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  var _level: js.Any = js.native
  
  var _log: js.Any = js.native
  
  var _rendermime: js.Any = js.native
  
  var _stateChanged: js.Any = js.native
  
  var _version: js.Any = js.native
  
  /**
    * A signal emitted when the list of log messages changes.
    */
  @JSName("contentChanged")
  def contentChanged_MLogger_ : ISignal[this.type, IContentChange] = js.native
  
  /**
    * Whether the logger is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MLogger_ : Boolean = js.native
  
  /**
    * Number of outputs logged.
    */
  @JSName("length")
  def length_MLogger_ : Double = js.native
  
  /**
    * The level of outputs logged
    */
  @JSName("level")
  def level_MLogger_ : LogLevel = js.native
  
  /**
    * The maximum number of outputs stored.
    *
    * #### Notes
    * Oldest entries will be trimmed to ensure the length is at most
    * `.maxLength`.
    */
  @JSName("maxLength")
  def maxLength_MLogger_ : Double = js.native
  
  /**
    * The output area model used for the logger.
    *
    * #### Notes
    * This will usually not be accessed directly. It is a public attribute so
    * that the renderer can access it.
    */
  @JSName("outputAreaModel")
  val outputAreaModel_Logger_ : LoggerOutputAreaModel = js.native
  
  /**
    * Rendermime to use when rendering outputs logged.
    */
  @JSName("rendermime")
  def rendermime_MLogger_ : IRenderMimeRegistry | Null = js.native
  
  /**
    * A signal emitted when the log state changes.
    */
  @JSName("stateChanged")
  def stateChanged_MLogger_ : ISignal[this.type, IStateChange] = js.native
  
  /**
    * The number of messages that have ever been stored.
    */
  @JSName("version")
  def version_MLogger_ : Double = js.native
}
