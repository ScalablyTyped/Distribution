package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFilter extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Filter
  
  /* static member */
  var fn: Filter
}
object TypeofFilter {
  
  inline def apply(extend: js.Object => Filter, fn: Filter): TypeofFilter = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFilter]
  }
  
  extension [Self <: TypeofFilter](x: Self) {
    
    inline def setExtend(value: js.Object => Filter): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Filter): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
