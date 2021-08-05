package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Gantt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofGantt extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Gantt
  
  /* static member */
  var fn: Gantt
}
object TypeofGantt {
  
  inline def apply(extend: js.Object => Gantt, fn: Gantt): TypeofGantt = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofGantt]
  }
  
  extension [Self <: TypeofGantt](x: Self) {
    
    inline def setExtend(value: js.Object => Gantt): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Gantt): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
