package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortableEvents extends StObject {
  
  var activate: js.UndefOr[SortableEvent] = js.undefined
  
  var beforeStop: js.UndefOr[SortableEvent] = js.undefined
  
  var change: js.UndefOr[SortableEvent] = js.undefined
  
  var deactivate: js.UndefOr[SortableEvent] = js.undefined
  
  var out: js.UndefOr[SortableEvent] = js.undefined
  
  var over: js.UndefOr[SortableEvent] = js.undefined
  
  var receive: js.UndefOr[SortableEvent] = js.undefined
  
  var remove: js.UndefOr[SortableEvent] = js.undefined
  
  var sort: js.UndefOr[SortableEvent] = js.undefined
  
  var start: js.UndefOr[SortableEvent] = js.undefined
  
  var stop: js.UndefOr[SortableEvent] = js.undefined
  
  var update: js.UndefOr[SortableEvent] = js.undefined
}
object SortableEvents {
  
  inline def apply(): SortableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableEvents]
  }
  
  extension [Self <: SortableEvents](x: Self) {
    
    inline def setActivate(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction2(value))
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setBeforeStop(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "beforeStop", js.Any.fromFunction2(value))
    
    inline def setBeforeStopUndefined: Self = StObject.set(x, "beforeStop", js.undefined)
    
    inline def setChange(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setDeactivate(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction2(value))
    
    inline def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    inline def setOut(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "out", js.Any.fromFunction2(value))
    
    inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    
    inline def setOver(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "over", js.Any.fromFunction2(value))
    
    inline def setOverUndefined: Self = StObject.set(x, "over", js.undefined)
    
    inline def setReceive(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "receive", js.Any.fromFunction2(value))
    
    inline def setReceiveUndefined: Self = StObject.set(x, "receive", js.undefined)
    
    inline def setRemove(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setSort(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setStart(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setUpdate(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
