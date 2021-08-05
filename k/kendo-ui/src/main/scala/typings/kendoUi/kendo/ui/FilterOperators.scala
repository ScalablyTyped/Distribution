package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterOperators extends StObject {
  
  var boolean: js.UndefOr[FilterOperatorsBoolean] = js.undefined
  
  var date: js.UndefOr[FilterOperatorsDate] = js.undefined
  
  var number: js.UndefOr[FilterOperatorsNumber] = js.undefined
  
  var string: js.UndefOr[FilterOperatorsString] = js.undefined
}
object FilterOperators {
  
  inline def apply(): FilterOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOperators]
  }
  
  extension [Self <: FilterOperators](x: Self) {
    
    inline def setBoolean(value: FilterOperatorsBoolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
    
    inline def setDate(value: FilterOperatorsDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setNumber(value: FilterOperatorsNumber): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setString(value: FilterOperatorsString): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
  }
}
