package typings.math3d

import org.scalablytyped.runtime.TopLevel
import typings.math3d.anon.Angle
import typings.math3d.anon.Columns
import typings.math3d.anon.X
import typings.math3d.mod.Transform.Space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("math3d", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
    var size: Columns = js.native
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
  
  @js.native
  class Quaternion () extends js.Object {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
    var angleAxis: Angle = js.native
    var eulerAngles: X = js.native
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
  
  @js.native
  class Transform () extends js.Object {
    def this(position: Vector3) = this()
    def this(position: Vector3, rotation: Quaternion) = this()
    var forward: Vector3 = js.native
    var localPosition: Vector3 = js.native
    var localRotation: Quaternion = js.native
    var localToWorldMatrix: Matrix4x4 = js.native
    var name: String = js.native
    var parent: Transform = js.native
    var position: Vector3 = js.native
    var right: Vector3 = js.native
    var root: Transform = js.native
    var rotation: Quaternion = js.native
    var up: Vector3 = js.native
    var worldToLocalMatrix: Matrix4x4 = js.native
    def addChild(child: Transform): Unit = js.native
    def inverseTransformPosition(position: Vector3): Vector3 = js.native
    def removeChild(child: Transform): Unit = js.native
    def rotate(x: Double, y: Double, z: Double): Transform = js.native
    def rotate(x: Double, y: Double, z: Double, relativeTo: Space): Transform = js.native
    def transformPosition(position: Vector3): Vector3 = js.native
    def translate(translation: Vector3): Transform = js.native
    def translate(translation: Vector3, relativeTo: Space): Transform = js.native
  }
  
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
  
  /* static members */
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
  
  @js.native
  object Transform extends js.Object {
    @js.native
    sealed trait Space extends js.Object
    
    @js.native
    object Space extends js.Object {
      @js.native
      sealed trait Self extends Space
      
      @js.native
      sealed trait World extends Space
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Space with Double] = js.native
      /* 0 */ @js.native
      object Self extends TopLevel[Self with Double]
      
      /* 1 */ @js.native
      object World extends TopLevel[World with Double]
      
    }
    
  }
  
  /* static members */
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
  
  /* static members */
  @js.native
  object Vector4 extends js.Object {
    var dimension: Double = js.native
    var one: Vector4 = js.native
    var zero: Vector4 = js.native
  }
  
}

