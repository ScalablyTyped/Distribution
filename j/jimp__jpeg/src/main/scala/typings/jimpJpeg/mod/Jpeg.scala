package typings.jimpJpeg.mod

import typings.jimpJpeg.anon.Imagejpeg
import typings.jimpJpeg.anon.ImagejpegDecoderFn
import typings.jimpJpeg.anon.ImagejpegEncoderFn
import typings.jimpJpeg.anon.ImagejpegString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jpeg extends js.Object {
  var `class`: JpegClass
  var constants: ImagejpegString
  var decoders: ImagejpegDecoderFn
  var encoders: ImagejpegEncoderFn
  var mime: Imagejpeg
}

object Jpeg {
  @scala.inline
  def apply(
    `class`: JpegClass,
    constants: ImagejpegString,
    decoders: ImagejpegDecoderFn,
    encoders: ImagejpegEncoderFn,
    mime: Imagejpeg
  ): Jpeg = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jpeg]
  }
}

