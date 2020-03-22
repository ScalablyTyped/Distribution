package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubtitleColor extends js.Object {
  var fontWeight: js.UndefOr[Double] = js.undefined
  var subtitleColor: js.UndefOr[String] = js.undefined
  var titleColor: js.UndefOr[String] = js.undefined
}

object AnonSubtitleColor {
  @scala.inline
  def apply(fontWeight: Int | Double = null, subtitleColor: String = null, titleColor: String = null): AnonSubtitleColor = {
    val __obj = js.Dynamic.literal()
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (subtitleColor != null) __obj.updateDynamic("subtitleColor")(subtitleColor.asInstanceOf[js.Any])
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubtitleColor]
  }
}

