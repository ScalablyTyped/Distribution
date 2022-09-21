package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLookupRequest extends StObject {
  
  /**
    * The ID of the database against which to make the request. '(default)' is not allowed; please use empty string '' to refer the default database.
    */
  var databaseId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Keys of entities to look up.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.undefined
  
  /**
    * The options for this lookup request.
    */
  var readOptions: js.UndefOr[SchemaReadOptions] = js.undefined
}
object SchemaLookupRequest {
  
  inline def apply(): SchemaLookupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupRequest]
  }
  
  extension [Self <: SchemaLookupRequest](x: Self) {
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdNull: Self = StObject.set(x, "databaseId", null)
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
    
    inline def setKeys(value: js.Array[SchemaKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: SchemaKey*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setReadOptions(value: SchemaReadOptions): Self = StObject.set(x, "readOptions", value.asInstanceOf[js.Any])
    
    inline def setReadOptionsUndefined: Self = StObject.set(x, "readOptions", js.undefined)
  }
}
