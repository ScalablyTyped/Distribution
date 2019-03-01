package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.StepperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps
  extends reactLib.reactMod.ReactNs.Props[materialDashUiLib.underscoreUnderscoreMaterialUINs.Snackbar] {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var autoHideDuration: js.UndefOr[scala.Double] = js.undefined
  var bodyStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var message: java.lang.String | reactLib.reactMod.Global.JSXNs.Element
  var onActionClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[js.Object]] = js.undefined
  /** @deprecated Use the open property to control the component instead */
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** @deprecated Use the open property to control the component instead */
  var onShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
   // DEPRECATED
  var open: scala.Boolean
  /** @deprecated Use the open property to control the component instead */
  var openOnMount: js.UndefOr[scala.Boolean] = js.undefined
   // DEPRECATED
  def onRequestClose(reason: java.lang.String): scala.Unit
}

object SnackbarProps {
  @scala.inline
  def apply(
    message: java.lang.String | reactLib.reactMod.Global.JSXNs.Element,
    onRequestClose: js.Function1[java.lang.String, scala.Unit],
    open: scala.Boolean,
    action: java.lang.String = null,
    autoHideDuration: scala.Int | scala.Double = null,
    bodyStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    onActionClick: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onDismiss: js.Function0[scala.Unit] = null,
    onShow: js.Function0[scala.Unit] = null,
    openOnMount: js.UndefOr[scala.Boolean] = js.undefined,
    ref: reactLib.reactMod.ReactNs.LegacyRef[materialDashUiLib.underscoreUnderscoreMaterialUINs.Snackbar] = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.updateDynamic("onRequestClose")(onRequestClose)
    __obj.updateDynamic("open")(open)
    if (action != null) __obj.updateDynamic("action")(action)
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(onActionClick)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(onDismiss)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (!js.isUndefined(openOnMount)) __obj.updateDynamic("openOnMount")(openOnMount)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
}

