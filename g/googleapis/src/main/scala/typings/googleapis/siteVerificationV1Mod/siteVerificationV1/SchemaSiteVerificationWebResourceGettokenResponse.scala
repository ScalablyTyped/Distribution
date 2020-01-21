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
  def apply(method: String = null, token: String = null): SchemaSiteVerificationWebResourceGettokenResponse = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSiteVerificationWebResourceGettokenResponse]
  }
}

