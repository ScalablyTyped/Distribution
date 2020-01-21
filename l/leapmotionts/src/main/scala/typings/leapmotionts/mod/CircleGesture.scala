package typings.leapmotionts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "CircleGesture")
@js.native
class CircleGesture () extends Gesture {
  var center: Vector3 = js.native
  var normal: Vector3 = js.native
  var pointable: Pointable = js.native
  var progress: Double = js.native
  var radius: Double = js.native
}

/* static members */
@JSImport("leapmotionts", "CircleGesture")
@js.native
object CircleGesture extends js.Object {
  var classType: Double = js.native
}

