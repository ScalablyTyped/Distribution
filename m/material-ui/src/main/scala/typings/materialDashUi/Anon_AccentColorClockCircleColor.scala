package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccentColorClockCircleColor extends js.Object {
  var accentColor: js.UndefOr[String] = js.undefined
  var clockCircleColor: js.UndefOr[String] = js.undefined
  var clockColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var headerColor: js.UndefOr[String] = js.undefined
  var selectColor: js.UndefOr[String] = js.undefined
  var selectTextColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object Anon_AccentColorClockCircleColor {
  @scala.inline
  def apply(
    accentColor: String = null,
    clockCircleColor: String = null,
    clockColor: String = null,
    color: String = null,
    headerColor: String = null,
    selectColor: String = null,
    selectTextColor: String = null,
    textColor: String = null
  ): Anon_AccentColorClockCircleColor = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor.asInstanceOf[js.Any])
    if (clockCircleColor != null) __obj.updateDynamic("clockCircleColor")(clockCircleColor.asInstanceOf[js.Any])
    if (clockColor != null) __obj.updateDynamic("clockColor")(clockColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (headerColor != null) __obj.updateDynamic("headerColor")(headerColor.asInstanceOf[js.Any])
    if (selectColor != null) __obj.updateDynamic("selectColor")(selectColor.asInstanceOf[js.Any])
    if (selectTextColor != null) __obj.updateDynamic("selectTextColor")(selectTextColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccentColorClockCircleColor]
  }
}

