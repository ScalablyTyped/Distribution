package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupResponse extends StObject {
  
  /** A list of keys that were not looked up due to resource constraints. The order of results in this field is undefined and has no relation to the order of the keys in the input. */
  var deferred: js.UndefOr[js.Array[Key]] = js.native
  
  /** Entities found as `ResultType.FULL` entities. The order of results in this field is undefined and has no relation to the order of the keys in the input. */
  var found: js.UndefOr[js.Array[EntityResult]] = js.native
  
  /** Entities not found as `ResultType.KEY_ONLY` entities. The order of results in this field is undefined and has no relation to the order of the keys in the input. */
  var missing: js.UndefOr[js.Array[EntityResult]] = js.native
}
object LookupResponse {
  
  @scala.inline
  def apply(): LookupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupResponse]
  }
  
  @scala.inline
  implicit class LookupResponseMutableBuilder[Self <: LookupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeferred(value: js.Array[Key]): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
    
    @scala.inline
    def setDeferredVarargs(value: Key*): Self = StObject.set(x, "deferred", js.Array(value :_*))
    
    @scala.inline
    def setFound(value: js.Array[EntityResult]): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoundUndefined: Self = StObject.set(x, "found", js.undefined)
    
    @scala.inline
    def setFoundVarargs(value: EntityResult*): Self = StObject.set(x, "found", js.Array(value :_*))
    
    @scala.inline
    def setMissing(value: js.Array[EntityResult]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    @scala.inline
    def setMissingVarargs(value: EntityResult*): Self = StObject.set(x, "missing", js.Array(value :_*))
  }
}
