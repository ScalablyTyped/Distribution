package typings.atJimpBmp

import typings.atJimpCore.typesEtcMod.Bitmap
import typings.atJimpCore.typesEtcMod.DecoderFn
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagebmpImagexmsbmp extends js.Object {
  @JSName("image/bmp")
  var `image/bmp_Original`: DecoderFn = js.native
  @JSName("image/x-ms-bmp")
  var `image/x-ms-bmp_Original`: DecoderFn = js.native
  def `image/bmp`(data: Buffer): Bitmap = js.native
  def `image/x-ms-bmp`(data: Buffer): Bitmap = js.native
}

