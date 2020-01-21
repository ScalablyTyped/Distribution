package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Accounts to search
  */
@js.native
trait SchemaAccountInfo extends js.Object {
  /**
    * A set of accounts to search.
    */
  var emails: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAccountInfo {
  @scala.inline
  def apply(emails: js.Array[String] = null): SchemaAccountInfo = {
    val __obj = js.Dynamic.literal()
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountInfo]
  }
}

