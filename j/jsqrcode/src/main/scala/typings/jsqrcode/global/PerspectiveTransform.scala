package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PerspectiveTransform")
@js.native
class PerspectiveTransform protected ()
  extends typings.jsqrcode.PerspectiveTransform {
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
  /* CompleteClass */
  override var a11: Double = js.native
  /* CompleteClass */
  override var a12: Double = js.native
  /* CompleteClass */
  override var a13: Double = js.native
  /* CompleteClass */
  override var a21: Double = js.native
  /* CompleteClass */
  override var a22: Double = js.native
  /* CompleteClass */
  override var a23: Double = js.native
  /* CompleteClass */
  override var a31: Double = js.native
  /* CompleteClass */
  override var a32: Double = js.native
  /* CompleteClass */
  override var a33: Double = js.native
  /* CompleteClass */
  override def buildAdjoint(): typings.jsqrcode.PerspectiveTransform = js.native
  /* CompleteClass */
  override def times(other: typings.jsqrcode.PerspectiveTransform): typings.jsqrcode.PerspectiveTransform = js.native
  /* CompleteClass */
  override def transformPoints1(points: js.Array[Double]): Unit = js.native
  /* CompleteClass */
  override def transformPoints2(xValues: js.Array[Double], yValues: js.Array[Double]): Unit = js.native
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
  ): typings.jsqrcode.PerspectiveTransform = js.native
  def quadrilateralToSquare(x0: Double, y0: Double, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): typings.jsqrcode.PerspectiveTransform = js.native
  def squareToQuadrilateral(x0: Double, y0: Double, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): typings.jsqrcode.PerspectiveTransform = js.native
}

