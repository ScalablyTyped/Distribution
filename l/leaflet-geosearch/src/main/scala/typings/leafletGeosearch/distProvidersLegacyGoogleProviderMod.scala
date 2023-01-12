package typings.leafletGeosearch

import typings.leafletGeosearch.anon.Compoundcode
import typings.leafletGeosearch.anon.Location
import typings.leafletGeosearch.anon.Longname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProvidersLegacyGoogleProviderMod {
  
  @JSImport("leaflet-geosearch/dist/providers/legacyGoogleProvider", JSImport.Default)
  @js.native
  open class default () extends LegacyGoogleProvider
  
  @js.native
  trait LegacyGoogleProvider
    extends typings.leafletGeosearch.distProvidersProviderMod.default[RequestResult, RawResult] {
    
    var searchUrl: String = js.native
  }
  
  trait RawResult extends StObject {
    
    var address_components: js.Array[Longname]
    
    var formatted_address: String
    
    var geometry: Location
    
    var place_id: String
    
    var plus_code: Compoundcode
    
    var types: js.Array[String]
  }
  object RawResult {
    
    inline def apply(
      address_components: js.Array[Longname],
      formatted_address: String,
      geometry: Location,
      place_id: String,
      plus_code: Compoundcode,
      types: js.Array[String]
    ): RawResult = {
      val __obj = js.Dynamic.literal(address_components = address_components.asInstanceOf[js.Any], formatted_address = formatted_address.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], plus_code = plus_code.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawResult] (val x: Self) extends AnyVal {
      
      inline def setAddress_components(value: js.Array[Longname]): Self = StObject.set(x, "address_components", value.asInstanceOf[js.Any])
      
      inline def setAddress_componentsVarargs(value: Longname*): Self = StObject.set(x, "address_components", js.Array(value*))
      
      inline def setFormatted_address(value: String): Self = StObject.set(x, "formatted_address", value.asInstanceOf[js.Any])
      
      inline def setGeometry(value: Location): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
      
      inline def setPlus_code(value: Compoundcode): Self = StObject.set(x, "plus_code", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  trait RequestResult extends StObject {
    
    var results: js.Array[RawResult]
    
    var status: String
  }
  object RequestResult {
    
    inline def apply(results: js.Array[RawResult], status: String): RequestResult = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestResult] (val x: Self) extends AnyVal {
      
      inline def setResults(value: js.Array[RawResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: RawResult*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
