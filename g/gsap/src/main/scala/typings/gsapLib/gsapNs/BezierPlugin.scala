package typings
package gsapLib.gsapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BezierPlugin extends TweenPlugin {
  def bezierThrough(values: js.Array[_]): js.Object = js.native
  def bezierThrough(values: js.Array[_], curviness: scala.Double): js.Object = js.native
  def bezierThrough(values: js.Array[_], curviness: scala.Double, quadratic: scala.Boolean): js.Object = js.native
  def bezierThrough(
    values: js.Array[_],
    curviness: scala.Double,
    quadratic: scala.Boolean,
    correlate: java.lang.String
  ): js.Object = js.native
  def bezierThrough(
    values: js.Array[_],
    curviness: scala.Double,
    quadratic: scala.Boolean,
    correlate: java.lang.String,
    prepend: js.Object
  ): js.Object = js.native
  def bezierThrough(
    values: js.Array[_],
    curviness: scala.Double,
    quadratic: scala.Boolean,
    correlate: java.lang.String,
    prepend: js.Object,
    calcDifs: scala.Boolean
  ): js.Object = js.native
  def cubicToQuadratic(a: scala.Double, b: scala.Double, c: scala.Double, d: scala.Double): js.Array[_] = js.native
  def quadraticToCubic(a: scala.Double, b: scala.Double, c: scala.Double): js.Object = js.native
}

