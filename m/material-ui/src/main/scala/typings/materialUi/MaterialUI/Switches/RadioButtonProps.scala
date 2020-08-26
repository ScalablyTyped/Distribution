package typings.materialUi.MaterialUI.Switches

import typings.react.mod.CSSProperties
import typings.react.mod.FormEvent
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioButtonProps extends CommonEnhancedSwitchProps[RadioButton] {
  // <EnhancedSwitch/> is element that get the 'other' properties
  var checkedIcon: js.UndefOr[ReactElement] = js.native
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  var inputStyle: js.UndefOr[CSSProperties] = js.native
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  var onCheck: js.UndefOr[js.Function2[/* e */ FormEvent[js.Object], /* selected */ String, Unit]] = js.native
  var uncheckedIcon: js.UndefOr[ReactElement] = js.native
   // Normally an SvgIcon
  @JSName("value")
  var value_RadioButtonProps: js.UndefOr[js.Any] = js.native
}

object RadioButtonProps {
  @scala.inline
  def apply(): RadioButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioButtonProps]
  }
  @scala.inline
  implicit class RadioButtonPropsOps[Self <: RadioButtonProps] (val x: Self) extends AnyVal {
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
    def setCheckedIcon(value: ReactElement): Self = this.set("checkedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedIcon: Self = this.set("checkedIcon", js.undefined)
    @scala.inline
    def setIconStyle(value: CSSProperties): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    @scala.inline
    def setInputStyle(value: CSSProperties): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setOnCheck(value: (/* e */ FormEvent[js.Object], /* selected */ String) => Unit): Self = this.set("onCheck", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCheck: Self = this.set("onCheck", js.undefined)
    @scala.inline
    def setUncheckedIcon(value: ReactElement): Self = this.set("uncheckedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUncheckedIcon: Self = this.set("uncheckedIcon", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

