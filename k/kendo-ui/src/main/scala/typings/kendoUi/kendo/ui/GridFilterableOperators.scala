package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFilterableOperators extends StObject {
  
  var date: js.UndefOr[GridFilterableOperatorsDate] = js.undefined
  
  var enums: js.UndefOr[GridFilterableOperatorsEnums] = js.undefined
  
  var number: js.UndefOr[GridFilterableOperatorsNumber] = js.undefined
  
  var string: js.UndefOr[GridFilterableOperatorsString] = js.undefined
}
object GridFilterableOperators {
  
  @scala.inline
  def apply(): GridFilterableOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFilterableOperators]
  }
  
  @scala.inline
  implicit class GridFilterableOperatorsMutableBuilder[Self <: GridFilterableOperators] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: GridFilterableOperatorsDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setEnums(value: GridFilterableOperatorsEnums): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
    
    @scala.inline
    def setNumber(value: GridFilterableOperatorsNumber): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setString(value: GridFilterableOperatorsString): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
  }
}
