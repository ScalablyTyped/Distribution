package typings.jose.mod.JWT

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignOptions extends js.Object {
  
  var algorithm: js.UndefOr[String] = js.native
  
  var audience: js.UndefOr[String | js.Array[String]] = js.native
  
  var expiresIn: js.UndefOr[String] = js.native
  
  var header: js.UndefOr[js.Object] = js.native
  
  var iat: js.UndefOr[Boolean] = js.native
  
  var issuer: js.UndefOr[String] = js.native
  
  var jti: js.UndefOr[String] = js.native
  
  var kid: js.UndefOr[Boolean] = js.native
  
  var notBefore: js.UndefOr[String] = js.native
  
  var now: js.UndefOr[Date] = js.native
  
  var subject: js.UndefOr[String] = js.native
}
object SignOptions {
  
  @scala.inline
  def apply(): SignOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignOptions]
  }
  
  @scala.inline
  implicit class SignOptionsOps[Self <: SignOptions] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setAudienceVarargs(value: String*): Self = this.set("audience", js.Array(value :_*))
    
    @scala.inline
    def setAudience(value: String | js.Array[String]): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setExpiresIn(value: String): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setIat(value: Boolean): Self = this.set("iat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIat: Self = this.set("iat", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    
    @scala.inline
    def setJti(value: String): Self = this.set("jti", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJti: Self = this.set("jti", js.undefined)
    
    @scala.inline
    def setKid(value: Boolean): Self = this.set("kid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKid: Self = this.set("kid", js.undefined)
    
    @scala.inline
    def setNotBefore(value: String): Self = this.set("notBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotBefore: Self = this.set("notBefore", js.undefined)
    
    @scala.inline
    def setNow(value: Date): Self = this.set("now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNow: Self = this.set("now", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
