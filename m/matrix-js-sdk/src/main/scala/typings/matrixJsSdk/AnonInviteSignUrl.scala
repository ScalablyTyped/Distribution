package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInviteSignUrl extends js.Object {
  // True to do a room initial sync on the resulting room. If false, the returned Room object will have no current state. Default: true.
  var inviteSignUrl: js.UndefOr[Boolean] = js.undefined
  var syncRoom: js.UndefOr[Boolean] = js.undefined
  // If the caller has a keypair 3pid invite, the signing URL is passed in this parameter.
  var viaServers: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonInviteSignUrl {
  @scala.inline
  def apply(
    inviteSignUrl: js.UndefOr[Boolean] = js.undefined,
    syncRoom: js.UndefOr[Boolean] = js.undefined,
    viaServers: js.Array[String] = null
  ): AnonInviteSignUrl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inviteSignUrl)) __obj.updateDynamic("inviteSignUrl")(inviteSignUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(syncRoom)) __obj.updateDynamic("syncRoom")(syncRoom.asInstanceOf[js.Any])
    if (viaServers != null) __obj.updateDynamic("viaServers")(viaServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInviteSignUrl]
  }
}

