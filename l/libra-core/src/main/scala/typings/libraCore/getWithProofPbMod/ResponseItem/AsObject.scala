package typings.libraCore.getWithProofPbMod.ResponseItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var getAccountStateResponse: js.UndefOr[typings.libraCore.getWithProofPbMod.GetAccountStateResponse.AsObject] = js.undefined
  var getAccountTransactionBySequenceNumberResponse: js.UndefOr[
    typings.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberResponse.AsObject
  ] = js.undefined
  var getEventsByEventAccessPathResponse: js.UndefOr[typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathResponse.AsObject] = js.undefined
  var getTransactionsResponse: js.UndefOr[typings.libraCore.getWithProofPbMod.GetTransactionsResponse.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    getAccountStateResponse: typings.libraCore.getWithProofPbMod.GetAccountStateResponse.AsObject = null,
    getAccountTransactionBySequenceNumberResponse: typings.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberResponse.AsObject = null,
    getEventsByEventAccessPathResponse: typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathResponse.AsObject = null,
    getTransactionsResponse: typings.libraCore.getWithProofPbMod.GetTransactionsResponse.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (getAccountStateResponse != null) __obj.updateDynamic("getAccountStateResponse")(getAccountStateResponse.asInstanceOf[js.Any])
    if (getAccountTransactionBySequenceNumberResponse != null) __obj.updateDynamic("getAccountTransactionBySequenceNumberResponse")(getAccountTransactionBySequenceNumberResponse.asInstanceOf[js.Any])
    if (getEventsByEventAccessPathResponse != null) __obj.updateDynamic("getEventsByEventAccessPathResponse")(getEventsByEventAccessPathResponse.asInstanceOf[js.Any])
    if (getTransactionsResponse != null) __obj.updateDynamic("getTransactionsResponse")(getTransactionsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

