package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Scheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofScheduler extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Scheduler
  
  /* static member */
  var fn: Scheduler
}
object TypeofScheduler {
  
  inline def apply(extend: js.Object => Scheduler, fn: Scheduler): TypeofScheduler = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofScheduler]
  }
  
  extension [Self <: TypeofScheduler](x: Self) {
    
    inline def setExtend(value: js.Object => Scheduler): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Scheduler): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
