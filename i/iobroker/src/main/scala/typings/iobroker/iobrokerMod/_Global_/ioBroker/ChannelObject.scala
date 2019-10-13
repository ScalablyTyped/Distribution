package typings.iobroker.iobrokerMod._Global_.ioBroker

import typings.iobroker.iobrokerStrings.channel
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelObject
  extends BaseObject
     with Object {
  @JSName("common")
  var common_ChannelObject: ChannelCommon
  @JSName("type")
  var type_ChannelObject: channel
}

object ChannelObject {
  @scala.inline
  def apply(
    _id: String,
    common: ChannelCommon,
    native: Record[String, _],
    `type`: channel,
    acl: ObjectACL = null,
    enums: Record[String, String] = null
  ): ChannelObject = {
    val __obj = js.Dynamic.literal(_id = _id, common = common, native = native)
    __obj.updateDynamic("type")(`type`)
    if (acl != null) __obj.updateDynamic("acl")(acl)
    if (enums != null) __obj.updateDynamic("enums")(enums)
    __obj.asInstanceOf[ChannelObject]
  }
}

