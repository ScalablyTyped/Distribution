package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCategoryListResponse extends StObject {
  
  /**
    * The list of categories with usage data.
    */
  var items: js.UndefOr[js.Array[SchemaCategory]] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#categoryListResponse`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Token corresponding to the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaCategoryListResponse {
  
  inline def apply(): SchemaCategoryListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCategoryListResponse]
  }
  
  extension [Self <: SchemaCategoryListResponse](x: Self) {
    
    inline def setItems(value: js.Array[SchemaCategory]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaCategory*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
