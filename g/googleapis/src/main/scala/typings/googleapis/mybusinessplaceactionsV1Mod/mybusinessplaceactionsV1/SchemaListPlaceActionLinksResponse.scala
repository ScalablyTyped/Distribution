package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPlaceActionLinksResponse extends StObject {
  
  /**
    * If there are more place action links than the requested page size, then this field is populated with a token to fetch the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The returned list of place action links.
    */
  var placeActionLinks: js.UndefOr[js.Array[SchemaPlaceActionLink]] = js.undefined
}
object SchemaListPlaceActionLinksResponse {
  
  inline def apply(): SchemaListPlaceActionLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPlaceActionLinksResponse]
  }
  
  extension [Self <: SchemaListPlaceActionLinksResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPlaceActionLinks(value: js.Array[SchemaPlaceActionLink]): Self = StObject.set(x, "placeActionLinks", value.asInstanceOf[js.Any])
    
    inline def setPlaceActionLinksUndefined: Self = StObject.set(x, "placeActionLinks", js.undefined)
    
    inline def setPlaceActionLinksVarargs(value: SchemaPlaceActionLink*): Self = StObject.set(x, "placeActionLinks", js.Array(value*))
  }
}
