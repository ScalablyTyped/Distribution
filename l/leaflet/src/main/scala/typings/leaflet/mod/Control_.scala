package typings.leaflet.mod

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.anon.InstantiableT
import typings.leaflet.leafletBooleans.`false`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Control")
@js.native
open class Control_ () extends Class {
  def this(options: ControlOptions) = this()
  
  def addTo(map: Map_): this.type = js.native
  
  def getContainer(): js.UndefOr[HTMLElement] = js.native
  
  def getPosition(): ControlPosition = js.native
  
  // Extension methods
  var onAdd: js.UndefOr[js.Function1[/* map */ Map_, HTMLElement]] = js.native
  
  var onRemove: js.UndefOr[js.Function1[/* map */ Map_, Unit]] = js.native
  
  var options: ControlOptions = js.native
  
  def remove(): this.type = js.native
  
  def setPosition(position: ControlPosition): this.type = js.native
}
/* static members */
object Control_ {
  
  @JSImport("leaflet", "Control")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet", "Control.Attribution")
  @js.native
  open class Attribution () extends Control_ {
    def this(options: AttributionOptions) = this()
    
    def addAttribution(text: String): this.type = js.native
    
    @JSName("options")
    var options_Attribution: AttributionOptions = js.native
    
    def removeAttribution(text: String): this.type = js.native
    
    def setPrefix(prefix: String): this.type = js.native
    @JSName("setPrefix")
    def setPrefix_false(prefix: `false`): this.type = js.native
  }
  
  @JSImport("leaflet", "Control.Layers")
  @js.native
  open class Layers () extends Control_ {
    def this(baseLayers: LayersObject) = this()
    def this(baseLayers: Unit, overlays: LayersObject) = this()
    def this(baseLayers: LayersObject, overlays: LayersObject) = this()
    def this(baseLayers: Unit, overlays: Unit, options: LayersOptions) = this()
    def this(baseLayers: Unit, overlays: LayersObject, options: LayersOptions) = this()
    def this(baseLayers: LayersObject, overlays: Unit, options: LayersOptions) = this()
    def this(baseLayers: LayersObject, overlays: LayersObject, options: LayersOptions) = this()
    
    def addBaseLayer(layer: Layer, name: String): this.type = js.native
    
    def addOverlay(layer: Layer, name: String): this.type = js.native
    
    def collapse(): this.type = js.native
    
    def expand(): this.type = js.native
    
    @JSName("options")
    var options_Layers: LayersOptions = js.native
    
    def removeLayer(layer: Layer): this.type = js.native
  }
  
  @JSImport("leaflet", "Control.Scale")
  @js.native
  open class Scale () extends Control_ {
    def this(options: ScaleOptions) = this()
    
    @JSName("options")
    var options_Scale: ScaleOptions = js.native
  }
  
  @JSImport("leaflet", "Control.Zoom")
  @js.native
  open class Zoom () extends Control_ {
    def this(options: typings.leaflet.mod.Control_.ZoomOptions) = this()
    
    @JSName("options")
    var options_Zoom: typings.leaflet.mod.Control_.ZoomOptions = js.native
  }
  
  inline def extend[T /* <: js.Object */](props: T): InstantiableT[T] & typings.leaflet.anon.Attribution = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(props.asInstanceOf[js.Any]).asInstanceOf[InstantiableT[T] & typings.leaflet.anon.Attribution]
  
  trait AttributionOptions
    extends StObject
       with ControlOptions {
    
    var prefix: js.UndefOr[String | Boolean] = js.undefined
  }
  object AttributionOptions {
    
