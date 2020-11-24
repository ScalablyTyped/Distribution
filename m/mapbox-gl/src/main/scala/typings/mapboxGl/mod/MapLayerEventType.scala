package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerEventType extends js.Object {
  
  var click: MapLayerMouseEvent = js.native
  
  var contextmenu: MapLayerMouseEvent = js.native
  
  var dblclick: MapLayerMouseEvent = js.native
  
  var mousedown: MapLayerMouseEvent = js.native
  
  var mouseenter: MapLayerMouseEvent = js.native
  
  var mouseleave: MapLayerMouseEvent = js.native
  
  var mousemove: MapLayerMouseEvent = js.native
  
  var mouseout: MapLayerMouseEvent = js.native
  
  var mouseover: MapLayerMouseEvent = js.native
  
  var mouseup: MapLayerMouseEvent = js.native
  
  var touchcancel: MapLayerTouchEvent = js.native
  
  var touchend: MapLayerTouchEvent = js.native
  
  var touchstart: MapLayerTouchEvent = js.native
}
object MapLayerEventType {
  
  @scala.inline
  def apply(
    click: MapLayerMouseEvent,
    contextmenu: MapLayerMouseEvent,
    dblclick: MapLayerMouseEvent,
    mousedown: MapLayerMouseEvent,
    mouseenter: MapLayerMouseEvent,
    mouseleave: MapLayerMouseEvent,
    mousemove: MapLayerMouseEvent,
    mouseout: MapLayerMouseEvent,
    mouseover: MapLayerMouseEvent,
    mouseup: MapLayerMouseEvent,
    touchcancel: MapLayerTouchEvent,
    touchend: MapLayerTouchEvent,
    touchstart: MapLayerTouchEvent
  ): MapLayerEventType = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerEventType]
  }
  
  @scala.inline
  implicit class MapLayerEventTypeOps[Self <: MapLayerEventType] (val x: Self) extends AnyVal {
    
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
    def setClick(value: MapLayerMouseEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextmenu(value: MapLayerMouseEvent): Self = this.set("contextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: MapLayerMouseEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousedown(value: MapLayerMouseEvent): Self = this.set("mousedown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseenter(value: MapLayerMouseEvent): Self = this.set("mouseenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseleave(value: MapLayerMouseEvent): Self = this.set("mouseleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousemove(value: MapLayerMouseEvent): Self = this.set("mousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseout(value: MapLayerMouseEvent): Self = this.set("mouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseover(value: MapLayerMouseEvent): Self = this.set("mouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseup(value: MapLayerMouseEvent): Self = this.set("mouseup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: MapLayerTouchEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: MapLayerTouchEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: MapLayerTouchEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
  }
}
