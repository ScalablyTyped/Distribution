package typings.materialUi.MaterialUI.Switches

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhancedSwitchProps extends CommonEnhancedSwitchProps[EnhancedSwitch] {
  var defaultSwitched: js.UndefOr[Boolean] = js.native
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  var disableTouchRipple: js.UndefOr[Boolean] = js.native
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  var inputStyle: CSSProperties = js.native
  var inputType: String = js.native
  var labelPosition: js.UndefOr[String] = js.native
   // oneOf(['left', 'right'])
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  var onSwitch: js.UndefOr[
    js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean, Unit]
  ] = js.native
  var rippleColor: js.UndefOr[String] = js.native
  var rippleStyle: js.UndefOr[CSSProperties] = js.native
  var switchElement: ReactElement = js.native
  var switched: Boolean = js.native
  var thumbStyle: js.UndefOr[CSSProperties] = js.native
  var trackStyle: js.UndefOr[CSSProperties] = js.native
  @JSName("value")
  var value_EnhancedSwitchProps: js.UndefOr[String] = js.native
  def onParentShouldUpdate(isInputChecked: Boolean): Unit = js.native
}

object EnhancedSwitchProps {
  @scala.inline
  def apply(
    inputStyle: CSSProperties,
    inputType: String,
    onParentShouldUpdate: Boolean => Unit,
    switchElement: ReactElement,
    switched: Boolean
  ): EnhancedSwitchProps = {
    val __obj = js.Dynamic.literal(inputStyle = inputStyle.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], onParentShouldUpdate = js.Any.fromFunction1(onParentShouldUpdate), switchElement = switchElement.asInstanceOf[js.Any], switched = switched.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedSwitchProps]
  }
  @scala.inline
  implicit class EnhancedSwitchPropsOps[Self <: EnhancedSwitchProps] (val x: Self) extends AnyVal {
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
    def setInputStyle(value: CSSProperties): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputType(value: String): Self = this.set("inputType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnParentShouldUpdate(value: Boolean => Unit): Self = this.set("onParentShouldUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def setSwitchElement(value: ReactElement): Self = this.set("switchElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwitched(value: Boolean): Self = this.set("switched", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultSwitched(value: Boolean): Self = this.set("defaultSwitched", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSwitched: Self = this.set("defaultSwitched", js.undefined)
    @scala.inline
    def setDisableFocusRipple(value: Boolean): Self = this.set("disableFocusRipple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFocusRipple: Self = this.set("disableFocusRipple", js.undefined)
    @scala.inline
    def setDisableTouchRipple(value: Boolean): Self = this.set("disableTouchRipple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableTouchRipple: Self = this.set("disableTouchRipple", js.undefined)
    @scala.inline
    def setIconStyle(value: CSSProperties): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    @scala.inline
    def setLabelPosition(value: String): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setOnSwitch(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean) => Unit): Self = this.set("onSwitch", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSwitch: Self = this.set("onSwitch", js.undefined)
    @scala.inline
    def setRippleColor(value: String): Self = this.set("rippleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleColor: Self = this.set("rippleColor", js.undefined)
    @scala.inline
    def setRippleStyle(value: CSSProperties): Self = this.set("rippleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleStyle: Self = this.set("rippleStyle", js.undefined)
    @scala.inline
    def setThumbStyle(value: CSSProperties): Self = this.set("thumbStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbStyle: Self = this.set("thumbStyle", js.undefined)
    @scala.inline
    def setTrackStyle(value: CSSProperties): Self = this.set("trackStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackStyle: Self = this.set("trackStyle", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

