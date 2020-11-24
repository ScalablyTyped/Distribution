package typings.materialTextfield.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/textfield.@material/textfield/character-counter/adapter.MDCTextFieldCharacterCounterAdapter> */
@js.native
trait PartialMDCTextFieldCharac extends js.Object {
  
  var setContent: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.native
}
object PartialMDCTextFieldCharac {
  
  @scala.inline
  def apply(): PartialMDCTextFieldCharac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTextFieldCharac]
  }
  
  @scala.inline
  implicit class PartialMDCTextFieldCharacOps[Self <: PartialMDCTextFieldCharac] (val x: Self) extends AnyVal {
    
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
    def setSetContent(value: /* content */ String => Unit): Self = this.set("setContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetContent: Self = this.set("setContent", js.undefined)
  }
}
