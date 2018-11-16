package typings
package leapmotiontsLib.leapmotiontsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "EventDispatcher")
@js.native
class EventDispatcher () extends js.Object {
  var _listeners: js.Any = js.native
  def addEventListener(typeStr: java.lang.String, listenerFunc: js.Function): scala.Unit = js.native
  def dispatchEvent(evt: LeapEvent): scala.Unit = js.native
  def hasEventListener(`type`: java.lang.String, listener: js.Function): scala.Boolean = js.native
  def removeEventListener(typeStr: java.lang.String, listenerFunc: js.Function): scala.Unit = js.native
}

