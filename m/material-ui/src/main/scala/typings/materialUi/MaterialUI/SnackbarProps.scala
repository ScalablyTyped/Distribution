package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
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
    open: Boolean,
    action: ReactNode = null,
    autoHideDuration: js.UndefOr[Double] = js.undefined,
    bodyStyle: CSSProperties = null,
    className: String = null,
    contentStyle: CSSProperties = null,
    message: ReactNode = null,
    onActionClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onRequestClose: /* reason */ String => Unit = null,
    style: CSSProperties = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHideDuration)) __obj.updateDynamic("autoHideDuration")(autoHideDuration.get.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction1(onActionClick))
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1(onRequestClose))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
}

