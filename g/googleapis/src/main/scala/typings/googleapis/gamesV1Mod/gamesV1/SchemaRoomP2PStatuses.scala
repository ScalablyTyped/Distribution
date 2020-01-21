package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an update on the status of peers in a room.
  */
@js.native
trait SchemaRoomP2PStatuses extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomP2PStatuses.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The updates for the peers.
    */
  var updates: js.UndefOr[js.Array[SchemaRoomP2PStatus]] = js.native
}

object SchemaRoomP2PStatuses {
  @scala.inline
  def apply(kind: String = null, updates: js.Array[SchemaRoomP2PStatus] = null): SchemaRoomP2PStatuses = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (updates != null) __obj.updateDynamic("updates")(updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRoomP2PStatuses]
  }
}

