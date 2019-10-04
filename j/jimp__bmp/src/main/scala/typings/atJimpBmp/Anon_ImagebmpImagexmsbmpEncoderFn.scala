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
  var `image/bmp_Original`: EncoderFn[Image] = js.native
  @JSName("image/x-ms-bmp")
  var `image/x-ms-bmp_Original`: EncoderFn[Image] = js.native
  def `image/bmp`(image: Image): Buffer = js.native
  def `image/x-ms-bmp`(image: Image): Buffer = js.native
}

