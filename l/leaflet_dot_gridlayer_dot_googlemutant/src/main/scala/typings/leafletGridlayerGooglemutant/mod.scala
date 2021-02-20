package typings.leafletGridlayerGooglemutant

import typings.leaflet.mod.GridLayer_
import typings.leaflet.mod.Point_
import typings.leaflet.mod.TileLayerOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object gridLayer {
    
    @JSImport("leaflet", "gridLayer.googleMutant")
    @js.native
    def googleMutant(): GoogleMutant_ = js.native
    @JSImport("leaflet", "gridLayer.googleMutant")
    @js.native
    def googleMutant(options: GoogleMutantOptions): GoogleMutant_ = js.native
    
    @js.native
    trait GoogleMutantOptions extends TileLayerOptions {
      
      var continuousWorld: js.UndefOr[Boolean] = js.native
      
      /**
        * Google's map styles.
        */
      var styles: js.UndefOr[js.Array[GoogleMutantStyle]] = js.native
      
      /**
        * Google's map type. 'hybrid' is not really supported.
        */
      var `type`: js.UndefOr[GoogleMutantType] = js.native
    }
    object GoogleMutantOptions {
      
      @scala.inline
      def apply(): GoogleMutantOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GoogleMutantOptions]
      }
      
      @scala.inline
      implicit class GoogleMutantOptionsMutableBuilder[Self <: GoogleMutantOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContinuousWorld(value: Boolean): Self = StObject.set(x, "continuousWorld", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContinuousWorldUndefined: Self = StObject.set(x, "continuousWorld", js.undefined)
        
        @scala.inline
        def setStyles(value: js.Array[GoogleMutantStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
        
        @scala.inline
        def setStylesVarargs(value: GoogleMutantStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
        
        @scala.inline
        def setType(value: GoogleMutantType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    /**
      * Google's map style.
      *
      * https://developers.google.com/maps/documentation/javascript/style-reference
      */
    @js.native
    trait GoogleMutantStyle extends StObject {
      
      /**
        * https://developers.google.com/maps/documentation/javascript/style-reference#style-elements
        */
      var elementType: js.UndefOr[String] = js.native
      
      /**
        * https://developers.google.com/maps/documentation/javascript/style-reference#style-features
        */
      var featureType: js.UndefOr[String] = js.native
      
      /**
        * https://developers.google.com/maps/documentation/javascript/style-reference#stylers
        */
      var stylers: js.UndefOr[js.Array[GoogleMutantStyler]] = js.native
    }
    object GoogleMutantStyle {
      
      @scala.inline
      def apply(): GoogleMutantStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GoogleMutantStyle]
      }
      
      @scala.inline
      implicit class GoogleMutantStyleMutableBuilder[Self <: GoogleMutantStyle] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
        
        @scala.inline
        def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
        
        @scala.inline
        def setStylers(value: js.Array[GoogleMutantStyler]): Self = StObject.set(x, "stylers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStylersUndefined: Self = StObject.set(x, "stylers", js.undefined)
        
        @scala.inline
        def setStylersVarargs(value: GoogleMutantStyler*): Self = StObject.set(x, "stylers", js.Array(value :_*))
      }
    }
    
    @js.native
    trait GoogleMutantStyler extends StObject {
      
      var color: js.UndefOr[String] = js.native
      
      var gamma: js.UndefOr[Double] = js.native
      
      var hue: js.UndefOr[String] = js.native
      
      var invert_lightness: js.UndefOr[Boolean] = js.native
      
      var lightness: js.UndefOr[Double] = js.native
      
      var saturation: js.UndefOr[Double] = js.native
      
      var visibility: js.UndefOr[String] = js.native
      
      var weight: js.UndefOr[Double] = js.native
    }
    object GoogleMutantStyler {
      
      @scala.inline
      def apply(): GoogleMutantStyler = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GoogleMutantStyler]
      }
      
      @scala.inline
      implicit class GoogleMutantStylerMutableBuilder[Self <: GoogleMutantStyler] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
        
        @scala.inline
        def setHue(value: String): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
        
        @scala.inline
        def setInvert_lightness(value: Boolean): Self = StObject.set(x, "invert_lightness", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInvert_lightnessUndefined: Self = StObject.set(x, "invert_lightness", js.undefined)
        
        @scala.inline
        def setLightness(value: Double): Self = StObject.set(x, "lightness", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLightnessUndefined: Self = StObject.set(x, "lightness", js.undefined)
        
        @scala.inline
        def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
        
        @scala.inline
        def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
        
        @scala.inline
        def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.roadmap
      - typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.satellite
      - typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.terrain
      - typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.hybrid
    */
    trait GoogleMutantType extends StObject
    object GoogleMutantType {
      
      @scala.inline
      def hybrid: typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.hybrid = "hybrid".asInstanceOf[typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.hybrid]
      
      @scala.inline
      def roadmap: typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.roadmap = "roadmap".asInstanceOf[typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.roadmap]
      
      @scala.inline
      def satellite: typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.satellite = "satellite".asInstanceOf[typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.satellite]
      
      @scala.inline
      def terrain: typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.terrain = "terrain".asInstanceOf[typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.terrain]
    }
    
    @js.native
    trait GoogleMutant_ extends GridLayer_ {
      
      /**
        * Add additional Google Maps layer.
        *
        * https://developers.google.com/maps/documentation/javascript/trafficlayer
        *
        * @param googleLayerName such as BicyclingLayer, TrafficLayer, or TransitLayer.
        * @param options? constructor arguments to pass through to the google layer.
        * @returns Promise for the native Google Maps Layer instance.
        */
      def addGoogleLayer(googleLayerName: String): js.Promise[js.Object] = js.native
      def addGoogleLayer(googleLayerName: String, options: js.Object): js.Promise[js.Object] = js.native
      
      /**
        * Removes Google Maps layer.
        *
        *  https://developers.google.com/maps/documentation/javascript/trafficlayer
        *
        * @param googleLayerName such as BicyclingLayer, TrafficLayer, or TransitLayer.
        */
      def removeGoogleLayer(googleLayerName: String): Unit = js.native
      
      def setElementSize(e: HTMLElement, size: Point_): Unit = js.native
    }
  }
}
