package typings.materialUi.MaterialUI.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemePalette extends js.Object {
  var accent1Color: js.UndefOr[String] = js.undefined
  var accent2Color: js.UndefOr[String] = js.undefined
  var accent3Color: js.UndefOr[String] = js.undefined
  var alternateTextColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var canvasColor: js.UndefOr[String] = js.undefined
  var clockCircleColor: js.UndefOr[String] = js.undefined
  var disabledColor: js.UndefOr[String] = js.undefined
  var pickerHeaderColor: js.UndefOr[String] = js.undefined
  var primary1Color: js.UndefOr[String] = js.undefined
  var primary2Color: js.UndefOr[String] = js.undefined
  var primary3Color: js.UndefOr[String] = js.undefined
  var secondaryTextColor: js.UndefOr[String] = js.undefined
  var shadowColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object ThemePalette {
  @scala.inline
  def apply(
    accent1Color: String = null,
    accent2Color: String = null,
    accent3Color: String = null,
    alternateTextColor: String = null,
    borderColor: String = null,
    canvasColor: String = null,
    clockCircleColor: String = null,
    disabledColor: String = null,
    pickerHeaderColor: String = null,
    primary1Color: String = null,
    primary2Color: String = null,
    primary3Color: String = null,
    secondaryTextColor: String = null,
    shadowColor: String = null,
    textColor: String = null
  ): ThemePalette = {
    val __obj = js.Dynamic.literal()
    if (accent1Color != null) __obj.updateDynamic("accent1Color")(accent1Color.asInstanceOf[js.Any])
    if (accent2Color != null) __obj.updateDynamic("accent2Color")(accent2Color.asInstanceOf[js.Any])
    if (accent3Color != null) __obj.updateDynamic("accent3Color")(accent3Color.asInstanceOf[js.Any])
    if (alternateTextColor != null) __obj.updateDynamic("alternateTextColor")(alternateTextColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (canvasColor != null) __obj.updateDynamic("canvasColor")(canvasColor.asInstanceOf[js.Any])
    if (clockCircleColor != null) __obj.updateDynamic("clockCircleColor")(clockCircleColor.asInstanceOf[js.Any])
    if (disabledColor != null) __obj.updateDynamic("disabledColor")(disabledColor.asInstanceOf[js.Any])
    if (pickerHeaderColor != null) __obj.updateDynamic("pickerHeaderColor")(pickerHeaderColor.asInstanceOf[js.Any])
    if (primary1Color != null) __obj.updateDynamic("primary1Color")(primary1Color.asInstanceOf[js.Any])
    if (primary2Color != null) __obj.updateDynamic("primary2Color")(primary2Color.asInstanceOf[js.Any])
    if (primary3Color != null) __obj.updateDynamic("primary3Color")(primary3Color.asInstanceOf[js.Any])
    if (secondaryTextColor != null) __obj.updateDynamic("secondaryTextColor")(secondaryTextColor.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemePalette]
  }
}

