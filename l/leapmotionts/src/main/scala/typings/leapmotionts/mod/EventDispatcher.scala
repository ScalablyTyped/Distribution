package typings.leapmotionts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "EventDispatcher")
@js.native
class EventDispatcher () extends js.Object {
  var _listeners: js.Any = js.native
  def addEventListener(typeStr: String, listenerFunc: js.Function): Unit = js.native
  def dispatchEvent(evt: LeapEvent): Unit = js.native
  def hasEventListener(`type`: String, listener: js.Function): Boolean = js.native
  def removeEventListener(typeStr: String, listenerFunc: js.Function): Unit = js.native
}

