package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChipProps extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var containerElement: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | java.lang.String] = js.undefined
  var deleteIconStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var labelColor: js.UndefOr[java.lang.String] = js.undefined
  var labelStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[Chip]] = js.undefined
  var onRequestDelete: js.UndefOr[reactLib.reactMod.ReactNs.TouchEventHandler[Chip]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object ChipProps {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    className: java.lang.String = null,
    containerElement: reactLib.reactMod.ReactNs.ReactNode | java.lang.String = null,
    deleteIconStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    labelColor: java.lang.String = null,
    labelStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[Chip] = null,
    onRequestDelete: reactLib.reactMod.ReactNs.TouchEventHandler[Chip] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): ChipProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (className != null) __obj.updateDynamic("className")(className)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (deleteIconStyle != null) __obj.updateDynamic("deleteIconStyle")(deleteIconStyle)
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onRequestDelete != null) __obj.updateDynamic("onRequestDelete")(onRequestDelete)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ChipProps]
  }
}

