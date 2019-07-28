package typings.mapboxDashGl.mapboxDashGlMod

import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapEventType extends js.Object {
  var boxzoomcancel: MapBoxZoomEvent
  var boxzoomend: MapBoxZoomEvent
  var boxzoomstart: MapBoxZoomEvent
  var click: MapMouseEvent
  var contextmenu: MapMouseEvent
  var data: MapDataEvent
  var dataloading: MapDataEvent
  var dblclick: MapMouseEvent
  var drag: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]
  var dragend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]
  var dragstart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]
  var error: ErrorEvent
  var load: MapboxEvent[js.UndefOr[scala.Nothing]]
  var mousedown: MapMouseEvent
  var mousemove: MapMouseEvent
  var mouseout: MapMouseEvent
  var mouseover: MapMouseEvent
  var mouseup: MapMouseEvent
  var move: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]
  var moveend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]
  var movestart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]
  var pitch: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]
  var pitchend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]
  var pitchstart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]
  var remove: MapboxEvent[js.UndefOr[scala.Nothing]]
  var render: MapboxEvent[js.UndefOr[scala.Nothing]]
  var resize: MapboxEvent[js.UndefOr[scala.Nothing]]
  var rotate: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]
  var rotateend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]
  var rotatestart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]
  var sourcedata: MapSourceDataEvent
  var sourcedataloading: MapSourceDataEvent
  var styledata: MapStyleDataEvent
  var styledataloading: MapStyleDataEvent
  var tiledataloading: MapDataEvent
  var touchcancel: MapTouchEvent
  var touchend: MapTouchEvent
  var touchmove: MapTouchEvent
  var touchstart: MapTouchEvent
  var webglcontextlost: MapContextEvent
  var webglcontextrestored: MapContextEvent
  var wheel: MapWheelEvent
  var zoom: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]
  var zoomend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]
  var zoomstart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]
}

object MapEventType {
  @scala.inline
  def apply(
    boxzoomcancel: MapBoxZoomEvent,
    boxzoomend: MapBoxZoomEvent,
    boxzoomstart: MapBoxZoomEvent,
    click: MapMouseEvent,
    contextmenu: MapMouseEvent,
    data: MapDataEvent,
    dataloading: MapDataEvent,
    dblclick: MapMouseEvent,
    drag: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    dragend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    dragstart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    error: ErrorEvent,
    load: MapboxEvent[js.UndefOr[scala.Nothing]],
    mousedown: MapMouseEvent,
    mousemove: MapMouseEvent,
    mouseout: MapMouseEvent,
    mouseover: MapMouseEvent,
    mouseup: MapMouseEvent,
    move: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]],
    moveend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]],
    movestart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]],
    pitch: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    pitchend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    pitchstart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    remove: MapboxEvent[js.UndefOr[scala.Nothing]],
    render: MapboxEvent[js.UndefOr[scala.Nothing]],
    resize: MapboxEvent[js.UndefOr[scala.Nothing]],
    rotate: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    rotateend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    rotatestart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]],
    sourcedata: MapSourceDataEvent,
    sourcedataloading: MapSourceDataEvent,
    styledata: MapStyleDataEvent,
    styledataloading: MapStyleDataEvent,
    tiledataloading: MapDataEvent,
    touchcancel: MapTouchEvent,
    touchend: MapTouchEvent,
    touchmove: MapTouchEvent,
    touchstart: MapTouchEvent,
    webglcontextlost: MapContextEvent,
    webglcontextrestored: MapContextEvent,
    wheel: MapWheelEvent,
    zoom: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]],
    zoomend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]],
    zoomstart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]
  ): MapEventType = {
    val __obj = js.Dynamic.literal(boxzoomcancel = boxzoomcancel, boxzoomend = boxzoomend, boxzoomstart = boxzoomstart, click = click, contextmenu = contextmenu, data = data, dataloading = dataloading, dblclick = dblclick, drag = drag, dragend = dragend, dragstart = dragstart, error = error, load = load, mousedown = mousedown, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, move = move, moveend = moveend, movestart = movestart, pitch = pitch, pitchend = pitchend, pitchstart = pitchstart, remove = remove, render = render, resize = resize, rotate = rotate, rotateend = rotateend, rotatestart = rotatestart, sourcedata = sourcedata, sourcedataloading = sourcedataloading, styledata = styledata, styledataloading = styledataloading, tiledataloading = tiledataloading, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, webglcontextlost = webglcontextlost, webglcontextrestored = webglcontextrestored, wheel = wheel, zoom = zoom, zoomend = zoomend, zoomstart = zoomstart)
  
    __obj.asInstanceOf[MapEventType]
  }
}

