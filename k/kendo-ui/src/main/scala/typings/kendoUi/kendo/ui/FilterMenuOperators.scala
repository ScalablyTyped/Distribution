package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterMenuOperators extends js.Object {
  
  var date: js.UndefOr[FilterMenuOperatorsDate] = js.native
  
  var enums: js.UndefOr[FilterMenuOperatorsEnums] = js.native
  
  var number: js.UndefOr[FilterMenuOperatorsNumber] = js.native
  
  var string: js.UndefOr[FilterMenuOperatorsString] = js.native
}
object FilterMenuOperators {
  
  @scala.inline
  def apply(): FilterMenuOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterMenuOperators]
  }
  
  @scala.inline
  implicit class FilterMenuOperatorsOps[Self <: FilterMenuOperators] (val x: Self) extends AnyVal {
    
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
    def setDate(value: FilterMenuOperatorsDate): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setEnums(value: FilterMenuOperatorsEnums): Self = this.set("enums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnums: Self = this.set("enums", js.undefined)
    
    @scala.inline
    def setNumber(value: FilterMenuOperatorsNumber): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setString(value: FilterMenuOperatorsString): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
  }
}
