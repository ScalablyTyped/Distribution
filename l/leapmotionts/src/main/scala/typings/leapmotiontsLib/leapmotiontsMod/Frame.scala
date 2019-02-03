package typings
package leapmotiontsLib.leapmotiontsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "Frame")
@js.native
class Frame () extends js.Object {
  var _gestures: js.Array[Gesture] = js.native
  var controller: Controller = js.native
  var fingers: js.Array[Finger] = js.native
  var hands: js.Array[Hand] = js.native
  var id: scala.Double = js.native
  var pointables: js.Array[Pointable] = js.native
  var rotation: Matrix = js.native
  var scaleFactorNumber: scala.Double = js.native
  var timestamp: scala.Double = js.native
  var tools: js.Array[Tool] = js.native
  var translationVector: Vector3 = js.native
  def finger(id: scala.Double): Finger = js.native
  def gesture(id: scala.Double): Gesture = js.native
  def gestures(): js.Array[Gesture] = js.native
  def gestures(sinceFrame: Frame): js.Array[Gesture] = js.native
  def hand(id: scala.Double): Hand = js.native
  def isEqualTo(other: Frame): scala.Boolean = js.native
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

/* static members */
@JSImport("leapmotionts", "Frame")
@js.native
object Frame extends js.Object {
  def invalid(): leapmotiontsLib.leapmotiontsMod.Frame = js.native
}

