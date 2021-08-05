package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerHandlerMap[C /* <: Marker */] extends StObject {
  
  /**
    * This event is fired when the marker's animation property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.animation_changed Maps JavaScript API}
    */
  def animation_changed(): Unit
  
  /**
    * This event is fired when the marker icon was clicked.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.click Maps JavaScript API}
    */
  def click(event: MouseEvent): Unit
  
  /**
    * This event is fired when the marker's clickable property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.clickable_changed Maps JavaScript API}
    */
  def clickable_changed(): Unit
  
  /**
    * This event is fired when the marker's cursor property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.cursor_changed Maps JavaScript API}
    */
  def cursor_changed(): Unit
  
  /**
    * This event is fired when the marker icon was double clicked.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.dblclick Maps JavaScript API}
    */
  def dblclick(event: MouseEvent): Unit
  
  /**
    * This event is repeatedly fired while the user drags the marker.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.drag Maps JavaScript API}
    */
  def drag(event: MouseEvent): Unit
  
  /**
    * This event is fired when the user stops dragging the marker.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.dragend Maps JavaScript API}
    */
  def dragend(event: MouseEvent): Unit
  
  /**
    * This event is fired when the marker's draggable property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.draggable_changed Maps JavaScript API}
    */
  def draggable_changed(): Unit
  
  /**
    * This event is fired when the user starts dragging the marker.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.dragstart Maps JavaScript API}
    */
  def dragstart(event: MouseEvent): Unit
  
  /**
    * This event is fired when the marker's flat property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.flat_changed Maps JavaScript API}
    */
  def flat_changed(): Unit
  
  /**
    * This event is fired when the marker icon property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.icon_changed Maps JavaScript API}
    */
  def icon_changed(): Unit
  
  /**
    * This event is fired for a mousedown on the marker.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.mousedown Maps JavaScript API}
    */
  def mousedown(event: MouseEvent): Unit
  
  /**
    * This event is fired when the mouse leaves the area of the marker icon.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.mouseout Maps JavaScript API}
    */
  def mouseout(event: MouseEvent): Unit
  
  /**
    * This event is fired when the mouse enters the area of the marker icon.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.mouseover Maps JavaScript API}
    */
  def mouseover(event: MouseEvent): Unit
  
  /**
    * This event is fired for a mouseup on the marker.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.mouseup Maps JavaScript API}
    */
  def mouseup(event: MouseEvent): Unit
  
  /**
    * This event is fired when the marker position property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.position_changed Maps JavaScript API}
    */
  def position_changed(): Unit
  
  /**
    * This event is fired for a rightclick on the marker.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.rightclick Maps JavaScript API}
    */
  def rightclick(event: MouseEvent): Unit
  
  /**
    * This event is fired when the marker's shape property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.shape_changed Maps JavaScript API}
    */
  def shape_changed(): Unit
  
  /**
    * This event is fired when the marker title property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.title_changed Maps JavaScript API}
    */
  def title_changed(): Unit
  
  /**
    * This event is fired when the marker's visible property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.visible_changed Maps JavaScript API}
    */
  def visible_changed(): Unit
  
  /**
    * This event is fired when the marker's zIndex property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.zindex_changed Maps JavaScript API}
    */
  def zindex_changed(): Unit
}
object MarkerHandlerMap {
  
