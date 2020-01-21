package typings.leapmotionts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "Vector3")
@js.native
class Vector3 protected () extends js.Object {
  def this(x: Double, y: Double, z: Double) = this()
  var pitch: Double = js.native
  var roll: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var yaw: Double = js.native
  var z: Double = js.native
  def angleTo(other: Vector3): Double = js.native
  def cross(other: Vector3): Vector3 = js.native
  def distanceTo(other: Vector3): Double = js.native
  def divide(scalar: Double): Vector3 = js.native
  def divideAssign(scalar: Double): Vector3 = js.native
  def dot(other: Vector3): Double = js.native
  def isEqualTo(other: Vector3): Boolean = js.native
  def isValid(): Boolean = js.native
  def magnitude(): Double = js.native
  def magnitudeSquared(): Double = js.native
  def minus(other: Vector3): Vector3 = js.native
  def minusAssign(other: Vector3): Vector3 = js.native
  def multiply(scalar: Double): Vector3 = js.native
  def multiplyAssign(scalar: Double): Vector3 = js.native
  def normalized(): Vector3 = js.native
  def opposite(): Vector3 = js.native
  def plus(other: Vector3): Vector3 = js.native
  def plusAssign(other: Vector3): Vector3 = js.native
}

/* static members */
@JSImport("leapmotionts", "Vector3")
@js.native
object Vector3 extends js.Object {
  def backward(): Vector3 = js.native
  def down(): Vector3 = js.native
  def forward(): Vector3 = js.native
  def invalid(): Vector3 = js.native
  def left(): Vector3 = js.native
  def right(): Vector3 = js.native
  def up(): Vector3 = js.native
  def xAxis(): Vector3 = js.native
  def yAxis(): Vector3 = js.native
  def zAxis(): Vector3 = js.native
  def zero(): Vector3 = js.native
}

