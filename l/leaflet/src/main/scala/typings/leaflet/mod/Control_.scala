package typings.leaflet.mod

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.anon.InstantiableT
import typings.leaflet.leafletBooleans.`false`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Control")
@js.native
class Control_ () extends Class {
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
  
  @JSImport("leaflet", "Control.Attribution")
  @js.native
  class Attribution () extends Control_ {
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
  class Layers () extends Control_ {
    def this(baseLayers: LayersObject) = this()
    def this(baseLayers: js.UndefOr[scala.Nothing], overlays: LayersObject) = this()
    def this(baseLayers: LayersObject, overlays: LayersObject) = this()
    def this(baseLayers: js.UndefOr[scala.Nothing], overlays: js.UndefOr[scala.Nothing], options: LayersOptions) = this()
    def this(baseLayers: js.UndefOr[scala.Nothing], overlays: LayersObject, options: LayersOptions) = this()
    def this(baseLayers: LayersObject, overlays: js.UndefOr[scala.Nothing], options: LayersOptions) = this()
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
  class Scale () extends Control_ {
    def this(options: ScaleOptions) = this()
    
    @JSName("options")
    var options_Scale: ScaleOptions = js.native
  }
  
  @JSImport("leaflet", "Control.Zoom")
  @js.native
  class Zoom () extends Control_ {
    def this(options: typings.leaflet.mod.Control_.ZoomOptions) = this()
    
    @JSName("options")
    var options_Zoom: typings.leaflet.mod.Control_.ZoomOptions = js.native
  }
  
  @JSImport("leaflet", "Control.extend")
  @js.native
  def extend[T /* <: js.Object */](props: T): InstantiableT[T] with typings.leaflet.anon.Attribution = js.native
  
  @js.native
  trait AttributionOptions extends ControlOptions {
    
    var prefix: js.UndefOr[String | Boolean] = js.native
  }
  object AttributionOptions {
    
    @scala.inline
    def apply(): AttributionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributionOptions]
    }
    
    @scala.inline
    implicit class AttributionOptionsMutableBuilder[Self <: AttributionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String | Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  type LayersObject = StringDictionary[Layer]
  
  @js.native
  trait LayersOptions extends ControlOptions {
    
    var autoZIndex: js.UndefOr[Boolean] = js.native
    
    var collapsed: js.UndefOr[Boolean] = js.native
    
    var hideSingleBase: js.UndefOr[Boolean] = js.native
  }
  object LayersOptions {
    
    @scala.inline
    def apply(): LayersOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersOptions]
    }
    
    @scala.inline
    implicit class LayersOptionsMutableBuilder[Self <: LayersOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setHideSingleBase(value: Boolean): Self = StObject.set(x, "hideSingleBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideSingleBaseUndefined: Self = StObject.set(x, "hideSingleBase", js.undefined)
    }
  }
  
  @js.native
  trait ScaleOptions extends ControlOptions {
    
    var imperial: js.UndefOr[Boolean] = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var metric: js.UndefOr[Boolean] = js.native
    
    var updateWhenIdle: js.UndefOr[Boolean] = js.native
  }
  object ScaleOptions {
    
    @scala.inline
    def apply(): ScaleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScaleOptions]
    }
    
    @scala.inline
    implicit class ScaleOptionsMutableBuilder[Self <: ScaleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImperial(value: Boolean): Self = StObject.set(x, "imperial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImperialUndefined: Self = StObject.set(x, "imperial", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMetric(value: Boolean): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
      
      @scala.inline
      def setUpdateWhenIdle(value: Boolean): Self = StObject.set(x, "updateWhenIdle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateWhenIdleUndefined: Self = StObject.set(x, "updateWhenIdle", js.undefined)
    }
  }
  
  @js.native
  trait ZoomOptions extends ControlOptions {
    
    var zoomInText: js.UndefOr[String] = js.native
    
    var zoomInTitle: js.UndefOr[String] = js.native
    
    var zoomOutText: js.UndefOr[String] = js.native
    
    var zoomOutTitle: js.UndefOr[String] = js.native
  }
  object ZoomOptions {
    
    @scala.inline
    def apply(): typings.leaflet.mod.Control_.ZoomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.leaflet.mod.Control_.ZoomOptions]
    }
    
    @scala.inline
    implicit class ZoomOptionsMutableBuilder[Self <: typings.leaflet.mod.Control_.ZoomOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setZoomInText(value: String): Self = StObject.set(x, "zoomInText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomInTextUndefined: Self = StObject.set(x, "zoomInText", js.undefined)
      
      @scala.inline
      def setZoomInTitle(value: String): Self = StObject.set(x, "zoomInTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomInTitleUndefined: Self = StObject.set(x, "zoomInTitle", js.undefined)
      
      @scala.inline
      def setZoomOutText(value: String): Self = StObject.set(x, "zoomOutText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOutTextUndefined: Self = StObject.set(x, "zoomOutText", js.undefined)
      
      @scala.inline
      def setZoomOutTitle(value: String): Self = StObject.set(x, "zoomOutTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOutTitleUndefined: Self = StObject.set(x, "zoomOutTitle", js.undefined)
    }
  }
}
