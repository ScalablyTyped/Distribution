package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ListLakesResponse extends StObject {
  
  /**
    * Lakes under the given parent location.
    */
  var lakes: js.UndefOr[js.Array[SchemaGoogleCloudDataplexV1Lake]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachableLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ListLakesResponse {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ListLakesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ListLakesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ListLakesResponse](x: Self) {
    
    inline def setLakes(value: js.Array[SchemaGoogleCloudDataplexV1Lake]): Self = StObject.set(x, "lakes", value.asInstanceOf[js.Any])
    
    inline def setLakesUndefined: Self = StObject.set(x, "lakes", js.undefined)
    
    inline def setLakesVarargs(value: SchemaGoogleCloudDataplexV1Lake*): Self = StObject.set(x, "lakes", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachableLocations(value: js.Array[String]): Self = StObject.set(x, "unreachableLocations", value.asInstanceOf[js.Any])
    
    inline def setUnreachableLocationsNull: Self = StObject.set(x, "unreachableLocations", null)
    
    inline def setUnreachableLocationsUndefined: Self = StObject.set(x, "unreachableLocations", js.undefined)
    
    inline def setUnreachableLocationsVarargs(value: String*): Self = StObject.set(x, "unreachableLocations", js.Array(value*))
  }
}
