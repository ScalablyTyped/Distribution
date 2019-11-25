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
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], blurX = blurX.asInstanceOf[js.Any], blurY = blurY.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hideObject = hideObject.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], knockout = knockout.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], shadowColor = shadowColor.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashFilter]
  }
}

