package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashFilter extends js.Object {
  var angle: scala.Double
  var blurX: scala.Double
  var blurY: scala.Double
  var brightness: scala.Double
  var color: js.Any
  var contrast: scala.Double
  var distance: scala.Double
  var enabled: scala.Boolean
  var hideObject: scala.Boolean
  var highlightColor: js.Any
  var hue: scala.Double
  var inner: scala.Boolean
  var knockout: scala.Boolean
  var name: java.lang.String
  var quality: java.lang.String
  var saturation: scala.Double
  var shadowColor: js.Any
  var strength: scala.Double
  var `type`: java.lang.String
}

object FlashFilter {
  @scala.inline
  def apply(
    angle: scala.Double,
    blurX: scala.Double,
    blurY: scala.Double,
    brightness: scala.Double,
    color: js.Any,
    contrast: scala.Double,
    distance: scala.Double,
    enabled: scala.Boolean,
    hideObject: scala.Boolean,
    highlightColor: js.Any,
    hue: scala.Double,
    inner: scala.Boolean,
    knockout: scala.Boolean,
    name: java.lang.String,
    quality: java.lang.String,
    saturation: scala.Double,
    shadowColor: js.Any,
    strength: scala.Double,
    `type`: java.lang.String
  ): FlashFilter = {
    val __obj = js.Dynamic.literal(angle = angle, blurX = blurX, blurY = blurY, brightness = brightness, color = color, contrast = contrast, distance = distance, enabled = enabled, hideObject = hideObject, highlightColor = highlightColor, hue = hue, inner = inner, knockout = knockout, name = name, quality = quality, saturation = saturation, shadowColor = shadowColor, strength = strength)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FlashFilter]
  }
}

