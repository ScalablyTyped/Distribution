package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterOptions extends StObject {
  
  var applyButton: js.UndefOr[Boolean] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ FilterChangeEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[DataSource] = js.undefined
  
  var expression: js.UndefOr[Any] = js.undefined
  
  var expressionPreview: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.UndefOr[js.Array[FilterField]] = js.undefined
  
  var mainLogic: js.UndefOr[String] = js.undefined
  
  var messages: js.UndefOr[FilterMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var operators: js.UndefOr[FilterOperators] = js.undefined
}
object FilterOptions {
  
  inline def apply(): FilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOptions]
  }
  
  extension [Self <: FilterOptions](x: Self) {
    
    inline def setApplyButton(value: Boolean): Self = StObject.set(x, "applyButton", value.asInstanceOf[js.Any])
    
    inline def setApplyButtonUndefined: Self = StObject.set(x, "applyButton", js.undefined)
    
    inline def setChange(value: /* e */ FilterChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setExpression(value: Any): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionPreview(value: Boolean): Self = StObject.set(x, "expressionPreview", value.asInstanceOf[js.Any])
    
    inline def setExpressionPreviewUndefined: Self = StObject.set(x, "expressionPreview", js.undefined)
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setFields(value: js.Array[FilterField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FilterField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setMainLogic(value: String): Self = StObject.set(x, "mainLogic", value.asInstanceOf[js.Any])
    
    inline def setMainLogicUndefined: Self = StObject.set(x, "mainLogic", js.undefined)
    
    inline def setMessages(value: FilterMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperators(value: FilterOperators): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
  }
}
