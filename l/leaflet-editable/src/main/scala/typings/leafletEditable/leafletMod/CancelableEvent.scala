package typings.leafletEditable.leafletMod

import typings.leaflet.mod.LeafletEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelableEvent
  extends StObject
     with LeafletEvent {
  
  /**
    * Cancel any subsequent action.
    */
  def cancel(): Unit
}
object CancelableEvent {
  
  inline def apply(
    cancel: () => Unit,
    layer: Any,
    popup: Any,
    propagatedFrom: Any,
    sourceTarget: Any,
    target: Any,
    `type`: String
  ): CancelableEvent = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelableEvent]
  }
  
  extension [Self <: CancelableEvent](x: Self) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
