package typings.lobibox.LobiboxModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressEvents extends StObject {
  
  var progressComplete: js.UndefOr[js.Function1[/* lobibox */ LobiboxStatic, Unit]] = js.undefined
  
  var progressUpdated: js.UndefOr[js.Function1[/* lobibox */ LobiboxStatic, Unit]] = js.undefined
}
object ProgressEvents {
  
  @scala.inline
  def apply(): ProgressEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressEvents]
  }
  
  @scala.inline
  implicit class ProgressEventsMutableBuilder[Self <: ProgressEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgressComplete(value: /* lobibox */ LobiboxStatic => Unit): Self = StObject.set(x, "progressComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProgressCompleteUndefined: Self = StObject.set(x, "progressComplete", js.undefined)
    
    @scala.inline
    def setProgressUpdated(value: /* lobibox */ LobiboxStatic => Unit): Self = StObject.set(x, "progressUpdated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProgressUpdatedUndefined: Self = StObject.set(x, "progressUpdated", js.undefined)
  }
}
