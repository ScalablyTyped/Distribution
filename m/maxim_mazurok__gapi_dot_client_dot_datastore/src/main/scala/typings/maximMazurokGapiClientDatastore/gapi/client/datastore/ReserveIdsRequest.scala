package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReserveIdsRequest extends StObject {
  
  /** The ID of the database against which to make the request. '(default)' is not allowed; please use empty string '' to refer the default database. */
  var databaseId: js.UndefOr[String] = js.undefined
  
  /** Required. A list of keys with complete key paths whose numeric IDs should not be auto-allocated. */
  var keys: js.UndefOr[js.Array[Key]] = js.undefined
}
object ReserveIdsRequest {
  
  inline def apply(): ReserveIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReserveIdsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReserveIdsRequest] (val x: Self) extends AnyVal {
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
    
    inline def setKeys(value: js.Array[Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: Key*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
