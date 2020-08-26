package typings.iobroker.mod.global.ioBroker

import typings.iobroker.iobrokerStrings.adapter
import typings.iobroker.iobrokerStrings.channel
import typings.iobroker.iobrokerStrings.config
import typings.iobroker.iobrokerStrings.device
import typings.iobroker.iobrokerStrings.enum
import typings.iobroker.iobrokerStrings.folder
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

// Base type for Objects. Should not be used directly
/* Rewritten from type alias, can be one of: 
  - typings.iobroker.mod.global.ioBroker.StateObject
  - typings.iobroker.mod.global.ioBroker.ChannelObject
  - typings.iobroker.mod.global.ioBroker.DeviceObject
  - typings.iobroker.mod.global.ioBroker.FolderObject
  - typings.iobroker.mod.global.ioBroker.OtherObject
*/
trait AnyObject extends js.Object

object AnyObject {
  @scala.inline
  def OtherObject(
    _id: String,
    common: OtherCommon,
    native: Record[String, ObjectField],
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user
  ): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  @scala.inline
  def DeviceObject(_id: String, common: DeviceCommon, native: Record[String, ObjectField], `type`: device): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  @scala.inline
  def FolderObject(_id: String, common: OtherCommon, native: Record[String, ObjectField], `type`: folder): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  @scala.inline
  def ChannelObject(_id: String, common: ChannelCommon, native: Record[String, ObjectField], `type`: channel): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  @scala.inline
  def StateObject(_id: String, common: StateCommon, native: Record[String, ObjectField], `type`: state): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
}

