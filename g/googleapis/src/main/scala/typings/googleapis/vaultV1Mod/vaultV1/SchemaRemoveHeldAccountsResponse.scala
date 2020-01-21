package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for batch delete held accounts.
  */
@js.native
trait SchemaRemoveHeldAccountsResponse extends js.Object {
  /**
    * A list of statuses for deleted accounts. Results have the same order as
    * the request.
    */
  var statuses: js.UndefOr[js.Array[SchemaStatus]] = js.native
}

object SchemaRemoveHeldAccountsResponse {
  @scala.inline
  def apply(statuses: js.Array[SchemaStatus] = null): SchemaRemoveHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRemoveHeldAccountsResponse]
  }
}

