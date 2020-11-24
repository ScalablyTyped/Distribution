package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckConsistencyResponse extends js.Object {
  
  /** True only if the token is consistent. A token is consistent if replication has caught up with the restrictions specified in the request. */
  var consistent: js.UndefOr[Boolean] = js.native
}
object CheckConsistencyResponse {
  
  @scala.inline
  def apply(): CheckConsistencyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckConsistencyResponse]
  }
  
  @scala.inline
  implicit class CheckConsistencyResponseOps[Self <: CheckConsistencyResponse] (val x: Self) extends AnyVal {
    
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
    def setConsistent(value: Boolean): Self = this.set("consistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsistent: Self = this.set("consistent", js.undefined)
  }
}
