package typings.math3d.math3dMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("math3d", "Vector3")
@js.native
class Vector3 () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  var homogeneous: Vector4 = js.native
  var magnitude: Double = js.native
  var values: js.Array[Double] = js.native
  var vector4: Vector4 = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def add(vector3: Vector3): Vector3 = js.native
  def average(vector3: Vector3): Vector3 = js.native
  def cross(vector3: Vector3): Vector3 = js.native
  def distanceTo(vector3: Vector3): Double = js.native
  def dot(vector3: Vector3): Double = js.native
  def equals(vector3: Vector3): Boolean = js.native
  def mulScalar(scalar: Double): Vector3 = js.native
  def negate(): Vector3 = js.native
  def normalize(): Vector3 = js.native
  def scale(vector3: Vector3): Vector3 = js.native
  def sub(vector3: Vector3): Vector3 = js.native
}

/* static members */
@JSImport("math3d", "Vector3")
@js.native
object Vector3 extends js.Object {
  var back: Vector3 = js.native
  var dimension: Double = js.native
  var down: Vector3 = js.native
  var forward: Vector3 = js.native
  var left: Vector3 = js.native
  var one: Vector3 = js.native
  var right: Vector3 = js.native
  var up: Vector3 = js.native
  var zero: Vector3 = js.native
  def FromVector4(vector4: Vector4): Vector3 = js.native
}

