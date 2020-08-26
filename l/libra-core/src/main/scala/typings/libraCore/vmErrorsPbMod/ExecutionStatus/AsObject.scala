package typings.libraCore.vmErrorsPbMod.ExecutionStatus

import typings.libraCore.vmErrorsPbMod.RuntimeStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var arithmeticError: js.UndefOr[typings.libraCore.vmErrorsPbMod.ArithmeticError.AsObject] = js.native
  var assertionFailure: js.UndefOr[typings.libraCore.vmErrorsPbMod.AssertionFailure.AsObject] = js.native
  var referenceError: js.UndefOr[typings.libraCore.vmErrorsPbMod.DynamicReferenceError.AsObject] = js.native
  var runtimeStatus: RuntimeStatus = js.native
}

object AsObject {
  @scala.inline
  def apply(runtimeStatus: RuntimeStatus): AsObject = {
    val __obj = js.Dynamic.literal(runtimeStatus = runtimeStatus.asInstanceOf[js.Any])
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
    def setRuntimeStatus(value: RuntimeStatus): Self = this.set("runtimeStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setArithmeticError(value: typings.libraCore.vmErrorsPbMod.ArithmeticError.AsObject): Self = this.set("arithmeticError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArithmeticError: Self = this.set("arithmeticError", js.undefined)
    @scala.inline
    def setAssertionFailure(value: typings.libraCore.vmErrorsPbMod.AssertionFailure.AsObject): Self = this.set("assertionFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssertionFailure: Self = this.set("assertionFailure", js.undefined)
    @scala.inline
    def setReferenceError(value: typings.libraCore.vmErrorsPbMod.DynamicReferenceError.AsObject): Self = this.set("referenceError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceError: Self = this.set("referenceError", js.undefined)
  }
  
}

