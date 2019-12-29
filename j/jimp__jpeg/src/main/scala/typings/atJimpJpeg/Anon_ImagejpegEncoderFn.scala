package typings.atJimpJpeg

import typings.atJimpCore.typesEtcMod.EncoderFn
import typings.atJimpCore.typesEtcMod.Image
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagejpegEncoderFn extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg_Original: EncoderFn[Image] = js.native
  @JSName("image/jpeg")
  def imageSlashjpeg(image: Image): Buffer = js.native
}

