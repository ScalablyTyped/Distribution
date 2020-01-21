package typings.leapmotionts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "Matrix")
@js.native
class Matrix protected () extends js.Object {
  def this(x: Vector3, y: Vector3, z: Vector3) = this()
  def this(x: Vector3, y: Vector3, z: Vector3, _origin: Vector3) = this()
  var origin: Vector3 = js.native
  var xBasis: Vector3 = js.native
  var yBasis: Vector3 = js.native
  var zBasis: Vector3 = js.native
  def isEqualTo(other: Matrix): Boolean = js.native
  def multiply(other: Matrix): Matrix = js.native
  def multiplyAssign(other: Matrix): Matrix = js.native
  def rigidInverse(): Matrix = js.native
  def setRotation(_axis: Vector3, angleRadians: Double): Unit = js.native
  def transformDirection(inVector: Vector3): Vector3 = js.native
  def transformPoint(inVector: Vector3): Vector3 = js.native
}

/* static members */
@JSImport("leapmotionts", "Matrix")
@js.native
object Matrix extends js.Object {
  def identity(): Matrix = js.native
}

