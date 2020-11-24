package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckValidCredsResponse extends js.Object {
  
  /** If set to `true`, the credentials exist and are valid. */
  var hasValidCreds: js.UndefOr[Boolean] = js.native
}
object CheckValidCredsResponse {
  
  @scala.inline
  def apply(): CheckValidCredsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckValidCredsResponse]
  }
  
  @scala.inline
  implicit class CheckValidCredsResponseOps[Self <: CheckValidCredsResponse] (val x: Self) extends AnyVal {
    
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
    def setHasValidCreds(value: Boolean): Self = this.set("hasValidCreds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasValidCreds: Self = this.set("hasValidCreds", js.undefined)
  }
}
