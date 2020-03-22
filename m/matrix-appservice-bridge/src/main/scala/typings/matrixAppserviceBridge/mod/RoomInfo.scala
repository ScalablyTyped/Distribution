package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomInfo extends js.Object {
  var id: String
         // The raw state events for this room
  var realJoinedUsers: js.Array[String]
    //  A list of user IDs of real matrix users that have joined this room.
  var remoteJoinedUsers: js.Array[String]
           // The matrix room ID
  var state: js.Array[js.Object]
}

object RoomInfo {
  @scala.inline
  def apply(
    id: String,
    realJoinedUsers: js.Array[String],
    remoteJoinedUsers: js.Array[String],
    state: js.Array[js.Object]
  ): RoomInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], realJoinedUsers = realJoinedUsers.asInstanceOf[js.Any], remoteJoinedUsers = remoteJoinedUsers.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoomInfo]
  }
}

