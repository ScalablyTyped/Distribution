package typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddPublicKeyResponse extends js.Object {
  
  /** Key that was added to the environment. */
  var key: js.UndefOr[String] = js.native
}
object AddPublicKeyResponse {
  
  @scala.inline
  def apply(): AddPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddPublicKeyResponse]
  }
  
  @scala.inline
  implicit class AddPublicKeyResponseOps[Self <: AddPublicKeyResponse] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
