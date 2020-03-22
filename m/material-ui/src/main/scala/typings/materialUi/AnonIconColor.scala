package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIconColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hoverColor: js.UndefOr[String] = js.undefined
  var iconColor: js.UndefOr[String] = js.undefined
  var menuHoverColor: js.UndefOr[String] = js.undefined
  var separatorColor: js.UndefOr[String] = js.undefined
  var titleFontSize: js.UndefOr[Double] = js.undefined
}

object AnonIconColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    color: String = null,
    height: Int | Double = null,
    hoverColor: String = null,
    iconColor: String = null,
    menuHoverColor: String = null,
    separatorColor: String = null,
    titleFontSize: Int | Double = null
  ): AnonIconColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (menuHoverColor != null) __obj.updateDynamic("menuHoverColor")(menuHoverColor.asInstanceOf[js.Any])
    if (separatorColor != null) __obj.updateDynamic("separatorColor")(separatorColor.asInstanceOf[js.Any])
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIconColor]
  }
}

