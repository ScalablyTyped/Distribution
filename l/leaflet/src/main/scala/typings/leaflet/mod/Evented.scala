package typings.leaflet.mod

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
import typings.leaflet.leafletStrings.tileabort
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
  /**
    * Alias for on(...)
    *
    * Adds a listener function (fn) to a particular event type of the object.
    * You can optionally specify the context of the listener (object the this
    * keyword will point to). You can also pass several space-separated types
    * (e.g. 'click dblclick').
    */
  // tslint:disable:unified-signatures
  def addEventListener(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn
  ): this.type = js.native
  def addEventListener(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
    context: Any
  ): this.type = js.native
  def addEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def addEventListener(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("addEventListener")
  def addEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
  
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
  /**
    * Alias for once(...)
    *
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  // tslint:disable:unified-signatures
  def addOneTimeEventListener(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn
  ): this.type = js.native
  def addOneTimeEventListener(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
    context: Any
  ): this.type = js.native
  def addOneTimeEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def addOneTimeEventListener(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("addOneTimeEventListener")
  def addOneTimeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
  
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
  
  /**
    * Returns true if a particular event type has any listeners attached to it.
    */
  // tslint:disable:unified-signatures
  def listens(
    `type`: baselayerchange | overlayadd | overlayremove | layeradd | layerremove | zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag | resize | popupopen | tooltipopen | tooltipclose | locationerror | locationfound | click | dblclick | mousedown | mouseup | mouseover | mouseout | mousemove | contextmenu | preclick | keypress | keydown | keyup | zoomanim | dragend | tileunload | tileloadstart | tileload | tileabort | tileerror
  ): Boolean = js.native
  def listens(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn
  ): Boolean = js.native
  def listens(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
    context: Any
  ): Boolean = js.native
  def listens(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
    context: Any,
    propagate: Boolean
  ): Boolean = js.native
  def listens(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
    context: Unit,
    propagate: Boolean
  ): Boolean = js.native
  def listens(
    `type`: baselayerchange | overlayadd | overlayremove | layeradd | layerremove | zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag | resize | popupopen | tooltipopen | tooltipclose | locationerror | locationfound | click | dblclick | mousedown | mouseup | mouseover | mouseout | mousemove | contextmenu | preclick | keypress | keydown | keyup | zoomanim | dragend | tileunload | tileloadstart | tileload | tileabort | tileerror,
    propagate: Boolean
  ): Boolean = js.native
  def listens(`type`: String, fn: LeafletEventHandlerFn): Boolean = js.native
  def listens(`type`: String, fn: LeafletEventHandlerFn, context: Any): Boolean = js.native
  def listens(`type`: String, fn: LeafletEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  def listens(`type`: String, fn: LeafletEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  def listens_dragend(`type`: dragend, fn: DragEndEventHandlerFn): Boolean = js.native
  @JSName("listens")
  def listens_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  def listens_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  def listens_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  def listens_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): Boolean = js.native
  @JSName("listens")
  def listens_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  def listens_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  def listens_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  def listens_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): Boolean = js.native
  @JSName("listens")
  def listens_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  def listens_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  def listens_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  def listens_resize(`type`: resize, fn: ResizeEventHandlerFn): Boolean = js.native
  @JSName("listens")
  def listens_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  def listens_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  def listens_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  def listens_tileerror(`type`: tileerror, fn: TileEventHandlerFn): Boolean = js.native
  @JSName("listens")
  def listens_tileerror(`type`: tileerror, fn: TileEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  def listens_tileerror(`type`: tileerror, fn: TileEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  def listens_tileerror(`type`: tileerror, fn: TileEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  def listens_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): Boolean = js.native
  @JSName("listens")
  def listens_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any): Boolean = js.native
  @JSName("listens")
  def listens_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
  @JSName("listens")
  def listens_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
  
  /**
    * Removes all listeners to all events on the object.
    */
  def off(): this.type = js.native
  /**
    * Removes a set of type/listener pairs.
    */
  // With an eventMap there are no additional arguments allowed
  def off(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  // tslint:enable:unified-signatures
  /**
    * Removes a previously added listener function. If no function is specified,
    * it will remove all the listeners of that particular event from the object.
    * Note that if you passed a custom context to on, you must pass the same context
    * to off in order to remove the listener.
    */
  // tslint:disable:unified-signatures
  def off(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart
  ): this.type = js.native
  def off(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn
  ): this.type = js.native
  def off(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
    context: Any
  ): this.type = js.native
  def off(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: Unit,
    context: Any
  ): this.type = js.native
  def off(`type`: String): this.type = js.native
  def off(`type`: String, fn: Unit, context: Any): this.type = js.native
  def off(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def off(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
  @JSName("off")
  def off_dragend(`type`: dragend): this.type = js.native
  @JSName("off")
  def off_dragend(`type`: dragend, fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  def off_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any): this.type = js.native
  @JSName("off")
  def off_locationerror(`type`: locationerror): this.type = js.native
  @JSName("off")
  def off_locationerror(`type`: locationerror, fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  def off_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("off")
  def off_locationfound(`type`: locationfound): this.type = js.native
  @JSName("off")
  def off_locationfound(`type`: locationfound, fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  def off_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any): this.type = js.native
  @JSName("off")
  def off_resize(`type`: resize): this.type = js.native
  @JSName("off")
  def off_resize(`type`: resize, fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  def off_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any): this.type = js.native
  @JSName("off")
  def off_tileerror(`type`: tileerror): this.type = js.native
  @JSName("off")
  def off_tileerror(`type`: tileerror, fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  def off_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("off")
  def off_zoomanim(`type`: zoomanim): this.type = js.native
  @JSName("off")
  def off_zoomanim(`type`: zoomanim, fn: Unit, context: Any): this.type = js.native
  @JSName("off")
  def off_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("off")
  def off_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
  
  /**
    * Adds a set of type/listener pairs, e.g. {click: onClick, mousemove: onMouseMove}
    */
  def on(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  /**
    * Adds a listener function (fn) to a particular event type of the object.
    * You can optionally specify the context of the listener (object the this
    * keyword will point to). You can also pass several space-separated types
    * (e.g. 'click dblclick').
    */
  // tslint:disable:unified-signatures
  def on(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn
  ): this.type = js.native
  def on(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
    context: Any
  ): this.type = js.native
  def on(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def on(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  def on_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  def on_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  def on_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  def on_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  def on_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  def on_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
  
  /**
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  def once(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  /**
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  // tslint:disable:unified-signatures
  def once(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn
  ): this.type = js.native
  def once(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
    context: Any
  ): this.type = js.native
  def once(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def once(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
  @JSName("once")
  def once_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any): this.type = js.native
  @JSName("once")
  def once_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("once")
  def once_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any): this.type = js.native
  @JSName("once")
  def once_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any): this.type = js.native
  @JSName("once")
  def once_tileerror(`type`: tileerror, fn: TileEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_tileerror(`type`: tileerror, fn: TileEventHandlerFn, context: Any): this.type = js.native
  @JSName("once")
  def once_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("once")
  def once_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
  
  /**
    * Alias for off(...)
    *
    * Removes a set of type/listener pairs.
    */
  def removeEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
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
  def removeEventListener(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart
  ): this.type = js.native
  def removeEventListener(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn
  ): this.type = js.native
  def removeEventListener(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
    context: Any
  ): this.type = js.native
  def removeEventListener(
    `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
    fn: Unit,
    context: Any
  ): this.type = js.native
  def removeEventListener(`type`: String): this.type = js.native
  def removeEventListener(`type`: String, fn: Unit, context: Any): this.type = js.native
  def removeEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
  def removeEventListener(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(`type`: dragend): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(`type`: dragend, fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationerror(`type`: locationerror): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationerror(`type`: locationerror, fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationfound(`type`: locationfound): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationfound(`type`: locationfound, fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(`type`: resize): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(`type`: resize, fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileerror(`type`: tileerror): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileerror(`type`: tileerror, fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomanim(`type`: zoomanim): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomanim(`type`: zoomanim, fn: Unit, context: Any): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
  
  /**
    * Removes an event parent, so it will stop receiving propagated events
    */
  def removeEventParent(obj: Evented): this.type = js.native
}
