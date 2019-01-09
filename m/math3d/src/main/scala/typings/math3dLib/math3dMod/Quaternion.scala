package typings
package math3dLib.math3dMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("math3d", "Quaternion")
@js.native
class Quaternion () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double) = this()
  var angleAxis: math3dLib.Anon_Angle = js.native
  var eulerAngles: math3dLib.Anon_X = js.native
  var w: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def angleTo(quaternion: Quaternion): scala.Double = js.native
  def conjugate(): Quaternion = js.native
  def distanceTo(quaternion: Quaternion): scala.Double = js.native
  def dot(quaternion: Quaternion): scala.Double = js.native
  def equals(quaternion: Quaternion): scala.Boolean = js.native
  def inverse(): Quaternion = js.native
  def mul(quaternion: Quaternion): Quaternion = js.native
  def mulVector3(vector3: Vector3): Vector3 = js.native
}

@JSImport("math3d", "Quaternion")
@js.native
object Quaternion extends js.Object {
  var identity: math3dLib.math3dMod.Quaternion = js.native
  var zero: math3dLib.math3dMod.Quaternion = js.native
  def AngleAxis(axis: math3dLib.math3dMod.Vector3, angle: scala.Double): math3dLib.math3dMod.Quaternion = js.native
  def Euler(): math3dLib.math3dMod.Quaternion = js.native
  def Euler(x: scala.Double): math3dLib.math3dMod.Quaternion = js.native
  def Euler(x: scala.Double, y: scala.Double): math3dLib.math3dMod.Quaternion = js.native
  def Euler(x: scala.Double, y: scala.Double, z: scala.Double): math3dLib.math3dMod.Quaternion = js.native
}

