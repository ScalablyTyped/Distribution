package typings
package leapmotiontsLib.leapmotiontsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "Gesture")
@js.native
class Gesture () extends js.Object {
  var duration: scala.Double = js.native
  var durationSeconds: scala.Double = js.native
  var frame: Frame = js.native
  var hands: js.Array[Hand] = js.native
  var id: scala.Double = js.native
  var pointables: js.Array[Pointable] = js.native
  var state: scala.Double = js.native
  var `type`: scala.Double = js.native
  def isEqualTo(other: Gesture): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
}

/* static members */
@JSImport("leapmotionts", "Gesture")
@js.native
object Gesture extends js.Object {
  var STATE_INVALID: scala.Double = js.native
  var STATE_START: scala.Double = js.native
  var STATE_STOP: scala.Double = js.native
  var STATE_UPDATE: scala.Double = js.native
  var TYPE_CIRCLE: scala.Double = js.native
  var TYPE_INVALID: scala.Double = js.native
  var TYPE_KEY_TAP: scala.Double = js.native
  var TYPE_SCREEN_TAP: scala.Double = js.native
  var TYPE_SWIPE: scala.Double = js.native
  def invalid(): leapmotiontsLib.leapmotiontsMod.Gesture = js.native
}

