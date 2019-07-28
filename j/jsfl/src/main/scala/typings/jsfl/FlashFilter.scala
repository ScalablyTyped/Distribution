package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashFilter extends js.Object {
  var angle: Double
  var blurX: Double
  var blurY: Double
  var brightness: Double
  var color: js.Any
  var contrast: Double
  var distance: Double
  var enabled: Boolean
  var hideObject: Boolean
  var highlightColor: js.Any
  var hue: Double
  var inner: Boolean
  var knockout: Boolean
  var name: String
  var quality: String
  var saturation: Double
  var shadowColor: js.Any
  var strength: Double
  var `type`: String
}

object FlashFilter {
  @scala.inline
  def apply(
    angle: Double,
    blurX: Double,
    blurY: Double,
    brightness: Double,
    color: js.Any,
    contrast: Double,
    distance: Double,
    enabled: Boolean,
    hideObject: Boolean,
    highlightColor: js.Any,
    hue: Double,
    inner: Boolean,
    knockout: Boolean,
    name: String,
    quality: String,
    saturation: Double,
    shadowColor: js.Any,
    strength: Double,
    `type`: String
  ): FlashFilter = {
    val __obj = js.Dynamic.literal(angle = angle, blurX = blurX, blurY = blurY, brightness = brightness, color = color, contrast = contrast, distance = distance, enabled = enabled, hideObject = hideObject, highlightColor = highlightColor, hue = hue, inner = inner, knockout = knockout, name = name, quality = quality, saturation = saturation, shadowColor = shadowColor, strength = strength)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FlashFilter]
  }
}

