package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObjects extends StObject {
  
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[SchemaObject]] = js.undefined
  
  /**
    * The kind of item this is. For lists of objects, this is always storage#objects.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of prefixes of objects matching-but-not-listed up to and including the requested delimiter.
    */
  var prefixes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaObjects {
  
  inline def apply(): SchemaObjects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjects]
  }
  
  extension [Self <: SchemaObjects](x: Self) {
    
    inline def setItems(value: js.Array[SchemaObject]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaObject*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPrefixes(value: js.Array[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    inline def setPrefixesNull: Self = StObject.set(x, "prefixes", null)
    
    inline def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
    
    inline def setPrefixesVarargs(value: String*): Self = StObject.set(x, "prefixes", js.Array(value*))
  }
}
