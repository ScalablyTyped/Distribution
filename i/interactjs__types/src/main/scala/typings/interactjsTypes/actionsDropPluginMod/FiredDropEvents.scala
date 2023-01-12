package typings.interactjsTypes.actionsDropPluginMod

import typings.interactjsTypes.actionsDropDropEventMod.DropEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<'leave' | 'enter' | 'move' | 'drop' | 'activate' | 'deactivate', @interactjs/types.@interactjs/actions/drop/DropEvent.DropEvent>> */
trait FiredDropEvents extends StObject {
  
  var activate: js.UndefOr[DropEvent] = js.undefined
  
  var deactivate: js.UndefOr[DropEvent] = js.undefined
  
  var drop: js.UndefOr[DropEvent] = js.undefined
  
  var enter: js.UndefOr[DropEvent] = js.undefined
  
  var leave: js.UndefOr[DropEvent] = js.undefined
  
  var move: js.UndefOr[DropEvent] = js.undefined
}
object FiredDropEvents {
  
  inline def apply(): FiredDropEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FiredDropEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FiredDropEvents] (val x: Self) extends AnyVal {
    
    inline def setActivate(value: DropEvent): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setDeactivate(value: DropEvent): Self = StObject.set(x, "deactivate", value.asInstanceOf[js.Any])
    
    inline def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    inline def setDrop(value: DropEvent): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setEnter(value: DropEvent): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setLeave(value: DropEvent): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
    
    inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    
    inline def setMove(value: DropEvent): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
  }
}
