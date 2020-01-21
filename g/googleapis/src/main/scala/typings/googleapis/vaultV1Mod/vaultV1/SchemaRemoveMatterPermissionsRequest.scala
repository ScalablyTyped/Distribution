package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remove an account as a matter collaborator.
  */
@js.native
trait SchemaRemoveMatterPermissionsRequest extends js.Object {
  /**
    * The account ID.
    */
  var accountId: js.UndefOr[String] = js.native
}

object SchemaRemoveMatterPermissionsRequest {
  @scala.inline
  def apply(accountId: String = null): SchemaRemoveMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRemoveMatterPermissionsRequest]
  }
}

