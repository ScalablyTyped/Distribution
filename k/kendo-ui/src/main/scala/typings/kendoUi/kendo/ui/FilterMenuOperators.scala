package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterMenuOperators extends StObject {
  
  var date: js.UndefOr[FilterMenuOperatorsDate] = js.undefined
  
  var enums: js.UndefOr[FilterMenuOperatorsEnums] = js.undefined
  
  var number: js.UndefOr[FilterMenuOperatorsNumber] = js.undefined
  
  var string: js.UndefOr[FilterMenuOperatorsString] = js.undefined
}
object FilterMenuOperators {
  
  @scala.inline
  def apply(): FilterMenuOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterMenuOperators]
  }
  
  @scala.inline
  implicit class FilterMenuOperatorsMutableBuilder[Self <: FilterMenuOperators] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: FilterMenuOperatorsDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setEnums(value: FilterMenuOperatorsEnums): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
    
    @scala.inline
    def setNumber(value: FilterMenuOperatorsNumber): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setString(value: FilterMenuOperatorsString): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
  }
}
