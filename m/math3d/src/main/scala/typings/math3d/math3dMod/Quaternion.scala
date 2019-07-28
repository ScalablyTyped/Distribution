package typings.math3d.math3dMod

import typings.math3d.Anon_Angle
import typings.math3d.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("math3d", "Quaternion")
@js.native
class Quaternion () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  var angleAxis: Anon_Angle = js.native
  var eulerAngles: Anon_X = js.native
  var w: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def angleTo(quaternion: Quaternion): Double = js.native
  def conjugate(): Quaternion = js.native
  def distanceTo(quaternion: Quaternion): Double = js.native
  def dot(quaternion: Quaternion): Double = js.native
  def equals(quaternion: Quaternion): Boolean = js.native
  def inverse(): Quaternion = js.native
  def mul(quaternion: Quaternion): Quaternion = js.native
  def mulVector3(vector3: Vector3): Vector3 = js.native
}

/* static members */
@JSImport("math3d", "Quaternion")
@js.native
object Quaternion extends js.Object {
  var identity: Quaternion = js.native
  var zero: Quaternion = js.native
  def AngleAxis(axis: Vector3, angle: Double): Quaternion = js.native
  def Euler(): Quaternion = js.native
  def Euler(x: Double): Quaternion = js.native
  def Euler(x: Double, y: Double): Quaternion = js.native
  def Euler(x: Double, y: Double, z: Double): Quaternion = js.native
}

