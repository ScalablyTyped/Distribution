package typings.materializeCss.M

import typings.materializeCss.anon.PartialDropdownOptionsAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormSelectOptions extends js.Object {
  
  /**
    * Classes to be added to the select wrapper element
    * @default ''
    */
  var classes: String = js.native
  
  /**
    * Pass options object to select dropdown initialization
    * @default {}
    */
  var dropdownOptions: PartialDropdownOptionsAlignment = js.native
}
object FormSelectOptions {
  
  @scala.inline
  def apply(classes: String, dropdownOptions: PartialDropdownOptionsAlignment): FormSelectOptions = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], dropdownOptions = dropdownOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSelectOptions]
  }
  
  @scala.inline
  implicit class FormSelectOptionsOps[Self <: FormSelectOptions] (val x: Self) extends AnyVal {
    
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
    def setDropdownOptions(value: PartialDropdownOptionsAlignment): Self = this.set("dropdownOptions", value.asInstanceOf[js.Any])
  }
}
