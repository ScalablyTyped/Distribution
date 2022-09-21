package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReserveIdsRequest extends StObject {
  
  /**
    * The ID of the database against which to make the request. '(default)' is not allowed; please use empty string '' to refer the default database.
    */
  var databaseId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A list of keys with complete key paths whose numeric IDs should not be auto-allocated.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.undefined
}
object SchemaReserveIdsRequest {
  
  inline def apply(): SchemaReserveIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReserveIdsRequest]
  }
  
  extension [Self <: SchemaReserveIdsRequest](x: Self) {
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdNull: Self = StObject.set(x, "databaseId", null)
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
    
    inline def setKeys(value: js.Array[SchemaKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: SchemaKey*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
