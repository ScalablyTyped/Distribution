package typings.materialDashUi.__MaterialUI.Stepper

import typings.materialDashUi.__MaterialUI.Snackbar
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps extends Props[Snackbar] {
  var action: js.UndefOr[String] = js.undefined
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var message: String | Element
  var onActionClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  /** @deprecated Use the open property to control the component instead */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** @deprecated Use the open property to control the component instead */
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
   // DEPRECATED
  var open: Boolean
  /** @deprecated Use the open property to control the component instead */
  var openOnMount: js.UndefOr[Boolean] = js.undefined
   // DEPRECATED
  def onRequestClose(reason: String): Unit
}

object SnackbarProps {
  @scala.inline
  def apply(
    message: String | Element,
    onRequestClose: String => Unit,
    open: Boolean,
    action: String = null,
    autoHideDuration: Int | Double = null,
    bodyStyle: CSSProperties = null,
    children: ReactNode = null,
    className: String = null,
    key: Key = null,
    onActionClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onDismiss: () => Unit = null,
    onShow: () => Unit = null,
    openOnMount: js.UndefOr[Boolean] = js.undefined,
    ref: LegacyRef[Snackbar] = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction1(onRequestClose), open = open.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction1(onActionClick))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (!js.isUndefined(openOnMount)) __obj.updateDynamic("openOnMount")(openOnMount.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
}

