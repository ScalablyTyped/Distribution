package typings.jupyterlabDocmanager.savehandlerMod

import typings.jupyterlabDocmanager.savehandlerMod.SaveHandler.IOptions
import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/docmanager/lib/savehandler", "SaveHandler")
@js.native
class SaveHandler_ protected () extends IDisposable {
  /**
    * Construct a new save handler.
    */
  def this(options: IOptions) = this()
  
  var _autosaveTimer: js.Any = js.native
  
  var _context: js.Any = js.native
  
  var _inDialog: js.Any = js.native
  
  var _interval: js.Any = js.native
  
  var _isActive: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  var _minInterval: js.Any = js.native
  
  var _multiplier: js.Any = js.native
  
  /**
    * Handle an autosave timeout.
    */
  var _save: js.Any = js.native
  
  /**
    * Set the timer.
    */
  var _setTimer: js.Any = js.native
  
  /**
    * Get whether the handler is active.
    */
  def isActive: Boolean = js.native
  
  /**
    * Get whether the save handler is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MSaveHandler_ : Boolean = js.native
  
  /**
    * The save interval used by the timer (in seconds).
    */
  def saveInterval: Double = js.native
  def saveInterval_=(value: Double): Unit = js.native
  
  /**
    * Start the autosaver.
    */
  def start(): Unit = js.native
  
  /**
    * Stop the autosaver.
    */
  def stop(): Unit = js.native
}
