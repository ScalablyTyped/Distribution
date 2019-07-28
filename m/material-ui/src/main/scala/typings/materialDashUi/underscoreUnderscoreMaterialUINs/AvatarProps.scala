package typings.materialDashUi.underscoreUnderscoreMaterialUINs

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[ReactElement] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    className: String = null,
    color: String = null,
    icon: ReactElement = null,
    onClick: MouseEventHandler[js.Object] = null,
    size: Int | Double = null,
    src: String = null,
    style: CSSProperties = null
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

