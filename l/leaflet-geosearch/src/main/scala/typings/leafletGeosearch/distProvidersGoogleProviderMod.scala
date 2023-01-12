package typings.leafletGeosearch

import typings.googleMaps.google.maps.Geocoder
import typings.googleMaps.google.maps.GeocoderResult
import typings.googleMaps.google.maps.GeocoderStatus
import typings.googlemapsJsApiLoader.mod.LoaderOptions
import typings.leafletGeosearch.distProvidersProviderMod.ProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProvidersGoogleProviderMod {
  
  @JSImport("leaflet-geosearch/dist/providers/googleProvider", JSImport.Default)
  @js.native
  open class default protected () extends GoogleProvider {
    def this(options: GoogleProviderOptions) = this()
  }
  
  @js.native
  trait GoogleProvider
    extends typings.leafletGeosearch.distProvidersProviderMod.default[RequestResult, GeocoderResult] {
    
    var geocoder: Geocoder | Null = js.native
    
    var loader: js.Promise[Geocoder] | Null = js.native
  }
  
  trait GoogleProviderOptions
    extends StObject
       with LoaderOptions
       with ProviderOptions
  object GoogleProviderOptions {
    
    inline def apply(apiKey: String): GoogleProviderOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleProviderOptions]
    }
  }
  
  trait RequestResult extends StObject {
    
    var results: js.Array[GeocoderResult]
    
    var status: js.UndefOr[GeocoderStatus] = js.undefined
  }
  object RequestResult {
    
    inline def apply(results: js.Array[GeocoderResult]): RequestResult = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestResult] (val x: Self) extends AnyVal {
      
      inline def setResults(value: js.Array[GeocoderResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: GeocoderResult*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setStatus(value: GeocoderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