  inline def apply[C /* <: Marker */](
    animation_changed: () => Unit,
    click: MouseEvent => Unit,
    clickable_changed: () => Unit,
    cursor_changed: () => Unit,
    dblclick: MouseEvent => Unit,
    drag: MouseEvent => Unit,
    dragend: MouseEvent => Unit,
    draggable_changed: () => Unit,
    dragstart: MouseEvent => Unit,
    flat_changed: () => Unit,
    icon_changed: () => Unit,
    mousedown: MouseEvent => Unit,
    mouseout: MouseEvent => Unit,
    mouseover: MouseEvent => Unit,
    mouseup: MouseEvent => Unit,
    position_changed: () => Unit,
    rightclick: MouseEvent => Unit,
    shape_changed: () => Unit,
    title_changed: () => Unit,
    visible_changed: () => Unit,
    zindex_changed: () => Unit
  ): MarkerHandlerMap[C] = {
    val __obj = js.Dynamic.literal(animation_changed = js.Any.fromFunction0(animation_changed), click = js.Any.fromFunction1(click), clickable_changed = js.Any.fromFunction0(clickable_changed), cursor_changed = js.Any.fromFunction0(cursor_changed), dblclick = js.Any.fromFunction1(dblclick), drag = js.Any.fromFunction1(drag), dragend = js.Any.fromFunction1(dragend), draggable_changed = js.Any.fromFunction0(draggable_changed), dragstart = js.Any.fromFunction1(dragstart), flat_changed = js.Any.fromFunction0(flat_changed), icon_changed = js.Any.fromFunction0(icon_changed), mousedown = js.Any.fromFunction1(mousedown), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), position_changed = js.Any.fromFunction0(position_changed), rightclick = js.Any.fromFunction1(rightclick), shape_changed = js.Any.fromFunction0(shape_changed), title_changed = js.Any.fromFunction0(title_changed), visible_changed = js.Any.fromFunction0(visible_changed), zindex_changed = js.Any.fromFunction0(zindex_changed))
    __obj.asInstanceOf[MarkerHandlerMap[C]]
  }
  
  extension [Self <: MarkerHandlerMap[?], C /* <: Marker */](x: Self & MarkerHandlerMap[C]) {
    
    inline def setAnimation_changed(value: () => Unit): Self = StObject.set(x, "animation_changed", js.Any.fromFunction0(value))
    
    inline def setClick(value: MouseEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setClickable_changed(value: () => Unit): Self = StObject.set(x, "clickable_changed", js.Any.fromFunction0(value))
    
    inline def setCursor_changed(value: () => Unit): Self = StObject.set(x, "cursor_changed", js.Any.fromFunction0(value))
    
    inline def setDblclick(value: MouseEvent => Unit): Self = StObject.set(x, "dblclick", js.Any.fromFunction1(value))
    
    inline def setDrag(value: MouseEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    inline def setDragend(value: MouseEvent => Unit): Self = StObject.set(x, "dragend", js.Any.fromFunction1(value))
    
    inline def setDraggable_changed(value: () => Unit): Self = StObject.set(x, "draggable_changed", js.Any.fromFunction0(value))
    
    inline def setDragstart(value: MouseEvent => Unit): Self = StObject.set(x, "dragstart", js.Any.fromFunction1(value))
    
    inline def setFlat_changed(value: () => Unit): Self = StObject.set(x, "flat_changed", js.Any.fromFunction0(value))
    
    inline def setIcon_changed(value: () => Unit): Self = StObject.set(x, "icon_changed", js.Any.fromFunction0(value))
    
    inline def setMousedown(value: MouseEvent => Unit): Self = StObject.set(x, "mousedown", js.Any.fromFunction1(value))
    
    inline def setMouseout(value: MouseEvent => Unit): Self = StObject.set(x, "mouseout", js.Any.fromFunction1(value))
    
    inline def setMouseover(value: MouseEvent => Unit): Self = StObject.set(x, "mouseover", js.Any.fromFunction1(value))
    
    inline def setMouseup(value: MouseEvent => Unit): Self = StObject.set(x, "mouseup", js.Any.fromFunction1(value))
    
    inline def setPosition_changed(value: () => Unit): Self = StObject.set(x, "position_changed", js.Any.fromFunction0(value))
    
    inline def setRightclick(value: MouseEvent => Unit): Self = StObject.set(x, "rightclick", js.Any.fromFunction1(value))
    
    inline def setShape_changed(value: () => Unit): Self = StObject.set(x, "shape_changed", js.Any.fromFunction0(value))
    
    inline def setTitle_changed(value: () => Unit): Self = StObject.set(x, "title_changed", js.Any.fromFunction0(value))
    
    inline def setVisible_changed(value: () => Unit): Self = StObject.set(x, "visible_changed", js.Any.fromFunction0(value))
    
    inline def setZindex_changed(value: () => Unit): Self = StObject.set(x, "zindex_changed", js.Any.fromFunction0(value))
  }
}
