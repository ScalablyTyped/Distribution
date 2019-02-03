package typings
package leapmotiontsLib.leapmotiontsMod

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
  var DEG_TO_RAD: scala.Double = js.native
  var EPSILON: scala.Double = js.native
  var HALF_PI: scala.Double = js.native
  var PI: scala.Double = js.native
  var RAD_TO_DEG: scala.Double = js.native
  var TWO_PI: scala.Double = js.native
  def cartesianToSpherical(vCartesian: leapmotiontsLib.leapmotiontsMod.Vector3): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def clamp(inVal: scala.Double, minVal: scala.Double, maxVal: scala.Double): scala.Double = js.native
  def componentWiseMax(vLHS: leapmotiontsLib.leapmotiontsMod.Vector3, vRHS: leapmotiontsLib.leapmotiontsMod.Vector3): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def componentWiseMin(vLHS: leapmotiontsLib.leapmotiontsMod.Vector3, vRHS: leapmotiontsLib.leapmotiontsMod.Vector3): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def componentWiseReciprocal(inVector: leapmotiontsLib.leapmotiontsMod.Vector3): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def componentWiseScale(vLHS: leapmotiontsLib.leapmotiontsMod.Vector3, vRHS: leapmotiontsLib.leapmotiontsMod.Vector3): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def elevation(inVector: leapmotiontsLib.leapmotiontsMod.Vector3): scala.Double = js.native
  def extractRotation(mtxTransform: leapmotiontsLib.leapmotiontsMod.Matrix): leapmotiontsLib.leapmotiontsMod.Matrix = js.native
  def heading(inVector: leapmotiontsLib.leapmotiontsMod.Vector3): scala.Double = js.native
  def isNearZero(value: scala.Double): scala.Boolean = js.native
  def lerp(a: scala.Double, b: scala.Double, coefficient: scala.Double): scala.Double = js.native
  def lerpVector(
    vec1: leapmotiontsLib.leapmotiontsMod.Vector3,
    vec2: leapmotiontsLib.leapmotiontsMod.Vector3,
    coefficient: scala.Double
  ): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def maxComponent(inVector: leapmotiontsLib.leapmotiontsMod.Vector3): scala.Double = js.native
  def minComponent(inVector: leapmotiontsLib.leapmotiontsMod.Vector3): scala.Double = js.native
  def normalizeSpherical(vSpherical: leapmotiontsLib.leapmotiontsMod.Vector3): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def rigidInverse(mtxTransform: leapmotiontsLib.leapmotiontsMod.Matrix): leapmotiontsLib.leapmotiontsMod.Matrix = js.native
  def rotationInverse(mtxRot: leapmotiontsLib.leapmotiontsMod.Matrix): leapmotiontsLib.leapmotiontsMod.Matrix = js.native
  def sphericalToCartesian(vSpherical: leapmotiontsLib.leapmotiontsMod.Vector3): leapmotiontsLib.leapmotiontsMod.Vector3 = js.native
  def toDegrees(radians: scala.Double): scala.Double = js.native
  def vectorIsNearZero(inVector: leapmotiontsLib.leapmotiontsMod.Vector3): scala.Boolean = js.native
}

