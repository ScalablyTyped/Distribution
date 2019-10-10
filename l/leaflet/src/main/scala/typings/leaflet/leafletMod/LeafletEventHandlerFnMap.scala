package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafletEventHandlerFnMap extends js.Object {
  var add: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var autopanstart: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var baselayerchange: js.UndefOr[LayersControlEventHandlerFn] = js.undefined
  var click: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var contextmenu: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var dblclick: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var down: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var drag: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var dragend: js.UndefOr[DragEndEventHandlerFn] = js.undefined
  var dragstart: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var error: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var keydown: js.UndefOr[LeafletKeyboardEventHandlerFn] = js.undefined
  var keypress: js.UndefOr[LeafletKeyboardEventHandlerFn] = js.undefined
  var keyup: js.UndefOr[LeafletKeyboardEventHandlerFn] = js.undefined
  var layeradd: js.UndefOr[LayerEventHandlerFn] = js.undefined
  var layerremove: js.UndefOr[LayerEventHandlerFn] = js.undefined
  var load: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var loading: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var locationerror: js.UndefOr[ErrorEventHandlerFn] = js.undefined
  var locationfound: js.UndefOr[LocationEventHandlerFn] = js.undefined
  var mousedown: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var mousemove: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var mouseout: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var mouseover: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var mouseup: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var move: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var moveend: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var movestart: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var overlayadd: js.UndefOr[LayersControlEventHandlerFn] = js.undefined
  var overlayremove: js.UndefOr[LayersControlEventHandlerFn] = js.undefined
  var popupclose: js.UndefOr[PopupEventHandlerFn] = js.undefined
  var popupopen: js.UndefOr[PopupEventHandlerFn] = js.undefined
  var preclick: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var predrag: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var remove: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var resize: js.UndefOr[ResizeEventHandlerFn] = js.undefined
  var tileerror: js.UndefOr[TileErrorEventHandlerFn] = js.undefined
  var tileload: js.UndefOr[TileEventHandlerFn] = js.undefined
  var tileloadstart: js.UndefOr[TileEventHandlerFn] = js.undefined
  var tileunload: js.UndefOr[TileEventHandlerFn] = js.undefined
  var tooltipclose: js.UndefOr[TooltipEventHandlerFn] = js.undefined
  var tooltipopen: js.UndefOr[TooltipEventHandlerFn] = js.undefined
  var unload: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var update: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var viewreset: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var zoom: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var zoomanim: js.UndefOr[ZoomAnimEventHandlerFn] = js.undefined
  var zoomend: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var zoomlevelschange: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var zoomstart: js.UndefOr[LeafletEventHandlerFn] = js.undefined
}

