package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupRequest extends js.Object {
  
  /** Required. Keys of entities to look up. */
  var keys: js.UndefOr[js.Array[Key]] = js.native
  
  /** The options for this lookup request. */
  var readOptions: js.UndefOr[ReadOptions] = js.native
}
object LookupRequest {
  
  @scala.inline
  def apply(): LookupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupRequest]
  }
  
  @scala.inline
  implicit class LookupRequestOps[Self <: LookupRequest] (val x: Self) extends AnyVal {
    
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
    def setKeysVarargs(value: Key*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[Key]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    
    @scala.inline
    def setReadOptions(value: ReadOptions): Self = this.set("readOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOptions: Self = this.set("readOptions", js.undefined)
  }
}
