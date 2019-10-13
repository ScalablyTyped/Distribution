package typings.iobroker.iobrokerMod._Global_.ioBroker

import typings.iobroker.iobrokerStrings.device
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceObject
  extends BaseObject
     with Object {
  @JSName("common")
  var common_DeviceObject: DeviceCommon
  @JSName("type")
  var type_DeviceObject: device
}

object DeviceObject {
  @scala.inline
  def apply(
    _id: String,
    common: DeviceCommon,
    native: Record[String, _],
    `type`: device,
    acl: ObjectACL = null,
    enums: Record[String, String] = null
  ): DeviceObject = {
    val __obj = js.Dynamic.literal(_id = _id, common = common, native = native)
    __obj.updateDynamic("type")(`type`)
    if (acl != null) __obj.updateDynamic("acl")(acl)
    if (enums != null) __obj.updateDynamic("enums")(enums)
    __obj.asInstanceOf[DeviceObject]
  }
}

