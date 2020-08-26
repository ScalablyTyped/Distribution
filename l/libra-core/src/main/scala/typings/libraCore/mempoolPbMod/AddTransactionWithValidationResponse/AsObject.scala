package typings.libraCore.mempoolPbMod.AddTransactionWithValidationResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var currentVersion: String = js.native
  var status: js.UndefOr[typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(currentVersion: String): AsObject = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any])
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
    def setCurrentVersion(value: String): Self = this.set("currentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

