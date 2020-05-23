package typings.jimpGif.anon

import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.DecoderFn
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagegifDecoderFn extends js.Object {
  @JSName("image/gif")
  var imageSlashgif_Original: DecoderFn = js.native
  @JSName("image/gif")
  def imageSlashgif(data: Buffer): Bitmap = js.native
}

