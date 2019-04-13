package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[js.Object]] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    className: java.lang.String = null,
    color: java.lang.String = null,
    icon: reactLib.reactMod.ReactElement[_] = null,
    onClick: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    size: scala.Int | scala.Double = null,
    src: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null
  ): AvatarProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[AvatarProps]
  }
}

