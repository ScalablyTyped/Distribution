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
import org.scalablytyped.runtime.StObject
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
trait AnyObject extends StObject
object AnyObject {
  
  @scala.inline
  def AdapterObject(_id: String, common: AdapterCommon, native: Record[String, _], `type`: adapter): typings.iobroker.objectsMod.global.ioBroker.AdapterObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.AdapterObject]
  }
  
  @scala.inline
  def ChannelObject(_id: String, common: ChannelCommon, native: Record[String, _], `type`: channel): typings.iobroker.objectsMod.global.ioBroker.ChannelObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.ChannelObject]
  }
  
  @scala.inline
  def DeviceObject(_id: String, common: DeviceCommon, native: Record[String, _], `type`: device): typings.iobroker.objectsMod.global.ioBroker.DeviceObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.DeviceObject]
  }
  
  @scala.inline
  def EnumObject(_id: String, common: EnumCommon, native: Record[String, _], `type`: enum): typings.iobroker.objectsMod.global.ioBroker.EnumObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.EnumObject]
  }
  
  @scala.inline
  def FolderObject(_id: String, common: OtherCommon, native: Record[String, _], `type`: folder): typings.iobroker.objectsMod.global.ioBroker.FolderObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.FolderObject]
  }
  
  @scala.inline
  def GroupObject(_id: String, common: GroupCommon, native: Record[String, _], `type`: group): typings.iobroker.objectsMod.global.ioBroker.GroupObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.GroupObject]
  }
  
  @scala.inline
  def HostObject(_id: String, common: HostCommon, native: HostNative, `type`: host): typings.iobroker.objectsMod.global.ioBroker.HostObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.HostObject]
  }
  
  @scala.inline
  def InstanceObject(_id: String, common: InstanceCommon, native: Record[String, _], `type`: instance): typings.iobroker.objectsMod.global.ioBroker.InstanceObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.InstanceObject]
  }
  
  @scala.inline
  def MetaObject(_id: String, common: MetaCommon, native: Record[String, _], `type`: meta): typings.iobroker.objectsMod.global.ioBroker.MetaObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.MetaObject]
  }
  
  @scala.inline
  def OtherObject(
    _id: String,
    common: OtherCommon,
    native: Record[String, _],
    `type`: adapter | config | info | chart
  ): typings.iobroker.objectsMod.global.ioBroker.OtherObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.OtherObject]
  }
  
  @scala.inline
  def ScriptObject(_id: String, common: ScriptCommon, native: Record[String, _], `type`: script): typings.iobroker.objectsMod.global.ioBroker.ScriptObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.ScriptObject]
  }
  
  @scala.inline
  def StateObject(_id: String, common: StateCommon, native: Record[String, _], `type`: state): typings.iobroker.objectsMod.global.ioBroker.StateObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.StateObject]
  }
  
  @scala.inline
  def UserObject(_id: String, common: UserCommon, native: Record[String, _], `type`: user): typings.iobroker.objectsMod.global.ioBroker.UserObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.UserObject]
  }
}
