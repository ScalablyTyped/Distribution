package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAccount extends js.Object {
  
  /** The email address of the service account. */
  var accountEmail: js.UndefOr[String] = js.native
}
object EnterpriseAccount {
  
  @scala.inline
  def apply(): EnterpriseAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseAccount]
  }
  
  @scala.inline
  implicit class EnterpriseAccountOps[Self <: EnterpriseAccount] (val x: Self) extends AnyVal {
    
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
    def setAccountEmail(value: String): Self = this.set("accountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountEmail: Self = this.set("accountEmail", js.undefined)
  }
}
