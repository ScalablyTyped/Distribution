package typings.iobroker.anon

import typings.iobroker.iobrokerStrings.adapter
import typings.iobroker.iobrokerStrings.config
import typings.iobroker.iobrokerStrings.enum
import typings.iobroker.iobrokerStrings.group
import typings.iobroker.iobrokerStrings.host
import typings.iobroker.iobrokerStrings.info
import typings.iobroker.iobrokerStrings.instance
import typings.iobroker.iobrokerStrings.meta
import typings.iobroker.iobrokerStrings.script
import typings.iobroker.iobrokerStrings.user
import typings.iobroker.mod.global.ioBroker.ObjectACL
import typings.iobroker.mod.global.ioBroker.ObjectField
import typings.iobroker.mod.global.ioBroker.OtherCommon
import typings.iobroker.mod.global.ioBroker.SettableObject
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined iobroker.iobroker.<global>.ioBroker.SettableObjectWorker<iobroker.iobroker.<global>.ioBroker.OtherObject> */
trait SettableObjectWorkerOther extends SettableObject {
  var _id: js.UndefOr[String] = js.undefined
  var acl: js.UndefOr[ObjectACL] = js.undefined
  var common: OtherCommon
  var encryptedNative: js.UndefOr[js.Array[String]] = js.undefined
  var enums: js.UndefOr[Record[String, String]] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var native: Record[String, ObjectField]
  var protectedNative: js.UndefOr[js.Array[String]] = js.undefined
  var ts: js.UndefOr[Double] = js.undefined
  var `type`: adapter | config | enum | group | host | info | instance | meta | script | user
}

object SettableObjectWorkerOther {
  @scala.inline
  def apply(
    common: OtherCommon,
    native: Record[String, ObjectField],
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user,
    _id: String = null,
    acl: ObjectACL = null,
    encryptedNative: js.Array[String] = null,
    enums: Record[String, String] = null,
    from: String = null,
    protectedNative: js.Array[String] = null,
    ts: js.UndefOr[Double] = js.undefined
  ): SettableObjectWorkerOther = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (encryptedNative != null) __obj.updateDynamic("encryptedNative")(encryptedNative.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (protectedNative != null) __obj.updateDynamic("protectedNative")(protectedNative.asInstanceOf[js.Any])
    if (!js.isUndefined(ts)) __obj.updateDynamic("ts")(ts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObjectWorkerOther]
  }
}

