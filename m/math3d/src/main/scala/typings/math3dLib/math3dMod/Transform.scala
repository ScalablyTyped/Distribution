package typings
package math3dLib.math3dMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("math3d", "Transform")
@js.native
class Transform () extends js.Object {
  def this(position: Vector3) = this()
  def this(position: Vector3, rotation: Quaternion) = this()
  var forward: Vector3 = js.native
  var localPosition: Vector3 = js.native
  var localRotation: Quaternion = js.native
  var localToWorldMatrix: Matrix4x4 = js.native
  var name: java.lang.String = js.native
  var parent: Transform = js.native
  var position: Vector3 = js.native
  var right: Vector3 = js.native
  var root: Transform = js.native
  var rotation: Quaternion = js.native
  var up: Vector3 = js.native
  var worldToLocalMatrix: Matrix4x4 = js.native
  def addChild(child: Transform): scala.Unit = js.native
  def inverseTransformPosition(position: Vector3): Vector3 = js.native
  def removeChild(child: Transform): scala.Unit = js.native
  def rotate(x: scala.Double, y: scala.Double, z: scala.Double): Transform = js.native
  def rotate(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    relativeTo: math3dLib.math3dMod.TransformNs.Space
  ): Transform = js.native
  def transformPosition(position: Vector3): Vector3 = js.native
  def translate(translation: Vector3): Transform = js.native
  def translate(translation: Vector3, relativeTo: math3dLib.math3dMod.TransformNs.Space): Transform = js.native
}

