package typings.jimpTiff

import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.DecoderFn
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImagetiffDecoderFn extends js.Object {
  @JSName("image/tiff")
  var imageSlashtiff_Original: DecoderFn = js.native
  @JSName("image/tiff")
  def imageSlashtiff(data: Buffer): Bitmap = js.native
}

