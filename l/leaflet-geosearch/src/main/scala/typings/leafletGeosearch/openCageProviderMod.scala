package typings.leafletGeosearch

import typings.leafletGeosearch.anon.Callingcode
import typings.leafletGeosearch.anon.Northeast
import typings.leafletGeosearch.providerMod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openCageProviderMod {
  
  @JSImport("leaflet-geosearch/dist/providers/openCageProvider", JSImport.Default)
  @js.native
  open class default () extends OpenCageProvider
  
  @js.native
  trait OpenCageProvider
    extends typings.leafletGeosearch.providerMod.default[RequestResult, RawResult] {
    
    var searchUrl: String = js.native
  }
  
  trait RawResult extends StObject {
    
    var annotations: Callingcode
    
    var bounds: Northeast
    
    var formatted: String
    
    var geometry: LatLng
  }
  object RawResult {
    
    inline def apply(annotations: Callingcode, bounds: Northeast, formatted: String, geometry: LatLng): RawResult = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawResult]
    }
    
    extension [Self <: RawResult](x: Self) {
      
      inline def setAnnotations(value: Callingcode): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setBounds(value: Northeast): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
      
      inline def setGeometry(value: LatLng): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestResult extends StObject {
    
    var results: js.Array[RawResult]
  }
  object RequestResult {
    
    inline def apply(results: js.Array[RawResult]): RequestResult = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResult]
    }
    
    extension [Self <: RequestResult](x: Self) {
      
      inline def setResults(value: js.Array[RawResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: RawResult*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
}
