package typings
package leapmotiontsLib.leapmotiontsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "Controller")
@js.native
class Controller () extends EventDispatcher {
  def this(host: java.lang.String) = this()
  var _isConnected: scala.Boolean = js.native
  var _isGesturesEnabled: scala.Boolean = js.native
  var connection: stdLib.WebSocket = js.native
  var frameHistory: js.Array[Frame] = js.native
  var latestFrame: js.Any = js.native
  var listener: js.Any = js.native
  def enableGesture(`type`: scala.Double): scala.Unit = js.native
  def enableGesture(`type`: scala.Double, enable: scala.Boolean): scala.Unit = js.native
  def frame(): Frame = js.native
  def frame(history: scala.Double): Frame = js.native
  def isConnected(): scala.Boolean = js.native
  def isGestureEnabled(`type`: scala.Double): scala.Boolean = js.native
  def setListener(listener: Listener): scala.Unit = js.native
}

@JSImport("leapmotionts", "Controller")
@js.native
object Controller extends js.Object {
  /* private */ def getHandByID(frame: js.Any, id: js.Any): js.Any = js.native
  /* private */ def getPointableByID(frame: js.Any, id: js.Any): js.Any = js.native
}

