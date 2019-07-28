package typings.leapmotionts.leapmotiontsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "Gesture")
@js.native
class Gesture () extends js.Object {
  var duration: Double = js.native
  var durationSeconds: Double = js.native
  var frame: Frame = js.native
  var hands: js.Array[Hand] = js.native
  var id: Double = js.native
  var pointables: js.Array[Pointable] = js.native
  var state: Double = js.native
  var `type`: Double = js.native
  def isEqualTo(other: Gesture): Boolean = js.native
  def isValid(): Boolean = js.native
}

/* static members */
@JSImport("leapmotionts", "Gesture")
@js.native
object Gesture extends js.Object {
  var STATE_INVALID: Double = js.native
  var STATE_START: Double = js.native
  var STATE_STOP: Double = js.native
  var STATE_UPDATE: Double = js.native
  var TYPE_CIRCLE: Double = js.native
  var TYPE_INVALID: Double = js.native
  var TYPE_KEY_TAP: Double = js.native
  var TYPE_SCREEN_TAP: Double = js.native
  var TYPE_SWIPE: Double = js.native
  def invalid(): Gesture = js.native
}

