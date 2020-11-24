package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableEvents extends js.Object {
  
  var create: js.UndefOr[DraggableEvent] = js.native
  
  var drag: js.UndefOr[DraggableEvent] = js.native
  
  var start: js.UndefOr[DraggableEvent] = js.native
  
  var stop: js.UndefOr[DraggableEvent] = js.native
}
object DraggableEvents {
  
  @scala.inline
  def apply(): DraggableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableEvents]
  }
  
  @scala.inline
  implicit class DraggableEventsOps[Self <: DraggableEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setDrag(value: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit): Self = this.set("drag", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setStart(value: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit): Self = this.set("start", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStop(value: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit): Self = this.set("stop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
}
