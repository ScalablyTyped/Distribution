package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHmacKeysMetadata extends StObject {
  
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[SchemaHmacKeyMetadata]] = js.undefined
  
  /**
    * The kind of item this is. For lists of hmacKeys, this is always storage#hmacKeysMetadata.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaHmacKeysMetadata {
  
  inline def apply(): SchemaHmacKeysMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHmacKeysMetadata]
  }
  
  extension [Self <: SchemaHmacKeysMetadata](x: Self) {
    
    inline def setItems(value: js.Array[SchemaHmacKeyMetadata]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaHmacKeyMetadata*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
