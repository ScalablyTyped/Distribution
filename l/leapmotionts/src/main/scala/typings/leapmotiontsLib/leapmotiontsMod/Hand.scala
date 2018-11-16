package typings
package leapmotiontsLib.leapmotiontsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "Hand")
@js.native
class Hand () extends js.Object {
  var direction: Vector3 = js.native
  var fingers: js.Array[Finger] = js.native
  var frame: Frame = js.native
  var id: scala.Double = js.native
  var palmNormal: Vector3 = js.native
  var palmPosition: Vector3 = js.native
  var palmVelocity: Vector3 = js.native
  var pointables: js.Array[Pointable] = js.native
  var rotation: Matrix = js.native
  var scaleFactorNumber: scala.Double = js.native
  var sphereCenter: Vector3 = js.native
  var sphereRadius: scala.Double = js.native
  var tools: js.Array[Tool] = js.native
  var translationVector: Vector3 = js.native
  def finger(id: scala.Double): Finger = js.native
  def isEqualTo(other: Hand): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
  def pointable(id: scala.Double): Pointable = js.native
  def rotationAngle(sinceFrame: Frame): scala.Double = js.native
  def rotationAngle(sinceFrame: Frame, axis: Vector3): scala.Double = js.native
  def rotationAxis(sinceFrame: Frame): Vector3 = js.native
  def rotationMatrix(sinceFrame: Frame): Matrix = js.native
  def scaleFactor(sinceFrame: Frame): scala.Double = js.native
  def tool(id: scala.Double): Tool = js.native
  def translation(sinceFrame: Frame): Vector3 = js.native
}

@JSImport("leapmotionts", "Hand")
@js.native
object Hand extends js.Object {
  def invalid(): leapmotiontsLib.leapmotiontsMod.Hand = js.native
}

