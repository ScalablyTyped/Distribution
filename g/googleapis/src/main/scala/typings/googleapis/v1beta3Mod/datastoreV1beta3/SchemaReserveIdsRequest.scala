package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Datastore.ReserveIds.
  */
@js.native
trait SchemaReserveIdsRequest extends js.Object {
  
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
  implicit class SchemaReserveIdsRequestOps[Self <: SchemaReserveIdsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatabaseId(value: String): Self = this.set("databaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseId: Self = this.set("databaseId", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: SchemaKey*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[SchemaKey]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
  }
}
