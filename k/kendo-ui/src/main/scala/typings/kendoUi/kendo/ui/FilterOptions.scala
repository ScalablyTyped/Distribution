package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterOptions extends js.Object {
  
  var applyButton: js.UndefOr[Boolean] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ FilterChangeEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[DataSource] = js.native
  
  var expression: js.UndefOr[js.Any] = js.native
  
  var expressionPreview: js.UndefOr[Boolean] = js.native
  
  var fields: js.UndefOr[js.Array[FilterField]] = js.native
  
  var mainLogic: js.UndefOr[String] = js.native
  
  var messages: js.UndefOr[FilterMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var operators: js.UndefOr[FilterOperators] = js.native
}
object FilterOptions {
  
  @scala.inline
  def apply(): FilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOptions]
  }
  
  @scala.inline
  implicit class FilterOptionsOps[Self <: FilterOptions] (val x: Self) extends AnyVal {
    
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
    def setApplyButton(value: Boolean): Self = this.set("applyButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyButton: Self = this.set("applyButton", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ FilterChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setExpression(value: js.Any): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    
    @scala.inline
    def setExpressionPreview(value: Boolean): Self = this.set("expressionPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionPreview: Self = this.set("expressionPreview", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: FilterField*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[FilterField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setMainLogic(value: String): Self = this.set("mainLogic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainLogic: Self = this.set("mainLogic", js.undefined)
    
    @scala.inline
    def setMessages(value: FilterMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOperators(value: FilterOperators): Self = this.set("operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperators: Self = this.set("operators", js.undefined)
  }
}
