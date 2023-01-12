package typings.leafletGeosearch

import typings.leafletGeosearch.anon.City
import typings.leafletGeosearch.anon.Type
import typings.leafletGeosearch.distProvidersProviderMod.ProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProvidersGeoApiFrProviderMod {
  
  @JSImport("leaflet-geosearch/dist/providers/geoApiFrProvider", JSImport.Default)
  @js.native
  open class default () extends GeoApiFrProvider {
    def this(options: GeoApiFrProviderOptions) = this()
  }
  
  @js.native
  trait GeoApiFrProvider
    extends typings.leafletGeosearch.distProvidersProviderMod.default[RequestResult, RawResult] {
    
    var reverseUrl: String = js.native
    
    var searchUrl: String = js.native
  }
  
  trait GeoApiFrProviderOptions
    extends StObject
       with ProviderOptions {
    
    var reverseUrl: js.UndefOr[String] = js.undefined
    
    var searchUrl: js.UndefOr[String] = js.undefined
  }
  object GeoApiFrProviderOptions {
    
    inline def apply(): GeoApiFrProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeoApiFrProviderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeoApiFrProviderOptions] (val x: Self) extends AnyVal {
      
      inline def setReverseUrl(value: String): Self = StObject.set(x, "reverseUrl", value.asInstanceOf[js.Any])
      
      inline def setReverseUrlUndefined: Self = StObject.set(x, "reverseUrl", js.undefined)
      
      inline def setSearchUrl(value: String): Self = StObject.set(x, "searchUrl", value.asInstanceOf[js.Any])
      
      inline def setSearchUrlUndefined: Self = StObject.set(x, "searchUrl", js.undefined)
    }
  }
  
  trait RawResult extends StObject {
    
    var geometry: Type
    
    var properties: City
    
    var `type`: String
  }
  object RawResult {
    
    inline def apply(geometry: Type, properties: City, `type`: String): RawResult = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawResult] (val x: Self) extends AnyVal {
      
      inline def setGeometry(value: Type): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: City): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestResult extends StObject {
    
    var attribution: String
    
    var features: js.Array[RawResult]
    
    var licence: String
    
    var limit: String
    
    var query: String
    
    var `type`: String
    
    var version: String
  }
  object RequestResult {
    
    inline def apply(
      attribution: String,
      features: js.Array[RawResult],
      licence: String,
      limit: String,
      query: String,
      `type`: String,
      version: String
    ): RequestResult = {
      val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], licence = licence.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestResult] (val x: Self) extends AnyVal {
      
      inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      inline def setFeatures(value: js.Array[RawResult]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: RawResult*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setLicence(value: String): Self = StObject.set(x, "licence", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
