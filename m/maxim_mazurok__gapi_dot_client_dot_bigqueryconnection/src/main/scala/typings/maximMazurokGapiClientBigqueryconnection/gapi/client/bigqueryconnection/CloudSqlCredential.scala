package typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudSqlCredential extends js.Object {
  
  /** The password for the credential. */
  var password: js.UndefOr[String] = js.native
  
  /** The username for the credential. */
  var username: js.UndefOr[String] = js.native
}
object CloudSqlCredential {
  
  @scala.inline
  def apply(): CloudSqlCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudSqlCredential]
  }
  
  @scala.inline
  implicit class CloudSqlCredentialOps[Self <: CloudSqlCredential] (val x: Self) extends AnyVal {
    
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
