package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorColorHeight extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hoverColor: js.UndefOr[String] = js.undefined
  var iconColor: js.UndefOr[String] = js.undefined
  var menuHoverColor: js.UndefOr[String] = js.undefined
  var separatorColor: js.UndefOr[String] = js.undefined
  var titleFontSize: js.UndefOr[Double] = js.undefined
}

object Anon_BackgroundColorColorHeight {
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
  ): Anon_BackgroundColorColorHeight = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor)
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor)
    if (menuHoverColor != null) __obj.updateDynamic("menuHoverColor")(menuHoverColor)
    if (separatorColor != null) __obj.updateDynamic("separatorColor")(separatorColor)
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundColorColorHeight]
  }
}

