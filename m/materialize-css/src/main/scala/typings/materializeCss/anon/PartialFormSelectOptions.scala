package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.FormSelectOptions> */
@js.native
trait PartialFormSelectOptions extends js.Object {
  
  var classes: js.UndefOr[String] = js.native
  
  var dropdownOptions: js.UndefOr[PartialDropdownOptionsAlignment] = js.native
}
object PartialFormSelectOptions {
  
  @scala.inline
  def apply(): PartialFormSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFormSelectOptions]
  }
  
  @scala.inline
  implicit class PartialFormSelectOptionsOps[Self <: PartialFormSelectOptions] (val x: Self) extends AnyVal {
    
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
    def setClasses(value: String): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setDropdownOptions(value: PartialDropdownOptionsAlignment): Self = this.set("dropdownOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownOptions: Self = this.set("dropdownOptions", js.undefined)
  }
}
