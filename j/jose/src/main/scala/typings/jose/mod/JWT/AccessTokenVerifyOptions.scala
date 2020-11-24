package typings.jose.mod.JWT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessTokenVerifyOptions extends ProfiledVerifyOptions {
  
  var maxAuthAge: js.UndefOr[String] = js.native
}
object AccessTokenVerifyOptions {
  
  @scala.inline
  def apply(audience: String | js.Array[String], issuer: String | js.Array[String]): AccessTokenVerifyOptions = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenVerifyOptions]
  }
  
  @scala.inline
  implicit class AccessTokenVerifyOptionsOps[Self <: AccessTokenVerifyOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxAuthAge(value: String): Self = this.set("maxAuthAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAuthAge: Self = this.set("maxAuthAge", js.undefined)
  }
}
