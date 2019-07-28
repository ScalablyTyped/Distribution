package typings.materialDashUi.underscoreUnderscoreMaterialUINs

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps extends js.Object {
  var action: js.UndefOr[ReactNode] = js.undefined
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  var message: ReactNode
  var onActionClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onRequestClose: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
  var open: Boolean
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SnackbarProps {
  @scala.inline
  def apply(
    message: ReactNode,
    open: Boolean,
    action: ReactNode = null,
    autoHideDuration: Int | Double = null,
    bodyStyle: CSSProperties = null,
    className: String = null,
    contentStyle: CSSProperties = null,
    onActionClick: MouseEventHandler[js.Object] = null,
    onRequestClose: /* reason */ String => Unit = null,
    style: CSSProperties = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], open = open)
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(onActionClick)
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1(onRequestClose))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SnackbarProps]
  }
}

