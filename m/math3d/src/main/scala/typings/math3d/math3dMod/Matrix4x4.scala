package typings.math3d.math3dMod

import typings.math3d.Anon_Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("math3d", "Matrix4x4")
@js.native
class Matrix4x4 protected () extends js.Object {
  def this(data: js.Array[Double]) = this()
  var columns: js.Array[js.Array[Double]] = js.native
  var m11: Double = js.native
  var m12: Double = js.native
  var m13: Double = js.native
  var m14: Double = js.native
  var m21: Double = js.native
  var m22: Double = js.native
  var m23: Double = js.native
  var m24: Double = js.native
  var m31: Double = js.native
  var m32: Double = js.native
  var m33: Double = js.native
  var m34: Double = js.native
  var m41: Double = js.native
  var m42: Double = js.native
  var m43: Double = js.native
  var m44: Double = js.native
  var rows: js.Array[js.Array[Double]] = js.native
  var size: Anon_Columns = js.native
  var values: js.Array[Double] = js.native
  def add(matrix4x4: Matrix4x4): Matrix4x4 = js.native
  def determinant(): Double = js.native
  def inverse(): Matrix4x4 = js.native
  def mul(matrix4x4: Matrix4x4): Matrix4x4 = js.native
  def mulScalar(scalar: Double): Matrix4x4 = js.native
  def mulVector3(vector3: Vector3): Vector3 = js.native
  def negate(): Matrix4x4 = js.native
  def sub(matrix4x4: Matrix4x4): Matrix4x4 = js.native
  def transpose(): Matrix4x4 = js.native
}

/* static members */
@JSImport("math3d", "Matrix4x4")
@js.native
object Matrix4x4 extends js.Object {
  var identity: Matrix4x4 = js.native
  var zero: Matrix4x4 = js.native
  def FlipMatrix(flipX: Boolean, flipY: Boolean, flipZ: Boolean): Matrix4x4 = js.native
  def LocalToWorldMatrix(position: Vector3, rotation: Quaternion, scale: Double): Matrix4x4 = js.native
  def LocalToWorldMatrix(position: Vector3, rotation: Quaternion, scale: Vector3): Matrix4x4 = js.native
  def RotationMatrix(quaternion: Quaternion): Matrix4x4 = js.native
  def ScaleMatrix(scale: Double): Matrix4x4 = js.native
  def ScaleMatrix(scale: Vector3): Matrix4x4 = js.native
  def TRS(translation: Vector3, rotation: Quaternion, scale: Double): Matrix4x4 = js.native
  def TRS(translation: Vector3, rotation: Quaternion, scale: Vector3): Matrix4x4 = js.native
  def TranslationMatrix(translation: Vector3): Matrix4x4 = js.native
  def WorldToLocalMatrix(position: Vector3, rotation: Quaternion, scale: Double): Matrix4x4 = js.native
  def WorldToLocalMatrix(position: Vector3, rotation: Quaternion, scale: Vector3): Matrix4x4 = js.native
}

