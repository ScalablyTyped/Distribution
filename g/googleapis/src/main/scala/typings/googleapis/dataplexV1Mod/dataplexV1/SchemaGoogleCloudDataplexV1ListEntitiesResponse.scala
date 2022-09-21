package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ListEntitiesResponse extends StObject {
  
  /**
    * Entities in the specified parent zone.
    */
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDataplexV1Entity]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no remaining results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ListEntitiesResponse {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ListEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ListEntitiesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ListEntitiesResponse](x: Self) {
    
    inline def setEntities(value: js.Array[SchemaGoogleCloudDataplexV1Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: SchemaGoogleCloudDataplexV1Entity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
