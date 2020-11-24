package typings.ibmCloudSdkCore.baseServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credentials extends js.Object {
  
  var iam_access_token: js.UndefOr[String] = js.native
  
  var iam_apikey: js.UndefOr[String] = js.native
  
  var iam_url: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object Credentials {
  
  @scala.inline
  def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
    
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
    def setIam_access_token(value: String): Self = this.set("iam_access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIam_access_token: Self = this.set("iam_access_token", js.undefined)
    
    @scala.inline
    def setIam_apikey(value: String): Self = this.set("iam_apikey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIam_apikey: Self = this.set("iam_apikey", js.undefined)
    
    @scala.inline
    def setIam_url(value: String): Self = this.set("iam_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIam_url: Self = this.set("iam_url", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
