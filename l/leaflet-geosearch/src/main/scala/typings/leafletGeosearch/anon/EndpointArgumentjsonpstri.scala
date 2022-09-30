package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StringDictionary
import typings.leafletGeosearch.providerMod.RequestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined leaflet-geosearch.leaflet-geosearch/dist/providers/provider.EndpointArgument & {  jsonp :string} */
trait EndpointArgumentjsonpstri extends StObject {
  
  var jsonp: String
  
  var query: String | (StringDictionary[String | Double | Boolean])
  
  var `type`: js.UndefOr[RequestType] = js.undefined
}
object EndpointArgumentjsonpstri {
  
  inline def apply(jsonp: String, query: String | (StringDictionary[String | Double | Boolean])): EndpointArgumentjsonpstri = {
    val __obj = js.Dynamic.literal(jsonp = jsonp.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointArgumentjsonpstri]
  }
  
  extension [Self <: EndpointArgumentjsonpstri](x: Self) {
    
    inline def setJsonp(value: String): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String | (StringDictionary[String | Double | Boolean])): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setType(value: RequestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
