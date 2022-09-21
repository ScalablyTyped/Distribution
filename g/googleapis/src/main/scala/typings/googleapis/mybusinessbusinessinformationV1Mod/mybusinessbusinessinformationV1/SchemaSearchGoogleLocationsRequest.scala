package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchGoogleLocationsRequest extends StObject {
  
  /**
    * Location to search for. If provided, will find locations which match the provided location details.
    */
  var location: js.UndefOr[SchemaLocation] = js.undefined
  
  /**
    * The number of matches to return. The default value is 3, with a maximum of 10. Note that latency may increase if more are requested. There is no pagination.
    */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Text query to search for. The search results from a query string will be less accurate than if providing an exact location, but can provide more inexact matches.
    */
  var query: js.UndefOr[String | Null] = js.undefined
}
object SchemaSearchGoogleLocationsRequest {
  
  inline def apply(): SchemaSearchGoogleLocationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchGoogleLocationsRequest]
  }
  
  extension [Self <: SchemaSearchGoogleLocationsRequest](x: Self) {
    
    inline def setLocation(value: SchemaLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
