package typings.iobroker.iobrokerMod.Global.ioBroker

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseObject extends js.Object {
  /** The ID of this object */
  var _id: String
  var acl: js.UndefOr[ObjectACL] = js.undefined
   // specified in the derived interfaces
  var common: StateCommon | ChannelCommon | DeviceCommon | OtherCommon
  var enums: js.UndefOr[Record[String, String]] = js.undefined
  var native: Record[String, _]
  var `type`: String
}

object BaseObject {
  @scala.inline
  def apply(
    _id: String,
    common: StateCommon | ChannelCommon | DeviceCommon | OtherCommon,
    native: Record[String, _],
    `type`: String,
    acl: ObjectACL = null,
    enums: Record[String, String] = null
  ): BaseObject = {
    val __obj = js.Dynamic.literal(_id = _id, common = common.asInstanceOf[js.Any], native = native)
    __obj.updateDynamic("type")(`type`)
    if (acl != null) __obj.updateDynamic("acl")(acl)
    if (enums != null) __obj.updateDynamic("enums")(enums)
    __obj.asInstanceOf[BaseObject]
  }
}

