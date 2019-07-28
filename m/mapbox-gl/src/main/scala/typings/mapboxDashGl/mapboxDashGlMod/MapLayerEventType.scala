package typings.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerEventType extends js.Object {
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
    val __obj = js.Dynamic.literal(click = click, contextmenu = contextmenu, dblclick = dblclick, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, touchcancel = touchcancel, touchend = touchend, touchstart = touchstart)
  
    __obj.asInstanceOf[MapLayerEventType]
  }
}

