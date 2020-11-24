package typings.leapmotionts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leapmotionts", "Frame")
@js.native
class Frame () extends js.Object {
  
  var _gestures: js.Array[Gesture] = js.native
  
  var controller: Controller = js.native
  
  def finger(id: Double): Finger = js.native
  
  var fingers: js.Array[Finger] = js.native
  
  def gesture(id: Double): Gesture = js.native
  
  def gestures(): js.Array[Gesture] = js.native
  def gestures(sinceFrame: Frame): js.Array[Gesture] = js.native
  
  def hand(id: Double): Hand = js.native
  
  var hands: js.Array[Hand] = js.native
  
  var id: Double = js.native
  
  def isEqualTo(other: Frame): Boolean = js.native
  
  def isValid(): Boolean = js.native
  
  def pointable(id: Double): Pointable = js.native
  
  var pointables: js.Array[Pointable] = js.native
  
  var rotation: Matrix = js.native
  
  def rotationAngle(sinceFrame: Frame): Double = js.native
  def rotationAngle(sinceFrame: Frame, axis: Vector3): Double = js.native
  
  def rotationAxis(sinceFrame: Frame): Vector3 = js.native
  
  def rotationMatrix(sinceFrame: Frame): Matrix = js.native
  
  def scaleFactor(sinceFrame: Frame): Double = js.native
  
  var scaleFactorNumber: Double = js.native
  
  var timestamp: Double = js.native
  
  def tool(id: Double): Tool = js.native
  
  var tools: js.Array[Tool] = js.native
  
  def translation(sinceFrame: Frame): Vector3 = js.native
  
  var translationVector: Vector3 = js.native
}
/* static members */
@JSImport("leapmotionts", "Frame")
@js.native
object Frame extends js.Object {
  
  def invalid(): Frame = js.native
}
