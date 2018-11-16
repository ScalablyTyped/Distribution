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

