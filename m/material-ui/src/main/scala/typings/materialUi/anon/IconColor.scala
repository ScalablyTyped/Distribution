package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hoverColor: js.UndefOr[String] = js.undefined
  var iconColor: js.UndefOr[String] = js.undefined
  var menuHoverColor: js.UndefOr[String] = js.undefined
  var separatorColor: js.UndefOr[String] = js.undefined
  var titleFontSize: js.UndefOr[Double] = js.undefined
}

object IconColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    color: String = null,
    height: js.UndefOr[Double] = js.undefined,
    hoverColor: String = null,
    iconColor: String = null,
    menuHoverColor: String = null,
    separatorColor: String = null,
    titleFontSize: js.UndefOr[Double] = js.undefined
  ): IconColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (menuHoverColor != null) __obj.updateDynamic("menuHoverColor")(menuHoverColor.asInstanceOf[js.Any])
    if (separatorColor != null) __obj.updateDynamic("separatorColor")(separatorColor.asInstanceOf[js.Any])
    if (!js.isUndefined(titleFontSize)) __obj.updateDynamic("titleFontSize")(titleFontSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconColor]
  }
}

