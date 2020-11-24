package typings.instagramPrivateApi.accountTwoFactorLoginOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountTwoFactorLoginOptions extends js.Object {
  
  var trustThisDevice: js.UndefOr[`1` | `0`] = js.native
  
  var twoFactorIdentifier: String = js.native
  
  var username: String = js.native
  
  var verificationCode: String = js.native
  
  var verificationMethod: js.UndefOr[String] = js.native
}
object AccountTwoFactorLoginOptions {
  
  @scala.inline
  def apply(twoFactorIdentifier: String, username: String, verificationCode: String): AccountTwoFactorLoginOptions = {
    val __obj = js.Dynamic.literal(twoFactorIdentifier = twoFactorIdentifier.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountTwoFactorLoginOptions]
  }
  
  @scala.inline
  implicit class AccountTwoFactorLoginOptionsOps[Self <: AccountTwoFactorLoginOptions] (val x: Self) extends AnyVal {
    
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
    def setTwoFactorIdentifier(value: String): Self = this.set("twoFactorIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationCode(value: String): Self = this.set("verificationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustThisDevice(value: `1` | `0`): Self = this.set("trustThisDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustThisDevice: Self = this.set("trustThisDevice", js.undefined)
    
    @scala.inline
    def setVerificationMethod(value: String): Self = this.set("verificationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationMethod: Self = this.set("verificationMethod", js.undefined)
  }
}
