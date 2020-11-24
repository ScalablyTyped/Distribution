package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskedTextBoxOptions extends js.Object {
  
  var change: js.UndefOr[js.Function1[/* e */ MaskedTextBoxChangeEvent, Unit]] = js.native
  
  var clearPromptChar: js.UndefOr[Boolean] = js.native
  
  var culture: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String | js.Function | MaskedTextBoxLabel] = js.native
  
  var mask: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var promptChar: js.UndefOr[String] = js.native
  
  var rules: js.UndefOr[js.Any] = js.native
  
  var unmaskOnPost: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object MaskedTextBoxOptions {
  
  @scala.inline
  def apply(): MaskedTextBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskedTextBoxOptions]
  }
  
  @scala.inline
  implicit class MaskedTextBoxOptionsOps[Self <: MaskedTextBoxOptions] (val x: Self) extends AnyVal {
    
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
    def setChange(value: /* e */ MaskedTextBoxChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setClearPromptChar(value: Boolean): Self = this.set("clearPromptChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearPromptChar: Self = this.set("clearPromptChar", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    
    @scala.inline
    def setLabel(value: String | js.Function | MaskedTextBoxLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPromptChar(value: String): Self = this.set("promptChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromptChar: Self = this.set("promptChar", js.undefined)
    
    @scala.inline
    def setRules(value: js.Any): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setUnmaskOnPost(value: Boolean): Self = this.set("unmaskOnPost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmaskOnPost: Self = this.set("unmaskOnPost", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
