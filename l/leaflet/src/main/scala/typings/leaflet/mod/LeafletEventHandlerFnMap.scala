package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeafletEventHandlerFnMap extends js.Object {
  var add: js.UndefOr[LeafletEventHandlerFn] = js.native
  var autopanstart: js.UndefOr[LeafletEventHandlerFn] = js.native
  var baselayerchange: js.UndefOr[LayersControlEventHandlerFn] = js.native
  var click: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var contextmenu: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var dblclick: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var down: js.UndefOr[LeafletEventHandlerFn] = js.native
  var drag: js.UndefOr[LeafletEventHandlerFn] = js.native
  var dragend: js.UndefOr[DragEndEventHandlerFn] = js.native
  var dragstart: js.UndefOr[LeafletEventHandlerFn] = js.native
  var error: js.UndefOr[LeafletEventHandlerFn] = js.native
  var keydown: js.UndefOr[LeafletKeyboardEventHandlerFn] = js.native
  var keypress: js.UndefOr[LeafletKeyboardEventHandlerFn] = js.native
  var keyup: js.UndefOr[LeafletKeyboardEventHandlerFn] = js.native
  var layeradd: js.UndefOr[LayerEventHandlerFn] = js.native
  var layerremove: js.UndefOr[LayerEventHandlerFn] = js.native
  var load: js.UndefOr[LeafletEventHandlerFn] = js.native
  var loading: js.UndefOr[LeafletEventHandlerFn] = js.native
  var locationerror: js.UndefOr[ErrorEventHandlerFn] = js.native
  var locationfound: js.UndefOr[LocationEventHandlerFn] = js.native
  var mousedown: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var mousemove: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var mouseout: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var mouseover: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var mouseup: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var move: js.UndefOr[LeafletEventHandlerFn] = js.native
  var moveend: js.UndefOr[LeafletEventHandlerFn] = js.native
  var movestart: js.UndefOr[LeafletEventHandlerFn] = js.native
  var overlayadd: js.UndefOr[LayersControlEventHandlerFn] = js.native
  var overlayremove: js.UndefOr[LayersControlEventHandlerFn] = js.native
  var popupclose: js.UndefOr[PopupEventHandlerFn] = js.native
  var popupopen: js.UndefOr[PopupEventHandlerFn] = js.native
  var preclick: js.UndefOr[LeafletMouseEventHandlerFn] = js.native
  var predrag: js.UndefOr[LeafletEventHandlerFn] = js.native
  var remove: js.UndefOr[LeafletEventHandlerFn] = js.native
  var resize: js.UndefOr[ResizeEventHandlerFn] = js.native
  var tileerror: js.UndefOr[TileErrorEventHandlerFn] = js.native
  var tileload: js.UndefOr[TileEventHandlerFn] = js.native
  var tileloadstart: js.UndefOr[TileEventHandlerFn] = js.native
  var tileunload: js.UndefOr[TileEventHandlerFn] = js.native
  var tooltipclose: js.UndefOr[TooltipEventHandlerFn] = js.native
  var tooltipopen: js.UndefOr[TooltipEventHandlerFn] = js.native
  var unload: js.UndefOr[LeafletEventHandlerFn] = js.native
  var update: js.UndefOr[LeafletEventHandlerFn] = js.native
  var viewreset: js.UndefOr[LeafletEventHandlerFn] = js.native
  var zoom: js.UndefOr[LeafletEventHandlerFn] = js.native
  var zoomanim: js.UndefOr[ZoomAnimEventHandlerFn] = js.native
  var zoomend: js.UndefOr[LeafletEventHandlerFn] = js.native
  var zoomlevelschange: js.UndefOr[LeafletEventHandlerFn] = js.native
  var zoomstart: js.UndefOr[LeafletEventHandlerFn] = js.native
}

