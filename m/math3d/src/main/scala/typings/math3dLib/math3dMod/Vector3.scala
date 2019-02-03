package typings
package math3dLib.math3dMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("math3d", "Vector3")
@js.native
class Vector3 () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  var homogeneous: Vector4 = js.native
  var magnitude: scala.Double = js.native
  var values: js.Array[scala.Double] = js.native
  var vector4: Vector4 = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def add(vector3: Vector3): Vector3 = js.native
  def average(vector3: Vector3): Vector3 = js.native
  def cross(vector3: Vector3): Vector3 = js.native
  def distanceTo(vector3: Vector3): scala.Double = js.native
  def dot(vector3: Vector3): scala.Double = js.native
  def equals(vector3: Vector3): scala.Boolean = js.native
  def mulScalar(scalar: scala.Double): Vector3 = js.native
  def negate(): Vector3 = js.native
  def normalize(): Vector3 = js.native
  def scale(vector3: Vector3): Vector3 = js.native
  def sub(vector3: Vector3): Vector3 = js.native
}

/* static members */
@JSImport("math3d", "Vector3")
@js.native
object Vector3 extends js.Object {
  var back: math3dLib.math3dMod.Vector3 = js.native
  var dimension: scala.Double = js.native
  var down: math3dLib.math3dMod.Vector3 = js.native
  var forward: math3dLib.math3dMod.Vector3 = js.native
  var left: math3dLib.math3dMod.Vector3 = js.native
  var one: math3dLib.math3dMod.Vector3 = js.native
  var right: math3dLib.math3dMod.Vector3 = js.native
  var up: math3dLib.math3dMod.Vector3 = js.native
  var zero: math3dLib.math3dMod.Vector3 = js.native
  def FromVector4(vector4: math3dLib.math3dMod.Vector4): math3dLib.math3dMod.Vector3 = js.native
}

