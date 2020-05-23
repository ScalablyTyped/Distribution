package typings.jimpPng.mod

import typings.jimpPng.anon.Imagepng
import typings.jimpPng.anon.ImagepngDecoderFn
import typings.jimpPng.anon.ImagepngEncoderFn
import typings.jimpPng.anon.MIMEPNG
import typings.jimpPng.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNG extends js.Object {
  var `class`: PNGClass
  var constants: MIMEPNG
  var decoders: ImagepngDecoderFn
  var encoders: ImagepngEncoderFn
  var hasAlpha: `0`
  var mime: Imagepng
}

object PNG {
  @scala.inline
  def apply(
    `class`: PNGClass,
    constants: MIMEPNG,
    decoders: ImagepngDecoderFn,
    encoders: ImagepngEncoderFn,
    hasAlpha: `0`,
    mime: Imagepng
  ): PNG = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], hasAlpha = hasAlpha.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNG]
  }
}

