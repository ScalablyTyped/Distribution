package typings.loginWithAmazonSdkBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains profile information.
  */
/* Inlined std.Partial<{  CustomerId :string,   Name :string,   PostalCode :string,   PrimaryEmail :string}> */
@js.native
trait UserProfile extends js.Object {
  
  var CustomerId: js.UndefOr[String] = js.native
  
  var Name: js.UndefOr[String] = js.native
  
  var PostalCode: js.UndefOr[String] = js.native
  
  var PrimaryEmail: js.UndefOr[String] = js.native
}
object UserProfile {
  
  @scala.inline
  def apply(): UserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserProfile]
  }
  
  @scala.inline
  implicit class UserProfileOps[Self <: UserProfile] (val x: Self) extends AnyVal {
    
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
    def setCustomerId(value: String): Self = this.set("CustomerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("CustomerId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("PostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("PostalCode", js.undefined)
    
    @scala.inline
    def setPrimaryEmail(value: String): Self = this.set("PrimaryEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryEmail: Self = this.set("PrimaryEmail", js.undefined)
  }
}
