package typings.leapmotionts.mod

import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leapmotionts", "Controller")
@js.native
class Controller () extends EventDispatcher {
  def this(host: String) = this()
  
  var _isConnected: Boolean = js.native
  
  var _isGesturesEnabled: Boolean = js.native
  
  var connection: WebSocket = js.native
  
  def enableGesture(`type`: Double): Unit = js.native
  def enableGesture(`type`: Double, enable: Boolean): Unit = js.native
  
  def frame(): Frame = js.native
  def frame(history: Double): Frame = js.native
  
  var frameHistory: js.Array[Frame] = js.native
  
  def isConnected(): Boolean = js.native
  
  def isGestureEnabled(`type`: Double): Boolean = js.native
  
  var latestFrame: js.Any = js.native
  
  var listener: js.Any = js.native
  
  def setListener(listener: Listener): Unit = js.native
}
/* static members */
@JSImport("leapmotionts", "Controller")
@js.native
object Controller extends js.Object {
  
  /* private */ def getHandByID(frame: js.Any, id: js.Any): js.Any = js.native
  
  /* private */ def getPointableByID(frame: js.Any, id: js.Any): js.Any = js.native
}
