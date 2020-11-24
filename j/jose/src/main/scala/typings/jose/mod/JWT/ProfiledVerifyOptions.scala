package typings.jose.mod.JWT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfiledVerifyOptions extends js.Object {
  
  var audience: String | js.Array[String] = js.native
  
  var issuer: String | js.Array[String] = js.native
}
object ProfiledVerifyOptions {
  
  @scala.inline
  def apply(audience: String | js.Array[String], issuer: String | js.Array[String]): ProfiledVerifyOptions = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfiledVerifyOptions]
  }
  
  @scala.inline
  implicit class ProfiledVerifyOptionsOps[Self <: ProfiledVerifyOptions] (val x: Self) extends AnyVal {
    
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
    def setAudienceVarargs(value: String*): Self = this.set("audience", js.Array(value :_*))
    
    @scala.inline
    def setAudience(value: String | js.Array[String]): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerVarargs(value: String*): Self = this.set("issuer", js.Array(value :_*))
    
    @scala.inline
    def setIssuer(value: String | js.Array[String]): Self = this.set("issuer", value.asInstanceOf[js.Any])
  }
}
