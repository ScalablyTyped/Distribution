package typings.atJimpTiff

import typings.atJimpCore.typesEtcMod.Bitmap
import typings.atJimpCore.typesEtcMod.DecoderFn
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagetiffDecoderFn extends js.Object {
  @JSName("image/tiff")
  var `image/tiff_Original`: DecoderFn = js.native
  def `image/tiff`(data: Buffer): Bitmap = js.native
}

