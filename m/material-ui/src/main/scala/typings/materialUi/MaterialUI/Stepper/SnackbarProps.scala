package typings.materialUi.MaterialUI.Stepper

import typings.materialUi.MaterialUI.Snackbar
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Props
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnackbarProps extends Props[Snackbar] {
  var action: js.UndefOr[String] = js.native
  var autoHideDuration: js.UndefOr[Double] = js.native
  var bodyStyle: js.UndefOr[CSSProperties] = js.native
  var className: js.UndefOr[String] = js.native
  var message: String | Element = js.native
  var onActionClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  /** @deprecated Use the open property to control the component instead */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  /** @deprecated Use the open property to control the component instead */
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
   // DEPRECATED
  var open: Boolean = js.native
  /** @deprecated Use the open property to control the component instead */
  var openOnMount: js.UndefOr[Boolean] = js.native
   // DEPRECATED
  def onRequestClose(reason: String): Unit = js.native
}

object SnackbarProps {
  @scala.inline
  def apply(message: String | Element, onRequestClose: String => Unit, open: Boolean): SnackbarProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction1(onRequestClose), open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
  @scala.inline
  implicit class SnackbarPropsOps[Self <: SnackbarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessage(value: String | Element): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRequestClose(value: String => Unit): Self = this.set("onRequestClose", js.Any.fromFunction1(value))
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAutoHideDuration(value: Double): Self = this.set("autoHideDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHideDuration: Self = this.set("autoHideDuration", js.undefined)
    @scala.inline
    def setBodyStyle(value: CSSProperties): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setOnActionClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onActionClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnActionClick: Self = this.set("onActionClick", js.undefined)
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOpenOnMount(value: Boolean): Self = this.set("openOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenOnMount: Self = this.set("openOnMount", js.undefined)
  }
  
}

