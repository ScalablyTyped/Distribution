package typings.leafletGeosearch

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("leaflet-geosearch/dist/providers/provider", JSImport.Default)
  @js.native
  abstract class default[TRequestResult, TRawResult] ()
    extends StObject
       with AbstractProvider[TRequestResult, TRawResult] {
    def this(options: ProviderOptions) = this()
    
    /* CompleteClass */
    override def endpoint(options: EndpointArgument): String = js.native
    
    /* CompleteClass */
    override def getParamString(params: ProviderParams): String = js.native
    
    /* CompleteClass */
    var options: ProviderOptions = js.native
    
    /* CompleteClass */
    override def parse(response: ParseArgument[TRequestResult]): js.Array[SearchResult[TRawResult]] = js.native
    
    /* CompleteClass */
    override def search(options: SearchArgument): js.Promise[js.Array[SearchResult[TRawResult]]] = js.native
  }
  
  @js.native
  sealed trait RequestType extends StObject
  @JSImport("leaflet-geosearch/dist/providers/provider", "RequestType")
  @js.native
  object RequestType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RequestType & Double] = js.native
    
    @js.native
    sealed trait REVERSE
      extends StObject
         with RequestType
    /* 1 */ val REVERSE: typings.leafletGeosearch.providerMod.RequestType.REVERSE & Double = js.native
    
    @js.native
    sealed trait SEARCH
      extends StObject
         with RequestType
    /* 0 */ val SEARCH: typings.leafletGeosearch.providerMod.RequestType.SEARCH & Double = js.native
  }
  
  @js.native
  trait AbstractProvider[TRequestResult, TRawResult]
    extends StObject
       with Provider[TRequestResult, TRawResult] {
    
    def getParamString(): String = js.native
    
    def getUrl(url: String): String = js.native
    def getUrl(url: String, params: ProviderParams): String = js.native
  }
  
  type BoundsTuple = js.Tuple2[PointTuple, PointTuple]
  
  trait EndpointArgument extends StObject {
    
    var query: String | (StringDictionary[String | Double | Boolean])
    
    var `type`: js.UndefOr[RequestType] = js.undefined
  }
  object EndpointArgument {
    
    inline def apply(query: String | (StringDictionary[String | Double | Boolean])): EndpointArgument = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointArgument]
    }
    
    extension [Self <: EndpointArgument](x: Self) {
      
      inline def setQuery(value: String | (StringDictionary[String | Double | Boolean])): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: RequestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LatLng extends StObject {
    
    var lat: Double
    
    var lng: Double
  }
  object LatLng {
    
    inline def apply(lat: Double, lng: Double): LatLng = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[LatLng]
    }
    
    extension [Self <: LatLng](x: Self) {
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseArgument[TData] extends StObject {
    
    var data: TData
  }
  object ParseArgument {
    
    inline def apply[TData](data: TData): ParseArgument[TData] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseArgument[TData]]
    }
    
    extension [Self <: ParseArgument[?], TData](x: Self & ParseArgument[TData]) {
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type PointTuple = js.Tuple2[Double, Double]
  
  trait Provider[TRequestResult, TRawResult] extends StObject {
    
    def endpoint(options: EndpointArgument): String
    
    def getParamString(params: ProviderParams): String
    
    var options: ProviderOptions
    
    def parse(response: ParseArgument[TRequestResult]): js.Array[SearchResult[TRawResult]]
    
    def search(options: SearchArgument): js.Promise[js.Array[SearchResult[TRawResult]]]
  }
  object Provider {
    
    inline def apply[TRequestResult, TRawResult](
      endpoint: EndpointArgument => String,
      getParamString: ProviderParams => String,
      options: ProviderOptions,
      parse: ParseArgument[TRequestResult] => js.Array[SearchResult[TRawResult]],
      search: SearchArgument => js.Promise[js.Array[SearchResult[TRawResult]]]
    ): Provider[TRequestResult, TRawResult] = {
      val __obj = js.Dynamic.literal(endpoint = js.Any.fromFunction1(endpoint), getParamString = js.Any.fromFunction1(getParamString), options = options.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), search = js.Any.fromFunction1(search))
      __obj.asInstanceOf[Provider[TRequestResult, TRawResult]]
    }
    
    extension [Self <: Provider[?, ?], TRequestResult, TRawResult](x: Self & (Provider[TRequestResult, TRawResult])) {
      
      inline def setEndpoint(value: EndpointArgument => String): Self = StObject.set(x, "endpoint", js.Any.fromFunction1(value))
      
      inline def setGetParamString(value: ProviderParams => String): Self = StObject.set(x, "getParamString", js.Any.fromFunction1(value))
      
      inline def setOptions(value: ProviderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setParse(value: ParseArgument[TRequestResult] => js.Array[SearchResult[TRawResult]]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setSearch(value: SearchArgument => js.Promise[js.Array[SearchResult[TRawResult]]]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
    }
  }
  
  trait ProviderOptions extends StObject {
    
    var params: js.UndefOr[ProviderParams] = js.undefined
  }
  object ProviderOptions {
    
    inline def apply(): ProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProviderOptions]
    }
    
    extension [Self <: ProviderOptions](x: Self) {
      
      inline def setParams(value: ProviderParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  type ProviderParams = StringDictionary[String | Double | Boolean]
  
  trait SearchArgument extends StObject {
    
    var query: String
  }
  object SearchArgument {
    
    inline def apply(query: String): SearchArgument = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchArgument]
    }
    
    extension [Self <: SearchArgument](x: Self) {
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchResult[TRawResult] extends StObject {
    
    var bounds: BoundsTuple | Null
    
    var label: String
    
    var raw: TRawResult
    
    var x: Double
    
    var y: Double
  }
  object SearchResult {
    
    inline def apply[TRawResult](label: String, raw: TRawResult, x: Double, y: Double): SearchResult[TRawResult] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], bounds = null)
      __obj.asInstanceOf[SearchResult[TRawResult]]
    }
    
    extension [Self <: SearchResult[?], TRawResult](x: Self & SearchResult[TRawResult]) {
      
      inline def setBounds(value: BoundsTuple): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsNull: Self = StObject.set(x, "bounds", null)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: TRawResult): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
