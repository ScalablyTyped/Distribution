package typings.leaflet

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.mod.Class
import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.Control_
import typings.leaflet.mod.Control_.AttributionOptions
import typings.leaflet.mod.Control_.LayersObject
import typings.leaflet.mod.Control_.LayersOptions
import typings.leaflet.mod.Control_.ScaleOptions
import typings.leaflet.mod.Control_.ZoomOptions
import typings.leaflet.mod.Coords
import typings.leaflet.mod.DomEvent.EventHandlerFn
import typings.leaflet.mod.DomEvent.PropagableEvent
import typings.leaflet.mod.Point_
import typings.std.DOMRect
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Active extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var coords: Coords
    
    var current: Boolean
    
    var el: HTMLElement
    
    var loaded: js.UndefOr[js.Date] = js.undefined
    
    var retain: js.UndefOr[Boolean] = js.undefined
  }
  object Active {
    
    inline def apply(coords: Coords, current: Boolean, el: HTMLElement): Active = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any])
      __obj.asInstanceOf[Active]
    }
    
    extension [Self <: Active](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setCoords(value: Coords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: js.Date): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      inline def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
    }
  }
  
  trait Alt extends StObject {
    
    var alt: js.UndefOr[Double] = js.undefined
    
    var lat: Double
    
    var lng: Double
  }
  object Alt {
    
    inline def apply(lat: Double, lng: Double): Alt = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alt]
    }
    
    extension [Self <: Alt](x: Self) {
      
      inline def setAlt(value: Double): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Attribution
    extends StObject
       with Instantiable0[Control_]
       with Instantiable1[/* options */ ControlOptions, Control_] {
    
    var Attribution: Instantiable1[
        /* options */ js.UndefOr[AttributionOptions], 
        typings.leaflet.mod.Control_.Attribution
      ] = js.native
    
    var Layers: Instantiable3[
        /* baseLayers */ js.UndefOr[LayersObject], 
        /* overlays */ js.UndefOr[LayersObject], 
        /* options */ js.UndefOr[LayersOptions], 
        typings.leaflet.mod.Control_.Layers
      ] = js.native
    
    var Scale: Instantiable1[/* options */ js.UndefOr[ScaleOptions], typings.leaflet.mod.Control_.Scale] = js.native
    
    var Zoom: Instantiable1[/* options */ js.UndefOr[ZoomOptions], typings.leaflet.mod.Control_.Zoom] = js.native
    
    def extend[T /* <: js.Object */](props: T): InstantiableT[T] & (/* import warning: importer.ImportType#apply Failed type conversion: typeof Control */ js.Any) = js.native
  }
  
  trait BoundingClientRect extends StObject {
    
    var boundingClientRect: DOMRect
    
    var x: Double
    
    var y: Double
  }
  object BoundingClientRect {
    
    inline def apply(boundingClientRect: DOMRect, x: Double, y: Double): BoundingClientRect = {
      val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundingClientRect]
    }
    
    extension [Self <: BoundingClientRect](x: Self) {
      
      inline def setBoundingClientRect(value: DOMRect): Self = StObject.set(x, "boundingClientRect", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, Any]
  
  @js.native
  trait InstantiableT[T /* <: js.Object */]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, T]
  
  @js.native
  trait TypeofClass
    extends StObject
       with Instantiable0[Class] {
    
    def addInitHook(initHookFn: js.Function0[Unit]): Any & (/* import warning: importer.ImportType#apply Failed type conversion: typeof Class */ js.Any) = js.native
    def addInitHook(methodName: String, args: Any*): Any & (/* import warning: importer.ImportType#apply Failed type conversion: typeof Class */ js.Any) = js.native
    
    def callInitHooks(): Unit = js.native
    
    def extend(props: Any): Instantiable & (/* import warning: importer.ImportType#apply Failed type conversion: typeof Class */ js.Any) = js.native
    
    def include(props: Any): Any & (/* import warning: importer.ImportType#apply Failed type conversion: typeof Class */ js.Any) = js.native
    
    def mergeOptions(props: Any): Any & (/* import warning: importer.ImportType#apply Failed type conversion: typeof Class */ js.Any) = js.native
  }
  
  @js.native
  trait TypeofDomEvent extends StObject {
    
    def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def addListener(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def addListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    def disableClickPropagation(el: HTMLElement): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    def disableScrollPropagation(el: HTMLElement): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    def getMousePosition(ev: MouseEvent): Point_ = js.native
    def getMousePosition(ev: MouseEvent, container: HTMLElement): Point_ = js.native
    
    def getPropagationPath(ev: Event): js.Array[HTMLElement] = js.native
    
    def getWheelDelta(ev: Event): Double = js.native
    
    // tslint:disable:unified-signatures
    def off(el: HTMLElement): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def off(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def off(el: HTMLElement, types: String, fn: EventHandlerFn, context: Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def on(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def on(el: HTMLElement, types: String, fn: EventHandlerFn, context: Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    def preventDefault(ev: Event): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    def stop(ev: PropagableEvent): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
    
    // tslint:enable:unified-signatures
    def stopPropagation(ev: PropagableEvent): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[name: string] : std.HTMLElement} & leaflet.leaflet.DefaultMapPanes */
  trait namestringHTMLElementDefa
    extends StObject
       with /* name */ StringDictionary[HTMLElement] {
    
    var mapPane: HTMLElement
    
    var markerPane: HTMLElement
    
    var overlayPane: HTMLElement
    
    var popupPane: HTMLElement
    
    var shadowPane: HTMLElement
    
    var tilePane: HTMLElement
    
    var tooltipPane: HTMLElement
  }
  object namestringHTMLElementDefa {
    
    inline def apply(
      mapPane: HTMLElement,
      markerPane: HTMLElement,
      overlayPane: HTMLElement,
      popupPane: HTMLElement,
      shadowPane: HTMLElement,
      tilePane: HTMLElement,
      tooltipPane: HTMLElement
    ): namestringHTMLElementDefa = {
      val __obj = js.Dynamic.literal(mapPane = mapPane.asInstanceOf[js.Any], markerPane = markerPane.asInstanceOf[js.Any], overlayPane = overlayPane.asInstanceOf[js.Any], popupPane = popupPane.asInstanceOf[js.Any], shadowPane = shadowPane.asInstanceOf[js.Any], tilePane = tilePane.asInstanceOf[js.Any], tooltipPane = tooltipPane.asInstanceOf[js.Any])
      __obj.asInstanceOf[namestringHTMLElementDefa]
    }
    
    extension [Self <: namestringHTMLElementDefa](x: Self) {
      
      inline def setMapPane(value: HTMLElement): Self = StObject.set(x, "mapPane", value.asInstanceOf[js.Any])
      
      inline def setMarkerPane(value: HTMLElement): Self = StObject.set(x, "markerPane", value.asInstanceOf[js.Any])
      
      inline def setOverlayPane(value: HTMLElement): Self = StObject.set(x, "overlayPane", value.asInstanceOf[js.Any])
      
      inline def setPopupPane(value: HTMLElement): Self = StObject.set(x, "popupPane", value.asInstanceOf[js.Any])
      
      inline def setShadowPane(value: HTMLElement): Self = StObject.set(x, "shadowPane", value.asInstanceOf[js.Any])
      
      inline def setTilePane(value: HTMLElement): Self = StObject.set(x, "tilePane", value.asInstanceOf[js.Any])
      
      inline def setTooltipPane(value: HTMLElement): Self = StObject.set(x, "tooltipPane", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {new (args : ...any): any} & {extend (props : any): {new (args : ...any): any} & typeof Class, include (props : any): any & typeof Class, mergeOptions (props : any): any & typeof Class, addInitHook (initHookFn : (): void): any & typeof Class, addInitHook (methodName : string, args : ...any): any & typeof Class, callInitHooks (): void, new (): leaflet.leaflet.Class} */
  @js.native
  trait newargsanyanyextendpropsa
    extends StObject
       with Instantiable0[Class]
       with Instantiable1[/* args (repeated) */ Any, Any] {
    
    def addInitHook(initHookFn: js.Function0[Unit]): Any & (/* import warning: importer.ImportType#apply Failed type conversion: typeof Class */ js.Any) = js.native
    def addInitHook(methodName: String, args: Any*): Any & (/* import warning: importer.ImportType#apply Failed type conversion: typeof Class */ js.Any) = js.native
    
    def callInitHooks(): Unit = js.native
    
    def extend(props: Any): Instantiable & (/* import warning: importer.ImportType#apply Failed type conversion: typeof Class */ js.Any) = js.native
    
    def include(props: Any): Any & (/* import warning: importer.ImportType#apply Failed type conversion: typeof Class */ js.Any) = js.native
    
    def mergeOptions(props: Any): Any & (/* import warning: importer.ImportType#apply Failed type conversion: typeof Class */ js.Any) = js.native
  }
}
