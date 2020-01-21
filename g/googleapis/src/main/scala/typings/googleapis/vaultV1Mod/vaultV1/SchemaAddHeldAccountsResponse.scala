package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for batch create held accounts.
  */
@js.native
trait SchemaAddHeldAccountsResponse extends js.Object {
  /**
    * The list of responses, in the same order as the batch request.
    */
  var responses: js.UndefOr[js.Array[SchemaAddHeldAccountResult]] = js.native
}

object SchemaAddHeldAccountsResponse {
  @scala.inline
  def apply(responses: js.Array[SchemaAddHeldAccountResult] = null): SchemaAddHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddHeldAccountsResponse]
  }
}

