package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueSortPhase extends StObject {
  
  var queueSortPhase: js.UndefOr[Boolean] = js.undefined
}
object QueueSortPhase {
  
  inline def apply(): QueueSortPhase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueSortPhase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueueSortPhase] (val x: Self) extends AnyVal {
    
    inline def setQueueSortPhase(value: Boolean): Self = StObject.set(x, "queueSortPhase", value.asInstanceOf[js.Any])
    
    inline def setQueueSortPhaseUndefined: Self = StObject.set(x, "queueSortPhase", js.undefined)
  }
}
