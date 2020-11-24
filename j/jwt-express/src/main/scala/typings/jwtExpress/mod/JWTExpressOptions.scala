package typings.jwtExpress.mod

import typings.express.mod.CookieOptions
import typings.jsonwebtoken.mod.SignOptions
import typings.jsonwebtoken.mod.VerifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWTExpressOptions extends js.Object {
  
  /**
    * The name of the cookie (default: 'jwt-express')
    */
  var cookie: js.UndefOr[String] = js.native
  
  /**
    * Options to use when storing the cookie (default: {httpOnly: true})
    */
  var cookieOptions: js.UndefOr[CookieOptions] = js.native
  
  /**
    * If true, will use cookies, otherwise will use the Authorization header (default: true)
    */
  var cookies: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the JWT should be refreshed and stored every request (default: true)
    */
  var refresh: js.UndefOr[Boolean] = js.native
  
  /**
    * The property of req to populate (default: 'jwt')
    */
  var reqProperty: js.UndefOr[String] = js.native
  
  /**
    * jwt.revoke() will call this function (default: function(jwt) {})
    */
  var revoke: js.UndefOr[js.Function1[/* jwt */ JWT, Unit]] = js.native
  
  /**
    * Options to use when signing the JWT (default: {})
    */
  var signOptions: js.UndefOr[SignOptions] = js.native
  
  /**
    * Milliseconds when the jwt will go stale (default: 900000 (15 minutes))
    */
  var stales: js.UndefOr[Double] = js.native
  
  /**
    * Additional verification. Must return a boolean (default: function(jwt) {return true})
    */
  var verify: js.UndefOr[js.Function1[/* jwt */ JWT, Boolean]] = js.native
  
  /**
    * Options to use when verifying the JWT (default: {})
    */
  var verifyOptions: js.UndefOr[VerifyOptions] = js.native
}
object JWTExpressOptions {
  
  @scala.inline
  def apply(): JWTExpressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JWTExpressOptions]
  }
  
  @scala.inline
  implicit class JWTExpressOptionsOps[Self <: JWTExpressOptions] (val x: Self) extends AnyVal {
    
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
    def setCookie(value: String): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setCookieOptions(value: CookieOptions): Self = this.set("cookieOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieOptions: Self = this.set("cookieOptions", js.undefined)
    
    @scala.inline
    def setCookies(value: Boolean): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    
    @scala.inline
    def setRefresh(value: Boolean): Self = this.set("refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    
    @scala.inline
    def setReqProperty(value: String): Self = this.set("reqProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReqProperty: Self = this.set("reqProperty", js.undefined)
    
    @scala.inline
    def setRevoke(value: /* jwt */ JWT => Unit): Self = this.set("revoke", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRevoke: Self = this.set("revoke", js.undefined)
    
    @scala.inline
    def setSignOptions(value: SignOptions): Self = this.set("signOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignOptions: Self = this.set("signOptions", js.undefined)
    
    @scala.inline
    def setStales(value: Double): Self = this.set("stales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStales: Self = this.set("stales", js.undefined)
    
    @scala.inline
    def setVerify(value: /* jwt */ JWT => Boolean): Self = this.set("verify", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteVerify: Self = this.set("verify", js.undefined)
    
    @scala.inline
    def setVerifyOptions(value: VerifyOptions): Self = this.set("verifyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifyOptions: Self = this.set("verifyOptions", js.undefined)
  }
}
