package typings.iobroker.anon

import typings.iobroker.iobrokerStrings.state
import typings.iobroker.mod.global.ioBroker.ObjectField
import typings.iobroker.mod.global.ioBroker.SettableObject
import typings.iobroker.mod.global.ioBroker.StateACL
import typings.iobroker.mod.global.ioBroker.StateCommon
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined iobroker.iobroker.<global>.ioBroker.SettableObjectWorker<iobroker.iobroker.<global>.ioBroker.StateObject> */
trait SettableObjectWorkerState extends SettableObject {
  var _id: js.UndefOr[String] = js.undefined
  var acl: js.UndefOr[StateACL] = js.undefined
  var common: StateCommon
  var encryptedNative: js.UndefOr[js.Array[String]] = js.undefined
  var enums: js.UndefOr[Record[String, String]] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var native: Record[String, ObjectField]
  var protectedNative: js.UndefOr[js.Array[String]] = js.undefined
  var ts: js.UndefOr[Double] = js.undefined
  var `type`: state
}

object SettableObjectWorkerState {
  @scala.inline
  def apply(
    common: StateCommon,
    native: Record[String, ObjectField],
    `type`: state,
    _id: String = null,
    acl: StateACL = null,
    encryptedNative: js.Array[String] = null,
    enums: Record[String, String] = null,
    from: String = null,
    protectedNative: js.Array[String] = null,
    ts: js.UndefOr[Double] = js.undefined
  ): SettableObjectWorkerState = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (encryptedNative != null) __obj.updateDynamic("encryptedNative")(encryptedNative.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (protectedNative != null) __obj.updateDynamic("protectedNative")(protectedNative.asInstanceOf[js.Any])
    if (!js.isUndefined(ts)) __obj.updateDynamic("ts")(ts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObjectWorkerState]
  }
}

