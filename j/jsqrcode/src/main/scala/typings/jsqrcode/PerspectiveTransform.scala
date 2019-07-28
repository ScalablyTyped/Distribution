package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PerspectiveTransform")
@js.native
class PerspectiveTransform protected () extends js.Object {
  def this(
    a11: Double,
    a21: Double,
    a31: Double,
    a12: Double,
    a22: Double,
    a32: Double,
    a13: Double,
    a23: Double,
    a33: Double
  ) = this()
  var a11: Double = js.native
  var a12: Double = js.native
  var a13: Double = js.native
  var a21: Double = js.native
  var a22: Double = js.native
  var a23: Double = js.native
  var a31: Double = js.native
  var a32: Double = js.native
  var a33: Double = js.native
  def buildAdjoint(): PerspectiveTransform = js.native
  def times(other: PerspectiveTransform): PerspectiveTransform = js.native
  def transformPoints1(points: js.Array[Double]): Unit = js.native
  def transformPoints2(xValues: js.Array[Double], yValues: js.Array[Double]): Unit = js.native
}

/* static members */
@JSGlobal("PerspectiveTransform")
@js.native
object PerspectiveTransform extends js.Object {
  def quadrilateralToQuadrilateral(
    x0: Double,
    y0: Double,
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x0p: Double,
    y0p: Double,
    x1p: Double,
    y1p: Double,
    x2p: Double,
    y2p: Double,
    x3p: Double,
    y3p: Double
  ): PerspectiveTransform = js.native
  def quadrilateralToSquare(x0: Double, y0: Double, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): PerspectiveTransform = js.native
  def squareToQuadrilateral(x0: Double, y0: Double, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): PerspectiveTransform = js.native
}

