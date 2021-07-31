package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocateIdsResponse extends StObject {
  
  /** The keys specified in the request (in the same order), each with its key path completed with a newly allocated ID. */
  var keys: js.UndefOr[js.Array[Key]] = js.undefined
}
object AllocateIdsResponse {
  
  @scala.inline
  def apply(): AllocateIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateIdsResponse]
  }
  
  @scala.inline
  implicit class AllocateIdsResponseMutableBuilder[Self <: AllocateIdsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Array[Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: Key*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
