package typings.iobroker.mod._Global_.ioBroker

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.iobroker.mod._Global_.ioBroker.PartialStateObject
  - typings.iobroker.mod._Global_.ioBroker.PartialChannelObject
  - typings.iobroker.mod._Global_.ioBroker.PartialDeviceObject
  - typings.iobroker.mod._Global_.ioBroker.PartialOtherObject
*/
trait PartialObject extends js.Object

object PartialObject {
  @scala.inline
  def PartialStateObject(acl: Partial[StateACL] = null, common: Partial[StateCommon] = null): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
  @scala.inline
  def PartialChannelObject(common: Partial[ChannelCommon] = null): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
  @scala.inline
  def PartialDeviceObject(common: Partial[DeviceCommon] = null): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
  @scala.inline
  def PartialOtherObject(common: Partial[ObjectCommon] = null): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
}

