package typings.iobroker.mod._Global_.ioBroker

import typings.iobroker.PartialStateACL
import typings.iobroker.PartialStateCommon
import typings.iobroker.iobrokerStrings.state
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Pick<iobroker.iobroker._Global_.ioBroker.StateObject, '_id' | 'native' | 'enums' | 'type'>> */
trait PartialStateObject extends PartialObject {
  var _id: js.UndefOr[String] = js.undefined
  var acl: js.UndefOr[PartialStateACL] = js.undefined
  var common: js.UndefOr[PartialStateCommon] = js.undefined
  var enums: js.UndefOr[Record[String, String]] = js.undefined
  var native: js.UndefOr[Record[String, _]] = js.undefined
  var `type`: js.UndefOr[state] = js.undefined
}

object PartialStateObject {
  @scala.inline
  def apply(
    _id: String = null,
    acl: PartialStateACL = null,
    common: PartialStateCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: state = null
  ): PartialStateObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStateObject]
  }
}

