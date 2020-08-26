package typings.mangopay2NodejsSdk.mod.dispute

import typings.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.dispute.DisputeData, 'ContestedFunds'> */
@js.native
trait SubmitDispute extends js.Object {
  var ContestedFunds: js.UndefOr[MoneyData] = js.native
}

object SubmitDispute {
  @scala.inline
  def apply(): SubmitDispute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitDispute]
  }
  @scala.inline
  implicit class SubmitDisputeOps[Self <: SubmitDispute] (val x: Self) extends AnyVal {
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
    def setContestedFunds(value: MoneyData): Self = this.set("ContestedFunds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContestedFunds: Self = this.set("ContestedFunds", js.undefined)
  }
  
}

