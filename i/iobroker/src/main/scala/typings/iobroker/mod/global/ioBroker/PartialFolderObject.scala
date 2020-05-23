package typings.iobroker.mod.global.ioBroker

import typings.iobroker.anon.PartialOtherCommon
import typings.iobroker.iobrokerStrings.folder
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Pick<iobroker.iobroker.<global>.ioBroker.FolderObject, '_id' | 'native' | 'enums' | 'type' | 'acl'>> */
trait PartialFolderObject extends PartialObject {
  var _id: js.UndefOr[String] = js.undefined
  var acl: js.UndefOr[ObjectACL] = js.undefined
  var common: js.UndefOr[PartialOtherCommon] = js.undefined
  var enums: js.UndefOr[Record[String, String]] = js.undefined
  var native: js.UndefOr[Record[String, ObjectField]] = js.undefined
  var `type`: js.UndefOr[folder] = js.undefined
}

object PartialFolderObject {
  @scala.inline
  def apply(
    _id: String = null,
    acl: ObjectACL = null,
    common: PartialOtherCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, ObjectField] = null,
    `type`: folder = null
  ): PartialFolderObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFolderObject]
  }
}

