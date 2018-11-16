package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DetectorResult")
@js.native
class DetectorResult protected () extends js.Object {
  def this(bits: BitMatrix, points: js.Tuple3[DetectorResult, DetectorResult, DetectorResult]) = this()
  def this(bits: BitMatrix, points: js.Tuple4[DetectorResult, DetectorResult, DetectorResult, DetectorResult]) = this()
  var bits: BitMatrix = js.native
  var points: (js.Tuple3[DetectorResult, DetectorResult, DetectorResult]) | (js.Tuple4[DetectorResult, DetectorResult, DetectorResult, DetectorResult]) = js.native
}

