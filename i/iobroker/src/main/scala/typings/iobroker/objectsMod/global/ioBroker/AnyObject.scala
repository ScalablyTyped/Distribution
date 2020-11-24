package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.adapter
import typings.iobroker.iobrokerStrings.channel
import typings.iobroker.iobrokerStrings.chart
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Base type for Objects. Should not be used directly
/* Rewritten from type alias, can be one of: 
  - typings.iobroker.objectsMod.global.ioBroker.StateObject
  - typings.iobroker.objectsMod.global.ioBroker.ChannelObject
  - typings.iobroker.objectsMod.global.ioBroker.DeviceObject
  - typings.iobroker.objectsMod.global.ioBroker.FolderObject
  - typings.iobroker.objectsMod.global.ioBroker.EnumObject
  - typings.iobroker.objectsMod.global.ioBroker.MetaObject
  - typings.iobroker.objectsMod.global.ioBroker.HostObject
  - typings.iobroker.objectsMod.global.ioBroker.AdapterObject
  - typings.iobroker.objectsMod.global.ioBroker.InstanceObject
  - typings.iobroker.objectsMod.global.ioBroker.UserObject
  - typings.iobroker.objectsMod.global.ioBroker.GroupObject
  - typings.iobroker.objectsMod.global.ioBroker.ScriptObject
  - typings.iobroker.objectsMod.global.ioBroker.OtherObject
*/
trait AnyObject extends js.Object
object AnyObject {
  
  @scala.inline
  def MetaObject(_id: String, common: MetaCommon, native: Record[String, _], `type`: meta): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def ScriptObject(_id: String, common: ScriptCommon, native: Record[String, _], `type`: script): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def GroupObject(_id: String, common: GroupCommon, native: Record[String, _], `type`: group): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def DeviceObject(_id: String, common: DeviceCommon, native: Record[String, _], `type`: device): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def AdapterObject(_id: String, common: AdapterCommon, native: Record[String, _], `type`: adapter): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def StateObject(_id: String, common: StateCommon, native: Record[String, _], `type`: state): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def HostObject(_id: String, common: HostCommon, native: HostNative, `type`: host): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def ChannelObject(_id: String, common: ChannelCommon, native: Record[String, _], `type`: channel): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def UserObject(_id: String, common: UserCommon, native: Record[String, _], `type`: user): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def EnumObject(_id: String, common: EnumCommon, native: Record[String, _], `type`: enum): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def OtherObject(
    _id: String,
    common: OtherCommon,
    native: Record[String, _],
    `type`: adapter | config | info | chart
  ): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def FolderObject(_id: String, common: OtherCommon, native: Record[String, _], `type`: folder): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def InstanceObject(_id: String, common: InstanceCommon, native: Record[String, _], `type`: instance): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
}
