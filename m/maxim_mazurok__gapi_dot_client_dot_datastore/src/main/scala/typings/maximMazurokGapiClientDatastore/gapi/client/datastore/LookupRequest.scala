package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupRequest extends StObject {
  
  /** Required. Keys of entities to look up. */
  var keys: js.UndefOr[js.Array[Key]] = js.undefined
  
  /** The options for this lookup request. */
  var readOptions: js.UndefOr[ReadOptions] = js.undefined
}
object LookupRequest {
  
  @scala.inline
  def apply(): LookupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupRequest]
  }
  
  @scala.inline
  implicit class LookupRequestMutableBuilder[Self <: LookupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Array[Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: Key*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setReadOptions(value: ReadOptions): Self = StObject.set(x, "readOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOptionsUndefined: Self = StObject.set(x, "readOptions", js.undefined)
  }
}
