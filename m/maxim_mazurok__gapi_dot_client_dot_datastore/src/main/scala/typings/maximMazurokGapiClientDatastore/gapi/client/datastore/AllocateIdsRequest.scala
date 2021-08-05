package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocateIdsRequest extends StObject {
  
  /** Required. A list of keys with incomplete key paths for which to allocate IDs. No key may be reserved/read-only. */
  var keys: js.UndefOr[js.Array[Key]] = js.undefined
}
object AllocateIdsRequest {
  
  inline def apply(): AllocateIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateIdsRequest]
  }
  
  extension [Self <: AllocateIdsRequest](x: Self) {
    
    inline def setKeys(value: js.Array[Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: Key*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
