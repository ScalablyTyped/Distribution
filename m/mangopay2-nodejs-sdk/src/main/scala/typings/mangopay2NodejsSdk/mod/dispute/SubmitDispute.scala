package typings.mangopay2NodejsSdk.mod.dispute

import typings.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.dispute.DisputeData, 'ContestedFunds'> */
trait SubmitDispute extends js.Object {
  var ContestedFunds: js.UndefOr[MoneyData] = js.undefined
}

object SubmitDispute {
  @scala.inline
  def apply(ContestedFunds: MoneyData = null): SubmitDispute = {
    val __obj = js.Dynamic.literal()
    if (ContestedFunds != null) __obj.updateDynamic("ContestedFunds")(ContestedFunds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitDispute]
  }
}

