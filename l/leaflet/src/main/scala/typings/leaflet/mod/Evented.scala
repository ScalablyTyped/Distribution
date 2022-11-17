package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("leaflet", "Evented")
@js.native
open class Evented () extends Class {
  
  /**
    * Alias for on(...)
    *
    * Adds a set of type/listener pairs, e.g. {click: onClick, mousemove: onMouseMove}
    */
  def addEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_dragend")
  def addEventListener(`type`: "dragend", fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_dragend")
  def addEventListener(`type`: "dragend", fn: DragEndEventHandlerFn, context: Any): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_locationerror")
  def addEventListener(`type`: "locationerror", fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_locationerror")
  def addEventListener(`type`: "locationerror", fn: ErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_locationfound")
  def addEventListener(`type`: "locationfound", fn: LocationEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_locationfound")
  def addEventListener(`type`: "locationfound", fn: LocationEventHandlerFn, context: Any): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_resize")
  def addEventListener(`type`: "resize", fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_resize")
  def addEventListener(`type`: "resize", fn: ResizeEventHandlerFn, context: Any): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_tileerror")
  def addEventListener(`type`: "tileerror", fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_tileerror")
  def addEventListener(`type`: "tileerror", fn: TileErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_zoomanim")
  def addEventListener(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_zoomanim")
  def addEventListener(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_layeradd_layerremove")
  def addEventListener(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_layeradd_layerremove")
  def addEventListener(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn, context: Any): this.type = js.native
  /**
    * Alias for on(...)
    *
    * Adds a listener function (fn) to a particular event type of the object.
    * You can optionally specify the context of the listener (object the this
    * keyword will point to). You can also pass several space-separated types
    * (e.g. 'click dblclick').
    */
  // tslint:disable:unified-signatures
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_baselayerchange_overlayadd_overlayremove")
  def addEventListener(`type`: "baselayerchange" | "overlayadd" | "overlayremove", fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_baselayerchange_overlayadd_overlayremove")
  def addEventListener(
    `type`: "baselayerchange" | "overlayadd" | "overlayremove",
    fn: LayersControlEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def addEventListener(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def addEventListener(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_keypress_keydown_keyup")
  def addEventListener(`type`: "keypress" | "keydown" | "keyup", fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_keypress_keydown_keyup")
  def addEventListener(`type`: "keypress" | "keydown" | "keyup", fn: LeafletKeyboardEventHandlerFn, context: Any): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def addEventListener(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def addEventListener(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_popupopen_popupclose")
  def addEventListener(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_popupopen_popupclose")
  def addEventListener(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn, context: Any): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_tileunload_tileloadstart_tileload_tileabort")
  def addEventListener(`type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort", fn: TileEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_tileunload_tileloadstart_tileload_tileabort")
  def addEventListener(
    `type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort",
    fn: TileEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_tooltipopen_tooltipclose")
  def addEventListener(`type`: "tooltipopen" | "tooltipclose", fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_tooltipopen_tooltipclose")
  def addEventListener(`type`: "tooltipopen" | "tooltipclose", fn: TooltipEventHandlerFn, context: Any): this.type = js.native
  def addEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def addEventListener(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
  
  // tslint:enable:unified-signatures
  /**
    * Adds an event parent - an Evented that will receive propagated events
    */
  def addEventParent(obj: Evented): this.type = js.native
  
  /**
    * Alias for once(...)
    *
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  def addOneTimeEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_dragend")
  def addOneTimeEventListener(`type`: "dragend", fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_dragend")
  def addOneTimeEventListener(`type`: "dragend", fn: DragEndEventHandlerFn, context: Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_locationerror")
  def addOneTimeEventListener(`type`: "locationerror", fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_locationerror")
  def addOneTimeEventListener(`type`: "locationerror", fn: ErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_locationfound")
  def addOneTimeEventListener(`type`: "locationfound", fn: LocationEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_locationfound")
  def addOneTimeEventListener(`type`: "locationfound", fn: LocationEventHandlerFn, context: Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_resize")
  def addOneTimeEventListener(`type`: "resize", fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_resize")
  def addOneTimeEventListener(`type`: "resize", fn: ResizeEventHandlerFn, context: Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_tileerror")
  def addOneTimeEventListener(`type`: "tileerror", fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_tileerror")
  def addOneTimeEventListener(`type`: "tileerror", fn: TileErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_zoomanim")
  def addOneTimeEventListener(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_zoomanim")
  def addOneTimeEventListener(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_layeradd_layerremove")
  def addOneTimeEventListener(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_layeradd_layerremove")
  def addOneTimeEventListener(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn, context: Any): this.type = js.native
  /**
    * Alias for once(...)
    *
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  // tslint:disable:unified-signatures
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_baselayerchange_overlayadd_overlayremove")
  def addOneTimeEventListener(`type`: "baselayerchange" | "overlayadd" | "overlayremove", fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_baselayerchange_overlayadd_overlayremove")
  def addOneTimeEventListener(
    `type`: "baselayerchange" | "overlayadd" | "overlayremove",
    fn: LayersControlEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def addOneTimeEventListener(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn
  ): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def addOneTimeEventListener(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_keypress_keydown_keyup")
  def addOneTimeEventListener(`type`: "keypress" | "keydown" | "keyup", fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_keypress_keydown_keyup")
  def addOneTimeEventListener(`type`: "keypress" | "keydown" | "keyup", fn: LeafletKeyboardEventHandlerFn, context: Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def addOneTimeEventListener(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn
  ): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def addOneTimeEventListener(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_popupopen_popupclose")
  def addOneTimeEventListener(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_popupopen_popupclose")
  def addOneTimeEventListener(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn, context: Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_tileunload_tileloadstart_tileload_tileabort")
  def addOneTimeEventListener(`type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort", fn: TileEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_tileunload_tileloadstart_tileload_tileabort")
  def addOneTimeEventListener(
    `type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort",
    fn: TileEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_tooltipopen_tooltipclose")
  def addOneTimeEventListener(`type`: "tooltipopen" | "tooltipclose", fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  @scala.annotation.targetName("addOneTimeEventListener_tooltipopen_tooltipclose")
  def addOneTimeEventListener(`type`: "tooltipopen" | "tooltipclose", fn: TooltipEventHandlerFn, context: Any): this.type = js.native
  def addOneTimeEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def addOneTimeEventListener(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
  
  // tslint:enable:unified-signatures
  /**
    * Alias for off()
    *
    * Removes all listeners to all events on the object.
    */
  def clearAllEventListeners(): this.type = js.native
  
  // tslint:enable:unified-signatures
  /**
    * Fires an event of the specified type. You can optionally provide a data
    * object — the first argument of the listener function will contain its properties.
    * The event might can optionally be propagated to event parents.
    */
  def fire(`type`: String): this.type = js.native
  def fire(`type`: String, data: Any): this.type = js.native
  def fire(`type`: String, data: Any, propagate: Boolean): this.type = js.native
  def fire(`type`: String, data: Unit, propagate: Boolean): this.type = js.native
  
  // tslint:enable:unified-signatures
  /**
    * Alias for fire(...)
    *
    * Fires an event of the specified type. You can optionally provide a data
    * object — the first argument of the listener function will contain its properties.
    * The event might can optionally be propagated to event parents.
    */
  def fireEvent(`type`: String): this.type = js.native
  def fireEvent(`type`: String, data: Any): this.type = js.native
  def fireEvent(`type`: String, data: Any, propagate: Boolean): this.type = js.native
  def fireEvent(`type`: String, data: Unit, propagate: Boolean): this.type = js.native
  
  /**
    * Alias for listens(...)
    *
    * Returns true if a particular event type has any listeners attached to it.
    */
  def hasEventListeners(`type`: String): Boolean = js.native
  
  @JSName("listens")
  @scala.annotation.targetName("listens_dragend")
  def listens(`type`: "dragend", fn: DragEndEventHandlerFn): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_dragend")
  def listens(`type`: "dragend", fn: DragEndEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_dragend")
  def listens(`type`: "dragend", fn: DragEndEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_dragend")
  def listens(`type`: "dragend", fn: DragEndEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_locationerror")
  def listens(`type`: "locationerror", fn: ErrorEventHandlerFn): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_locationerror")
  def listens(`type`: "locationerror", fn: ErrorEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_locationerror")
  def listens(`type`: "locationerror", fn: ErrorEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_locationerror")
  def listens(`type`: "locationerror", fn: ErrorEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_locationfound")
  def listens(`type`: "locationfound", fn: LocationEventHandlerFn): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_locationfound")
  def listens(`type`: "locationfound", fn: LocationEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_locationfound")
  def listens(`type`: "locationfound", fn: LocationEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_locationfound")
  def listens(`type`: "locationfound", fn: LocationEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_resize")
  def listens(`type`: "resize", fn: ResizeEventHandlerFn): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_resize")
  def listens(`type`: "resize", fn: ResizeEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_resize")
  def listens(`type`: "resize", fn: ResizeEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_resize")
  def listens(`type`: "resize", fn: ResizeEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_tileerror")
  def listens(`type`: "tileerror", fn: TileEventHandlerFn): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_tileerror")
  def listens(`type`: "tileerror", fn: TileEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_tileerror")
  def listens(`type`: "tileerror", fn: TileEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_tileerror")
  def listens(`type`: "tileerror", fn: TileEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_zoomanim")
  def listens(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_zoomanim")
  def listens(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_zoomanim")
  def listens(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_zoomanim")
  def listens(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  /**
    * Returns true if a particular event type has any listeners attached to it.
    */
  // tslint:disable:unified-signatures
  @JSName("listens")
  @scala.annotation.targetName("listens_baselayerchange_overlayadd_overlayremove_layeradd_layerremove_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag_resize_popupopen_tooltipopen_tooltipclose_locationerror_locationfound_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick_keypress_keydown_keyup_zoomanim_dragend_tileunload_tileloadstart_tileload_tileabort_tileerror")
  def listens(
    `type`: "baselayerchange" | "overlayadd" | "overlayremove" | "layeradd" | "layerremove" | "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag" | "resize" | "popupopen" | "tooltipopen" | "tooltipclose" | "locationerror" | "locationfound" | "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick" | "keypress" | "keydown" | "keyup" | "zoomanim" | "dragend" | "tileunload" | "tileloadstart" | "tileload" | "tileabort" | "tileerror"
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_layeradd_layerremove")
  def listens(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_layeradd_layerremove")
  def listens(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_layeradd_layerremove")
  def listens(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_layeradd_layerremove")
  def listens(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_baselayerchange_overlayadd_overlayremove")
  def listens(`type`: "baselayerchange" | "overlayadd" | "overlayremove", fn: LayersControlEventHandlerFn): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_baselayerchange_overlayadd_overlayremove")
  def listens(
    `type`: "baselayerchange" | "overlayadd" | "overlayremove",
    fn: LayersControlEventHandlerFn,
    context: Any
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_baselayerchange_overlayadd_overlayremove")
  def listens(
    `type`: "baselayerchange" | "overlayadd" | "overlayremove",
    fn: LayersControlEventHandlerFn,
    context: Any,
    propagate: Boolean
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_baselayerchange_overlayadd_overlayremove")
  def listens(
    `type`: "baselayerchange" | "overlayadd" | "overlayremove",
    fn: LayersControlEventHandlerFn,
    context: Unit,
    propagate: Boolean
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def listens(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def listens(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn,
    context: Any
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def listens(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn,
    context: Any,
    propagate: Boolean
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def listens(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn,
    context: Unit,
    propagate: Boolean
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_keypress_keydown_keyup")
  def listens(`type`: "keypress" | "keydown" | "keyup", fn: LeafletKeyboardEventHandlerFn): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_keypress_keydown_keyup")
  def listens(`type`: "keypress" | "keydown" | "keyup", fn: LeafletKeyboardEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_keypress_keydown_keyup")
  def listens(
    `type`: "keypress" | "keydown" | "keyup",
    fn: LeafletKeyboardEventHandlerFn,
    context: Any,
    propagate: Boolean
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_keypress_keydown_keyup")
  def listens(
    `type`: "keypress" | "keydown" | "keyup",
    fn: LeafletKeyboardEventHandlerFn,
    context: Unit,
    propagate: Boolean
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def listens(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def listens(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn,
    context: Any
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def listens(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn,
    context: Any,
    propagate: Boolean
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def listens(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn,
    context: Unit,
    propagate: Boolean
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_popupopen_popupclose")
  def listens(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_popupopen_popupclose")
  def listens(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_popupopen_popupclose")
  def listens(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_popupopen_popupclose")
  def listens(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_tileunload_tileloadstart_tileload_tileabort")
  def listens(`type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort", fn: TileEventHandlerFn): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_tileunload_tileloadstart_tileload_tileabort")
  def listens(
    `type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort",
    fn: TileEventHandlerFn,
    context: Any
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_tileunload_tileloadstart_tileload_tileabort")
  def listens(
    `type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort",
    fn: TileEventHandlerFn,
    context: Any,
    propagate: Boolean
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_tileunload_tileloadstart_tileload_tileabort")
  def listens(
    `type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort",
    fn: TileEventHandlerFn,
    context: Unit,
    propagate: Boolean
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_tooltipopen_tooltipclose")
  def listens(`type`: "tooltipopen" | "tooltipclose", fn: TooltipEventHandlerFn): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_tooltipopen_tooltipclose")
  def listens(`type`: "tooltipopen" | "tooltipclose", fn: TooltipEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_tooltipopen_tooltipclose")
  def listens(
    `type`: "tooltipopen" | "tooltipclose",
    fn: TooltipEventHandlerFn,
    context: Any,
    propagate: Boolean
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_tooltipopen_tooltipclose")
  def listens(
    `type`: "tooltipopen" | "tooltipclose",
    fn: TooltipEventHandlerFn,
    context: Unit,
    propagate: Boolean
  ): Boolean = js.native
  @JSName("listens")
  @scala.annotation.targetName("listens_baselayerchange_overlayadd_overlayremove_layeradd_layerremove_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag_resize_popupopen_tooltipopen_tooltipclose_locationerror_locationfound_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick_keypress_keydown_keyup_zoomanim_dragend_tileunload_tileloadstart_tileload_tileabort_tileerror")
  def listens(
    `type`: "baselayerchange" | "overlayadd" | "overlayremove" | "layeradd" | "layerremove" | "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag" | "resize" | "popupopen" | "tooltipopen" | "tooltipclose" | "locationerror" | "locationfound" | "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick" | "keypress" | "keydown" | "keyup" | "zoomanim" | "dragend" | "tileunload" | "tileloadstart" | "tileload" | "tileabort" | "tileerror",
    propagate: Boolean
  ): Boolean = js.native
  def listens(`type`: String, fn: LeafletEventHandlerFn): Boolean = js.native
  def listens(`type`: String, fn: LeafletEventHandlerFn, context: Any): Boolean = js.native
  def listens(`type`: String, fn: LeafletEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  def listens(`type`: String, fn: LeafletEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  
  /**
    * Removes all listeners to all events on the object.
    */
  def off(): this.type = js.native
  /**
    * Removes a set of type/listener pairs.
    */
  // With an eventMap there are no additional arguments allowed
  def off(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_locationfound")
  def off(`type`: "locationfound"): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_locationerror")
  def off(`type`: "locationerror"): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_dragend")
  def off(`type`: "dragend"): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_resize")
  def off(`type`: "resize"): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_zoomanim")
  def off(`type`: "zoomanim"): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_tileerror")
  def off(`type`: "tileerror"): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_zoomanim")
  def off(`type`: "zoomanim", fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_resize")
  def off(`type`: "resize", fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_locationfound")
  def off(`type`: "locationfound", fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_dragend")
  def off(`type`: "dragend", fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_tileerror")
  def off(`type`: "tileerror", fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_locationerror")
  def off(`type`: "locationerror", fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_dragend")
  def off(`type`: "dragend", fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_dragend")
  def off(`type`: "dragend", fn: DragEndEventHandlerFn, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_locationerror")
  def off(`type`: "locationerror", fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_locationerror")
  def off(`type`: "locationerror", fn: ErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_locationfound")
  def off(`type`: "locationfound", fn: LocationEventHandlerFn): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_locationfound")
  def off(`type`: "locationfound", fn: LocationEventHandlerFn, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_resize")
  def off(`type`: "resize", fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_resize")
  def off(`type`: "resize", fn: ResizeEventHandlerFn, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_tileerror")
  def off(`type`: "tileerror", fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_tileerror")
  def off(`type`: "tileerror", fn: TileErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_zoomanim")
  def off(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_zoomanim")
  def off(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def off(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick"
  ): this.type = js.native
  // tslint:enable:unified-signatures
  /**
    * Removes a previously added listener function. If no function is specified,
    * it will remove all the listeners of that particular event from the object.
    * Note that if you passed a custom context to on, you must pass the same context
    * to off in order to remove the listener.
    */
  // tslint:disable:unified-signatures
  @JSName("off")
  @scala.annotation.targetName("off_baselayerchange_overlayadd_overlayremove")
  def off(`type`: "baselayerchange" | "overlayadd" | "overlayremove"): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def off(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag"
  ): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_popupopen_popupclose")
  def off(`type`: "popupopen" | "popupclose"): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_layeradd_layerremove")
  def off(`type`: "layeradd" | "layerremove"): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_tileunload_tileloadstart_tileload_tileabort")
  def off(`type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort"): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_keypress_keydown_keyup")
  def off(`type`: "keypress" | "keydown" | "keyup"): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_tooltipopen_tooltipclose")
  def off(`type`: "tooltipopen" | "tooltipclose"): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def off(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: Unit,
    context: Any
  ): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_popupopen_popupclose")
  def off(`type`: "popupopen" | "popupclose", fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_keypress_keydown_keyup")
  def off(`type`: "keypress" | "keydown" | "keyup", fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_layeradd_layerremove")
  def off(`type`: "layeradd" | "layerremove", fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_baselayerchange_overlayadd_overlayremove")
  def off(`type`: "baselayerchange" | "overlayadd" | "overlayremove", fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def off(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: Unit,
    context: Any
  ): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_tooltipopen_tooltipclose")
  def off(`type`: "tooltipopen" | "tooltipclose", fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_tileunload_tileloadstart_tileload_tileabort")
  def off(`type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort", fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_layeradd_layerremove")
  def off(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_layeradd_layerremove")
  def off(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_baselayerchange_overlayadd_overlayremove")
  def off(`type`: "baselayerchange" | "overlayadd" | "overlayremove", fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_baselayerchange_overlayadd_overlayremove")
  def off(
    `type`: "baselayerchange" | "overlayadd" | "overlayremove",
    fn: LayersControlEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def off(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn
  ): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def off(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_keypress_keydown_keyup")
  def off(`type`: "keypress" | "keydown" | "keyup", fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_keypress_keydown_keyup")
  def off(`type`: "keypress" | "keydown" | "keyup", fn: LeafletKeyboardEventHandlerFn, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def off(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn
  ): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def off(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_popupopen_popupclose")
  def off(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_popupopen_popupclose")
  def off(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn, context: Any): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_tileunload_tileloadstart_tileload_tileabort")
  def off(`type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort", fn: TileEventHandlerFn): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_tileunload_tileloadstart_tileload_tileabort")
  def off(
    `type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort",
    fn: TileEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_tooltipopen_tooltipclose")
  def off(`type`: "tooltipopen" | "tooltipclose", fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("off")
  @scala.annotation.targetName("off_tooltipopen_tooltipclose")
  def off(`type`: "tooltipopen" | "tooltipclose", fn: TooltipEventHandlerFn, context: Any): this.type = js.native
  def off(`type`: String): this.type = js.native
  def off(`type`: String, fn: Unit, context: Any): this.type = js.native
  def off(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def off(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
  
  /**
    * Adds a set of type/listener pairs, e.g. {click: onClick, mousemove: onMouseMove}
    */
  def on(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_dragend")
  def on(`type`: "dragend", fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_dragend")
  def on(`type`: "dragend", fn: DragEndEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_locationerror")
  def on(`type`: "locationerror", fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_locationerror")
  def on(`type`: "locationerror", fn: ErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_locationfound")
  def on(`type`: "locationfound", fn: LocationEventHandlerFn): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_locationfound")
  def on(`type`: "locationfound", fn: LocationEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_resize")
  def on(`type`: "resize", fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_resize")
  def on(`type`: "resize", fn: ResizeEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_tileerror")
  def on(`type`: "tileerror", fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_tileerror")
  def on(`type`: "tileerror", fn: TileErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_zoomanim")
  def on(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_zoomanim")
  def on(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_layeradd_layerremove")
  def on(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_layeradd_layerremove")
  def on(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn, context: Any): this.type = js.native
  /**
    * Adds a listener function (fn) to a particular event type of the object.
    * You can optionally specify the context of the listener (object the this
    * keyword will point to). You can also pass several space-separated types
    * (e.g. 'click dblclick').
    */
  // tslint:disable:unified-signatures
  @JSName("on")
  @scala.annotation.targetName("on_baselayerchange_overlayadd_overlayremove")
  def on(`type`: "baselayerchange" | "overlayadd" | "overlayremove", fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_baselayerchange_overlayadd_overlayremove")
  def on(
    `type`: "baselayerchange" | "overlayadd" | "overlayremove",
    fn: LayersControlEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def on(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def on(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_keypress_keydown_keyup")
  def on(`type`: "keypress" | "keydown" | "keyup", fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_keypress_keydown_keyup")
  def on(`type`: "keypress" | "keydown" | "keyup", fn: LeafletKeyboardEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def on(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def on(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_popupopen_popupclose")
  def on(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_popupopen_popupclose")
  def on(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_tileunload_tileloadstart_tileload_tileabort")
  def on(`type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort", fn: TileEventHandlerFn): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_tileunload_tileloadstart_tileload_tileabort")
  def on(
    `type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort",
    fn: TileEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_tooltipopen_tooltipclose")
  def on(`type`: "tooltipopen" | "tooltipclose", fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_tooltipopen_tooltipclose")
  def on(`type`: "tooltipopen" | "tooltipclose", fn: TooltipEventHandlerFn, context: Any): this.type = js.native
  def on(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def on(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
  
  /**
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  def once(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_dragend")
  def once(`type`: "dragend", fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_dragend")
  def once(`type`: "dragend", fn: DragEndEventHandlerFn, context: Any): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_locationerror")
  def once(`type`: "locationerror", fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_locationerror")
  def once(`type`: "locationerror", fn: ErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_locationfound")
  def once(`type`: "locationfound", fn: LocationEventHandlerFn): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_locationfound")
  def once(`type`: "locationfound", fn: LocationEventHandlerFn, context: Any): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_resize")
  def once(`type`: "resize", fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_resize")
  def once(`type`: "resize", fn: ResizeEventHandlerFn, context: Any): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_tileerror")
  def once(`type`: "tileerror", fn: TileEventHandlerFn): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_tileerror")
  def once(`type`: "tileerror", fn: TileEventHandlerFn, context: Any): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_zoomanim")
  def once(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_zoomanim")
  def once(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_layeradd_layerremove")
  def once(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_layeradd_layerremove")
  def once(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn, context: Any): this.type = js.native
  /**
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  // tslint:disable:unified-signatures
  @JSName("once")
  @scala.annotation.targetName("once_baselayerchange_overlayadd_overlayremove")
  def once(`type`: "baselayerchange" | "overlayadd" | "overlayremove", fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_baselayerchange_overlayadd_overlayremove")
  def once(
    `type`: "baselayerchange" | "overlayadd" | "overlayremove",
    fn: LayersControlEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def once(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def once(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_keypress_keydown_keyup")
  def once(`type`: "keypress" | "keydown" | "keyup", fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_keypress_keydown_keyup")
  def once(`type`: "keypress" | "keydown" | "keyup", fn: LeafletKeyboardEventHandlerFn, context: Any): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def once(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def once(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_popupopen_popupclose")
  def once(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_popupopen_popupclose")
  def once(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn, context: Any): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_tileunload_tileloadstart_tileload_tileabort")
  def once(`type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort", fn: TileEventHandlerFn): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_tileunload_tileloadstart_tileload_tileabort")
  def once(
    `type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort",
    fn: TileEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_tooltipopen_tooltipclose")
  def once(`type`: "tooltipopen" | "tooltipclose", fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_tooltipopen_tooltipclose")
  def once(`type`: "tooltipopen" | "tooltipclose", fn: TooltipEventHandlerFn, context: Any): this.type = js.native
  def once(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def once(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
  
  /**
    * Alias for off(...)
    *
    * Removes a set of type/listener pairs.
    */
  def removeEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_locationerror")
  def removeEventListener(`type`: "locationerror"): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_dragend")
  def removeEventListener(`type`: "dragend"): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_zoomanim")
  def removeEventListener(`type`: "zoomanim"): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_locationfound")
  def removeEventListener(`type`: "locationfound"): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_tileerror")
  def removeEventListener(`type`: "tileerror"): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_resize")
  def removeEventListener(`type`: "resize"): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_dragend")
  def removeEventListener(`type`: "dragend", fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_locationfound")
  def removeEventListener(`type`: "locationfound", fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_resize")
  def removeEventListener(`type`: "resize", fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_locationerror")
  def removeEventListener(`type`: "locationerror", fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_zoomanim")
  def removeEventListener(`type`: "zoomanim", fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_tileerror")
  def removeEventListener(`type`: "tileerror", fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_dragend")
  def removeEventListener(`type`: "dragend", fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_dragend")
  def removeEventListener(`type`: "dragend", fn: DragEndEventHandlerFn, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_locationerror")
  def removeEventListener(`type`: "locationerror", fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_locationerror")
  def removeEventListener(`type`: "locationerror", fn: ErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_locationfound")
  def removeEventListener(`type`: "locationfound", fn: LocationEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_locationfound")
  def removeEventListener(`type`: "locationfound", fn: LocationEventHandlerFn, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_resize")
  def removeEventListener(`type`: "resize", fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_resize")
  def removeEventListener(`type`: "resize", fn: ResizeEventHandlerFn, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_tileerror")
  def removeEventListener(`type`: "tileerror", fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_tileerror")
  def removeEventListener(`type`: "tileerror", fn: TileErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_zoomanim")
  def removeEventListener(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_zoomanim")
  def removeEventListener(`type`: "zoomanim", fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_tileunload_tileloadstart_tileload_tileabort")
  def removeEventListener(`type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort"): this.type = js.native
  // tslint:enable:unified-signatures
  /**
    * Alias for off(...)
    *
    * Removes a previously added listener function. If no function is specified,
    * it will remove all the listeners of that particular event from the object.
    * Note that if you passed a custom context to on, you must pass the same context
    * to off in order to remove the listener.
    */
  // tslint:disable:unified-signatures
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_baselayerchange_overlayadd_overlayremove")
  def removeEventListener(`type`: "baselayerchange" | "overlayadd" | "overlayremove"): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_tooltipopen_tooltipclose")
  def removeEventListener(`type`: "tooltipopen" | "tooltipclose"): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def removeEventListener(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick"
  ): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_keypress_keydown_keyup")
  def removeEventListener(`type`: "keypress" | "keydown" | "keyup"): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_layeradd_layerremove")
  def removeEventListener(`type`: "layeradd" | "layerremove"): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def removeEventListener(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag"
  ): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_popupopen_popupclose")
  def removeEventListener(`type`: "popupopen" | "popupclose"): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def removeEventListener(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: Unit,
    context: Any
  ): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_keypress_keydown_keyup")
  def removeEventListener(`type`: "keypress" | "keydown" | "keyup", fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_tileunload_tileloadstart_tileload_tileabort")
  def removeEventListener(`type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort", fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_layeradd_layerremove")
  def removeEventListener(`type`: "layeradd" | "layerremove", fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def removeEventListener(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: Unit,
    context: Any
  ): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_popupopen_popupclose")
  def removeEventListener(`type`: "popupopen" | "popupclose", fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_baselayerchange_overlayadd_overlayremove")
  def removeEventListener(`type`: "baselayerchange" | "overlayadd" | "overlayremove", fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_tooltipopen_tooltipclose")
  def removeEventListener(`type`: "tooltipopen" | "tooltipclose", fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_layeradd_layerremove")
  def removeEventListener(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_layeradd_layerremove")
  def removeEventListener(`type`: "layeradd" | "layerremove", fn: LayerEventHandlerFn, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_baselayerchange_overlayadd_overlayremove")
  def removeEventListener(`type`: "baselayerchange" | "overlayadd" | "overlayremove", fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_baselayerchange_overlayadd_overlayremove")
  def removeEventListener(
    `type`: "baselayerchange" | "overlayadd" | "overlayremove",
    fn: LayersControlEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def removeEventListener(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn
  ): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_zoomlevelschange_unload_viewreset_load_zoomstart_movestart_zoom_move_zoomend_moveend_autopanstart_dragstart_drag_add_remove_loading_error_update_down_predrag")
  def removeEventListener(
    `type`: "zoomlevelschange" | "unload" | "viewreset" | "load" | "zoomstart" | "movestart" | "zoom" | "move" | "zoomend" | "moveend" | "autopanstart" | "dragstart" | "drag" | "add" | "remove" | "loading" | "error" | "update" | "down" | "predrag",
    fn: LeafletEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_keypress_keydown_keyup")
  def removeEventListener(`type`: "keypress" | "keydown" | "keyup", fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_keypress_keydown_keyup")
  def removeEventListener(`type`: "keypress" | "keydown" | "keyup", fn: LeafletKeyboardEventHandlerFn, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def removeEventListener(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn
  ): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_click_dblclick_mousedown_mouseup_mouseover_mouseout_mousemove_contextmenu_preclick")
  def removeEventListener(
    `type`: "click" | "dblclick" | "mousedown" | "mouseup" | "mouseover" | "mouseout" | "mousemove" | "contextmenu" | "preclick",
    fn: LeafletMouseEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_popupopen_popupclose")
  def removeEventListener(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_popupopen_popupclose")
  def removeEventListener(`type`: "popupopen" | "popupclose", fn: PopupEventHandlerFn, context: Any): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_tileunload_tileloadstart_tileload_tileabort")
  def removeEventListener(`type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort", fn: TileEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_tileunload_tileloadstart_tileload_tileabort")
  def removeEventListener(
    `type`: "tileunload" | "tileloadstart" | "tileload" | "tileabort",
    fn: TileEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_tooltipopen_tooltipclose")
  def removeEventListener(`type`: "tooltipopen" | "tooltipclose", fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_tooltipopen_tooltipclose")
  def removeEventListener(`type`: "tooltipopen" | "tooltipclose", fn: TooltipEventHandlerFn, context: Any): this.type = js.native
  def removeEventListener(`type`: String): this.type = js.native
  def removeEventListener(`type`: String, fn: Unit, context: Any): this.type = js.native
  def removeEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def removeEventListener(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
  
  /**
    * Removes an event parent, so it will stop receiving propagated events
    */
  def removeEventParent(obj: Evented): this.type = js.native
}
