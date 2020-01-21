package typings.iobroker.mod._Global_.ioBroker

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Pick<iobroker.iobroker._Global_.ioBroker.DeviceObject, '_id' | 'native' | 'enums' | 'type' | 'acl'> ]:? std.Pick<iobroker.iobroker._Global_.ioBroker.DeviceObject, '_id' | 'native' | 'enums' | 'type' | 'acl'>[P]} */ trait PartialDeviceObject extends PartialObject {
  var common: js.UndefOr[Partial[DeviceCommon]] = js.undefined
}

object PartialDeviceObject {
  @scala.inline
  def apply(common: Partial[DeviceCommon] = null): PartialDeviceObject = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDeviceObject]
  }
}

