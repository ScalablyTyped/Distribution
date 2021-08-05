package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFilterableOperatorsEnums extends StObject {
  
  @JSName("eq")
  var eq_FGridFilterableOperatorsEnums: js.UndefOr[String] = js.undefined
  
  var isnotnull: js.UndefOr[String] = js.undefined
  
  var isnull: js.UndefOr[String] = js.undefined
  
  var neq: js.UndefOr[String] = js.undefined
}
object GridFilterableOperatorsEnums {
  
  inline def apply(): GridFilterableOperatorsEnums = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFilterableOperatorsEnums]
  }
  
  extension [Self <: GridFilterableOperatorsEnums](x: Self) {
    
    inline def setEq_(value: String): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
    
    inline def setEq_Undefined: Self = StObject.set(x, "eq", js.undefined)
    
    inline def setIsnotnull(value: String): Self = StObject.set(x, "isnotnull", value.asInstanceOf[js.Any])
    
    inline def setIsnotnullUndefined: Self = StObject.set(x, "isnotnull", js.undefined)
    
    inline def setIsnull(value: String): Self = StObject.set(x, "isnull", value.asInstanceOf[js.Any])
    
    inline def setIsnullUndefined: Self = StObject.set(x, "isnull", js.undefined)
    
    inline def setNeq(value: String): Self = StObject.set(x, "neq", value.asInstanceOf[js.Any])
    
    inline def setNeqUndefined: Self = StObject.set(x, "neq", js.undefined)
  }
}
