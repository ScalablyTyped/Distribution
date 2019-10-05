package typings.iobroker.iobrokerMod.Global.ioBroker

import typings.iobroker.iobrokerStrings.adapter
import typings.iobroker.iobrokerStrings.config
import typings.iobroker.iobrokerStrings.enum
import typings.iobroker.iobrokerStrings.group
import typings.iobroker.iobrokerStrings.host
import typings.iobroker.iobrokerStrings.info
import typings.iobroker.iobrokerStrings.instance
import typings.iobroker.iobrokerStrings.meta
import typings.iobroker.iobrokerStrings.script
import typings.iobroker.iobrokerStrings.user
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherObject
  extends BaseObject
     with Object {
  @JSName("common")
  var common_OtherObject: OtherCommon
  @JSName("type")
  var type_OtherObject: adapter | config | enum | group | host | info | instance | meta | script | user
}

object OtherObject {
  @scala.inline
  def apply(
    _id: String,
    common: OtherCommon,
    native: Record[String, _],
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user,
    acl: ObjectACL = null,
    enums: Record[String, String] = null
  ): OtherObject = {
    val __obj = js.Dynamic.literal(_id = _id, common = common, native = native)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl)
    if (enums != null) __obj.updateDynamic("enums")(enums)
    __obj.asInstanceOf[OtherObject]
  }
}

