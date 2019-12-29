package typings.atJimpTiff

import typings.atJimpCore.typesEtcMod.EncoderFn
import typings.atJimpCore.typesEtcMod.Image
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagetiffEncoderFn extends js.Object {
  @JSName("image/tiff")
  var imageSlashtiff_Original: EncoderFn[Image] = js.native
  @JSName("image/tiff")
  def imageSlashtiff(image: Image): Buffer = js.native
}

