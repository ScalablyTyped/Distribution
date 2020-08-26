package typings.hapiNes.clientMod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientSubscribeFlags extends js.Object {
  var revoked: js.UndefOr[Boolean] = js.native
}

object ClientSubscribeFlags {
  @scala.inline
  def apply(): ClientSubscribeFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSubscribeFlags]
  }
  @scala.inline
  implicit class ClientSubscribeFlagsOps[Self <: ClientSubscribeFlags] (val x: Self) extends AnyVal {
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
    def setRevoked(value: Boolean): Self = this.set("revoked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevoked: Self = this.set("revoked", js.undefined)
  }
  
}

