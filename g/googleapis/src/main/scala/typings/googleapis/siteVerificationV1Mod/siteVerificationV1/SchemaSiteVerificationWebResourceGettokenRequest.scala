package typings.googleapis.siteVerificationV1Mod.siteVerificationV1

import typings.googleapis.AnonIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSiteVerificationWebResourceGettokenRequest extends js.Object {
  /**
    * The site for which a verification token will be generated.
    */
  var site: js.UndefOr[AnonIdentifier] = js.native
  /**
    * The verification method that will be used to verify this site. For sites,
    * &#39;FILE&#39; or &#39;META&#39; methods may be used. For domains, only
    * &#39;DNS&#39; may be used.
    */
  var verificationMethod: js.UndefOr[String] = js.native
}

object SchemaSiteVerificationWebResourceGettokenRequest {
  @scala.inline
  def apply(site: AnonIdentifier = null, verificationMethod: String = null): SchemaSiteVerificationWebResourceGettokenRequest = {
    val __obj = js.Dynamic.literal()
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    if (verificationMethod != null) __obj.updateDynamic("verificationMethod")(verificationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSiteVerificationWebResourceGettokenRequest]
  }
}

