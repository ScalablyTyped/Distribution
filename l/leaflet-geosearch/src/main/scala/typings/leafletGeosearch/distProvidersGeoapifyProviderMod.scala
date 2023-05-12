package typings.leafletGeosearch

import typings.leafletGeosearch.distProvidersProviderMod.ProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProvidersGeoapifyProviderMod {
  
  @JSImport("leaflet-geosearch/dist/providers/geoapifyProvider", JSImport.Default)
  @js.native
  open class default () extends GeoapifyProvider {
    def this(options: GeoapifyProviderOptions) = this()
  }
  
  trait BBox extends StObject {
    
    var lat1: String
    
    var lat2: String
    
    var lon1: String
    
    var lon2: String
  }
  object BBox {
    
    inline def apply(lat1: String, lat2: String, lon1: String, lon2: String): BBox = {
      val __obj = js.Dynamic.literal(lat1 = lat1.asInstanceOf[js.Any], lat2 = lat2.asInstanceOf[js.Any], lon1 = lon1.asInstanceOf[js.Any], lon2 = lon2.asInstanceOf[js.Any])
      __obj.asInstanceOf[BBox]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BBox] (val x: Self) extends AnyVal {
      
      inline def setLat1(value: String): Self = StObject.set(x, "lat1", value.asInstanceOf[js.Any])
      
      inline def setLat2(value: String): Self = StObject.set(x, "lat2", value.asInstanceOf[js.Any])
      
      inline def setLon1(value: String): Self = StObject.set(x, "lon1", value.asInstanceOf[js.Any])
      
      inline def setLon2(value: String): Self = StObject.set(x, "lon2", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GeoapifyProvider
    extends typings.leafletGeosearch.distProvidersProviderMod.default[RequestResult, RawResult] {
    
    var reverseUrl: String = js.native
    
    var searchUrl: String = js.native
  }
  
  trait GeoapifyProviderOptions
    extends StObject
       with ProviderOptions {
    
    var reverseUrl: js.UndefOr[String] = js.undefined
    
    var searchUrl: js.UndefOr[String] = js.undefined
  }
  object GeoapifyProviderOptions {
    
    inline def apply(): GeoapifyProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeoapifyProviderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeoapifyProviderOptions] (val x: Self) extends AnyVal {
      
      inline def setReverseUrl(value: String): Self = StObject.set(x, "reverseUrl", value.asInstanceOf[js.Any])
      
      inline def setReverseUrlUndefined: Self = StObject.set(x, "reverseUrl", js.undefined)
      
      inline def setSearchUrl(value: String): Self = StObject.set(x, "searchUrl", value.asInstanceOf[js.Any])
      
      inline def setSearchUrlUndefined: Self = StObject.set(x, "searchUrl", js.undefined)
    }
  }
  
  trait RawQuery extends StObject {
    
    var parsed: RawQueryParsed
    
    var text: String
  }
  object RawQuery {
    
    inline def apply(parsed: RawQueryParsed, text: String): RawQuery = {
      val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawQuery] (val x: Self) extends AnyVal {
      
      inline def setParsed(value: RawQueryParsed): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawQueryParsed extends StObject {
    
    var city: String
    
    var expected_type: String
  }
  object RawQueryParsed {
    
    inline def apply(city: String, expected_type: String): RawQueryParsed = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], expected_type = expected_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawQueryParsed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawQueryParsed] (val x: Self) extends AnyVal {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setExpected_type(value: String): Self = StObject.set(x, "expected_type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawResult extends StObject {
    
    var bbox: BBox
    
    var city: String
    
    var country: String
    
    var country_code: String
    
    var county: String
    
    var formatted: String
    
    var lat: String
    
    var lon: String
    
    var postcode: Double
    
    var state: String
    
    var state_code: String
    
    var street: String
    
    var suburb: String
  }
  object RawResult {
    
    inline def apply(
      bbox: BBox,
      city: String,
      country: String,
      country_code: String,
      county: String,
      formatted: String,
      lat: String,
      lon: String,
      postcode: Double,
      state: String,
      state_code: String,
      street: String,
      suburb: String
    ): RawResult = {
      val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], county = county.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], state_code = state_code.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], suburb = suburb.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawResult] (val x: Self) extends AnyVal {
      
      inline def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setCounty(value: String): Self = StObject.set(x, "county", value.asInstanceOf[js.Any])
      
      inline def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
      
      inline def setLat(value: String): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLon(value: String): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
      
      inline def setPostcode(value: Double): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setState_code(value: String): Self = StObject.set(x, "state_code", value.asInstanceOf[js.Any])
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      inline def setSuburb(value: String): Self = StObject.set(x, "suburb", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestResult extends StObject {
    
    var query: js.Array[RawQuery]
    
    var results: js.Array[RawResult]
  }
  object RequestResult {
    
    inline def apply(query: js.Array[RawQuery], results: js.Array[RawResult]): RequestResult = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestResult] (val x: Self) extends AnyVal {
      
      inline def setQuery(value: js.Array[RawQuery]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryVarargs(value: RawQuery*): Self = StObject.set(x, "query", js.Array(value*))
      
      inline def setResults(value: js.Array[RawResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: RawResult*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
}
