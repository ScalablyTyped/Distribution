package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.AutoComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAutoComplete extends StObject {
  
  /* static member */
  def extend(proto: js.Object): AutoComplete
  
  /* static member */
  var fn: AutoComplete
}
object TypeofAutoComplete {
  
  inline def apply(extend: js.Object => AutoComplete, fn: AutoComplete): TypeofAutoComplete = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAutoComplete]
  }
  
  extension [Self <: TypeofAutoComplete](x: Self) {
    
    inline def setExtend(value: js.Object => AutoComplete): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: AutoComplete): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
