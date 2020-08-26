package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowJoin extends js.Object {
  var allowJoin: Boolean = js.native
  // True to allow guests to join this room. This implicitly gives guests write access. If false or not given, guests are explicitly forbidden from joining the room.
  var allowRead: Boolean = js.native
}

object AllowJoin {
  @scala.inline
  def apply(allowJoin: Boolean, allowRead: Boolean): AllowJoin = {
    val __obj = js.Dynamic.literal(allowJoin = allowJoin.asInstanceOf[js.Any], allowRead = allowRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowJoin]
  }
  @scala.inline
  implicit class AllowJoinOps[Self <: AllowJoin] (val x: Self) extends AnyVal {
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
    def setAllowJoin(value: Boolean): Self = this.set("allowJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowRead(value: Boolean): Self = this.set("allowRead", value.asInstanceOf[js.Any])
  }
  
}

