package typings.libraCore.getWithProofPbMod.GetAccountStateResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var accountStateWithProof: js.UndefOr[typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(): AsObject = {
    val __obj = js.Dynamic.literal()
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
    def setAccountStateWithProof(value: typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject): Self = this.set("accountStateWithProof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountStateWithProof: Self = this.set("accountStateWithProof", js.undefined)
  }
  
}

