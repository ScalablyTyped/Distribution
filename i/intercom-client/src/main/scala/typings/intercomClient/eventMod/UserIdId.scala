package typings.intercomClient.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserIdId extends EventIdentifier {
  var user_id: String = js.native
}

object UserIdId {
  @scala.inline
  def apply(user_id: String): UserIdId = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdId]
  }
  @scala.inline
  implicit class UserIdIdOps[Self <: UserIdId] (val x: Self) extends AnyVal {
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
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
  }
  
}

