package typings.atJimpPng.atJimpPngMod

import typings.atJimpPng.Anon_0
import typings.atJimpPng.Anon_Imagepng
import typings.atJimpPng.Anon_ImagepngDecoderFn
import typings.atJimpPng.Anon_ImagepngEncoderFn
import typings.atJimpPng.Anon_ImagepngTrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNG extends js.Object {
  var `class`: PNGClass
  var constants: Anon_0
  var decoders: Anon_ImagepngDecoderFn
  var encoders: Anon_ImagepngEncoderFn
  var hasAlpha: Anon_ImagepngTrue
  var mime: Anon_Imagepng
}

object PNG {
  @scala.inline
  def apply(
    `class`: PNGClass,
    constants: Anon_0,
    decoders: Anon_ImagepngDecoderFn,
    encoders: Anon_ImagepngEncoderFn,
    hasAlpha: Anon_ImagepngTrue,
    mime: Anon_Imagepng
  ): PNG = {
    val __obj = js.Dynamic.literal(constants = constants, decoders = decoders, encoders = encoders, hasAlpha = hasAlpha, mime = mime)
    __obj.updateDynamic("class")(`class`)
    __obj.asInstanceOf[PNG]
  }
}

