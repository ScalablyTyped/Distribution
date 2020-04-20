package typings.iobroker.mod._Global_.ioBroker

import typings.iobroker.iobrokerStrings.device
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceObject
  extends BaseObject
     with Object {
  @JSName("common")
  var common_DeviceObject: DeviceCommon
  @JSName("type")
  var type_DeviceObject: device
}

object DeviceObject {
  @scala.inline
  def apply(
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
  ): DeviceObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (encryptedNative != null) __obj.updateDynamic("encryptedNative")(encryptedNative.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (protectedNative != null) __obj.updateDynamic("protectedNative")(protectedNative.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceObject]
  }
}

