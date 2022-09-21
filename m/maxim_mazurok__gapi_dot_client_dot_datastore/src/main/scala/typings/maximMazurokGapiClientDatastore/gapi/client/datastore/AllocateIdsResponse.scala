package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocateIdsResponse extends StObject {
  
  /** The keys specified in the request (in the same order), each with its key path completed with a newly allocated ID. */
  var keys: js.UndefOr[js.Array[Key]] = js.undefined
}
object AllocateIdsResponse {
  
  inline def apply(): AllocateIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateIdsResponse]
  }
  
  extension [Self <: AllocateIdsResponse](x: Self) {
    
    inline def setKeys(value: js.Array[Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: Key*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
