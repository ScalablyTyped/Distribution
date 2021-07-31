package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizableEvents extends StObject {
  
  var create: js.UndefOr[ResizableEvent] = js.undefined
  
  var resize: js.UndefOr[ResizableEvent] = js.undefined
  
  var start: js.UndefOr[ResizableEvent] = js.undefined
  
  var stop: js.UndefOr[ResizableEvent] = js.undefined
}
object ResizableEvents {
  
  @scala.inline
  def apply(): ResizableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizableEvents]
  }
  
  @scala.inline
  implicit class ResizableEventsMutableBuilder[Self <: ResizableEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setResize(value: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setStart(value: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStop(value: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
