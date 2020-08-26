package typings.googleapis.siteVerificationV1Mod.siteVerificationV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSiteVerificationWebResourceGettokenResponse extends js.Object {
  /**
    * The verification method to use in conjunction with this token. For FILE,
    * the token should be placed in the top-level directory of the site, stored
    * inside a file of the same name. For META, the token should be placed in
    * the HEAD tag of the default page that is loaded for the site. For DNS,
    * the token should be placed in a TXT record of the domain.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * The verification token. The token must be placed appropriately in order
    * for verification to succeed.
    */
  var token: js.UndefOr[String] = js.native
}

object SchemaSiteVerificationWebResourceGettokenResponse {
  @scala.inline
  def apply(): SchemaSiteVerificationWebResourceGettokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteVerificationWebResourceGettokenResponse]
  }
  @scala.inline
  implicit class SchemaSiteVerificationWebResourceGettokenResponseOps[Self <: SchemaSiteVerificationWebResourceGettokenResponse] (val x: Self) extends AnyVal {
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

