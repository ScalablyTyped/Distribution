package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupResponse extends js.Object {
  
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
  implicit class LookupResponseOps[Self <: LookupResponse] (val x: Self) extends AnyVal {
    
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
    def setDeferredVarargs(value: Key*): Self = this.set("deferred", js.Array(value :_*))
    
    @scala.inline
    def setDeferred(value: js.Array[Key]): Self = this.set("deferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferred: Self = this.set("deferred", js.undefined)
    
    @scala.inline
    def setFoundVarargs(value: EntityResult*): Self = this.set("found", js.Array(value :_*))
    
    @scala.inline
    def setFound(value: js.Array[EntityResult]): Self = this.set("found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFound: Self = this.set("found", js.undefined)
    
    @scala.inline
    def setMissingVarargs(value: EntityResult*): Self = this.set("missing", js.Array(value :_*))
    
    @scala.inline
    def setMissing(value: js.Array[EntityResult]): Self = this.set("missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissing: Self = this.set("missing", js.undefined)
  }
}
