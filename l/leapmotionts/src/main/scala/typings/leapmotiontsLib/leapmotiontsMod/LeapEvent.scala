package typings
package leapmotiontsLib.leapmotiontsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "LeapEvent")
@js.native
class LeapEvent protected () extends js.Object {
  def this(`type`: java.lang.String, targetListener: Listener) = this()
  def this(`type`: java.lang.String, targetListener: Listener, frame: Frame) = this()
  var _target: js.Any = js.native
  var _type: js.Any = js.native
  var frame: Frame = js.native
  def getTarget(): js.Any = js.native
  def getType(): java.lang.String = js.native
}

@JSImport("leapmotionts", "LeapEvent")
@js.native
object LeapEvent extends js.Object {
  var LEAPMOTION_CONNECTED: java.lang.String = js.native
  var LEAPMOTION_DISCONNECTED: java.lang.String = js.native
  var LEAPMOTION_EXIT: java.lang.String = js.native
  var LEAPMOTION_FRAME: java.lang.String = js.native
  var LEAPMOTION_INIT: java.lang.String = js.native
}

