package typings.leafletHeat

import org.scalablytyped.runtime.NumberDictionary
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.TileLayer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  @JSImport("leaflet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def heatLayer(latlngs: js.Array[LatLng_ | HeatLatLngTuple], options: HeatMapOptions): HeatLayer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("heatLayer")(latlngs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HeatLayer_]
  
  type ColorGradientConfig = NumberDictionary[String]
  
  type HeatLatLngTuple = js.Tuple3[Double, Double, Double]
  
  @js.native
  trait HeatLayer_ extends TileLayer_ {
    
    def addLatLng(latlng: LatLng_): HeatLayer_ = js.native
    def addLatLng(latlng: HeatLatLngTuple): HeatLayer_ = js.native
    
    def setLatLngs(latlngs: js.Array[LatLng_ | HeatLatLngTuple]): HeatLayer_ = js.native
    
    def setOptions(options: HeatMapOptions): HeatLayer_ = js.native
  }
  
  trait HeatMapOptions extends StObject {
    
    var blur: js.UndefOr[Double] = js.undefined
    
    var gradient: js.UndefOr[ColorGradientConfig] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var minOpacity: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
  }
  object HeatMapOptions {
    
    inline def apply(): HeatMapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeatMapOptions]
    }
    
    extension [Self <: HeatMapOptions](x: Self) {
      
      inline def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setGradient(value: ColorGradientConfig): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinOpacity(value: Double): Self = StObject.set(x, "minOpacity", value.asInstanceOf[js.Any])
      
      inline def setMinOpacityUndefined: Self = StObject.set(x, "minOpacity", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
}
