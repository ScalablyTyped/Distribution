package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridColumnFilterableCell extends StObject {
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var dataTextField: js.UndefOr[String] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var inputWidth: js.UndefOr[Double] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var operator: js.UndefOr[String] = js.native
  
  var showOperators: js.UndefOr[Boolean] = js.native
  
  var suggestionOperator: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[js.Function] = js.native
}
object GridColumnFilterableCell {
  
  @scala.inline
  def apply(): GridColumnFilterableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnFilterableCell]
  }
  
  @scala.inline
  implicit class GridColumnFilterableCellMutableBuilder[Self <: GridColumnFilterableCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataTextField(value: String): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setInputWidth(value: Double): Self = StObject.set(x, "inputWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputWidthUndefined: Self = StObject.set(x, "inputWidth", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setShowOperators(value: Boolean): Self = StObject.set(x, "showOperators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOperatorsUndefined: Self = StObject.set(x, "showOperators", js.undefined)
    
    @scala.inline
    def setSuggestionOperator(value: String): Self = StObject.set(x, "suggestionOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionOperatorUndefined: Self = StObject.set(x, "suggestionOperator", js.undefined)
    
    @scala.inline
    def setTemplate(value: js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
