package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics account tree requests. The account tree
  * request is used in the provisioning api to create an account, property, and
  * view (profile). It contains the basic information required to make these
  * fields.
  */
@js.native
trait SchemaAccountTreeRequest extends js.Object {
  var accountName: js.UndefOr[String] = js.native
  /**
    * Resource type for account ticket.
    */
  var kind: js.UndefOr[String] = js.native
  var profileName: js.UndefOr[String] = js.native
  var timezone: js.UndefOr[String] = js.native
  var webpropertyName: js.UndefOr[String] = js.native
  var websiteUrl: js.UndefOr[String] = js.native
}

object SchemaAccountTreeRequest {
  @scala.inline
  def apply(
    accountName: String = null,
    kind: String = null,
    profileName: String = null,
    timezone: String = null,
    webpropertyName: String = null,
    websiteUrl: String = null
  ): SchemaAccountTreeRequest = {
    val __obj = js.Dynamic.literal()
    if (accountName != null) __obj.updateDynamic("accountName")(accountName.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (profileName != null) __obj.updateDynamic("profileName")(profileName.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (webpropertyName != null) __obj.updateDynamic("webpropertyName")(webpropertyName.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountTreeRequest]
  }
}

