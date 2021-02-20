package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortableEvents extends StObject {
  
  var activate: js.UndefOr[SortableEvent] = js.native
  
  var beforeStop: js.UndefOr[SortableEvent] = js.native
  
  var change: js.UndefOr[SortableEvent] = js.native
  
  var deactivate: js.UndefOr[SortableEvent] = js.native
  
  var out: js.UndefOr[SortableEvent] = js.native
  
  var over: js.UndefOr[SortableEvent] = js.native
  
  var receive: js.UndefOr[SortableEvent] = js.native
  
  var remove: js.UndefOr[SortableEvent] = js.native
  
  var sort: js.UndefOr[SortableEvent] = js.native
  
  var start: js.UndefOr[SortableEvent] = js.native
  
  var stop: js.UndefOr[SortableEvent] = js.native
  
  var update: js.UndefOr[SortableEvent] = js.native
}
object SortableEvents {
  
  @scala.inline
  def apply(): SortableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableEvents]
  }
  
  @scala.inline
  implicit class SortableEventsMutableBuilder[Self <: SortableEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    @scala.inline
    def setBeforeStop(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "beforeStop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeStopUndefined: Self = StObject.set(x, "beforeStop", js.undefined)
    
    @scala.inline
    def setChange(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setDeactivate(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    @scala.inline
    def setOut(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "out", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    
    @scala.inline
    def setOver(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "over", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOverUndefined: Self = StObject.set(x, "over", js.undefined)
    
    @scala.inline
    def setReceive(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "receive", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReceiveUndefined: Self = StObject.set(x, "receive", js.undefined)
    
    @scala.inline
    def setRemove(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setSort(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setStart(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStop(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    @scala.inline
    def setUpdate(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
