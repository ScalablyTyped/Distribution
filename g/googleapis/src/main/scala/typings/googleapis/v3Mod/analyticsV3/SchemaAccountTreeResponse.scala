package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics account tree response. The account tree
  * response is used in the provisioning api to return the result of creating
  * an account, property, and view (profile).
  */
@js.native
trait SchemaAccountTreeResponse extends js.Object {
  /**
    * The account created.
    */
  var account: js.UndefOr[SchemaAccount] = js.native
  /**
    * Resource type for account ticket.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * View (Profile) for the account.
    */
  var profile: js.UndefOr[SchemaProfile] = js.native
  /**
    * Web property for the account.
    */
  var webproperty: js.UndefOr[SchemaWebproperty] = js.native
}

object SchemaAccountTreeResponse {
  @scala.inline
  def apply(
    account: SchemaAccount = null,
    kind: String = null,
    profile: SchemaProfile = null,
    webproperty: SchemaWebproperty = null
  ): SchemaAccountTreeResponse = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (webproperty != null) __obj.updateDynamic("webproperty")(webproperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountTreeResponse]
  }
}

