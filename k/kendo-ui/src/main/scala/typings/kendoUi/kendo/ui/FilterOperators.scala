package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterOperators extends StObject {
  
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
  implicit class FilterOperatorsMutableBuilder[Self <: FilterOperators] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolean(value: FilterOperatorsBoolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
    
    @scala.inline
    def setDate(value: FilterOperatorsDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setNumber(value: FilterOperatorsNumber): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setString(value: FilterOperatorsString): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
  }
}
