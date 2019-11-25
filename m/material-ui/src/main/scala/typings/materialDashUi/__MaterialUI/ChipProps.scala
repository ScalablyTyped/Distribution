package typings.materialDashUi.__MaterialUI

import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.react.reactMod.TouchEvent
import typings.react.reactMod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChipProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var containerElement: js.UndefOr[ReactNode | String] = js.undefined
  var deleteIconStyle: js.UndefOr[CSSProperties] = js.undefined
  var labelColor: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[Chip]] = js.undefined
  var onRequestDelete: js.UndefOr[TouchEventHandler[Chip]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ChipProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    className: String = null,
    containerElement: ReactNode | String = null,
    deleteIconStyle: CSSProperties = null,
    labelColor: String = null,
    labelStyle: CSSProperties = null,
    onClick: MouseEvent[Chip, NativeMouseEvent] => Unit = null,
    onRequestDelete: TouchEvent[Chip] => Unit = null,
    style: CSSProperties = null
  ): ChipProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (deleteIconStyle != null) __obj.updateDynamic("deleteIconStyle")(deleteIconStyle.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onRequestDelete != null) __obj.updateDynamic("onRequestDelete")(js.Any.fromFunction1(onRequestDelete))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChipProps]
  }
}

