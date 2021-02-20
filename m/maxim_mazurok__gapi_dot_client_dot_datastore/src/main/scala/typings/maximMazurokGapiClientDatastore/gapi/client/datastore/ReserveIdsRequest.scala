package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReserveIdsRequest extends StObject {
  
  /** If not empty, the ID of the database against which to make the request. */
  var databaseId: js.UndefOr[String] = js.native
  
  /** Required. A list of keys with complete key paths whose numeric IDs should not be auto-allocated. */
  var keys: js.UndefOr[js.Array[Key]] = js.native
}
object ReserveIdsRequest {
  
  @scala.inline
  def apply(): ReserveIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReserveIdsRequest]
  }
  
  @scala.inline
  implicit class ReserveIdsRequestMutableBuilder[Self <: ReserveIdsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
    
    @scala.inline
    def setKeys(value: js.Array[Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: Key*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
