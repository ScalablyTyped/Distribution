package typings.atJimpPng

import typings.atJimpCore.typesEtcMod.Bitmap
import typings.atJimpCore.typesEtcMod.DecoderFn
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagepngDecoderFn extends js.Object {
  @JSName("image/png")
  var imageSlashpng_Original: DecoderFn = js.native
  @JSName("image/png")
  def imageSlashpng(data: Buffer): Bitmap = js.native
}

