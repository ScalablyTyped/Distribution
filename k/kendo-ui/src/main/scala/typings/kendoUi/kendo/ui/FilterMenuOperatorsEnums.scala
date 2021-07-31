package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterMenuOperatorsEnums extends StObject {
  
  @JSName("eq")
  var eq_FFilterMenuOperatorsEnums: js.UndefOr[String] = js.undefined
  
  var isnotnull: js.UndefOr[String] = js.undefined
  
  var isnull: js.UndefOr[String] = js.undefined
  
  var neq: js.UndefOr[String] = js.undefined
}
object FilterMenuOperatorsEnums {
  
  @scala.inline
  def apply(): FilterMenuOperatorsEnums = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterMenuOperatorsEnums]
  }
  
  @scala.inline
  implicit class FilterMenuOperatorsEnumsMutableBuilder[Self <: FilterMenuOperatorsEnums] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEq_(value: String): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEq_Undefined: Self = StObject.set(x, "eq", js.undefined)
    
    @scala.inline
    def setIsnotnull(value: String): Self = StObject.set(x, "isnotnull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsnotnullUndefined: Self = StObject.set(x, "isnotnull", js.undefined)
    
    @scala.inline
    def setIsnull(value: String): Self = StObject.set(x, "isnull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsnullUndefined: Self = StObject.set(x, "isnull", js.undefined)
    
    @scala.inline
    def setNeq(value: String): Self = StObject.set(x, "neq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeqUndefined: Self = StObject.set(x, "neq", js.undefined)
  }
}
