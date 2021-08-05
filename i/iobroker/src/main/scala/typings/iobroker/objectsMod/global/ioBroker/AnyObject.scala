package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.adapter
import typings.iobroker.iobrokerStrings.chart
import typings.iobroker.iobrokerStrings.config
import typings.iobroker.iobrokerStrings.info
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  inline def AdapterObject(_id: String, common: AdapterCommon, native: Record[String, js.Any]): typings.iobroker.objectsMod.global.ioBroker.AdapterObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("adapter")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.AdapterObject]
  }
  
  inline def ChannelObject(_id: String, common: ChannelCommon, native: Record[String, js.Any]): typings.iobroker.objectsMod.global.ioBroker.ChannelObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("channel")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.ChannelObject]
  }
  
  inline def DeviceObject(_id: String, common: DeviceCommon, native: Record[String, js.Any]): typings.iobroker.objectsMod.global.ioBroker.DeviceObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("device")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.DeviceObject]
  }
  
  inline def EnumObject(_id: String, common: EnumCommon, native: Record[String, js.Any]): typings.iobroker.objectsMod.global.ioBroker.EnumObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("enum")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.EnumObject]
  }
  
  inline def FolderObject(_id: String, common: OtherCommon, native: Record[String, js.Any]): typings.iobroker.objectsMod.global.ioBroker.FolderObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("folder")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.FolderObject]
  }
  
  inline def GroupObject(_id: String, common: GroupCommon, native: Record[String, js.Any]): typings.iobroker.objectsMod.global.ioBroker.GroupObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("group")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.GroupObject]
  }
  
  inline def HostObject(_id: String, common: HostCommon, native: HostNative): typings.iobroker.objectsMod.global.ioBroker.HostObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("host")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.HostObject]
  }
  
  inline def InstanceObject(_id: String, common: InstanceCommon, native: Record[String, js.Any]): typings.iobroker.objectsMod.global.ioBroker.InstanceObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("instance")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.InstanceObject]
  }
  
  inline def MetaObject(_id: String, common: MetaCommon, native: Record[String, js.Any]): typings.iobroker.objectsMod.global.ioBroker.MetaObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("meta")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.MetaObject]
  }
  
  inline def OtherObject(
    _id: String,
    common: OtherCommon,
    native: Record[String, js.Any],
    `type`: adapter | config | info | chart
  ): typings.iobroker.objectsMod.global.ioBroker.OtherObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.OtherObject]
  }
  
  inline def ScriptObject(_id: String, common: ScriptCommon, native: Record[String, js.Any]): typings.iobroker.objectsMod.global.ioBroker.ScriptObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("script")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.ScriptObject]
  }
  
  inline def StateObject(_id: String, common: StateCommon, native: Record[String, js.Any]): typings.iobroker.objectsMod.global.ioBroker.StateObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("state")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.StateObject]
  }
  
  inline def UserObject(_id: String, common: UserCommon, native: Record[String, js.Any]): typings.iobroker.objectsMod.global.ioBroker.UserObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("user")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.UserObject]
  }
}
