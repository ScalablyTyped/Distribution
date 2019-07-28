package typings.math3d.math3dMod

import typings.math3d.math3dMod.TransformNs.Space
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

