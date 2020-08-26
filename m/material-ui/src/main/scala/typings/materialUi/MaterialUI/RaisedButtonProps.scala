package typings.materialUi.MaterialUI

import typings.materialUi.materialUiStrings.after
import typings.materialUi.materialUiStrings.before
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaisedButtonProps extends SharedEnhancedButtonProps[RaisedButton] {
  // <EnhancedButton/> is the element that get the 'other' properties
  var backgroundColor: js.UndefOr[String] = js.native
  var buttonStyle: js.UndefOr[CSSProperties] = js.native
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var disabledBackgroundColor: js.UndefOr[String] = js.native
  var disabledLabelColor: js.UndefOr[String] = js.native
  var fullWidth: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[ReactNode] = js.native
  var label: js.UndefOr[ReactNode] = js.native
  var labelColor: js.UndefOr[String] = js.native
  var labelPosition: js.UndefOr[before | after] = js.native
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  var linkButton: js.UndefOr[Boolean] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[js.Object]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[js.Object]] = js.native
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  var primary: js.UndefOr[Boolean] = js.native
  var rippleStyle: js.UndefOr[CSSProperties] = js.native
  var secondary: js.UndefOr[Boolean] = js.native
}

object RaisedButtonProps {
  @scala.inline
  def apply(): RaisedButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RaisedButtonProps]
  }
  @scala.inline
  implicit class RaisedButtonPropsOps[Self <: RaisedButtonProps] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setButtonStyle(value: CSSProperties): Self = this.set("buttonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonStyle: Self = this.set("buttonStyle", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledBackgroundColor(value: String): Self = this.set("disabledBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledBackgroundColor: Self = this.set("disabledBackgroundColor", js.undefined)
    @scala.inline
    def setDisabledLabelColor(value: String): Self = this.set("disabledLabelColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledLabelColor: Self = this.set("disabledLabelColor", js.undefined)
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelColor(value: String): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    @scala.inline
    def setLabelPosition(value: before | after): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setLinkButton(value: Boolean): Self = this.set("linkButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkButton: Self = this.set("linkButton", js.undefined)
    @scala.inline
    def setOnMouseDown(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseUp(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[js.Object] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchStart(value: TouchEvent[js.Object] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setRippleStyle(value: CSSProperties): Self = this.set("rippleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleStyle: Self = this.set("rippleStyle", js.undefined)
    @scala.inline
    def setSecondary(value: Boolean): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
  }
  
}

