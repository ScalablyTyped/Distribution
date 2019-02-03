package typings
package math3dLib.math3dMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("math3d", "Matrix4x4")
@js.native
class Matrix4x4 protected () extends js.Object {
  def this(data: js.Array[scala.Double]) = this()
  var columns: js.Array[js.Array[scala.Double]] = js.native
  var m11: scala.Double = js.native
  var m12: scala.Double = js.native
  var m13: scala.Double = js.native
  var m14: scala.Double = js.native
  var m21: scala.Double = js.native
  var m22: scala.Double = js.native
  var m23: scala.Double = js.native
  var m24: scala.Double = js.native
  var m31: scala.Double = js.native
  var m32: scala.Double = js.native
  var m33: scala.Double = js.native
  var m34: scala.Double = js.native
  var m41: scala.Double = js.native
  var m42: scala.Double = js.native
  var m43: scala.Double = js.native
  var m44: scala.Double = js.native
  var rows: js.Array[js.Array[scala.Double]] = js.native
  var size: math3dLib.Anon_Columns = js.native
  var values: js.Array[scala.Double] = js.native
  def add(matrix4x4: Matrix4x4): Matrix4x4 = js.native
  def determinant(): scala.Double = js.native
  def inverse(): Matrix4x4 = js.native
  def mul(matrix4x4: Matrix4x4): Matrix4x4 = js.native
  def mulScalar(scalar: scala.Double): Matrix4x4 = js.native
  def mulVector3(vector3: Vector3): Vector3 = js.native
  def negate(): Matrix4x4 = js.native
  def sub(matrix4x4: Matrix4x4): Matrix4x4 = js.native
  def transpose(): Matrix4x4 = js.native
}

/* static members */
@JSImport("math3d", "Matrix4x4")
@js.native
object Matrix4x4 extends js.Object {
  var identity: math3dLib.math3dMod.Matrix4x4 = js.native
  var zero: math3dLib.math3dMod.Matrix4x4 = js.native
  def FlipMatrix(flipX: scala.Boolean, flipY: scala.Boolean, flipZ: scala.Boolean): math3dLib.math3dMod.Matrix4x4 = js.native
  def LocalToWorldMatrix(
    position: math3dLib.math3dMod.Vector3,
    rotation: math3dLib.math3dMod.Quaternion,
    scale: math3dLib.math3dMod.Vector3
  ): math3dLib.math3dMod.Matrix4x4 = js.native
  def LocalToWorldMatrix(
    position: math3dLib.math3dMod.Vector3,
    rotation: math3dLib.math3dMod.Quaternion,
    scale: scala.Double
  ): math3dLib.math3dMod.Matrix4x4 = js.native
  def RotationMatrix(quaternion: math3dLib.math3dMod.Quaternion): math3dLib.math3dMod.Matrix4x4 = js.native
  def ScaleMatrix(scale: math3dLib.math3dMod.Vector3): math3dLib.math3dMod.Matrix4x4 = js.native
  def ScaleMatrix(scale: scala.Double): math3dLib.math3dMod.Matrix4x4 = js.native
  def TRS(
    translation: math3dLib.math3dMod.Vector3,
    rotation: math3dLib.math3dMod.Quaternion,
    scale: math3dLib.math3dMod.Vector3
  ): math3dLib.math3dMod.Matrix4x4 = js.native
  def TRS(
    translation: math3dLib.math3dMod.Vector3,
    rotation: math3dLib.math3dMod.Quaternion,
    scale: scala.Double
  ): math3dLib.math3dMod.Matrix4x4 = js.native
  def TranslationMatrix(translation: math3dLib.math3dMod.Vector3): math3dLib.math3dMod.Matrix4x4 = js.native
  def WorldToLocalMatrix(
    position: math3dLib.math3dMod.Vector3,
    rotation: math3dLib.math3dMod.Quaternion,
    scale: math3dLib.math3dMod.Vector3
  ): math3dLib.math3dMod.Matrix4x4 = js.native
  def WorldToLocalMatrix(
    position: math3dLib.math3dMod.Vector3,
    rotation: math3dLib.math3dMod.Quaternion,
    scale: scala.Double
  ): math3dLib.math3dMod.Matrix4x4 = js.native
}

