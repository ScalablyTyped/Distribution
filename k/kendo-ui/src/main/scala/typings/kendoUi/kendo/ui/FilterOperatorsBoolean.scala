package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterOperatorsBoolean extends StObject {
  
  @JSName("eq")
  var eq_FFilterOperatorsBoolean: js.UndefOr[String] = js.undefined
  
  var neq: js.UndefOr[String] = js.undefined
}
object FilterOperatorsBoolean {
  
  @scala.inline
  def apply(): FilterOperatorsBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOperatorsBoolean]
  }
  
  @scala.inline
  implicit class FilterOperatorsBooleanMutableBuilder[Self <: FilterOperatorsBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEq_(value: String): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEq_Undefined: Self = StObject.set(x, "eq", js.undefined)
    
    @scala.inline
    def setNeq(value: String): Self = StObject.set(x, "neq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeqUndefined: Self = StObject.set(x, "neq", js.undefined)
  }
}
