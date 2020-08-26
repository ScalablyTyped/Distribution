package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.anon.Matrix
import typings.matrixAppserviceBridge.anon.Remote
import typings.matrixAppserviceBridge.anon.Remotes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BridgeContext extends js.Object {
  var rooms: Remotes = js.native
  var senders: Matrix = js.native
  var targets: Remote = js.native
}

object BridgeContext {
  @scala.inline
  def apply(rooms: Remotes, senders: Matrix, targets: Remote): BridgeContext = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any], senders = senders.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeContext]
  }
  @scala.inline
  implicit class BridgeContextOps[Self <: BridgeContext] (val x: Self) extends AnyVal {
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
    def setRooms(value: Remotes): Self = this.set("rooms", value.asInstanceOf[js.Any])
    @scala.inline
    def setSenders(value: Matrix): Self = this.set("senders", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargets(value: Remote): Self = this.set("targets", value.asInstanceOf[js.Any])
  }
  
}

