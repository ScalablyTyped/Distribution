package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorOverlayContentBackground extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var overlayContentBackground: js.UndefOr[java.lang.String] = js.undefined
  var subtitleColor: js.UndefOr[java.lang.String] = js.undefined
  var titleColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ColorOverlayContentBackground {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    overlayContentBackground: java.lang.String = null,
    subtitleColor: java.lang.String = null,
    titleColor: java.lang.String = null
  ): Anon_ColorOverlayContentBackground = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (overlayContentBackground != null) __obj.updateDynamic("overlayContentBackground")(overlayContentBackground)
    if (subtitleColor != null) __obj.updateDynamic("subtitleColor")(subtitleColor)
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor)
    __obj.asInstanceOf[Anon_ColorOverlayContentBackground]
  }
}

