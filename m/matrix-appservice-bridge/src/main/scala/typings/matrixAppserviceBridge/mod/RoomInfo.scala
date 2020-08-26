package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomInfo extends js.Object {
  var id: String = js.native
         // The raw state events for this room
  var realJoinedUsers: js.Array[String] = js.native
    //  A list of user IDs of real matrix users that have joined this room.
  var remoteJoinedUsers: js.Array[String] = js.native
           // The matrix room ID
  var state: js.Array[js.Object] = js.native
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
  @scala.inline
  implicit class RoomInfoOps[Self <: RoomInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRealJoinedUsersVarargs(value: String*): Self = this.set("realJoinedUsers", js.Array(value :_*))
    @scala.inline
    def setRealJoinedUsers(value: js.Array[String]): Self = this.set("realJoinedUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteJoinedUsersVarargs(value: String*): Self = this.set("remoteJoinedUsers", js.Array(value :_*))
    @scala.inline
    def setRemoteJoinedUsers(value: js.Array[String]): Self = this.set("remoteJoinedUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateVarargs(value: js.Object*): Self = this.set("state", js.Array(value :_*))
    @scala.inline
    def setState(value: js.Array[js.Object]): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

