package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerHandlerMap[C /* <: Marker */] extends js.Object {
  
  /**
    * This event is fired when the marker's animation property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.animation_changed Maps JavaScript API}
    */
  def animation_changed(): Unit = js.native
  
  /**
    * This event is fired when the marker icon was clicked.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.click Maps JavaScript API}
    */
  def click(event: MouseEvent): Unit = js.native
  
  /**
    * This event is fired when the marker's clickable property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.clickable_changed Maps JavaScript API}
    */
  def clickable_changed(): Unit = js.native
  
  /**
    * This event is fired when the marker's cursor property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.cursor_changed Maps JavaScript API}
    */
  def cursor_changed(): Unit = js.native
  
  /**
    * This event is fired when the marker icon was double clicked.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.dblclick Maps JavaScript API}
    */
  def dblclick(event: MouseEvent): Unit = js.native
  
  /**
    * This event is repeatedly fired while the user drags the marker.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.drag Maps JavaScript API}
    */
  def drag(event: MouseEvent): Unit = js.native
  
  /**
    * This event is fired when the user stops dragging the marker.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.dragend Maps JavaScript API}
    */
  def dragend(event: MouseEvent): Unit = js.native
  
  /**
    * This event is fired when the marker's draggable property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.draggable_changed Maps JavaScript API}
    */
  def draggable_changed(): Unit = js.native
  
  /**
    * This event is fired when the user starts dragging the marker.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.dragstart Maps JavaScript API}
    */
  def dragstart(event: MouseEvent): Unit = js.native
  
  /**
    * This event is fired when the marker's flat property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.flat_changed Maps JavaScript API}
    */
  def flat_changed(): Unit = js.native
  
  /**
    * This event is fired when the marker icon property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.icon_changed Maps JavaScript API}
    */
  def icon_changed(): Unit = js.native
  
  /**
    * This event is fired for a mousedown on the marker.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.mousedown Maps JavaScript API}
    */
  def mousedown(event: MouseEvent): Unit = js.native
  
  /**
    * This event is fired when the mouse leaves the area of the marker icon.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.mouseout Maps JavaScript API}
    */
  def mouseout(event: MouseEvent): Unit = js.native
  
  /**
    * This event is fired when the mouse enters the area of the marker icon.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.mouseover Maps JavaScript API}
    */
  def mouseover(event: MouseEvent): Unit = js.native
  
  /**
    * This event is fired for a mouseup on the marker.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.mouseup Maps JavaScript API}
    */
  def mouseup(event: MouseEvent): Unit = js.native
  
  /**
    * This event is fired when the marker position property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.position_changed Maps JavaScript API}
    */
  def position_changed(): Unit = js.native
  
  /**
    * This event is fired for a rightclick on the marker.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.rightclick Maps JavaScript API}
    */
  def rightclick(event: MouseEvent): Unit = js.native
  
  /**
    * This event is fired when the marker's shape property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.shape_changed Maps JavaScript API}
    */
  def shape_changed(): Unit = js.native
  
  /**
    * This event is fired when the marker title property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.title_changed Maps JavaScript API}
    */
  def title_changed(): Unit = js.native
  
  /**
    * This event is fired when the marker's visible property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.visible_changed Maps JavaScript API}
    */
  def visible_changed(): Unit = js.native
  
  /**
    * This event is fired when the marker's zIndex property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker.zindex_changed Maps JavaScript API}
    */
  def zindex_changed(): Unit = js.native
}
object MarkerHandlerMap {
  
  @scala.inline
  def apply[C /* <: Marker */](
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
  
  @scala.inline
  implicit class MarkerHandlerMapOps[Self <: MarkerHandlerMap[_], C /* <: Marker */] (val x: Self with MarkerHandlerMap[C]) extends AnyVal {
    
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
    def setAnimation_changed(value: () => Unit): Self = this.set("animation_changed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClick(value: MouseEvent => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClickable_changed(value: () => Unit): Self = this.set("clickable_changed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCursor_changed(value: () => Unit): Self = this.set("cursor_changed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDblclick(value: MouseEvent => Unit): Self = this.set("dblclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDrag(value: MouseEvent => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragend(value: MouseEvent => Unit): Self = this.set("dragend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDraggable_changed(value: () => Unit): Self = this.set("draggable_changed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDragstart(value: MouseEvent => Unit): Self = this.set("dragstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFlat_changed(value: () => Unit): Self = this.set("flat_changed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIcon_changed(value: () => Unit): Self = this.set("icon_changed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMousedown(value: MouseEvent => Unit): Self = this.set("mousedown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseout(value: MouseEvent => Unit): Self = this.set("mouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseover(value: MouseEvent => Unit): Self = this.set("mouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseup(value: MouseEvent => Unit): Self = this.set("mouseup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPosition_changed(value: () => Unit): Self = this.set("position_changed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRightclick(value: MouseEvent => Unit): Self = this.set("rightclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShape_changed(value: () => Unit): Self = this.set("shape_changed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle_changed(value: () => Unit): Self = this.set("title_changed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisible_changed(value: () => Unit): Self = this.set("visible_changed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setZindex_changed(value: () => Unit): Self = this.set("zindex_changed", js.Any.fromFunction0(value))
  }
}
