package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedRoom extends js.Object {
  var creationOpts: Name = js.native
  var remote: js.UndefOr[RemoteRoom] = js.native
}

object ProvisionedRoom {
  @scala.inline
  def apply(creationOpts: Name): ProvisionedRoom = {
    val __obj = js.Dynamic.literal(creationOpts = creationOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedRoom]
  }
  @scala.inline
  implicit class ProvisionedRoomOps[Self <: ProvisionedRoom] (val x: Self) extends AnyVal {
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
    def setCreationOpts(value: Name): Self = this.set("creationOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemote(value: RemoteRoom): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
  }
  
}

