package typings.iobroker.mod._Global_.ioBroker

import typings.iobroker.PartialChannelCommon
import typings.iobroker.iobrokerStrings.channel
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Pick<iobroker.iobroker._Global_.ioBroker.ChannelObject, '_id' | 'native' | 'enums' | 'type' | 'acl'>> */
trait PartialChannelObject extends PartialObject {
  var _id: js.UndefOr[String] = js.undefined
  var acl: js.UndefOr[ObjectACL] = js.undefined
  var common: js.UndefOr[PartialChannelCommon] = js.undefined
  var enums: js.UndefOr[Record[String, String]] = js.undefined
  var native: js.UndefOr[Record[String, _]] = js.undefined
  var `type`: js.UndefOr[channel] = js.undefined
}

object PartialChannelObject {
  @scala.inline
  def apply(
    _id: String = null,
    acl: ObjectACL = null,
    common: PartialChannelCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: channel = null
  ): PartialChannelObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialChannelObject]
  }
}