object LeafletEventHandlerFnMap {
  @scala.inline
  def apply(): LeafletEventHandlerFnMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeafletEventHandlerFnMap]
  }
  @scala.inline
  implicit class LeafletEventHandlerFnMapOps[Self <: LeafletEventHandlerFnMap] (val x: Self) extends AnyVal {
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
    def setAdd(value: /* event */ LeafletEvent => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAutopanstart(value: /* event */ LeafletEvent => Unit): Self = this.set("autopanstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAutopanstart: Self = this.set("autopanstart", js.undefined)
    @scala.inline
    def setBaselayerchange(value: /* event */ LayersControlEvent => Unit): Self = this.set("baselayerchange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBaselayerchange: Self = this.set("baselayerchange", js.undefined)
    @scala.inline
    def setClick(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setContextmenu(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("contextmenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContextmenu: Self = this.set("contextmenu", js.undefined)
    @scala.inline
    def setDblclick(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("dblclick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDblclick: Self = this.set("dblclick", js.undefined)
    @scala.inline
    def setDown(value: /* event */ LeafletEvent => Unit): Self = this.set("down", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    @scala.inline
    def setDrag(value: /* event */ LeafletEvent => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setDragend(value: /* event */ DragEndEvent => Unit): Self = this.set("dragend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragend: Self = this.set("dragend", js.undefined)
    @scala.inline
    def setDragstart(value: /* event */ LeafletEvent => Unit): Self = this.set("dragstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragstart: Self = this.set("dragstart", js.undefined)
    @scala.inline
    def setError(value: /* event */ LeafletEvent => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setKeydown(value: /* event */ LeafletKeyboardEvent => Unit): Self = this.set("keydown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeydown: Self = this.set("keydown", js.undefined)
    @scala.inline
    def setKeypress(value: /* event */ LeafletKeyboardEvent => Unit): Self = this.set("keypress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeypress: Self = this.set("keypress", js.undefined)
    @scala.inline
    def setKeyup(value: /* event */ LeafletKeyboardEvent => Unit): Self = this.set("keyup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeyup: Self = this.set("keyup", js.undefined)
    @scala.inline
    def setLayeradd(value: /* event */ LayerEvent => Unit): Self = this.set("layeradd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLayeradd: Self = this.set("layeradd", js.undefined)
    @scala.inline
    def setLayerremove(value: /* event */ LayerEvent => Unit): Self = this.set("layerremove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLayerremove: Self = this.set("layerremove", js.undefined)
    @scala.inline
    def setLoad(value: /* event */ LeafletEvent => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setLoading(value: /* event */ LeafletEvent => Unit): Self = this.set("loading", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setLocationerror(value: /* event */ ErrorEvent => Unit): Self = this.set("locationerror", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLocationerror: Self = this.set("locationerror", js.undefined)
    @scala.inline
    def setLocationfound(value: /* event */ LocationEvent => Unit): Self = this.set("locationfound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLocationfound: Self = this.set("locationfound", js.undefined)
    @scala.inline
    def setMousedown(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("mousedown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMousedown: Self = this.set("mousedown", js.undefined)
    @scala.inline
    def setMousemove(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("mousemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMousemove: Self = this.set("mousemove", js.undefined)
    @scala.inline
    def setMouseout(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("mouseout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseout: Self = this.set("mouseout", js.undefined)
    @scala.inline
    def setMouseover(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("mouseover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseover: Self = this.set("mouseover", js.undefined)
    @scala.inline
    def setMouseup(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("mouseup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseup: Self = this.set("mouseup", js.undefined)
    @scala.inline
    def setMove(value: /* event */ LeafletEvent => Unit): Self = this.set("move", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    @scala.inline
    def setMoveend(value: /* event */ LeafletEvent => Unit): Self = this.set("moveend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMoveend: Self = this.set("moveend", js.undefined)
    @scala.inline
    def setMovestart(value: /* event */ LeafletEvent => Unit): Self = this.set("movestart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMovestart: Self = this.set("movestart", js.undefined)
    @scala.inline
    def setOverlayadd(value: /* event */ LayersControlEvent => Unit): Self = this.set("overlayadd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOverlayadd: Self = this.set("overlayadd", js.undefined)
    @scala.inline
    def setOverlayremove(value: /* event */ LayersControlEvent => Unit): Self = this.set("overlayremove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOverlayremove: Self = this.set("overlayremove", js.undefined)
    @scala.inline
    def setPopupclose(value: /* event */ PopupEvent => Unit): Self = this.set("popupclose", js.Any.fromFunction1(value))
    @scala.inline
    def deletePopupclose: Self = this.set("popupclose", js.undefined)
    @scala.inline
    def setPopupopen(value: /* event */ PopupEvent => Unit): Self = this.set("popupopen", js.Any.fromFunction1(value))
    @scala.inline
    def deletePopupopen: Self = this.set("popupopen", js.undefined)
    @scala.inline
    def setPreclick(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("preclick", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreclick: Self = this.set("preclick", js.undefined)
    @scala.inline
    def setPredrag(value: /* event */ LeafletEvent => Unit): Self = this.set("predrag", js.Any.fromFunction1(value))
    @scala.inline
    def deletePredrag: Self = this.set("predrag", js.undefined)
    @scala.inline
    def setRemove(value: /* event */ LeafletEvent => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setResize(value: /* event */ ResizeEvent => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setTileerror(value: /* event */ TileErrorEvent => Unit): Self = this.set("tileerror", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTileerror: Self = this.set("tileerror", js.undefined)
    @scala.inline
    def setTileload(value: /* event */ TileEvent => Unit): Self = this.set("tileload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTileload: Self = this.set("tileload", js.undefined)
    @scala.inline
    def setTileloadstart(value: /* event */ TileEvent => Unit): Self = this.set("tileloadstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTileloadstart: Self = this.set("tileloadstart", js.undefined)
    @scala.inline
    def setTileunload(value: /* event */ TileEvent => Unit): Self = this.set("tileunload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTileunload: Self = this.set("tileunload", js.undefined)
    @scala.inline
    def setTooltipclose(value: /* event */ TooltipEvent => Unit): Self = this.set("tooltipclose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTooltipclose: Self = this.set("tooltipclose", js.undefined)
    @scala.inline
    def setTooltipopen(value: /* event */ TooltipEvent => Unit): Self = this.set("tooltipopen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTooltipopen: Self = this.set("tooltipopen", js.undefined)
    @scala.inline
    def setUnload(value: /* event */ LeafletEvent => Unit): Self = this.set("unload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnload: Self = this.set("unload", js.undefined)
    @scala.inline
    def setUpdate(value: /* event */ LeafletEvent => Unit): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setViewreset(value: /* event */ LeafletEvent => Unit): Self = this.set("viewreset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteViewreset: Self = this.set("viewreset", js.undefined)
    @scala.inline
    def setZoom(value: /* event */ LeafletEvent => Unit): Self = this.set("zoom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    @scala.inline
    def setZoomanim(value: /* event */ ZoomAnimEvent => Unit): Self = this.set("zoomanim", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoomanim: Self = this.set("zoomanim", js.undefined)
    @scala.inline
    def setZoomend(value: /* event */ LeafletEvent => Unit): Self = this.set("zoomend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoomend: Self = this.set("zoomend", js.undefined)
    @scala.inline
    def setZoomlevelschange(value: /* event */ LeafletEvent => Unit): Self = this.set("zoomlevelschange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoomlevelschange: Self = this.set("zoomlevelschange", js.undefined)
    @scala.inline
    def setZoomstart(value: /* event */ LeafletEvent => Unit): Self = this.set("zoomstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoomstart: Self = this.set("zoomstart", js.undefined)
  }
  
}

