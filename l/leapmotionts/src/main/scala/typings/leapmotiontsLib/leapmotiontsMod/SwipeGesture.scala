package typings
package leapmotiontsLib.leapmotiontsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "SwipeGesture")
@js.native
class SwipeGesture () extends Gesture {
  var direction: Vector3 = js.native
  var pointable: Pointable = js.native
  var position: Vector3 = js.native
  var speed: scala.Double = js.native
  var startPosition: Vector3 = js.native
}

/* static members */
@JSImport("leapmotionts", "SwipeGesture")
@js.native
object SwipeGesture extends js.Object {
  var classType: scala.Double = js.native
}

