package typings.leapmotionts.leapmotiontsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "LeapUtil")
@js.native
class LeapUtil () extends js.Object

/* static members */
@JSImport("leapmotionts", "LeapUtil")
@js.native
object LeapUtil extends js.Object {
  var DEG_TO_RAD: Double = js.native
  var EPSILON: Double = js.native
  var HALF_PI: Double = js.native
  var PI: Double = js.native
  var RAD_TO_DEG: Double = js.native
  var TWO_PI: Double = js.native
  def cartesianToSpherical(vCartesian: Vector3): Vector3 = js.native
  def clamp(inVal: Double, minVal: Double, maxVal: Double): Double = js.native
  def componentWiseMax(vLHS: Vector3, vRHS: Vector3): Vector3 = js.native
  def componentWiseMin(vLHS: Vector3, vRHS: Vector3): Vector3 = js.native
  def componentWiseReciprocal(inVector: Vector3): Vector3 = js.native
  def componentWiseScale(vLHS: Vector3, vRHS: Vector3): Vector3 = js.native
  def elevation(inVector: Vector3): Double = js.native
  def extractRotation(mtxTransform: Matrix): Matrix = js.native
  def heading(inVector: Vector3): Double = js.native
  def isNearZero(value: Double): Boolean = js.native
  def lerp(a: Double, b: Double, coefficient: Double): Double = js.native
  def lerpVector(vec1: Vector3, vec2: Vector3, coefficient: Double): Vector3 = js.native
  def maxComponent(inVector: Vector3): Double = js.native
  def minComponent(inVector: Vector3): Double = js.native
  def normalizeSpherical(vSpherical: Vector3): Vector3 = js.native
  def rigidInverse(mtxTransform: Matrix): Matrix = js.native
  def rotationInverse(mtxRot: Matrix): Matrix = js.native
  def sphericalToCartesian(vSpherical: Vector3): Vector3 = js.native
  def toDegrees(radians: Double): Double = js.native
  def vectorIsNearZero(inVector: Vector3): Boolean = js.native
}

