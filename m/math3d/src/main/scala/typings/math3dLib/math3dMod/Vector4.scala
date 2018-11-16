package typings
package math3dLib.math3dMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("math3d", "Vector4")
@js.native
class Vector4 () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double) = this()
  var magnitude: scala.Double = js.native
  var values: js.Array[scala.Double] = js.native
  var w: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def add(vector4: Vector4): Vector4 = js.native
  def distanceTo(vector4: Vector4): scala.Double = js.native
  def dot(vector4: Vector4): scala.Double = js.native
  def equals(vector4: Vector4): scala.Boolean = js.native
  def mulScalar(scalar: scala.Double): Vector4 = js.native
  def negate(): Vector4 = js.native
  def normalize(): Vector3 = js.native
  def sub(vector4: Vector4): Vector3 = js.native
}

@JSImport("math3d", "Vector4")
@js.native
object Vector4 extends js.Object {
  var dimension: scala.Double = js.native
  var one: math3dLib.math3dMod.Vector4 = js.native
  var zero: math3dLib.math3dMod.Vector4 = js.native
}