    inline def apply(): AttributionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributionOptions]
    }
    
    extension [Self <: AttributionOptions](x: Self) {
      
      inline def setPrefix(value: String | Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  type LayersObject = StringDictionary[Layer]
  
  trait LayersOptions
    extends StObject
       with ControlOptions {
    
    var autoZIndex: js.UndefOr[Boolean] = js.undefined
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var hideSingleBase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A [compare function](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/sort)
      * that will be used for sorting the layers, when `sortLayers` is `true`. The function receives both the
      * [`L.Layer`](https://leafletjs.com/reference.html#layer) instances and their names, as in
      * `sortFunction(layerA, layerB, nameA, nameB)`. By default, it sorts layers alphabetically by their name.
      */
    var sortFunction: js.UndefOr[
        js.Function4[/* layerA */ Layer, /* layerB */ Layer, /* nameA */ String, /* nameB */ String, Double]
      ] = js.undefined
    
    /**
      * Whether to sort the layers. When `false`, layers will keep the order in which they were added to the control.
      */
    var sortLayers: js.UndefOr[Boolean] = js.undefined
  }
  object LayersOptions {
    
    inline def apply(): LayersOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersOptions]
    }
    
    extension [Self <: LayersOptions](x: Self) {
      
      inline def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      inline def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setHideSingleBase(value: Boolean): Self = StObject.set(x, "hideSingleBase", value.asInstanceOf[js.Any])
      
      inline def setHideSingleBaseUndefined: Self = StObject.set(x, "hideSingleBase", js.undefined)
      
      inline def setSortFunction(value: (/* layerA */ Layer, /* layerB */ Layer, /* nameA */ String, /* nameB */ String) => Double): Self = StObject.set(x, "sortFunction", js.Any.fromFunction4(value))
      
      inline def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
      
      inline def setSortLayers(value: Boolean): Self = StObject.set(x, "sortLayers", value.asInstanceOf[js.Any])
      
      inline def setSortLayersUndefined: Self = StObject.set(x, "sortLayers", js.undefined)
    }
  }
  
  trait ScaleOptions
    extends StObject
       with ControlOptions {
    
    var imperial: js.UndefOr[Boolean] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var metric: js.UndefOr[Boolean] = js.undefined
    
    var updateWhenIdle: js.UndefOr[Boolean] = js.undefined
  }
  object ScaleOptions {
    
    inline def apply(): ScaleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScaleOptions]
    }
    
    extension [Self <: ScaleOptions](x: Self) {
      
      inline def setImperial(value: Boolean): Self = StObject.set(x, "imperial", value.asInstanceOf[js.Any])
      
      inline def setImperialUndefined: Self = StObject.set(x, "imperial", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMetric(value: Boolean): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
      
      inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
      
      inline def setUpdateWhenIdle(value: Boolean): Self = StObject.set(x, "updateWhenIdle", value.asInstanceOf[js.Any])
      
      inline def setUpdateWhenIdleUndefined: Self = StObject.set(x, "updateWhenIdle", js.undefined)
    }
  }
  
  trait ZoomOptions
    extends StObject
       with ControlOptions {
    
    var zoomInText: js.UndefOr[String] = js.undefined
    
    var zoomInTitle: js.UndefOr[String] = js.undefined
    
    var zoomOutText: js.UndefOr[String] = js.undefined
    
    var zoomOutTitle: js.UndefOr[String] = js.undefined
  }
  object ZoomOptions {
    
    inline def apply(): typings.leaflet.mod.Control_.ZoomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.leaflet.mod.Control_.ZoomOptions]
    }
    
    extension [Self <: typings.leaflet.mod.Control_.ZoomOptions](x: Self) {
      
      inline def setZoomInText(value: String): Self = StObject.set(x, "zoomInText", value.asInstanceOf[js.Any])
      
      inline def setZoomInTextUndefined: Self = StObject.set(x, "zoomInText", js.undefined)
      
      inline def setZoomInTitle(value: String): Self = StObject.set(x, "zoomInTitle", value.asInstanceOf[js.Any])
      
      inline def setZoomInTitleUndefined: Self = StObject.set(x, "zoomInTitle", js.undefined)
      
      inline def setZoomOutText(value: String): Self = StObject.set(x, "zoomOutText", value.asInstanceOf[js.Any])
      
      inline def setZoomOutTextUndefined: Self = StObject.set(x, "zoomOutText", js.undefined)
      
      inline def setZoomOutTitle(value: String): Self = StObject.set(x, "zoomOutTitle", value.asInstanceOf[js.Any])
      
      inline def setZoomOutTitleUndefined: Self = StObject.set(x, "zoomOutTitle", js.undefined)
    }
  }
}
