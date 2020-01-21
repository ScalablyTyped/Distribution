package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Accounts to search
  */
@js.native
trait SchemaHangoutsChatInfo extends js.Object {
  /**
    * A set of rooms to search.
    */
  var roomId: js.UndefOr[js.Array[String]] = js.native
}

object SchemaHangoutsChatInfo {
  @scala.inline
  def apply(roomId: js.Array[String] = null): SchemaHangoutsChatInfo = {
    val __obj = js.Dynamic.literal()
    if (roomId != null) __obj.updateDynamic("roomId")(roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHangoutsChatInfo]
  }
}

