package typings.iobroker.mod._Global_.ioBroker

import typings.iobroker.PartialChannelCommon
import typings.iobroker.PartialDeviceCommon
import typings.iobroker.PartialObjectCommon
import typings.iobroker.PartialStateACL
import typings.iobroker.PartialStateCommon
import typings.iobroker.iobrokerStrings.adapter
import typings.iobroker.iobrokerStrings.channel
import typings.iobroker.iobrokerStrings.config
import typings.iobroker.iobrokerStrings.device
import typings.iobroker.iobrokerStrings.enum
import typings.iobroker.iobrokerStrings.group
import typings.iobroker.iobrokerStrings.host
import typings.iobroker.iobrokerStrings.info
import typings.iobroker.iobrokerStrings.instance
import typings.iobroker.iobrokerStrings.meta
import typings.iobroker.iobrokerStrings.script
import typings.iobroker.iobrokerStrings.state
import typings.iobroker.iobrokerStrings.user
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.iobroker.mod._Global_.ioBroker.PartialStateObject
  - typings.iobroker.mod._Global_.ioBroker.PartialChannelObject
  - typings.iobroker.mod._Global_.ioBroker.PartialDeviceObject
  - typings.iobroker.mod._Global_.ioBroker.PartialOtherObject
*/
trait PartialObject extends js.Object

object PartialObject {
  @scala.inline
  def PartialStateObject(
    _id: String = null,
    acl: PartialStateACL = null,
    common: PartialStateCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: state = null
  ): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
  @scala.inline
  def PartialChannelObject(
    _id: String = null,
    acl: ObjectACL = null,
    common: PartialChannelCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: channel = null
  ): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
  @scala.inline
  def PartialDeviceObject(
    _id: String = null,
    acl: ObjectACL = null,
    common: PartialDeviceCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: device = null
  ): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
  @scala.inline
  def PartialOtherObject(
    _id: String = null,
    acl: ObjectACL = null,
    common: PartialObjectCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user = null
  ): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
}

