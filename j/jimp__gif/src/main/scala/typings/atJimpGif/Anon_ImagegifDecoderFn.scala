package typings.atJimpGif

import typings.atJimpCore.typesEtcMod.Bitmap
import typings.atJimpCore.typesEtcMod.DecoderFn
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagegifDecoderFn extends js.Object {
  @JSName("image/gif")
  var `image/gif_Original`: DecoderFn = js.native
  def `image/gif`(data: Buffer): Bitmap = js.native
}

