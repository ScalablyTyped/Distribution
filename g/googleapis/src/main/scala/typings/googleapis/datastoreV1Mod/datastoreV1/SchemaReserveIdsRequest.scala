package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Datastore.ReserveIds.
  */
@js.native
trait SchemaReserveIdsRequest extends StObject {
  
  /**
    * If not empty, the ID of the database against which to make the request.
    */
  var databaseId: js.UndefOr[String] = js.native
  
  /**
    * A list of keys with complete key paths whose numeric IDs should not be
    * auto-allocated.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.native
}
object SchemaReserveIdsRequest {
  
  @scala.inline
  def apply(): SchemaReserveIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReserveIdsRequest]
  }
  
  @scala.inline
  implicit class SchemaReserveIdsRequestMutableBuilder[Self <: SchemaReserveIdsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
    
    @scala.inline
    def setKeys(value: js.Array[SchemaKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: SchemaKey*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
