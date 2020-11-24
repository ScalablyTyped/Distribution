package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountTreeResponse extends js.Object {
  
  /** The account created. */
  var account: js.UndefOr[Account] = js.native
  
  /** Resource type for account ticket. */
  var kind: js.UndefOr[String] = js.native
  
  /** View (Profile) for the account. */
  var profile: js.UndefOr[Profile] = js.native
  
  /** Web property for the account. */
  var webproperty: js.UndefOr[Webproperty] = js.native
}
object AccountTreeResponse {
  
  @scala.inline
  def apply(): AccountTreeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountTreeResponse]
  }
  
  @scala.inline
  implicit class AccountTreeResponseOps[Self <: AccountTreeResponse] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: Account): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setProfile(value: Profile): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setWebproperty(value: Webproperty): Self = this.set("webproperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebproperty: Self = this.set("webproperty", js.undefined)
  }
}
