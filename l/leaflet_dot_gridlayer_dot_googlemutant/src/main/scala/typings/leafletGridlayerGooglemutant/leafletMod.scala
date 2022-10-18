package typings.leafletGridlayerGooglemutant

import typings.leaflet.mod.GridLayer_
import typings.leaflet.mod.Point_
import typings.leaflet.mod.TileLayerOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  object gridLayer {
    
    @JSImport("leaflet", "gridLayer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def googleMutant(): GoogleMutant_ = ^.asInstanceOf[js.Dynamic].applyDynamic("googleMutant")().asInstanceOf[GoogleMutant_]
    inline def googleMutant(options: GoogleMutantOptions): GoogleMutant_ = ^.asInstanceOf[js.Dynamic].applyDynamic("googleMutant")(options.asInstanceOf[js.Any]).asInstanceOf[GoogleMutant_]
    
    trait GoogleMutantOptions
      extends StObject
         with TileLayerOptions {
      
      var continuousWorld: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Google's map styles.
        */
      var styles: js.UndefOr[js.Array[GoogleMutantStyle]] = js.undefined
      
      /**
        * Google's map type. 'hybrid' is not really supported.
        */
      var `type`: js.UndefOr[GoogleMutantType] = js.undefined
    }
    object GoogleMutantOptions {
      
      inline def apply(): GoogleMutantOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GoogleMutantOptions]
      }
      
      extension [Self <: GoogleMutantOptions](x: Self) {
        
        inline def setContinuousWorld(value: Boolean): Self = StObject.set(x, "continuousWorld", value.asInstanceOf[js.Any])
        
        inline def setContinuousWorldUndefined: Self = StObject.set(x, "continuousWorld", js.undefined)
        
        inline def setStyles(value: js.Array[GoogleMutantStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
        
        inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
        
        inline def setStylesVarargs(value: GoogleMutantStyle*): Self = StObject.set(x, "styles", js.Array(value*))
        
        inline def setType(value: GoogleMutantType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    /**
      * Google's map style.
      *
      * https://developers.google.com/maps/documentation/javascript/style-reference
      */
    trait GoogleMutantStyle extends StObject {
      
      /**
        * https://developers.google.com/maps/documentation/javascript/style-reference#style-elements
        */
      var elementType: js.UndefOr[String] = js.undefined
      
      /**
        * https://developers.google.com/maps/documentation/javascript/style-reference#style-features
        */
      var featureType: js.UndefOr[String] = js.undefined
      
      /**
        * https://developers.google.com/maps/documentation/javascript/style-reference#stylers
        */
      var stylers: js.UndefOr[js.Array[GoogleMutantStyler]] = js.undefined
    }
    object GoogleMutantStyle {
      
      inline def apply(): GoogleMutantStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GoogleMutantStyle]
      }
      
      extension [Self <: GoogleMutantStyle](x: Self) {
        
        inline def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
        
        inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
        
        inline def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
        
        inline def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
        
        inline def setStylers(value: js.Array[GoogleMutantStyler]): Self = StObject.set(x, "stylers", value.asInstanceOf[js.Any])
        
        inline def setStylersUndefined: Self = StObject.set(x, "stylers", js.undefined)
        
        inline def setStylersVarargs(value: GoogleMutantStyler*): Self = StObject.set(x, "stylers", js.Array(value*))
      }
    }
    
    trait GoogleMutantStyler extends StObject {
      
      var color: js.UndefOr[String] = js.undefined
      
      var gamma: js.UndefOr[Double] = js.undefined
      
      var hue: js.UndefOr[String] = js.undefined
      
      var invert_lightness: js.UndefOr[Boolean] = js.undefined
      
      var lightness: js.UndefOr[Double] = js.undefined
      
      var saturation: js.UndefOr[Double] = js.undefined
      
      var visibility: js.UndefOr[String] = js.undefined
      
      var weight: js.UndefOr[Double] = js.undefined
    }
    object GoogleMutantStyler {
      
      inline def apply(): GoogleMutantStyler = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GoogleMutantStyler]
      }
      
      extension [Self <: GoogleMutantStyler](x: Self) {
        
        inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
        
        inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
        
        inline def setHue(value: String): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
        
        inline def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
        
        inline def setInvert_lightness(value: Boolean): Self = StObject.set(x, "invert_lightness", value.asInstanceOf[js.Any])
        
        inline def setInvert_lightnessUndefined: Self = StObject.set(x, "invert_lightness", js.undefined)
        
        inline def setLightness(value: Double): Self = StObject.set(x, "lightness", value.asInstanceOf[js.Any])
        
        inline def setLightnessUndefined: Self = StObject.set(x, "lightness", js.undefined)
        
        inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
        
        inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
        
        inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
        
        inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
        
        inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
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
      
      inline def hybrid: typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.hybrid = "hybrid".asInstanceOf[typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.hybrid]
      
      inline def roadmap: typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.roadmap = "roadmap".asInstanceOf[typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.roadmap]
      
      inline def satellite: typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.satellite = "satellite".asInstanceOf[typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.satellite]
      
      inline def terrain: typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.terrain = "terrain".asInstanceOf[typings.leafletGridlayerGooglemutant.leafletGridlayerGooglemutantStrings.terrain]
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
