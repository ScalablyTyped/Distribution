package typings.atJimpPng

import typings.atJimpCore.typesEtcMod.EncoderFn
import typings.atJimpCore.typesEtcMod.Image
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagepngEncoderFn extends js.Object {
  @JSName("image/png")
  var `image/png_Original`: EncoderFn[Image] = js.native
  def `image/png`(image: Image): Buffer = js.native
}

