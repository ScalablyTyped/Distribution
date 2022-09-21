package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSnapshotListResponse extends StObject {
  
  /**
    * The snapshots.
    */
  var items: js.UndefOr[js.Array[SchemaSnapshot]] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#snapshotListResponse`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Token corresponding to the next page of results. If there are no more results, the token is omitted.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaSnapshotListResponse {
  
  inline def apply(): SchemaSnapshotListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshotListResponse]
  }
  
  extension [Self <: SchemaSnapshotListResponse](x: Self) {
    
    inline def setItems(value: js.Array[SchemaSnapshot]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaSnapshot*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
