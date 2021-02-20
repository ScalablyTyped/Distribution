package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Datastore.Lookup.
  */
@js.native
trait SchemaLookupRequest extends StObject {
  
  /**
    * Keys of entities to look up.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.native
  
  /**
    * The options for this lookup request.
    */
  var readOptions: js.UndefOr[SchemaReadOptions] = js.native
}
object SchemaLookupRequest {
  
  @scala.inline
  def apply(): SchemaLookupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupRequest]
  }
  
  @scala.inline
  implicit class SchemaLookupRequestMutableBuilder[Self <: SchemaLookupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Array[SchemaKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: SchemaKey*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setReadOptions(value: SchemaReadOptions): Self = StObject.set(x, "readOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOptionsUndefined: Self = StObject.set(x, "readOptions", js.undefined)
  }
}
