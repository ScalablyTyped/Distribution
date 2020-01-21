package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorOverlayContentBackground extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var overlayContentBackground: js.UndefOr[String] = js.undefined
  var subtitleColor: js.UndefOr[String] = js.undefined
  var titleColor: js.UndefOr[String] = js.undefined
}

object AnonColorOverlayContentBackground {
  @scala.inline
  def apply(
    color: String = null,
    overlayContentBackground: String = null,
    subtitleColor: String = null,
    titleColor: String = null
  ): AnonColorOverlayContentBackground = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (overlayContentBackground != null) __obj.updateDynamic("overlayContentBackground")(overlayContentBackground.asInstanceOf[js.Any])
    if (subtitleColor != null) __obj.updateDynamic("subtitleColor")(subtitleColor.asInstanceOf[js.Any])
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorOverlayContentBackground]
  }
}

