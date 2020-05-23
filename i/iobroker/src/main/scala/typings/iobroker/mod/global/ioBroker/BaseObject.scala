package typings.iobroker.mod.global.ioBroker

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseObject extends js.Object {
  /** The ID of this object */
  var _id: String
  var acl: js.UndefOr[ObjectACL] = js.undefined
   // specified in the derived interfaces
  // Be strict with what we allow here. Read objects overwrite this with any.
  var common: StateCommon | ChannelCommon | DeviceCommon | OtherCommon
  /** Like protectedNative, but the properties are also encrypted and decrypted automatically */
  var encryptedNative: js.UndefOr[js.Array[String]] = js.undefined
  var enums: js.UndefOr[Record[String, String]] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  // Be strict with what we allow here. Read objects overwrite this with any.
  var native: Record[String, ObjectField]
  /** An array of `native` properties which cannot be accessed from outside the defining adapter */
  var protectedNative: js.UndefOr[js.Array[String]] = js.undefined
  var ts: js.UndefOr[Double] = js.undefined
  var `type`: String
}

object BaseObject {
  @scala.inline
  def apply(
    _id: String,
    common: StateCommon | ChannelCommon | DeviceCommon | OtherCommon,
    native: Record[String, ObjectField],
    `type`: String,
    acl: ObjectACL = null,
    encryptedNative: js.Array[String] = null,
    enums: Record[String, String] = null,
    from: String = null,
    protectedNative: js.Array[String] = null,
    ts: js.UndefOr[Double] = js.undefined
  ): BaseObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (encryptedNative != null) __obj.updateDynamic("encryptedNative")(encryptedNative.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (protectedNative != null) __obj.updateDynamic("protectedNative")(protectedNative.asInstanceOf[js.Any])
    if (!js.isUndefined(ts)) __obj.updateDynamic("ts")(ts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseObject]
  }
}

