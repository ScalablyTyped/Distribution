package typings.atJimpTiff.atJimpTiffMod

import typings.atJimpTiff.Anon_Imagetiff
import typings.atJimpTiff.Anon_ImagetiffDecoderFn
import typings.atJimpTiff.Anon_ImagetiffEncoderFn
import typings.atJimpTiff.Anon_ImagetiffMIMETIFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tiff extends js.Object {
  var constants: Anon_ImagetiffMIMETIFF
  var decoders: Anon_ImagetiffDecoderFn
  var encoders: Anon_ImagetiffEncoderFn
  var mime: Anon_Imagetiff
}

object Tiff {
  @scala.inline
  def apply(
    constants: Anon_ImagetiffMIMETIFF,
    decoders: Anon_ImagetiffDecoderFn,
    encoders: Anon_ImagetiffEncoderFn,
    mime: Anon_Imagetiff
  ): Tiff = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tiff]
  }
}

