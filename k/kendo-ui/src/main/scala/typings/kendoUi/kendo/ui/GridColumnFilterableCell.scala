package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnFilterableCell extends StObject {
  
  var dataSource: js.UndefOr[Any | DataSource] = js.undefined
  
  var dataTextField: js.UndefOr[String] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var inputWidth: js.UndefOr[Double] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var operator: js.UndefOr[String] = js.undefined
  
  var showOperators: js.UndefOr[Boolean] = js.undefined
  
  var suggestionOperator: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[js.Function] = js.undefined
}
object GridColumnFilterableCell {
  
  inline def apply(): GridColumnFilterableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnFilterableCell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridColumnFilterableCell] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataTextField(value: String): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    inline def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setInputWidth(value: Double): Self = StObject.set(x, "inputWidth", value.asInstanceOf[js.Any])
    
    inline def setInputWidthUndefined: Self = StObject.set(x, "inputWidth", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setShowOperators(value: Boolean): Self = StObject.set(x, "showOperators", value.asInstanceOf[js.Any])
    
    inline def setShowOperatorsUndefined: Self = StObject.set(x, "showOperators", js.undefined)
    
    inline def setSuggestionOperator(value: String): Self = StObject.set(x, "suggestionOperator", value.asInstanceOf[js.Any])
    
    inline def setSuggestionOperatorUndefined: Self = StObject.set(x, "suggestionOperator", js.undefined)
    
    inline def setTemplate(value: js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
