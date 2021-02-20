package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Datastore.AllocateIds.
  */
@js.native
trait SchemaAllocateIdsRequest extends StObject {
  
  /**
    * A list of keys with incomplete key paths for which to allocate IDs. No
    * key may be reserved/read-only.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.native
}
object SchemaAllocateIdsRequest {
  
  @scala.inline
  def apply(): SchemaAllocateIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocateIdsRequest]
  }
  
  @scala.inline
  implicit class SchemaAllocateIdsRequestMutableBuilder[Self <: SchemaAllocateIdsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Array[SchemaKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: SchemaKey*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
