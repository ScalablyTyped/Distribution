package typings
package makerDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Bezier")
@js.native
class Bezier protected ()
  extends bezierDashJsLib.BezierJsNs.Bezier {
  def this(points: js.Array[bezierDashJsLib.BezierJsNs.Point]) = this()
}

@JSGlobal("Bezier")
@js.native
object Bezier
  extends org.scalablytyped.runtime.Instantiable1[
      /* points */ js.Array[bezierDashJsLib.BezierJsNs.Point], 
      bezierDashJsLib.BezierJsNs.Bezier
    ] {
  def cubicFromPoints(
    S: bezierDashJsLib.BezierJsNs.Point,
    B: bezierDashJsLib.BezierJsNs.Point,
    E: bezierDashJsLib.BezierJsNs.Point
  ): bezierDashJsLib.BezierJsNs.Bezier = js.native
  def cubicFromPoints(
    S: bezierDashJsLib.BezierJsNs.Point,
    B: bezierDashJsLib.BezierJsNs.Point,
    E: bezierDashJsLib.BezierJsNs.Point,
    t: scala.Double
  ): bezierDashJsLib.BezierJsNs.Bezier = js.native
  def cubicFromPoints(
    S: bezierDashJsLib.BezierJsNs.Point,
    B: bezierDashJsLib.BezierJsNs.Point,
    E: bezierDashJsLib.BezierJsNs.Point,
    t: scala.Double,
    d1: scala.Double
  ): bezierDashJsLib.BezierJsNs.Bezier = js.native
  def fromSVG(svgString: java.lang.String): bezierDashJsLib.BezierJsNs.Bezier = js.native
  def getABC(
    n: scala.Double,
    S: bezierDashJsLib.BezierJsNs.Point,
    B: bezierDashJsLib.BezierJsNs.Point,
    E: bezierDashJsLib.BezierJsNs.Point,
    t: scala.Double
  ): bezierDashJsLib.BezierJsNs.ABC = js.native
  def getUtils(): bezierDashJsLib.Anon_A = js.native
  def quadraticFromPoints(
    p1: bezierDashJsLib.BezierJsNs.Point,
    p2: bezierDashJsLib.BezierJsNs.Point,
    p3: bezierDashJsLib.BezierJsNs.Point
  ): bezierDashJsLib.BezierJsNs.Bezier = js.native
  def quadraticFromPoints(
    p1: bezierDashJsLib.BezierJsNs.Point,
    p2: bezierDashJsLib.BezierJsNs.Point,
    p3: bezierDashJsLib.BezierJsNs.Point,
    t: scala.Double
  ): bezierDashJsLib.BezierJsNs.Bezier = js.native
}

