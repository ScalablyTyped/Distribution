package typings.iobroker.mod._Global_.ioBroker

import typings.iobroker.iobrokerStrings.state
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateObject
  extends BaseObject
     with Object {
  @JSName("acl")
  var acl_StateObject: js.UndefOr[StateACL] = js.undefined
  @JSName("common")
  var common_StateObject: StateCommon
  @JSName("type")
  var type_StateObject: state
}

object StateObject {
  @scala.inline
  def apply(
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
  ): StateObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (encryptedNative != null) __obj.updateDynamic("encryptedNative")(encryptedNative.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (protectedNative != null) __obj.updateDynamic("protectedNative")(protectedNative.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateObject]
  }
}

