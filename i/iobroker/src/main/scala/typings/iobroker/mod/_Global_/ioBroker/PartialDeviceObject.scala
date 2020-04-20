package typings.iobroker.mod._Global_.ioBroker

import typings.iobroker.PartialDeviceCommon
import typings.iobroker.iobrokerStrings.device
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Omit<iobroker.iobroker._Global_.ioBroker.DeviceObject, 'common'>> */
trait PartialDeviceObject extends PartialObject {
  var _id: js.UndefOr[String] = js.undefined
  var acl: js.UndefOr[ObjectACL] = js.undefined
  var common: js.UndefOr[PartialDeviceCommon] = js.undefined
  var encryptedNative: js.UndefOr[js.Array[String]] = js.undefined
  var enums: js.UndefOr[Record[String, String]] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var native: js.UndefOr[Record[String, _]] = js.undefined
  var protectedNative: js.UndefOr[js.Array[String]] = js.undefined
  var ts: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[device] = js.undefined
}

object PartialDeviceObject {
  @scala.inline
  def apply(
    _id: String = null,
    acl: ObjectACL = null,
    common: PartialDeviceCommon = null,
    encryptedNative: js.Array[String] = null,
    enums: Record[String, String] = null,
    from: String = null,
    native: Record[String, _] = null,
    protectedNative: js.Array[String] = null,
    ts: Int | Double = null,
    `type`: device = null
  ): PartialDeviceObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (encryptedNative != null) __obj.updateDynamic("encryptedNative")(encryptedNative.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (protectedNative != null) __obj.updateDynamic("protectedNative")(protectedNative.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDeviceObject]
  }
}

