package typings.gtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenOptions extends js.Object {
  var additionalClaims: js.UndefOr[js.Object] = js.native
  var email: js.UndefOr[String] = js.native
  var iss: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var keyFile: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String | js.Array[String]] = js.native
  var sub: js.UndefOr[String] = js.native
}

object TokenOptions {
  @scala.inline
  def apply(): TokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenOptions]
  }
  @scala.inline
  implicit class TokenOptionsOps[Self <: TokenOptions] (val x: Self) extends AnyVal {
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
    def setAdditionalClaims(value: js.Object): Self = this.set("additionalClaims", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalClaims: Self = this.set("additionalClaims", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setIss(value: String): Self = this.set("iss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIss: Self = this.set("iss", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeyFile(value: String): Self = this.set("keyFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyFile: Self = this.set("keyFile", js.undefined)
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    @scala.inline
    def setScope(value: String | js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSub(value: String): Self = this.set("sub", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSub: Self = this.set("sub", js.undefined)
  }
  
}

