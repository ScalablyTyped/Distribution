package typings.httpAuth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicOptions extends js.Object {
  
  /**
    * Content type for failed authentication page.
    * @default 'text/plain'
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * File where user details are stored.
    * - Line format is {user:pass} or {user:passHash} for basic access.
    * - Line format is {user:realm:passHash} for digest access.
    */
  var file: js.UndefOr[String] = js.native
  
  /**
    * Message for failed authentication 401 page.
    * @default '401 Unauthorized'
    */
  var msg401: js.UndefOr[String] = js.native
  
  /**
    * Message for failed authentication 407 page.
    * @default '407 Proxy authentication required
    */
  var msg407: js.UndefOr[String] = js.native
  
  /**
    * Set this to true, if you want to use it with http-proxy (https://github.com/http-party/node-http-proxy).
    * @default false
    */
  var proxy: js.UndefOr[Boolean] = js.native
  
  /**
    * Authentication realm, by default it is 'users'.
    * @default 'users'
    */
  var realm: js.UndefOr[String] = js.native
  
  /**
    * Set this to true, if you don't want req.user to be filled with authentication info.
    */
  var skipUser: js.UndefOr[Boolean] = js.native
}
object BasicOptions {
  
  @scala.inline
  def apply(): BasicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicOptions]
  }
  
  @scala.inline
  implicit class BasicOptionsOps[Self <: BasicOptions] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setMsg401(value: String): Self = this.set("msg401", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsg401: Self = this.set("msg401", js.undefined)
    
    @scala.inline
    def setMsg407(value: String): Self = this.set("msg407", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsg407: Self = this.set("msg407", js.undefined)
    
    @scala.inline
    def setProxy(value: Boolean): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealm: Self = this.set("realm", js.undefined)
    
    @scala.inline
    def setSkipUser(value: Boolean): Self = this.set("skipUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipUser: Self = this.set("skipUser", js.undefined)
  }
}
