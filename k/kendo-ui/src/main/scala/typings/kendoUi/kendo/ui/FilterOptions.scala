package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterOptions extends StObject {
  
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
  implicit class FilterOptionsMutableBuilder[Self <: FilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyButton(value: Boolean): Self = StObject.set(x, "applyButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyButtonUndefined: Self = StObject.set(x, "applyButton", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ FilterChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setExpression(value: js.Any): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionPreview(value: Boolean): Self = StObject.set(x, "expressionPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionPreviewUndefined: Self = StObject.set(x, "expressionPreview", js.undefined)
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[FilterField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: FilterField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setMainLogic(value: String): Self = StObject.set(x, "mainLogic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainLogicUndefined: Self = StObject.set(x, "mainLogic", js.undefined)
    
    @scala.inline
    def setMessages(value: FilterMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperators(value: FilterOperators): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
  }
}
