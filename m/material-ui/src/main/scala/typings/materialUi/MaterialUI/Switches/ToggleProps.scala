package typings.materialUi.MaterialUI.Switches

import typings.materialUi.MaterialUI.ReactLink
import typings.materialUi.materialUiStrings.left
import typings.materialUi.materialUiStrings.right
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToggleProps extends CommonEnhancedSwitchProps[Toggle] {
  // <EnhancedSwitch/> is element that get the 'other' properties
  var defaultToggled: js.UndefOr[Boolean] = js.native
  var elementStyle: js.UndefOr[CSSProperties] = js.native
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  var inputStyle: js.UndefOr[CSSProperties] = js.native
  var labelPosition: js.UndefOr[left | right] = js.native
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  var onToggle: js.UndefOr[
    js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean, Unit]
  ] = js.native
  var rippleStyle: js.UndefOr[CSSProperties] = js.native
  var thumbStyle: js.UndefOr[CSSProperties] = js.native
  var thumbSwitchedStyle: js.UndefOr[CSSProperties] = js.native
  var toggled: js.UndefOr[Boolean] = js.native
  var trackStyle: js.UndefOr[CSSProperties] = js.native
  var trackSwitchedStyle: js.UndefOr[CSSProperties] = js.native
  var valueLink: js.UndefOr[ReactLink[Boolean]] = js.native
}

object ToggleProps {
  @scala.inline
  def apply(): ToggleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToggleProps]
  }
  @scala.inline
  implicit class TogglePropsOps[Self <: ToggleProps] (val x: Self) extends AnyVal {
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
    def setDefaultToggled(value: Boolean): Self = this.set("defaultToggled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultToggled: Self = this.set("defaultToggled", js.undefined)
    @scala.inline
    def setElementStyle(value: CSSProperties): Self = this.set("elementStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementStyle: Self = this.set("elementStyle", js.undefined)
    @scala.inline
    def setIconStyle(value: CSSProperties): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    @scala.inline
    def setInputStyle(value: CSSProperties): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    @scala.inline
    def setLabelPosition(value: left | right): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setOnToggle(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean) => Unit): Self = this.set("onToggle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    @scala.inline
    def setRippleStyle(value: CSSProperties): Self = this.set("rippleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleStyle: Self = this.set("rippleStyle", js.undefined)
    @scala.inline
    def setThumbStyle(value: CSSProperties): Self = this.set("thumbStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbStyle: Self = this.set("thumbStyle", js.undefined)
    @scala.inline
    def setThumbSwitchedStyle(value: CSSProperties): Self = this.set("thumbSwitchedStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbSwitchedStyle: Self = this.set("thumbSwitchedStyle", js.undefined)
    @scala.inline
    def setToggled(value: Boolean): Self = this.set("toggled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggled: Self = this.set("toggled", js.undefined)
    @scala.inline
    def setTrackStyle(value: CSSProperties): Self = this.set("trackStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackStyle: Self = this.set("trackStyle", js.undefined)
    @scala.inline
    def setTrackSwitchedStyle(value: CSSProperties): Self = this.set("trackSwitchedStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackSwitchedStyle: Self = this.set("trackSwitchedStyle", js.undefined)
    @scala.inline
    def setValueLink(value: ReactLink[Boolean]): Self = this.set("valueLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueLink: Self = this.set("valueLink", js.undefined)
  }
  
}

