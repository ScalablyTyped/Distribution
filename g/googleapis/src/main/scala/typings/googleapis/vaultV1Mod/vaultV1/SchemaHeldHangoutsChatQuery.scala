package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Query options for hangouts chat holds.
  */
@js.native
trait SchemaHeldHangoutsChatQuery extends js.Object {
  /**
    * If true, include rooms the user has participated in.
    */
  var includeRooms: js.UndefOr[Boolean] = js.native
}

object SchemaHeldHangoutsChatQuery {
  @scala.inline
  def apply(includeRooms: js.UndefOr[Boolean] = js.undefined): SchemaHeldHangoutsChatQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeRooms)) __obj.updateDynamic("includeRooms")(includeRooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHeldHangoutsChatQuery]
  }
}

