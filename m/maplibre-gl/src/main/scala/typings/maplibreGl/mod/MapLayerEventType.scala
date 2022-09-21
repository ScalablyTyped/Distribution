package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayerEventType extends StObject {
  
  var click: MapLayerMouseEvent
  
  var contextmenu: MapLayerMouseEvent
  
  var dblclick: MapLayerMouseEvent
  
  var mousedown: MapLayerMouseEvent
  
  var mouseenter: MapLayerMouseEvent
  
  var mouseleave: MapLayerMouseEvent
  
  var mousemove: MapLayerMouseEvent
  
  var mouseout: MapLayerMouseEvent
  
  var mouseover: MapLayerMouseEvent
  
  var mouseup: MapLayerMouseEvent
  
  var touchcancel: MapLayerTouchEvent
  
  var touchend: MapLayerTouchEvent
  
  var touchstart: MapLayerTouchEvent
}
object MapLayerEventType {
  
  inline def apply(
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
  
  extension [Self <: MapLayerEventType](x: Self) {
    
    inline def setClick(value: MapLayerMouseEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setContextmenu(value: MapLayerMouseEvent): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
    
    inline def setDblclick(value: MapLayerMouseEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    inline def setMousedown(value: MapLayerMouseEvent): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
    
    inline def setMouseenter(value: MapLayerMouseEvent): Self = StObject.set(x, "mouseenter", value.asInstanceOf[js.Any])
    
    inline def setMouseleave(value: MapLayerMouseEvent): Self = StObject.set(x, "mouseleave", value.asInstanceOf[js.Any])
    
    inline def setMousemove(value: MapLayerMouseEvent): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
    
    inline def setMouseout(value: MapLayerMouseEvent): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
    
    inline def setMouseover(value: MapLayerMouseEvent): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
    
    inline def setMouseup(value: MapLayerMouseEvent): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
    
    inline def setTouchcancel(value: MapLayerTouchEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    inline def setTouchend(value: MapLayerTouchEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    inline def setTouchstart(value: MapLayerTouchEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
  }
}
