package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayoutReorderEvent
  extends StObject
     with TileLayoutEvent {
  
  var container: js.UndefOr[JQuery] = js.undefined
  
  var newIndex: js.UndefOr[Double] = js.undefined
  
  var oldIndex: js.UndefOr[Double] = js.undefined
}
object TileLayoutReorderEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TileLayout): TileLayoutReorderEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayoutReorderEvent]
  }
  
  @scala.inline
  implicit class TileLayoutReorderEventMutableBuilder[Self <: TileLayoutReorderEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewIndexUndefined: Self = StObject.set(x, "newIndex", js.undefined)
    
    @scala.inline
    def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldIndexUndefined: Self = StObject.set(x, "oldIndex", js.undefined)
  }
}
