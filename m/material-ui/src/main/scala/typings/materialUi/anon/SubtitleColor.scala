package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubtitleColor extends js.Object {
  var fontWeight: js.UndefOr[Double] = js.undefined
  var subtitleColor: js.UndefOr[String] = js.undefined
  var titleColor: js.UndefOr[String] = js.undefined
}

object SubtitleColor {
  @scala.inline
  def apply(
    fontWeight: js.UndefOr[Double] = js.undefined,
    subtitleColor: String = null,
    titleColor: String = null
  ): SubtitleColor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fontWeight)) __obj.updateDynamic("fontWeight")(fontWeight.get.asInstanceOf[js.Any])
    if (subtitleColor != null) __obj.updateDynamic("subtitleColor")(subtitleColor.asInstanceOf[js.Any])
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtitleColor]
  }
}

