package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterOperators extends js.Object {
  
  var boolean: js.UndefOr[FilterOperatorsBoolean] = js.native
  
  var date: js.UndefOr[FilterOperatorsDate] = js.native
  
  var number: js.UndefOr[FilterOperatorsNumber] = js.native
  
  var string: js.UndefOr[FilterOperatorsString] = js.native
}
object FilterOperators {
  
  @scala.inline
  def apply(): FilterOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOperators]
  }
  
  @scala.inline
  implicit class FilterOperatorsOps[Self <: FilterOperators] (val x: Self) extends AnyVal {
    
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
    def setBoolean(value: FilterOperatorsBoolean): Self = this.set("boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoolean: Self = this.set("boolean", js.undefined)
    
    @scala.inline
    def setDate(value: FilterOperatorsDate): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setNumber(value: FilterOperatorsNumber): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setString(value: FilterOperatorsString): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
  }
}
