package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorColorHeight extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hoverColor: js.UndefOr[java.lang.String] = js.undefined
  var iconColor: js.UndefOr[java.lang.String] = js.undefined
  var menuHoverColor: js.UndefOr[java.lang.String] = js.undefined
  var separatorColor: js.UndefOr[java.lang.String] = js.undefined
  var titleFontSize: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BackgroundColorColorHeight {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    color: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    hoverColor: java.lang.String = null,
    iconColor: java.lang.String = null,
    menuHoverColor: java.lang.String = null,
    separatorColor: java.lang.String = null,
    titleFontSize: scala.Int | scala.Double = null
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

