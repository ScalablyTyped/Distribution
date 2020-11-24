package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterMenuOptions extends js.Object {
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var extra: js.UndefOr[Boolean] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var messages: js.UndefOr[FilterMenuMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var operators: js.UndefOr[FilterMenuOperators] = js.native
}
object FilterMenuOptions {
  
  @scala.inline
  def apply(): FilterMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterMenuOptions]
  }
  
  @scala.inline
  implicit class FilterMenuOptionsOps[Self <: FilterMenuOptions] (val x: Self) extends AnyVal {
    
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
    def setDataSource(value: js.Any | DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setExtra(value: Boolean): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setMessages(value: FilterMenuMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOperators(value: FilterMenuOperators): Self = this.set("operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperators: Self = this.set("operators", js.undefined)
  }
}
