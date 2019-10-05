package typings.makerDotJs

import org.scalablytyped.runtime.Instantiable1
import typings.bezierDashJs.BezierJs.ABC
import typings.bezierDashJs.BezierJs.Point
import typings.bezierDashJs.Typeofutils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Bezier")
@js.native
class Bezier protected ()
  extends typings.bezierDashJs.BezierJs.Bezier {
  def this(points: js.Array[Point]) = this()
}

@JSGlobal("Bezier")
@js.native
object Bezier
  extends Instantiable1[/* points */ js.Array[Point], typings.bezierDashJs.BezierJs.Bezier] {
  def cubicFromPoints(S: Point, B: Point, E: Point): typings.bezierDashJs.BezierJs.Bezier = js.native
  def cubicFromPoints(S: Point, B: Point, E: Point, t: Double): typings.bezierDashJs.BezierJs.Bezier = js.native
  def cubicFromPoints(S: Point, B: Point, E: Point, t: Double, d1: Double): typings.bezierDashJs.BezierJs.Bezier = js.native
  def fromSVG(svgString: String): typings.bezierDashJs.BezierJs.Bezier = js.native
  def getABC(n: Double, S: Point, B: Point, E: Point, t: Double): ABC = js.native
  def getUtils(): Typeofutils = js.native
  def quadraticFromPoints(p1: Point, p2: Point, p3: Point): typings.bezierDashJs.BezierJs.Bezier = js.native
  def quadraticFromPoints(p1: Point, p2: Point, p3: Point, t: Double): typings.bezierDashJs.BezierJs.Bezier = js.native
}

