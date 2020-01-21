package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The holds for a matter.
  */
@js.native
trait SchemaListHoldsResponse extends js.Object {
  /**
    * The list of holds.
    */
  var holds: js.UndefOr[js.Array[SchemaHold]] = js.native
  /**
    * Page token to retrieve the next page of results in the list. If this is
    * empty, then there are no more holds to list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListHoldsResponse {
  @scala.inline
  def apply(holds: js.Array[SchemaHold] = null, nextPageToken: String = null): SchemaListHoldsResponse = {
    val __obj = js.Dynamic.literal()
    if (holds != null) __obj.updateDynamic("holds")(holds.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListHoldsResponse]
  }
}

