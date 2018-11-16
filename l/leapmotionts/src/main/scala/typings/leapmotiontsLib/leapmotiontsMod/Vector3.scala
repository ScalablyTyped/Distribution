package typings
package leapmotiontsLib.leapmotiontsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "Vector3")
@js.native
class Vector3 protected () extends js.Object {
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  var pitch: scala.Double = js.native
  var roll: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var yaw: scala.Double = js.native
  var z: scala.Double = js.native
  def angleTo(other: Vector3): scala.Double = js.native
  def cross(other: Vector3): Vector3 = js.native
  def distanceTo(other: Vector3): scala.Double = js.native
  def divide(scalar: scala.Double): Vector3 = js.native
  def divideAssign(scalar: scala.Double): Vector3 = js.native
  def dot(other: Vector3): scala.Double = js.native
  def isEqualTo(other: Vector3): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
  def magnitude(): scala.Double = js.native
  def magnitudeSquared(): scala.Double = js.native
  def minus(other: Vector3): Vector3 = js.native
  def minusAssign(other: Vector3): Vector3 = js.native
  def multiply(scalar: scala.Double): Vector3 = js.native
  def multiplyAssign(scalar: scala.Double): Vector3 = js.native
  def normalized(): Vector3 = js.native
  def opposite(): Vector3 = js.native
  def plus(other: Vector3): Vector3 = js.native
  def plusAssign(other: Vector3): Vector3 = js.native
}

@JSImport("leapmotionts", "Vector3")
@js.native
object Vector3 extends js.Object {
  def backward(): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def down(): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def forward(): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def invalid(): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def left(): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def right(): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def up(): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def xAxis(): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def yAxis(): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def zAxis(): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def zero(): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
}

