package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewFilterable extends StObject {
  
  var autoFilter: js.UndefOr[Boolean] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  var operator: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
}
object ListViewFilterable {
  
  inline def apply(): ListViewFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewFilterable]
  }
  
  extension [Self <: ListViewFilterable](x: Self) {
    
    inline def setAutoFilter(value: Boolean): Self = StObject.set(x, "autoFilter", value.asInstanceOf[js.Any])
    
    inline def setAutoFilterUndefined: Self = StObject.set(x, "autoFilter", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
