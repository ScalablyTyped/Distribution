package typings.maximMazurokGapiClientAnalytics.anon

import typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.ProfileRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountRef extends js.Object {
  
  /** Account for this link. */
  var accountRef: js.UndefOr[typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.AccountRef] = js.native
  
  /** View (Profile) for this link. */
  var profileRef: js.UndefOr[ProfileRef] = js.native
  
  /** Web property for this link. */
  var webPropertyRef: js.UndefOr[typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.WebPropertyRef] = js.native
}
object AccountRef {
  
  @scala.inline
  def apply(): AccountRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountRef]
  }
  
  @scala.inline
  implicit class AccountRefOps[Self <: AccountRef] (val x: Self) extends AnyVal {
    
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
    def setAccountRef(value: typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.AccountRef): Self = this.set("accountRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountRef: Self = this.set("accountRef", js.undefined)
    
    @scala.inline
    def setProfileRef(value: ProfileRef): Self = this.set("profileRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileRef: Self = this.set("profileRef", js.undefined)
    
    @scala.inline
    def setWebPropertyRef(value: typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.WebPropertyRef): Self = this.set("webPropertyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPropertyRef: Self = this.set("webPropertyRef", js.undefined)
  }
}
