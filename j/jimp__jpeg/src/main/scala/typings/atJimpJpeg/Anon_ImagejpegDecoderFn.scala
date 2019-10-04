package typings.atJimpJpeg

import typings.atJimpCore.typesEtcMod.Bitmap
import typings.atJimpCore.typesEtcMod.DecoderFn
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagejpegDecoderFn extends js.Object {
  @JSName("image/jpeg")
  var `image/jpeg_Original`: DecoderFn = js.native
  def `image/jpeg`(data: Buffer): Bitmap = js.native
}

