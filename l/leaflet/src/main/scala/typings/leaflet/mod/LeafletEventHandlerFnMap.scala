package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeafletEventHandlerFnMap extends StObject {
  
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
  implicit class LeafletEventHandlerFnMapMutableBuilder[Self <: LeafletEventHandlerFnMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAutopanstart(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "autopanstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutopanstartUndefined: Self = StObject.set(x, "autopanstart", js.undefined)
    
    @scala.inline
    def setBaselayerchange(value: /* event */ LayersControlEvent => Unit): Self = StObject.set(x, "baselayerchange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBaselayerchangeUndefined: Self = StObject.set(x, "baselayerchange", js.undefined)
    
    @scala.inline
    def setClick(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setContextmenu(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "contextmenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
    
    @scala.inline
    def setDblclick(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "dblclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDblclickUndefined: Self = StObject.set(x, "dblclick", js.undefined)
    
    @scala.inline
    def setDown(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    @scala.inline
    def setDrag(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setDragend(value: /* event */ DragEndEvent => Unit): Self = StObject.set(x, "dragend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
    
    @scala.inline
    def setDragstart(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "dragstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
    
    @scala.inline
    def setError(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setKeydown(value: /* event */ LeafletKeyboardEvent => Unit): Self = StObject.set(x, "keydown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
    
    @scala.inline
    def setKeypress(value: /* event */ LeafletKeyboardEvent => Unit): Self = StObject.set(x, "keypress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeypressUndefined: Self = StObject.set(x, "keypress", js.undefined)
    
    @scala.inline
    def setKeyup(value: /* event */ LeafletKeyboardEvent => Unit): Self = StObject.set(x, "keyup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyupUndefined: Self = StObject.set(x, "keyup", js.undefined)
    
    @scala.inline
    def setLayeradd(value: /* event */ LayerEvent => Unit): Self = StObject.set(x, "layeradd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLayeraddUndefined: Self = StObject.set(x, "layeradd", js.undefined)
    
    @scala.inline
    def setLayerremove(value: /* event */ LayerEvent => Unit): Self = StObject.set(x, "layerremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLayerremoveUndefined: Self = StObject.set(x, "layerremove", js.undefined)
    
    @scala.inline
    def setLoad(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setLoading(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "loading", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setLocationerror(value: /* event */ ErrorEvent => Unit): Self = StObject.set(x, "locationerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocationerrorUndefined: Self = StObject.set(x, "locationerror", js.undefined)
    
    @scala.inline
    def setLocationfound(value: /* event */ LocationEvent => Unit): Self = StObject.set(x, "locationfound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocationfoundUndefined: Self = StObject.set(x, "locationfound", js.undefined)
    
    @scala.inline
    def setMousedown(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "mousedown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMousedownUndefined: Self = StObject.set(x, "mousedown", js.undefined)
    
    @scala.inline
    def setMousemove(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "mousemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMousemoveUndefined: Self = StObject.set(x, "mousemove", js.undefined)
    
    @scala.inline
    def setMouseout(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "mouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
    
    @scala.inline
    def setMouseover(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "mouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
    
    @scala.inline
    def setMouseup(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "mouseup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseupUndefined: Self = StObject.set(x, "mouseup", js.undefined)
    
    @scala.inline
    def setMove(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    @scala.inline
    def setMoveend(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "moveend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveendUndefined: Self = StObject.set(x, "moveend", js.undefined)
    
    @scala.inline
    def setMovestart(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "movestart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMovestartUndefined: Self = StObject.set(x, "movestart", js.undefined)
    
    @scala.inline
    def setOverlayadd(value: /* event */ LayersControlEvent => Unit): Self = StObject.set(x, "overlayadd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOverlayaddUndefined: Self = StObject.set(x, "overlayadd", js.undefined)
    
    @scala.inline
    def setOverlayremove(value: /* event */ LayersControlEvent => Unit): Self = StObject.set(x, "overlayremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOverlayremoveUndefined: Self = StObject.set(x, "overlayremove", js.undefined)
    
    @scala.inline
    def setPopupclose(value: /* event */ PopupEvent => Unit): Self = StObject.set(x, "popupclose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPopupcloseUndefined: Self = StObject.set(x, "popupclose", js.undefined)
    
    @scala.inline
    def setPopupopen(value: /* event */ PopupEvent => Unit): Self = StObject.set(x, "popupopen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPopupopenUndefined: Self = StObject.set(x, "popupopen", js.undefined)
    
    @scala.inline
    def setPreclick(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "preclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreclickUndefined: Self = StObject.set(x, "preclick", js.undefined)
    
    @scala.inline
    def setPredrag(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "predrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPredragUndefined: Self = StObject.set(x, "predrag", js.undefined)
    
    @scala.inline
    def setRemove(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setResize(value: /* event */ ResizeEvent => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setTileerror(value: /* event */ TileErrorEvent => Unit): Self = StObject.set(x, "tileerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTileerrorUndefined: Self = StObject.set(x, "tileerror", js.undefined)
    
    @scala.inline
    def setTileload(value: /* event */ TileEvent => Unit): Self = StObject.set(x, "tileload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTileloadUndefined: Self = StObject.set(x, "tileload", js.undefined)
    
    @scala.inline
    def setTileloadstart(value: /* event */ TileEvent => Unit): Self = StObject.set(x, "tileloadstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTileloadstartUndefined: Self = StObject.set(x, "tileloadstart", js.undefined)
    
    @scala.inline
    def setTileunload(value: /* event */ TileEvent => Unit): Self = StObject.set(x, "tileunload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTileunloadUndefined: Self = StObject.set(x, "tileunload", js.undefined)
    
    @scala.inline
    def setTooltipclose(value: /* event */ TooltipEvent => Unit): Self = StObject.set(x, "tooltipclose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltipcloseUndefined: Self = StObject.set(x, "tooltipclose", js.undefined)
    
    @scala.inline
    def setTooltipopen(value: /* event */ TooltipEvent => Unit): Self = StObject.set(x, "tooltipopen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltipopenUndefined: Self = StObject.set(x, "tooltipopen", js.undefined)
    
    @scala.inline
    def setUnload(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "unload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnloadUndefined: Self = StObject.set(x, "unload", js.undefined)
    
    @scala.inline
    def setUpdate(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    @scala.inline
    def setViewreset(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "viewreset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setViewresetUndefined: Self = StObject.set(x, "viewreset", js.undefined)
    
    @scala.inline
    def setZoom(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    @scala.inline
    def setZoomanim(value: /* event */ ZoomAnimEvent => Unit): Self = StObject.set(x, "zoomanim", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomanimUndefined: Self = StObject.set(x, "zoomanim", js.undefined)
    
    @scala.inline
    def setZoomend(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "zoomend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomendUndefined: Self = StObject.set(x, "zoomend", js.undefined)
    
    @scala.inline
    def setZoomlevelschange(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "zoomlevelschange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomlevelschangeUndefined: Self = StObject.set(x, "zoomlevelschange", js.undefined)
    
    @scala.inline
    def setZoomstart(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "zoomstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomstartUndefined: Self = StObject.set(x, "zoomstart", js.undefined)
  }
}
