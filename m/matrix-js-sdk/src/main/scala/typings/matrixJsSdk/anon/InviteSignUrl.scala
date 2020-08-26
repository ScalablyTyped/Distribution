package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteSignUrl extends js.Object {
  // True to do a room initial sync on the resulting room. If false, the returned Room object will have no current state. Default: true.
  var inviteSignUrl: js.UndefOr[Boolean] = js.native
  var syncRoom: js.UndefOr[Boolean] = js.native
  // If the caller has a keypair 3pid invite, the signing URL is passed in this parameter.
  var viaServers: js.UndefOr[js.Array[String]] = js.native
}

object InviteSignUrl {
  @scala.inline
  def apply(): InviteSignUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteSignUrl]
  }
  @scala.inline
  implicit class InviteSignUrlOps[Self <: InviteSignUrl] (val x: Self) extends AnyVal {
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
    def setInviteSignUrl(value: Boolean): Self = this.set("inviteSignUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInviteSignUrl: Self = this.set("inviteSignUrl", js.undefined)
    @scala.inline
    def setSyncRoom(value: Boolean): Self = this.set("syncRoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncRoom: Self = this.set("syncRoom", js.undefined)
    @scala.inline
    def setViaServersVarargs(value: String*): Self = this.set("viaServers", js.Array(value :_*))
    @scala.inline
    def setViaServers(value: js.Array[String]): Self = this.set("viaServers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViaServers: Self = this.set("viaServers", js.undefined)
  }
  
}

