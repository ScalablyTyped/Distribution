package typings.leafletGeosearch

import typings.leafletGeosearch.distProvidersProviderMod.ProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProvidersOpenStreetMapProviderMod {
  
  @JSImport("leaflet-geosearch/dist/providers/openStreetMapProvider", JSImport.Default)
  @js.native
  open class default () extends OpenStreetMapProvider {
    def this(options: OpenStreetMapProviderOptions) = this()
  }
  
  @js.native
  trait OpenStreetMapProvider
    extends typings.leafletGeosearch.distProvidersProviderMod.default[js.Array[RawResult], RawResult] {
    
    var reverseUrl: String = js.native
    
    var searchUrl: String = js.native
  }
  
  trait OpenStreetMapProviderOptions
    extends StObject
       with ProviderOptions {
    
    var reverseUrl: js.UndefOr[String] = js.undefined
    
    var searchUrl: js.UndefOr[String] = js.undefined
  }
  object OpenStreetMapProviderOptions {
    
    inline def apply(): OpenStreetMapProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenStreetMapProviderOptions]
    }
    
    extension [Self <: OpenStreetMapProviderOptions](x: Self) {
      
      inline def setReverseUrl(value: String): Self = StObject.set(x, "reverseUrl", value.asInstanceOf[js.Any])
      
      inline def setReverseUrlUndefined: Self = StObject.set(x, "reverseUrl", js.undefined)
      
      inline def setSearchUrl(value: String): Self = StObject.set(x, "searchUrl", value.asInstanceOf[js.Any])
      
      inline def setSearchUrlUndefined: Self = StObject.set(x, "searchUrl", js.undefined)
    }
  }
  
  trait RawResult extends StObject {
    
    var boundingbox: js.Tuple4[String, String, String, String]
    
    var `class`: String
    
    var display_name: String
    
    var icon: js.UndefOr[String] = js.undefined
    
    var importance: Double
    
    var lat: String
    
    var license: String
    
    var lon: String
    
    var osm_id: Double
    
    var osm_type: String
    
    var place_id: String
    
    var `type`: String
  }
  object RawResult {
    
    inline def apply(
      boundingbox: js.Tuple4[String, String, String, String],
      `class`: String,
      display_name: String,
      importance: Double,
      lat: String,
      license: String,
      lon: String,
      osm_id: Double,
      osm_type: String,
      place_id: String,
      `type`: String
    ): RawResult = {
      val __obj = js.Dynamic.literal(boundingbox = boundingbox.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any], osm_id = osm_id.asInstanceOf[js.Any], osm_type = osm_type.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawResult]
    }
    
    extension [Self <: RawResult](x: Self) {
      
      inline def setBoundingbox(value: js.Tuple4[String, String, String, String]): Self = StObject.set(x, "boundingbox", value.asInstanceOf[js.Any])
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setImportance(value: Double): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
      
      inline def setLat(value: String): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLon(value: String): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
      
      inline def setOsm_id(value: Double): Self = StObject.set(x, "osm_id", value.asInstanceOf[js.Any])
      
      inline def setOsm_type(value: String): Self = StObject.set(x, "osm_type", value.asInstanceOf[js.Any])
      
      inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RequestResult = js.Array[RawResult]
}
