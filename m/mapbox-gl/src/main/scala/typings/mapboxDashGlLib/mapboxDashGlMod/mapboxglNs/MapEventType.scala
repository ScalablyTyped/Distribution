package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

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
  var drag: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var dragend: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var dragstart: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var error: ErrorEvent
  var load: MapboxEvent[js.UndefOr[scala.Nothing]]
  var mousedown: MapMouseEvent
  var mousemove: MapMouseEvent
  var mouseout: MapMouseEvent
  var mouseover: MapMouseEvent
  var mouseup: MapMouseEvent
  var move: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]
  var moveend: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]
  var movestart: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]
  var pitch: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var pitchend: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var pitchstart: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var remove: MapboxEvent[js.UndefOr[scala.Nothing]]
  var render: MapboxEvent[js.UndefOr[scala.Nothing]]
  var resize: MapboxEvent[js.UndefOr[scala.Nothing]]
  var rotate: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var rotateend: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var rotatestart: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
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
  var zoom: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]
  var zoomend: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]
  var zoomstart: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]
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
    drag: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]],
    dragend: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]],
    dragstart: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]],
    error: ErrorEvent,
    load: MapboxEvent[js.UndefOr[scala.Nothing]],
    mousedown: MapMouseEvent,
    mousemove: MapMouseEvent,
    mouseout: MapMouseEvent,
    mouseover: MapMouseEvent,
    mouseup: MapMouseEvent,
    move: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]],
    moveend: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]],
    movestart: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]],
    pitch: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]],
    pitchend: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]],
    pitchstart: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]],
    remove: MapboxEvent[js.UndefOr[scala.Nothing]],
    render: MapboxEvent[js.UndefOr[scala.Nothing]],
    resize: MapboxEvent[js.UndefOr[scala.Nothing]],
    rotate: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]],
    rotateend: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]],
    rotatestart: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]],
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
    zoom: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]],
    zoomend: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]],
    zoomstart: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]
  ): MapEventType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boxzoomcancel")(boxzoomcancel)
    __obj.updateDynamic("boxzoomend")(boxzoomend)
    __obj.updateDynamic("boxzoomstart")(boxzoomstart)
    __obj.updateDynamic("click")(click)
    __obj.updateDynamic("contextmenu")(contextmenu)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("dataloading")(dataloading)
    __obj.updateDynamic("dblclick")(dblclick)
    __obj.updateDynamic("drag")(drag)
    __obj.updateDynamic("dragend")(dragend)
    __obj.updateDynamic("dragstart")(dragstart)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("mousedown")(mousedown)
    __obj.updateDynamic("mousemove")(mousemove)
    __obj.updateDynamic("mouseout")(mouseout)
    __obj.updateDynamic("mouseover")(mouseover)
    __obj.updateDynamic("mouseup")(mouseup)
    __obj.updateDynamic("move")(move)
    __obj.updateDynamic("moveend")(moveend)
    __obj.updateDynamic("movestart")(movestart)
    __obj.updateDynamic("pitch")(pitch)
    __obj.updateDynamic("pitchend")(pitchend)
    __obj.updateDynamic("pitchstart")(pitchstart)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("render")(render)
    __obj.updateDynamic("resize")(resize)
    __obj.updateDynamic("rotate")(rotate)
    __obj.updateDynamic("rotateend")(rotateend)
    __obj.updateDynamic("rotatestart")(rotatestart)
    __obj.updateDynamic("sourcedata")(sourcedata)
    __obj.updateDynamic("sourcedataloading")(sourcedataloading)
    __obj.updateDynamic("styledata")(styledata)
    __obj.updateDynamic("styledataloading")(styledataloading)
    __obj.updateDynamic("tiledataloading")(tiledataloading)
    __obj.updateDynamic("touchcancel")(touchcancel)
    __obj.updateDynamic("touchend")(touchend)
    __obj.updateDynamic("touchmove")(touchmove)
    __obj.updateDynamic("touchstart")(touchstart)
    __obj.updateDynamic("webglcontextlost")(webglcontextlost)
    __obj.updateDynamic("webglcontextrestored")(webglcontextrestored)
    __obj.updateDynamic("wheel")(wheel)
    __obj.updateDynamic("zoom")(zoom)
    __obj.updateDynamic("zoomend")(zoomend)
    __obj.updateDynamic("zoomstart")(zoomstart)
    __obj.asInstanceOf[MapEventType]
  }
}

