package typings.iobroker.anon

import typings.iobroker.iobrokerStrings.device
import typings.iobroker.mod.global.ioBroker.DeviceCommon
import typings.iobroker.mod.global.ioBroker.ObjectACL
import typings.iobroker.mod.global.ioBroker.ObjectField
import typings.iobroker.mod.global.ioBroker.SettableObject
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined iobroker.iobroker.<global>.ioBroker.SettableObjectWorker<iobroker.iobroker.<global>.ioBroker.DeviceObject> */
trait SettableObjectWorkerDevic extends SettableObject {
  var _id: js.UndefOr[String] = js.undefined
  var acl: js.UndefOr[ObjectACL] = js.undefined
  var common: DeviceCommon
  var encryptedNative: js.UndefOr[js.Array[String]] = js.undefined
  var enums: js.UndefOr[Record[String, String]] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var native: Record[String, ObjectField]
  var protectedNative: js.UndefOr[js.Array[String]] = js.undefined
  var ts: js.UndefOr[Double] = js.undefined
  var `type`: device
}

object SettableObjectWorkerDevic {
  @scala.inline
  def apply(
    common: DeviceCommon,
    native: Record[String, ObjectField],
    `type`: device,
    _id: String = null,
    acl: ObjectACL = null,
    encryptedNative: js.Array[String] = null,
    enums: Record[String, String] = null,
    from: String = null,
    protectedNative: js.Array[String] = null,
    ts: js.UndefOr[Double] = js.undefined
  ): SettableObjectWorkerDevic = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (encryptedNative != null) __obj.updateDynamic("encryptedNative")(encryptedNative.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (protectedNative != null) __obj.updateDynamic("protectedNative")(protectedNative.asInstanceOf[js.Any])
    if (!js.isUndefined(ts)) __obj.updateDynamic("ts")(ts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObjectWorkerDevic]
  }
}

