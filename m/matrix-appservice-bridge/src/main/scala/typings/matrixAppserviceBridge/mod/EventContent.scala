package typings.matrixAppserviceBridge.mod

import typings.matrixJsSdk.mod.MembershipType
import typings.matrixJsSdk.mod.MsgType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventContent extends js.Object {
  var avatar_url: Null | String
  var body: js.UndefOr[String] = js.undefined
  var displayname: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[js.Any] = js.undefined
  var is_direct: Boolean
  var membership: js.UndefOr[MembershipType] = js.undefined
  var msgtype: js.UndefOr[MsgType] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
  var topic: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object EventContent {
  @scala.inline
  def apply(
    is_direct: Boolean,
    avatar_url: String = null,
    body: String = null,
    displayname: String = null,
    info: js.Any = null,
    membership: MembershipType = null,
    msgtype: MsgType = null,
    name: String = null,
    reason: String = null,
    topic: String = null,
    url: String = null
  ): EventContent = {
    val __obj = js.Dynamic.literal(is_direct = is_direct.asInstanceOf[js.Any])
    if (avatar_url != null) __obj.updateDynamic("avatar_url")(avatar_url.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (displayname != null) __obj.updateDynamic("displayname")(displayname.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (membership != null) __obj.updateDynamic("membership")(membership.asInstanceOf[js.Any])
    if (msgtype != null) __obj.updateDynamic("msgtype")(msgtype.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventContent]
  }
}

