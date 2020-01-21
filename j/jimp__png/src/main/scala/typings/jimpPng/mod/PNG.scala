package typings.jimpPng.mod

import typings.jimpPng.Anon0
import typings.jimpPng.AnonImagepng
import typings.jimpPng.AnonImagepngDecoderFn
import typings.jimpPng.AnonImagepngEncoderFn
import typings.jimpPng.AnonImagepngTrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNG extends js.Object {
  var `class`: PNGClass
  var constants: Anon0
  var decoders: AnonImagepngDecoderFn
  var encoders: AnonImagepngEncoderFn
  var hasAlpha: AnonImagepngTrue
  var mime: AnonImagepng
}

object PNG {
  @scala.inline
  def apply(
    `class`: PNGClass,
    constants: Anon0,
    decoders: AnonImagepngDecoderFn,
    encoders: AnonImagepngEncoderFn,
    hasAlpha: AnonImagepngTrue,
    mime: AnonImagepng
  ): PNG = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], hasAlpha = hasAlpha.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNG]
  }
}

