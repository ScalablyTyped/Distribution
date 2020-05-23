package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DetectorResult")
@js.native
class DetectorResult protected ()
  extends typings.jsqrcode.DetectorResult {
  def this(
    bits: typings.jsqrcode.BitMatrix,
    points: js.Tuple3[
        typings.jsqrcode.DetectorResult, 
        typings.jsqrcode.DetectorResult, 
        typings.jsqrcode.DetectorResult
      ]
  ) = this()
  def this(
    bits: typings.jsqrcode.BitMatrix,
    points: js.Tuple4[
        typings.jsqrcode.DetectorResult, 
        typings.jsqrcode.DetectorResult, 
        typings.jsqrcode.DetectorResult, 
        typings.jsqrcode.DetectorResult
      ]
  ) = this()
  /* CompleteClass */
  override var bits: typings.jsqrcode.BitMatrix = js.native
  /* CompleteClass */
  override var points: (js.Tuple3[
    typings.jsqrcode.DetectorResult, 
    typings.jsqrcode.DetectorResult, 
    typings.jsqrcode.DetectorResult
  ]) | (js.Tuple4[
    typings.jsqrcode.DetectorResult, 
    typings.jsqrcode.DetectorResult, 
    typings.jsqrcode.DetectorResult, 
    typings.jsqrcode.DetectorResult
  ]) = js.native
}

