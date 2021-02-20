package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerEventType extends StObject {
  
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
  implicit class MapLayerEventTypeMutableBuilder[Self <: MapLayerEventType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: MapLayerMouseEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextmenu(value: MapLayerMouseEvent): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: MapLayerMouseEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousedown(value: MapLayerMouseEvent): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseenter(value: MapLayerMouseEvent): Self = StObject.set(x, "mouseenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseleave(value: MapLayerMouseEvent): Self = StObject.set(x, "mouseleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousemove(value: MapLayerMouseEvent): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseout(value: MapLayerMouseEvent): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseover(value: MapLayerMouseEvent): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseup(value: MapLayerMouseEvent): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: MapLayerTouchEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: MapLayerTouchEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: MapLayerTouchEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
  }
}
