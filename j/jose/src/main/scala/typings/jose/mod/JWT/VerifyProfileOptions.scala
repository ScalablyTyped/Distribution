package typings.jose.mod.JWT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyProfileOptions[profile] extends js.Object {
  var audience: String | js.Array[String] = js.native
  var issuer: String = js.native
  var profile: js.UndefOr[profile] = js.native
}

object VerifyProfileOptions {
  @scala.inline
  def apply[profile](audience: String | js.Array[String], issuer: String): VerifyProfileOptions[profile] = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyProfileOptions[profile]]
  }
  @scala.inline
  implicit class VerifyProfileOptionsOps[Self <: VerifyProfileOptions[_], profile] (val x: Self with VerifyProfileOptions[profile]) extends AnyVal {
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
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfile(value: profile): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
  }
  
}

