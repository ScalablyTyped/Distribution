package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionedRoom extends js.Object {
  var creationOpts: Name
  var remote: js.UndefOr[RemoteRoom] = js.undefined
}

object ProvisionedRoom {
  @scala.inline
  def apply(creationOpts: Name, remote: RemoteRoom = null): ProvisionedRoom = {
    val __obj = js.Dynamic.literal(creationOpts = creationOpts.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedRoom]
  }
}

