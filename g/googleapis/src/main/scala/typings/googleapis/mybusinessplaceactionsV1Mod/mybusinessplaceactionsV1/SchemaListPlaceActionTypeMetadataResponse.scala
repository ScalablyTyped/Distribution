package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPlaceActionTypeMetadataResponse extends StObject {
  
  /**
    * If the number of action types exceeded the requested page size, this field will be populated with a token to fetch the next page on a subsequent call to `placeActionTypeMetadata.list`. If there are no more results, this field will not be present in the response.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A collection of metadata for the available place action types.
    */
  var placeActionTypeMetadata: js.UndefOr[js.Array[SchemaPlaceActionTypeMetadata]] = js.undefined
}
object SchemaListPlaceActionTypeMetadataResponse {
  
  inline def apply(): SchemaListPlaceActionTypeMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPlaceActionTypeMetadataResponse]
  }
  
  extension [Self <: SchemaListPlaceActionTypeMetadataResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPlaceActionTypeMetadata(value: js.Array[SchemaPlaceActionTypeMetadata]): Self = StObject.set(x, "placeActionTypeMetadata", value.asInstanceOf[js.Any])
    
    inline def setPlaceActionTypeMetadataUndefined: Self = StObject.set(x, "placeActionTypeMetadata", js.undefined)
    
    inline def setPlaceActionTypeMetadataVarargs(value: SchemaPlaceActionTypeMetadata*): Self = StObject.set(x, "placeActionTypeMetadata", js.Array(value*))
  }
}
