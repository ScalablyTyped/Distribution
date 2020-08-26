package typings.mapboxGl.mod

import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapEventType extends js.Object {
  var boxzoomcancel: MapBoxZoomEvent = js.native
  var boxzoomend: MapBoxZoomEvent = js.native
  var boxzoomstart: MapBoxZoomEvent = js.native
  var click: MapMouseEvent = js.native
  var contextmenu: MapMouseEvent = js.native
  var data: MapDataEvent = js.native
  var dataloading: MapDataEvent = js.native
  var dblclick: MapMouseEvent = js.native
  var drag: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var dragend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var dragstart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var error: ErrorEvent = js.native
  var load: MapboxEvent[js.UndefOr[scala.Nothing]] = js.native
  var mousedown: MapMouseEvent = js.native
  var mousemove: MapMouseEvent = js.native
  var mouseout: MapMouseEvent = js.native
  var mouseover: MapMouseEvent = js.native
  var mouseup: MapMouseEvent = js.native
  var move: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]] = js.native
  var moveend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]] = js.native
  var movestart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]] = js.native
  var pitch: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var pitchend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var pitchstart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var remove: MapboxEvent[js.UndefOr[scala.Nothing]] = js.native
  var render: MapboxEvent[js.UndefOr[scala.Nothing]] = js.native
  var resize: MapboxEvent[js.UndefOr[scala.Nothing]] = js.native
  var rotate: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var rotateend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var rotatestart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]] = js.native
  var sourcedata: MapSourceDataEvent = js.native
  var sourcedataloading: MapSourceDataEvent = js.native
  var styledata: MapStyleDataEvent = js.native
  var styledataloading: MapStyleDataEvent = js.native
  var tiledataloading: MapDataEvent = js.native
  var touchcancel: MapTouchEvent = js.native
  var touchend: MapTouchEvent = js.native
  var touchmove: MapTouchEvent = js.native
  var touchstart: MapTouchEvent = js.native
  var webglcontextlost: MapContextEvent = js.native
  var webglcontextrestored: MapContextEvent = js.native
  var wheel: MapWheelEvent = js.native
  var zoom: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]] = js.native
  var zoomend: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]] = js.native
  var zoomstart: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]] = js.native
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
    val __obj = js.Dynamic.literal(boxzoomcancel = boxzoomcancel.asInstanceOf[js.Any], boxzoomend = boxzoomend.asInstanceOf[js.Any], boxzoomstart = boxzoomstart.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataloading = dataloading.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], movestart = movestart.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], pitchend = pitchend.asInstanceOf[js.Any], pitchstart = pitchstart.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], rotateend = rotateend.asInstanceOf[js.Any], rotatestart = rotatestart.asInstanceOf[js.Any], sourcedata = sourcedata.asInstanceOf[js.Any], sourcedataloading = sourcedataloading.asInstanceOf[js.Any], styledata = styledata.asInstanceOf[js.Any], styledataloading = styledataloading.asInstanceOf[js.Any], tiledataloading = tiledataloading.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], webglcontextlost = webglcontextlost.asInstanceOf[js.Any], webglcontextrestored = webglcontextrestored.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any], zoomend = zoomend.asInstanceOf[js.Any], zoomstart = zoomstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapEventType]
  }
  @scala.inline
  implicit class MapEventTypeOps[Self <: MapEventType] (val x: Self) extends AnyVal {
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
    def setBoxzoomcancel(value: MapBoxZoomEvent): Self = this.set("boxzoomcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoxzoomend(value: MapBoxZoomEvent): Self = this.set("boxzoomend", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoxzoomstart(value: MapBoxZoomEvent): Self = this.set("boxzoomstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setClick(value: MapMouseEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextmenu(value: MapMouseEvent): Self = this.set("contextmenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: MapDataEvent): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataloading(value: MapDataEvent): Self = this.set("dataloading", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: MapMouseEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrag(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = this.set("drag", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragend(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = this.set("dragend", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragstart(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = this.set("dragstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorEvent): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad(value: MapboxEvent[js.UndefOr[scala.Nothing]]): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousedown(value: MapMouseEvent): Self = this.set("mousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousemove(value: MapMouseEvent): Self = this.set("mousemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseout(value: MapMouseEvent): Self = this.set("mouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseover(value: MapMouseEvent): Self = this.set("mouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseup(value: MapMouseEvent): Self = this.set("mouseup", value.asInstanceOf[js.Any])
    @scala.inline
    def setMove(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = this.set("move", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoveend(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = this.set("moveend", value.asInstanceOf[js.Any])
    @scala.inline
    def setMovestart(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = this.set("movestart", value.asInstanceOf[js.Any])
    @scala.inline
    def setPitch(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = this.set("pitch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPitchend(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = this.set("pitchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setPitchstart(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = this.set("pitchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: MapboxEvent[js.UndefOr[scala.Nothing]]): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def setRender(value: MapboxEvent[js.UndefOr[scala.Nothing]]): Self = this.set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def setResize(value: MapboxEvent[js.UndefOr[scala.Nothing]]): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotate(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotateend(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = this.set("rotateend", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotatestart(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = this.set("rotatestart", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcedata(value: MapSourceDataEvent): Self = this.set("sourcedata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcedataloading(value: MapSourceDataEvent): Self = this.set("sourcedataloading", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyledata(value: MapStyleDataEvent): Self = this.set("styledata", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyledataloading(value: MapStyleDataEvent): Self = this.set("styledataloading", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiledataloading(value: MapDataEvent): Self = this.set("tiledataloading", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: MapTouchEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: MapTouchEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: MapTouchEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: MapTouchEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebglcontextlost(value: MapContextEvent): Self = this.set("webglcontextlost", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebglcontextrestored(value: MapContextEvent): Self = this.set("webglcontextrestored", value.asInstanceOf[js.Any])
    @scala.inline
    def setWheel(value: MapWheelEvent): Self = this.set("wheel", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomend(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = this.set("zoomend", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomstart(value: MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = this.set("zoomstart", value.asInstanceOf[js.Any])
  }
  
}

