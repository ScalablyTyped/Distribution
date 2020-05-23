package typings.jimpPng.anon

import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.DecoderFn
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagepngDecoderFn extends js.Object {
  @JSName("image/png")
  var imageSlashpng_Original: DecoderFn = js.native
  @JSName("image/png")
  def imageSlashpng(data: Buffer): Bitmap = js.native
}

