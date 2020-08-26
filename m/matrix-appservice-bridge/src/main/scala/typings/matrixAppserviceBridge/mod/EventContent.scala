package typings.matrixAppserviceBridge.mod

import org.scalablytyped.runtime.StringDictionary
import typings.matrixJsSdk.mod.MembershipType
import typings.matrixJsSdk.mod.MsgType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventContent
  extends /* key */ StringDictionary[js.Any] {
  var avatar_url: Null | String = js.native
  var body: js.UndefOr[String] = js.native
  var displayname: js.UndefOr[String] = js.native
  var info: js.UndefOr[js.Any] = js.native
  var is_direct: Boolean = js.native
  var membership: js.UndefOr[MembershipType] = js.native
  var msgtype: js.UndefOr[MsgType] = js.native
  var name: js.UndefOr[String] = js.native
  var reason: js.UndefOr[String] = js.native
  var topic: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object EventContent {
  @scala.inline
  def apply(is_direct: Boolean): EventContent = {
    val __obj = js.Dynamic.literal(is_direct = is_direct.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventContent]
  }
  @scala.inline
  implicit class EventContentOps[Self <: EventContent] (val x: Self) extends AnyVal {
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
    def setIs_direct(value: Boolean): Self = this.set("is_direct", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvatar_url(value: String): Self = this.set("avatar_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvatar_urlNull: Self = this.set("avatar_url", null)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setDisplayname(value: String): Self = this.set("displayname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayname: Self = this.set("displayname", js.undefined)
    @scala.inline
    def setInfo(value: js.Any): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setMembership(value: MembershipType): Self = this.set("membership", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembership: Self = this.set("membership", js.undefined)
    @scala.inline
    def setMsgtype(value: MsgType): Self = this.set("msgtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsgtype: Self = this.set("msgtype", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

