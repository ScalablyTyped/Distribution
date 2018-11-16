package typings
package leapmotiontsLib.leapmotiontsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "Pointable")
@js.native
class Pointable () extends js.Object {
  var direction: Vector3 = js.native
  var frame: Frame = js.native
  var hand: Hand = js.native
  var id: scala.Double = js.native
  var isFinger: scala.Boolean = js.native
  var isTool: scala.Boolean = js.native
  var length: scala.Double = js.native
  var tipPosition: Vector3 = js.native
  var tipVelocity: Vector3 = js.native
  var width: scala.Double = js.native
  def isEqualTo(other: Pointable): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
}

@JSImport("leapmotionts", "Pointable")
@js.native
object Pointable extends js.Object {
  def invalid(): leapmotiontsLib.leapmotiontsMod.Pointable = js.native
}

