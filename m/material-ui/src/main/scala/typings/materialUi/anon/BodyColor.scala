package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyColor extends js.Object {
  var bodyColor: js.UndefOr[String] = js.undefined
  var bodyFontSize: js.UndefOr[Double] = js.undefined
  var titleFontSize: js.UndefOr[Double] = js.undefined
}

object BodyColor {
  @scala.inline
  def apply(
    bodyColor: String = null,
    bodyFontSize: js.UndefOr[Double] = js.undefined,
    titleFontSize: js.UndefOr[Double] = js.undefined
  ): BodyColor = {
    val __obj = js.Dynamic.literal()
    if (bodyColor != null) __obj.updateDynamic("bodyColor")(bodyColor.asInstanceOf[js.Any])
    if (!js.isUndefined(bodyFontSize)) __obj.updateDynamic("bodyFontSize")(bodyFontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(titleFontSize)) __obj.updateDynamic("titleFontSize")(titleFontSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyColor]
  }
}

