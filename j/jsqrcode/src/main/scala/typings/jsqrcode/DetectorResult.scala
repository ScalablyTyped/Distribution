package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorResult extends js.Object {
  var bits: BitMatrix
  var points: (js.Tuple3[DetectorResult, DetectorResult, DetectorResult]) | (js.Tuple4[DetectorResult, DetectorResult, DetectorResult, DetectorResult])
}

object DetectorResult {
  @scala.inline
  def apply(
    bits: BitMatrix,
    points: (js.Tuple3[DetectorResult, DetectorResult, DetectorResult]) | (js.Tuple4[DetectorResult, DetectorResult, DetectorResult, DetectorResult])
  ): DetectorResult = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorResult]
  }
}

