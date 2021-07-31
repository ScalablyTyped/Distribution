package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocateIdsRequest extends StObject {
  
  /** Required. A list of keys with incomplete key paths for which to allocate IDs. No key may be reserved/read-only. */
  var keys: js.UndefOr[js.Array[Key]] = js.undefined
}
object AllocateIdsRequest {
  
  @scala.inline
  def apply(): AllocateIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateIdsRequest]
  }
  
  @scala.inline
  implicit class AllocateIdsRequestMutableBuilder[Self <: AllocateIdsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Array[Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: Key*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
