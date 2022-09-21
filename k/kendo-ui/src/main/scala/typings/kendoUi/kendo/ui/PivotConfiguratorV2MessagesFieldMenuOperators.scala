package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotConfiguratorV2MessagesFieldMenuOperators extends StObject {
  
  var contains: js.UndefOr[String] = js.undefined
  
  var doesnotcontain: js.UndefOr[String] = js.undefined
  
  var endswith: js.UndefOr[String] = js.undefined
  
  @JSName("eq")
  var eq_FPivotConfiguratorV2MessagesFieldMenuOperators: js.UndefOr[String] = js.undefined
  
  var neq: js.UndefOr[String] = js.undefined
  
  var startswith: js.UndefOr[String] = js.undefined
}
object PivotConfiguratorV2MessagesFieldMenuOperators {
  
  inline def apply(): PivotConfiguratorV2MessagesFieldMenuOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotConfiguratorV2MessagesFieldMenuOperators]
  }
  
  extension [Self <: PivotConfiguratorV2MessagesFieldMenuOperators](x: Self) {
    
    inline def setContains(value: String): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setDoesnotcontain(value: String): Self = StObject.set(x, "doesnotcontain", value.asInstanceOf[js.Any])
    
    inline def setDoesnotcontainUndefined: Self = StObject.set(x, "doesnotcontain", js.undefined)
    
    inline def setEndswith(value: String): Self = StObject.set(x, "endswith", value.asInstanceOf[js.Any])
    
    inline def setEndswithUndefined: Self = StObject.set(x, "endswith", js.undefined)
    
    inline def setEq_(value: String): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
    
    inline def setEq_Undefined: Self = StObject.set(x, "eq", js.undefined)
    
    inline def setNeq(value: String): Self = StObject.set(x, "neq", value.asInstanceOf[js.Any])
    
    inline def setNeqUndefined: Self = StObject.set(x, "neq", js.undefined)
    
    inline def setStartswith(value: String): Self = StObject.set(x, "startswith", value.asInstanceOf[js.Any])
    
    inline def setStartswithUndefined: Self = StObject.set(x, "startswith", js.undefined)
  }
}
