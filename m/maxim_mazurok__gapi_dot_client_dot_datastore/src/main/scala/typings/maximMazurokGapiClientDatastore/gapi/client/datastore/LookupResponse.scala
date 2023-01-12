package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupResponse extends StObject {
  
  /** A list of keys that were not looked up due to resource constraints. The order of results in this field is undefined and has no relation to the order of the keys in the input. */
  var deferred: js.UndefOr[js.Array[Key]] = js.undefined
  
  /** Entities found as `ResultType.FULL` entities. The order of results in this field is undefined and has no relation to the order of the keys in the input. */
  var found: js.UndefOr[js.Array[EntityResult]] = js.undefined
  
  /** Entities not found as `ResultType.KEY_ONLY` entities. The order of results in this field is undefined and has no relation to the order of the keys in the input. */
  var missing: js.UndefOr[js.Array[EntityResult]] = js.undefined
  
  /** The time at which these entities were read or found missing. */
  var readTime: js.UndefOr[String] = js.undefined
}
object LookupResponse {
  
  inline def apply(): LookupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LookupResponse] (val x: Self) extends AnyVal {
    
    inline def setDeferred(value: js.Array[Key]): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    inline def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
    
    inline def setDeferredVarargs(value: Key*): Self = StObject.set(x, "deferred", js.Array(value*))
    
    inline def setFound(value: js.Array[EntityResult]): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setFoundUndefined: Self = StObject.set(x, "found", js.undefined)
    
    inline def setFoundVarargs(value: EntityResult*): Self = StObject.set(x, "found", js.Array(value*))
    
    inline def setMissing(value: js.Array[EntityResult]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setMissingVarargs(value: EntityResult*): Self = StObject.set(x, "missing", js.Array(value*))
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
  }
}
