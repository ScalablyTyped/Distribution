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
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapLayerEventType]
  }
}

