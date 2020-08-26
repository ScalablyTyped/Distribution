package typings.libraCore.vmErrorsPbMod.VMVerificationStatusList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var statusListList: js.Array[typings.libraCore.vmErrorsPbMod.VMVerificationStatus.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(statusListList: js.Array[typings.libraCore.vmErrorsPbMod.VMVerificationStatus.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(statusListList = statusListList.asInstanceOf[js.Any])
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
    def setStatusListListVarargs(value: typings.libraCore.vmErrorsPbMod.VMVerificationStatus.AsObject*): Self = this.set("statusListList", js.Array(value :_*))
    @scala.inline
    def setStatusListList(value: js.Array[typings.libraCore.vmErrorsPbMod.VMVerificationStatus.AsObject]): Self = this.set("statusListList", value.asInstanceOf[js.Any])
  }
  
}