object LeafletEventHandlerFnMap {
  @scala.inline
  def apply(
    add: /* event */ LeafletEvent => Unit = null,
    autopanstart: /* event */ LeafletEvent => Unit = null,
    baselayerchange: /* event */ LayersControlEvent => Unit = null,
    click: /* event */ LeafletMouseEvent => Unit = null,
    contextmenu: /* event */ LeafletMouseEvent => Unit = null,
    dblclick: /* event */ LeafletMouseEvent => Unit = null,
    down: /* event */ LeafletEvent => Unit = null,
    drag: /* event */ LeafletEvent => Unit = null,
    dragend: /* event */ DragEndEvent => Unit = null,
    dragstart: /* event */ LeafletEvent => Unit = null,
    error: /* event */ LeafletEvent => Unit = null,
    keydown: /* event */ LeafletKeyboardEvent => Unit = null,
    keypress: /* event */ LeafletKeyboardEvent => Unit = null,
    keyup: /* event */ LeafletKeyboardEvent => Unit = null,
    layeradd: /* event */ LayerEvent => Unit = null,
    layerremove: /* event */ LayerEvent => Unit = null,
    load: /* event */ LeafletEvent => Unit = null,
    loading: /* event */ LeafletEvent => Unit = null,
    locationerror: /* event */ ErrorEvent => Unit = null,
    locationfound: /* event */ LocationEvent => Unit = null,
    mousedown: /* event */ LeafletMouseEvent => Unit = null,
    mousemove: /* event */ LeafletMouseEvent => Unit = null,
    mouseout: /* event */ LeafletMouseEvent => Unit = null,
    mouseover: /* event */ LeafletMouseEvent => Unit = null,
    mouseup: /* event */ LeafletMouseEvent => Unit = null,
    move: /* event */ LeafletEvent => Unit = null,
    moveend: /* event */ LeafletEvent => Unit = null,
    movestart: /* event */ LeafletEvent => Unit = null,
    overlayadd: /* event */ LayersControlEvent => Unit = null,
    overlayremove: /* event */ LayersControlEvent => Unit = null,
    popupclose: /* event */ PopupEvent => Unit = null,
    popupopen: /* event */ PopupEvent => Unit = null,
    preclick: /* event */ LeafletMouseEvent => Unit = null,
    predrag: /* event */ LeafletEvent => Unit = null,
    remove: /* event */ LeafletEvent => Unit = null,
    resize: /* event */ ResizeEvent => Unit = null,
    tileerror: /* event */ TileErrorEvent => Unit = null,
    tileload: /* event */ TileEvent => Unit = null,
    tileloadstart: /* event */ TileEvent => Unit = null,
    tileunload: /* event */ TileEvent => Unit = null,
    tooltipclose: /* event */ TooltipEvent => Unit = null,
    tooltipopen: /* event */ TooltipEvent => Unit = null,
    unload: /* event */ LeafletEvent => Unit = null,
    update: /* event */ LeafletEvent => Unit = null,
    viewreset: /* event */ LeafletEvent => Unit = null,
    zoom: /* event */ LeafletEvent => Unit = null,
    zoomanim: /* event */ ZoomAnimEvent => Unit = null,
    zoomend: /* event */ LeafletEvent => Unit = null,
    zoomlevelschange: /* event */ LeafletEvent => Unit = null,
    zoomstart: /* event */ LeafletEvent => Unit = null
  ): LeafletEventHandlerFnMap = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (autopanstart != null) __obj.updateDynamic("autopanstart")(js.Any.fromFunction1(autopanstart))
    if (baselayerchange != null) __obj.updateDynamic("baselayerchange")(js.Any.fromFunction1(baselayerchange))
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (contextmenu != null) __obj.updateDynamic("contextmenu")(js.Any.fromFunction1(contextmenu))
    if (dblclick != null) __obj.updateDynamic("dblclick")(js.Any.fromFunction1(dblclick))
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction1(down))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1(dragend))
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1(dragstart))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (keydown != null) __obj.updateDynamic("keydown")(js.Any.fromFunction1(keydown))
    if (keypress != null) __obj.updateDynamic("keypress")(js.Any.fromFunction1(keypress))
    if (keyup != null) __obj.updateDynamic("keyup")(js.Any.fromFunction1(keyup))
    if (layeradd != null) __obj.updateDynamic("layeradd")(js.Any.fromFunction1(layeradd))
    if (layerremove != null) __obj.updateDynamic("layerremove")(js.Any.fromFunction1(layerremove))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loading != null) __obj.updateDynamic("loading")(js.Any.fromFunction1(loading))
    if (locationerror != null) __obj.updateDynamic("locationerror")(js.Any.fromFunction1(locationerror))
    if (locationfound != null) __obj.updateDynamic("locationfound")(js.Any.fromFunction1(locationfound))
    if (mousedown != null) __obj.updateDynamic("mousedown")(js.Any.fromFunction1(mousedown))
    if (mousemove != null) __obj.updateDynamic("mousemove")(js.Any.fromFunction1(mousemove))
    if (mouseout != null) __obj.updateDynamic("mouseout")(js.Any.fromFunction1(mouseout))
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction1(mouseover))
    if (mouseup != null) __obj.updateDynamic("mouseup")(js.Any.fromFunction1(mouseup))
    if (move != null) __obj.updateDynamic("move")(js.Any.fromFunction1(move))
    if (moveend != null) __obj.updateDynamic("moveend")(js.Any.fromFunction1(moveend))
    if (movestart != null) __obj.updateDynamic("movestart")(js.Any.fromFunction1(movestart))
    if (overlayadd != null) __obj.updateDynamic("overlayadd")(js.Any.fromFunction1(overlayadd))
    if (overlayremove != null) __obj.updateDynamic("overlayremove")(js.Any.fromFunction1(overlayremove))
    if (popupclose != null) __obj.updateDynamic("popupclose")(js.Any.fromFunction1(popupclose))
    if (popupopen != null) __obj.updateDynamic("popupopen")(js.Any.fromFunction1(popupopen))
    if (preclick != null) __obj.updateDynamic("preclick")(js.Any.fromFunction1(preclick))
    if (predrag != null) __obj.updateDynamic("predrag")(js.Any.fromFunction1(predrag))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (tileerror != null) __obj.updateDynamic("tileerror")(js.Any.fromFunction1(tileerror))
    if (tileload != null) __obj.updateDynamic("tileload")(js.Any.fromFunction1(tileload))
    if (tileloadstart != null) __obj.updateDynamic("tileloadstart")(js.Any.fromFunction1(tileloadstart))
    if (tileunload != null) __obj.updateDynamic("tileunload")(js.Any.fromFunction1(tileunload))
    if (tooltipclose != null) __obj.updateDynamic("tooltipclose")(js.Any.fromFunction1(tooltipclose))
    if (tooltipopen != null) __obj.updateDynamic("tooltipopen")(js.Any.fromFunction1(tooltipopen))
    if (unload != null) __obj.updateDynamic("unload")(js.Any.fromFunction1(unload))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    if (viewreset != null) __obj.updateDynamic("viewreset")(js.Any.fromFunction1(viewreset))
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1(zoom))
    if (zoomanim != null) __obj.updateDynamic("zoomanim")(js.Any.fromFunction1(zoomanim))
    if (zoomend != null) __obj.updateDynamic("zoomend")(js.Any.fromFunction1(zoomend))
    if (zoomlevelschange != null) __obj.updateDynamic("zoomlevelschange")(js.Any.fromFunction1(zoomlevelschange))
    if (zoomstart != null) __obj.updateDynamic("zoomstart")(js.Any.fromFunction1(zoomstart))
    __obj.asInstanceOf[LeafletEventHandlerFnMap]
  }
}

