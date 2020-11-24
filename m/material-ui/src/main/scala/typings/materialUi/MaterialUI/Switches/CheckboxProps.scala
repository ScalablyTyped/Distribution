package typings.materialUi.MaterialUI.Switches

import typings.materialUi.MaterialUI.ReactLink
import typings.materialUi.materialUiStrings.left
import typings.materialUi.materialUiStrings.right
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxProps extends CommonEnhancedSwitchProps[Checkbox] {
  
  var checkedIcon: js.UndefOr[ReactElement] = js.native
  
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  
  var inputStyle: js.UndefOr[CSSProperties] = js.native
  
  var labelPosition: js.UndefOr[left | right] = js.native
  
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  
  var onCheck: js.UndefOr[
    js.Function2[/* event */ MouseEvent[js.Object, NativeMouseEvent], /* checked */ Boolean, Unit]
  ] = js.native
  
  var uncheckedIcon: js.UndefOr[ReactElement] = js.native
  
   // Normally an SvgIcon
  var valueLink: js.UndefOr[ReactLink[Boolean]] = js.native
}
object CheckboxProps {
  
  @scala.inline
  def apply(): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxProps]
  }
  
  @scala.inline
  implicit class CheckboxPropsOps[Self <: CheckboxProps] (val x: Self) extends AnyVal {
    
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
    def setLabelPosition(value: left | right): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setOnCheck(value: (/* event */ MouseEvent[js.Object, NativeMouseEvent], /* checked */ Boolean) => Unit): Self = this.set("onCheck", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCheck: Self = this.set("onCheck", js.undefined)
    
    @scala.inline
    def setUncheckedIcon(value: ReactElement): Self = this.set("uncheckedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncheckedIcon: Self = this.set("uncheckedIcon", js.undefined)
    
    @scala.inline
    def setValueLink(value: ReactLink[Boolean]): Self = this.set("valueLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueLink: Self = this.set("valueLink", js.undefined)
  }
}
