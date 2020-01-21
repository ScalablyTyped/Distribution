package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGmbAccountsGmbAccount extends js.Object {
  /**
    * The email which identifies the GMB account.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Number of listings under this account.
    */
  var listingCount: js.UndefOr[String] = js.native
  /**
    * The name of the GMB account.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the GMB account (User or Business).
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGmbAccountsGmbAccount {
  @scala.inline
  def apply(email: String = null, listingCount: String = null, name: String = null, `type`: String = null): SchemaGmbAccountsGmbAccount = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (listingCount != null) __obj.updateDynamic("listingCount")(listingCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGmbAccountsGmbAccount]
  }
}

