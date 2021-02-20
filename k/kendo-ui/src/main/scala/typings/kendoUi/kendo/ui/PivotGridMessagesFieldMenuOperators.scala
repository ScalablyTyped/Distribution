package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGridMessagesFieldMenuOperators extends StObject {
  
  var contains: js.UndefOr[String] = js.native
  
  var doesnotcontain: js.UndefOr[String] = js.native
  
  var endswith: js.UndefOr[String] = js.native
  
  @JSName("eq")
  var eq_FPivotGridMessagesFieldMenuOperators: js.UndefOr[String] = js.native
  
  var neq: js.UndefOr[String] = js.native
  
  var startswith: js.UndefOr[String] = js.native
}
object PivotGridMessagesFieldMenuOperators {
  
  @scala.inline
  def apply(): PivotGridMessagesFieldMenuOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridMessagesFieldMenuOperators]
  }
  
  @scala.inline
  implicit class PivotGridMessagesFieldMenuOperatorsMutableBuilder[Self <: PivotGridMessagesFieldMenuOperators] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: String): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    @scala.inline
    def setDoesnotcontain(value: String): Self = StObject.set(x, "doesnotcontain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoesnotcontainUndefined: Self = StObject.set(x, "doesnotcontain", js.undefined)
    
    @scala.inline
    def setEndswith(value: String): Self = StObject.set(x, "endswith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndswithUndefined: Self = StObject.set(x, "endswith", js.undefined)
    
    @scala.inline
    def setEq_(value: String): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEq_Undefined: Self = StObject.set(x, "eq", js.undefined)
    
    @scala.inline
    def setNeq(value: String): Self = StObject.set(x, "neq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeqUndefined: Self = StObject.set(x, "neq", js.undefined)
    
    @scala.inline
    def setStartswith(value: String): Self = StObject.set(x, "startswith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartswithUndefined: Self = StObject.set(x, "startswith", js.undefined)
  }
}
