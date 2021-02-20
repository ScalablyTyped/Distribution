package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Scheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofScheduler extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Scheduler = js.native
  
  /* static member */
  var fn: Scheduler = js.native
}
object TypeofScheduler {
  
  @scala.inline
  def apply(extend: js.Object => Scheduler, fn: Scheduler): TypeofScheduler = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofScheduler]
  }
  
  @scala.inline
  implicit class TypeofSchedulerMutableBuilder[Self <: TypeofScheduler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Scheduler): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Scheduler): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
