package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BezierPlugin extends TweenPlugin {
  def bezierThrough(values: js.Array[_]): js.Object = js.native
  def bezierThrough(values: js.Array[_], curviness: Double): js.Object = js.native
  def bezierThrough(values: js.Array[_], curviness: Double, quadratic: Boolean): js.Object = js.native
  def bezierThrough(values: js.Array[_], curviness: Double, quadratic: Boolean, correlate: String): js.Object = js.native
  def bezierThrough(values: js.Array[_], curviness: Double, quadratic: Boolean, correlate: String, prepend: js.Object): js.Object = js.native
  def bezierThrough(
    values: js.Array[_],
    curviness: Double,
    quadratic: Boolean,
    correlate: String,
    prepend: js.Object,
    calcDifs: Boolean
  ): js.Object = js.native
  def cubicToQuadratic(a: Double, b: Double, c: Double, d: Double): js.Array[_] = js.native
  def quadraticToCubic(a: Double, b: Double, c: Double): js.Object = js.native
}

