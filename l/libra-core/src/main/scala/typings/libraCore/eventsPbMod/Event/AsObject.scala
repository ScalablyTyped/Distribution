package typings.libraCore.eventsPbMod.Event

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var accessPath: js.UndefOr[typings.libraCore.accessPathPbMod.AccessPath.AsObject] = js.native
  var eventData: Uint8Array | String = js.native
  var sequenceNumber: String = js.native
}

object AsObject {
  @scala.inline
  def apply(eventData: Uint8Array | String, sequenceNumber: String): AsObject = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventData(value: Uint8Array | String): Self = this.set("eventData", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequenceNumber(value: String): Self = this.set("sequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessPath(value: typings.libraCore.accessPathPbMod.AccessPath.AsObject): Self = this.set("accessPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessPath: Self = this.set("accessPath", js.undefined)
  }
  
}

