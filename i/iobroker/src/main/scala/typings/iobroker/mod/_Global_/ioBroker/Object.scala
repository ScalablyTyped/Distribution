package typings.iobroker.mod._Global_.ioBroker

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

/* Rewritten from type alias, can be one of: 
  - typings.iobroker.mod._Global_.ioBroker.StateObject
  - typings.iobroker.mod._Global_.ioBroker.ChannelObject
  - typings.iobroker.mod._Global_.ioBroker.DeviceObject
  - typings.iobroker.mod._Global_.ioBroker.FolderObject
  - typings.iobroker.mod._Global_.ioBroker.OtherObject
*/
trait Object extends js.Object

object Object {
  @scala.inline
  def FolderObject(
    _id: String,
    common: OtherCommon,
    native: Record[String, _],
    `type`: folder,
    acl: ObjectACL = null,
    encryptedNative: js.Array[String] = null,
    enums: Record[String, String] = null,
    from: String = null,
    protectedNative: js.Array[String] = null,
    ts: Int | Double = null
  ): Object = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (encryptedNative != null) __obj.updateDynamic("encryptedNative")(encryptedNative.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (protectedNative != null) __obj.updateDynamic("protectedNative")(protectedNative.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  def OtherObject(
    _id: String,
    common: OtherCommon,
    native: Record[String, _],
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user,
    acl: ObjectACL = null,
    encryptedNative: js.Array[String] = null,
    enums: Record[String, String] = null,
    from: String = null,
    protectedNative: js.Array[String] = null,
    ts: Int | Double = null
  ): Object = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (encryptedNative != null) __obj.updateDynamic("encryptedNative")(encryptedNative.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (protectedNative != null) __obj.updateDynamic("protectedNative")(protectedNative.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  def StateObject(
    _id: String,
    common: StateCommon,
    native: Record[String, _],
    `type`: state,
    acl: StateACL = null,
    encryptedNative: js.Array[String] = null,
    enums: Record[String, String] = null,
    from: String = null,
    protectedNative: js.Array[String] = null,
    ts: Int | Double = null
  ): Object = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (encryptedNative != null) __obj.updateDynamic("encryptedNative")(encryptedNative.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (protectedNative != null) __obj.updateDynamic("protectedNative")(protectedNative.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  def DeviceObject(
    _id: String,
    common: DeviceCommon,
    native: Record[String, _],
    `type`: device,
    acl: ObjectACL = null,
    encryptedNative: js.Array[String] = null,
    enums: Record[String, String] = null,
    from: String = null,
    protectedNative: js.Array[String] = null,
    ts: Int | Double = null
  ): Object = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (encryptedNative != null) __obj.updateDynamic("encryptedNative")(encryptedNative.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (protectedNative != null) __obj.updateDynamic("protectedNative")(protectedNative.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  def ChannelObject(
    _id: String,
    common: ChannelCommon,
    native: Record[String, _],
    `type`: channel,
    acl: ObjectACL = null,
    encryptedNative: js.Array[String] = null,
    enums: Record[String, String] = null,
    from: String = null,
    protectedNative: js.Array[String] = null,
    ts: Int | Double = null
  ): Object = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (encryptedNative != null) __obj.updateDynamic("encryptedNative")(encryptedNative.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (protectedNative != null) __obj.updateDynamic("protectedNative")(protectedNative.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
}

