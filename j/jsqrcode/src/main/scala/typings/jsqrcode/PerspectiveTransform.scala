package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerspectiveTransform extends js.Object {
  var a11: Double
  var a12: Double
  var a13: Double
  var a21: Double
  var a22: Double
  var a23: Double
  var a31: Double
  var a32: Double
  var a33: Double
  def buildAdjoint(): PerspectiveTransform
  def times(other: PerspectiveTransform): PerspectiveTransform
  def transformPoints1(points: js.Array[Double]): Unit
  def transformPoints2(xValues: js.Array[Double], yValues: js.Array[Double]): Unit
}

object PerspectiveTransform {
  @scala.inline
  def apply(
    a11: Double,
    a12: Double,
    a13: Double,
    a21: Double,
    a22: Double,
    a23: Double,
    a31: Double,
    a32: Double,
    a33: Double,
    buildAdjoint: () => PerspectiveTransform,
    times: PerspectiveTransform => PerspectiveTransform,
    transformPoints1: js.Array[Double] => Unit,
    transformPoints2: (js.Array[Double], js.Array[Double]) => Unit
  ): PerspectiveTransform = {
    val __obj = js.Dynamic.literal(a11 = a11.asInstanceOf[js.Any], a12 = a12.asInstanceOf[js.Any], a13 = a13.asInstanceOf[js.Any], a21 = a21.asInstanceOf[js.Any], a22 = a22.asInstanceOf[js.Any], a23 = a23.asInstanceOf[js.Any], a31 = a31.asInstanceOf[js.Any], a32 = a32.asInstanceOf[js.Any], a33 = a33.asInstanceOf[js.Any], buildAdjoint = js.Any.fromFunction0(buildAdjoint), times = js.Any.fromFunction1(times), transformPoints1 = js.Any.fromFunction1(transformPoints1), transformPoints2 = js.Any.fromFunction2(transformPoints2))
    __obj.asInstanceOf[PerspectiveTransform]
  }
}

