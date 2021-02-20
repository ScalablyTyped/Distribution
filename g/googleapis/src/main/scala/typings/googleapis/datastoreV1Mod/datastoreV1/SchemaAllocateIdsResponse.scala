package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for Datastore.AllocateIds.
  */
@js.native
trait SchemaAllocateIdsResponse extends StObject {
  
  /**
    * The keys specified in the request (in the same order), each with its key
    * path completed with a newly allocated ID.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.native
}
object SchemaAllocateIdsResponse {
  
  @scala.inline
  def apply(): SchemaAllocateIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocateIdsResponse]
  }
  
  @scala.inline
  implicit class SchemaAllocateIdsResponseMutableBuilder[Self <: SchemaAllocateIdsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Array[SchemaKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: SchemaKey*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
