package typings.iobroker.iobrokerMod._Global_.ioBroker

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
    enums: Record[String, String] = null
  ): StateObject = {
    val __obj = js.Dynamic.literal(_id = _id, common = common, native = native)
    __obj.updateDynamic("type")(`type`)
    if (acl != null) __obj.updateDynamic("acl")(acl)
    if (enums != null) __obj.updateDynamic("enums")(enums)
    __obj.asInstanceOf[StateObject]
  }
}

