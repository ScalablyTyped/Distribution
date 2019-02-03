package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PerspectiveTransform")
@js.native
class PerspectiveTransform protected () extends js.Object {
  def this(a11: scala.Double, a21: scala.Double, a31: scala.Double, a12: scala.Double, a22: scala.Double, a32: scala.Double, a13: scala.Double, a23: scala.Double, a33: scala.Double) = this()
  var a11: scala.Double = js.native
  var a12: scala.Double = js.native
  var a13: scala.Double = js.native
  var a21: scala.Double = js.native
  var a22: scala.Double = js.native
  var a23: scala.Double = js.native
  var a31: scala.Double = js.native
  var a32: scala.Double = js.native
  var a33: scala.Double = js.native
  def buildAdjoint(): PerspectiveTransform = js.native
  def times(other: PerspectiveTransform): PerspectiveTransform = js.native
  def transformPoints1(points: js.Array[scala.Double]): scala.Unit = js.native
  def transformPoints2(xValues: js.Array[scala.Double], yValues: js.Array[scala.Double]): scala.Unit = js.native
}

/* static members */
@JSGlobal("PerspectiveTransform")
@js.native
object PerspectiveTransform extends js.Object {
  def quadrilateralToQuadrilateral(
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    x0p: scala.Double,
    y0p: scala.Double,
    x1p: scala.Double,
    y1p: scala.Double,
    x2p: scala.Double,
    y2p: scala.Double,
    x3p: scala.Double,
    y3p: scala.Double
  ): jsqrcodeLib.PerspectiveTransform = js.native
  def quadrilateralToSquare(
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double
  ): jsqrcodeLib.PerspectiveTransform = js.native
  def squareToQuadrilateral(
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double
  ): jsqrcodeLib.PerspectiveTransform = js.native
}

