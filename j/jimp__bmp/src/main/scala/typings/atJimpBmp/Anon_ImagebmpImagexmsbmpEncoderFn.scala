package typings.atJimpBmp

import typings.atJimpCore.typesEtcMod.EncoderFn
import typings.atJimpCore.typesEtcMod.Image
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagebmpImagexmsbmpEncoderFn extends js.Object {
  @JSName("image/bmp")
  var imageSlashbmp_Original: EncoderFn[Image] = js.native
  @JSName("image/x-ms-bmp")
  var `imageSlashx-ms-bmp_Original`: EncoderFn[Image] = js.native
  @JSName("image/bmp")
  def imageSlashbmp(image: Image): Buffer = js.native
  @JSName("image/x-ms-bmp")
  def `imageSlashx-ms-bmp`(image: Image): Buffer = js.native
}

