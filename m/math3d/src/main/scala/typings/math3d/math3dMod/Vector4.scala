package typings.math3d.math3dMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("math3d", "Vector4")
@js.native
class Vector4 () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  var magnitude: Double = js.native
  var values: js.Array[Double] = js.native
  var w: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def add(vector4: Vector4): Vector4 = js.native
  def distanceTo(vector4: Vector4): Double = js.native
  def dot(vector4: Vector4): Double = js.native
  def equals(vector4: Vector4): Boolean = js.native
  def mulScalar(scalar: Double): Vector4 = js.native
  def negate(): Vector4 = js.native
  def normalize(): Vector3 = js.native
  def sub(vector4: Vector4): Vector3 = js.native
}

/* static members */
@JSImport("math3d", "Vector4")
@js.native
object Vector4 extends js.Object {
  var dimension: Double = js.native
  var one: Vector4 = js.native
  var zero: Vector4 = js.native
}

