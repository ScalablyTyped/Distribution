package typings.jimpJpeg.anon

import typings.jimpCore.etcMod.EncoderFn
import typings.jimpCore.etcMod.Image
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagejpegEncoderFn extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg_Original: EncoderFn[Image] = js.native
  @JSName("image/jpeg")
  def imageSlashjpeg(image: Image): Buffer = js.native
}

