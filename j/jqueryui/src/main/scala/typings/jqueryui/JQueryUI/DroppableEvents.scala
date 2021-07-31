package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableEvents extends StObject {
  
  var activate: js.UndefOr[DroppableEvent] = js.undefined
  
  var create: js.UndefOr[DroppableEvent] = js.undefined
  
  var deactivate: js.UndefOr[DroppableEvent] = js.undefined
  
  var drop: js.UndefOr[DroppableEvent] = js.undefined
  
  var out: js.UndefOr[DroppableEvent] = js.undefined
  
  var over: js.UndefOr[DroppableEvent] = js.undefined
}
object DroppableEvents {
  
  @scala.inline
  def apply(): DroppableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DroppableEvents]
  }
  
  @scala.inline
  implicit class DroppableEventsMutableBuilder[Self <: DroppableEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDeactivate(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    @scala.inline
    def setDrop(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    @scala.inline
    def setOut(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit): Self = StObject.set(x, "out", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    
    @scala.inline
    def setOver(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit): Self = StObject.set(x, "over", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOverUndefined: Self = StObject.set(x, "over", js.undefined)
  }
}
