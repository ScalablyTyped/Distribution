package typings.leaflet.leafletMod

import typings.leaflet.leafletStrings.add
import typings.leaflet.leafletStrings.autopanstart
import typings.leaflet.leafletStrings.baselayerchange
import typings.leaflet.leafletStrings.click
import typings.leaflet.leafletStrings.contextmenu
import typings.leaflet.leafletStrings.dblclick
import typings.leaflet.leafletStrings.down
import typings.leaflet.leafletStrings.drag
import typings.leaflet.leafletStrings.dragend
import typings.leaflet.leafletStrings.dragstart
import typings.leaflet.leafletStrings.error
import typings.leaflet.leafletStrings.keydown
import typings.leaflet.leafletStrings.keypress
import typings.leaflet.leafletStrings.keyup
import typings.leaflet.leafletStrings.layeradd
import typings.leaflet.leafletStrings.layerremove
import typings.leaflet.leafletStrings.load
import typings.leaflet.leafletStrings.loading
import typings.leaflet.leafletStrings.locationerror
import typings.leaflet.leafletStrings.locationfound
import typings.leaflet.leafletStrings.mousedown
import typings.leaflet.leafletStrings.mousemove
import typings.leaflet.leafletStrings.mouseout
import typings.leaflet.leafletStrings.mouseover
import typings.leaflet.leafletStrings.mouseup
import typings.leaflet.leafletStrings.move
import typings.leaflet.leafletStrings.moveend
import typings.leaflet.leafletStrings.movestart
import typings.leaflet.leafletStrings.overlayadd
import typings.leaflet.leafletStrings.overlayremove
import typings.leaflet.leafletStrings.popupclose
import typings.leaflet.leafletStrings.popupopen
import typings.leaflet.leafletStrings.preclick
import typings.leaflet.leafletStrings.predrag
import typings.leaflet.leafletStrings.remove
import typings.leaflet.leafletStrings.resize
import typings.leaflet.leafletStrings.tileerror
import typings.leaflet.leafletStrings.tileload
import typings.leaflet.leafletStrings.tileloadstart
import typings.leaflet.leafletStrings.tileunload
import typings.leaflet.leafletStrings.tooltipclose
import typings.leaflet.leafletStrings.tooltipopen
import typings.leaflet.leafletStrings.unload
import typings.leaflet.leafletStrings.update
import typings.leaflet.leafletStrings.viewreset
import typings.leaflet.leafletStrings.zoom
import typings.leaflet.leafletStrings.zoomanim
import typings.leaflet.leafletStrings.zoomend
import typings.leaflet.leafletStrings.zoomlevelschange
import typings.leaflet.leafletStrings.zoomstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Evented")
@js.native
abstract class Evented () extends Class {
  /**
    * Alias for on(...)
    *
    * Adds a set of type/listener pairs, e.g. {click: onClick, mousemove: onMouseMove}
    */
  def addEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  def addEventListener(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
    fn: LeafletEventHandlerFn
  ): this.type = js.native
  def addEventListener(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
    fn: LeafletEventHandlerFn,
    context: js.Any
  ): this.type = js.native
  /**
    * Alias for on(...)
    *
    * Adds a listener function (fn) to a particular event type of the object.
    * You can optionally specify the context of the listener (object the this
    * keyword will point to). You can also pass several space-separated types
    * (e.g. 'click dblclick').
    */
  // tslint:disable:unified-signatures
  def addEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def addEventListener(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
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
  def addOneTimeEventListener(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
    fn: LeafletEventHandlerFn
  ): this.type = js.native
  def addOneTimeEventListener(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
    fn: LeafletEventHandlerFn,
    context: js.Any
  ): this.type = js.native
  /**
    * Alias for once(...)
    *
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  // tslint:disable:unified-signatures
  def addOneTimeEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def addOneTimeEventListener(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
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
  def fire(`type`: String, data: js.Any): this.type = js.native
  def fire(`type`: String, data: js.Any, propagate: Boolean): this.type = js.native
  // tslint:enable:unified-signatures
  /**
    * Alias for fire(...)
    *
    * Fires an event of the specified type. You can optionally provide a data
    * object — the first argument of the listener function will contain its properties.
    * The event might can optionally be propagated to event parents.
    */
  def fireEvent(`type`: String): this.type = js.native
  def fireEvent(`type`: String, data: js.Any): this.type = js.native
  def fireEvent(`type`: String, data: js.Any, propagate: Boolean): this.type = js.native
  /**
    * Alias for listens(...)
    *
    * Returns true if a particular event type has any listeners attached to it.
    */
  def hasEventListeners(`type`: String): Boolean = js.native
  /**
    * Returns true if a particular event type has any listeners attached to it.
    */
  def listens(`type`: String): Boolean = js.native
  /**
    * Removes all listeners to all events on the object.
    */
  def off(): this.type = js.native
  /**
    * Removes a set of type/listener pairs.
    */
  // With an eventMap there are no additional arguments allowed
  def off(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  def off(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag
  ): this.type = js.native
  def off(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
    fn: LeafletEventHandlerFn
  ): this.type = js.native
  def off(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
    fn: LeafletEventHandlerFn,
    context: js.Any
  ): this.type = js.native
  // tslint:enable:unified-signatures
  /**
    * Removes a previously added listener function. If no function is specified,
    * it will remove all the listeners of that particular event from the object.
    * Note that if you passed a custom context to on, you must pass the same context
    * to off in order to remove the listener.
    */
  // tslint:disable:unified-signatures
  def off(`type`: String): this.type = js.native
  def off(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def off(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_baselayerchange(`type`: baselayerchange): this.type = js.native
  @JSName("off")
  def off_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_click(`type`: click): this.type = js.native
  @JSName("off")
  def off_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_contextmenu(`type`: contextmenu): this.type = js.native
  @JSName("off")
  def off_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_dblclick(`type`: dblclick): this.type = js.native
  @JSName("off")
  def off_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_dragend(`type`: dragend): this.type = js.native
  @JSName("off")
  def off_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_keydown(`type`: keydown): this.type = js.native
  @JSName("off")
  def off_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_keypress(`type`: keypress): this.type = js.native
  @JSName("off")
  def off_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_keyup(`type`: keyup): this.type = js.native
  @JSName("off")
  def off_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_layeradd(`type`: layeradd): this.type = js.native
  @JSName("off")
  def off_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_layerremove(`type`: layerremove): this.type = js.native
  @JSName("off")
  def off_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_locationerror(`type`: locationerror): this.type = js.native
  @JSName("off")
  def off_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_locationfound(`type`: locationfound): this.type = js.native
  @JSName("off")
  def off_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_mousedown(`type`: mousedown): this.type = js.native
  @JSName("off")
  def off_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_mousemove(`type`: mousemove): this.type = js.native
  @JSName("off")
  def off_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_mouseout(`type`: mouseout): this.type = js.native
  @JSName("off")
  def off_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_mouseover(`type`: mouseover): this.type = js.native
  @JSName("off")
  def off_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_mouseup(`type`: mouseup): this.type = js.native
  @JSName("off")
  def off_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_overlayadd(`type`: overlayadd): this.type = js.native
  @JSName("off")
  def off_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_overlayremove(`type`: overlayremove): this.type = js.native
  @JSName("off")
  def off_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_popupclose(`type`: popupclose): this.type = js.native
  @JSName("off")
  def off_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_popupopen(`type`: popupopen): this.type = js.native
  @JSName("off")
  def off_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_preclick(`type`: preclick): this.type = js.native
  @JSName("off")
  def off_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_resize(`type`: resize): this.type = js.native
  @JSName("off")
  def off_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_tileerror(`type`: tileerror): this.type = js.native
  @JSName("off")
  def off_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_tileload(`type`: tileload): this.type = js.native
  @JSName("off")
  def off_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_tileloadstart(`type`: tileloadstart): this.type = js.native
  @JSName("off")
  def off_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_tileunload(`type`: tileunload): this.type = js.native
  @JSName("off")
  def off_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_tooltipclose(`type`: tooltipclose): this.type = js.native
  @JSName("off")
  def off_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_tooltipopen(`type`: tooltipopen): this.type = js.native
  @JSName("off")
  def off_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("off")
  def off_zoomanim(`type`: zoomanim): this.type = js.native
  @JSName("off")
  def off_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
  /**
    * Adds a set of type/listener pairs, e.g. {click: onClick, mousemove: onMouseMove}
    */
  def on(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  def on(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
    fn: LeafletEventHandlerFn
  ): this.type = js.native
  def on(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
    fn: LeafletEventHandlerFn,
    context: js.Any
  ): this.type = js.native
  /**
    * Adds a listener function (fn) to a particular event type of the object.
    * You can optionally specify the context of the listener (object the this
    * keyword will point to). You can also pass several space-separated types
    * (e.g. 'click dblclick').
    */
  // tslint:disable:unified-signatures
  def on(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def on(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("on")
  def on_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
  /**
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  def once(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  def once(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
    fn: LeafletEventHandlerFn
  ): this.type = js.native
  def once(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
    fn: LeafletEventHandlerFn,
    context: js.Any
  ): this.type = js.native
  /**
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  // tslint:disable:unified-signatures
  def once(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def once(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_tileerror(`type`: tileerror, fn: TileEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_tileerror(`type`: tileerror, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("once")
  def once_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
  /**
    * Alias for off(...)
    *
    * Removes a set of type/listener pairs.
    */
  def removeEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  def removeEventListener(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag
  ): this.type = js.native
  def removeEventListener(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
    fn: LeafletEventHandlerFn
  ): this.type = js.native
  def removeEventListener(
    `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
    fn: LeafletEventHandlerFn,
    context: js.Any
  ): this.type = js.native
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
  def removeEventListener(`type`: String): this.type = js.native
  def removeEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def removeEventListener(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_baselayerchange(`type`: baselayerchange): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(`type`: click): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(`type`: contextmenu): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(`type`: dblclick): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(`type`: dragend): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(`type`: keydown): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(`type`: keypress): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(`type`: keyup): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_layeradd(`type`: layeradd): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_layerremove(`type`: layerremove): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationerror(`type`: locationerror): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationfound(`type`: locationfound): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(`type`: mousedown): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(`type`: mousemove): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(`type`: mouseout): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(`type`: mouseover): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(`type`: mouseup): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_overlayadd(`type`: overlayadd): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_overlayremove(`type`: overlayremove): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_popupclose(`type`: popupclose): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_popupopen(`type`: popupopen): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_preclick(`type`: preclick): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(`type`: resize): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileerror(`type`: tileerror): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileload(`type`: tileload): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileloadstart(`type`: tileloadstart): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileunload(`type`: tileunload): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tooltipclose(`type`: tooltipclose): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tooltipopen(`type`: tooltipopen): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomanim(`type`: zoomanim): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
  /**
    * Removes an event parent, so it will stop receiving propagated events
    */
  def removeEventParent(obj: Evented): this.type = js.native
}

