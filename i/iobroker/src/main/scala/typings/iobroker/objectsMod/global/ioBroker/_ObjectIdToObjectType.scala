package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.chart
import typings.iobroker.iobrokerStrings.config
import typings.iobroker.iobrokerStrings.read
import typings.iobroker.iobrokerStrings.write
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ObjectIdToObjectType[T /* <: String */, Read /* <: read | write */] extends StObject
object _ObjectIdToObjectType {
  
  inline def AdapterObject(_id: String, common: AdapterCommon, native: Record[String, Any]): typings.iobroker.objectsMod.global.ioBroker.AdapterObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("adapter")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.AdapterObject]
  }
  
  inline def ChannelObject(_id: String, common: ChannelCommon, native: Record[String, Any]): typings.iobroker.objectsMod.global.ioBroker.ChannelObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("channel")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.ChannelObject]
  }
  
  inline def DeviceObject(_id: String, common: DeviceCommon, native: Record[String, Any]): typings.iobroker.objectsMod.global.ioBroker.DeviceObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("device")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.DeviceObject]
  }
  
  inline def EnumObject(_id: String, common: EnumCommon, native: Record[String, Any]): typings.iobroker.objectsMod.global.ioBroker.EnumObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("enum")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.EnumObject]
  }
  
  inline def FolderObject(_id: String, common: OtherCommon, native: Record[String, Any]): typings.iobroker.objectsMod.global.ioBroker.FolderObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("folder")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.FolderObject]
  }
  
  inline def GroupObject(_id: String, common: GroupCommon, native: Record[String, Any]): typings.iobroker.objectsMod.global.ioBroker.GroupObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("group")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.GroupObject]
  }
  
  inline def HostObject(_id: String, common: HostCommon, native: HostNative): typings.iobroker.objectsMod.global.ioBroker.HostObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("host")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.HostObject]
  }
  
  inline def InstanceObject(_id: String, common: InstanceCommon, native: Record[String, Any]): typings.iobroker.objectsMod.global.ioBroker.InstanceObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("instance")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.InstanceObject]
  }
  
  inline def MetaObject(_id: String, common: MetaCommon, native: Record[String, Any]): typings.iobroker.objectsMod.global.ioBroker.MetaObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("meta")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.MetaObject]
  }
  
  inline def OtherObject(_id: String, common: OtherCommon, native: Record[String, Any], `type`: config | chart): typings.iobroker.objectsMod.global.ioBroker.OtherObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.OtherObject]
  }
  
  inline def OtherObjecttypeconfig(_id: String, common: OtherCommon, native: Record[String, Any], `type`: (config | chart) & config): typings.iobroker.anon.OtherObjecttypeconfig = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.iobroker.anon.OtherObjecttypeconfig]
  }
  
  inline def ScriptObject(_id: String, common: ScriptCommon, native: Record[String, Any]): typings.iobroker.objectsMod.global.ioBroker.ScriptObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("script")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.ScriptObject]
  }
  
  inline def StateObject(_id: String, common: StateCommon, native: Record[String, Any]): typings.iobroker.objectsMod.global.ioBroker.StateObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("state")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.StateObject]
  }
  
  inline def UserObject(_id: String, common: UserCommon, native: Record[String, Any]): typings.iobroker.objectsMod.global.ioBroker.UserObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("user")
    __obj.asInstanceOf[typings.iobroker.objectsMod.global.ioBroker.UserObject]
  }
}
