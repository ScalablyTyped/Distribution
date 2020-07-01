package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hangouts chat search advanced options
  */
@js.native
trait SchemaHangoutsChatOptions extends js.Object {
  /**
    * Set to true to include rooms.
    */
  var includeRooms: js.UndefOr[Boolean] = js.native
}

object SchemaHangoutsChatOptions {
  @scala.inline
  def apply(includeRooms: js.UndefOr[Boolean] = js.undefined): SchemaHangoutsChatOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeRooms)) __obj.updateDynamic("includeRooms")(includeRooms.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHangoutsChatOptions]
  }
}

