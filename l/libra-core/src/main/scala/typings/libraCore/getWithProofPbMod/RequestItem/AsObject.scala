package typings.libraCore.getWithProofPbMod.RequestItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var getAccountStateRequest: js.UndefOr[typings.libraCore.getWithProofPbMod.GetAccountStateRequest.AsObject] = js.undefined
  var getAccountTransactionBySequenceNumberRequest: js.UndefOr[
    typings.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberRequest.AsObject
  ] = js.undefined
  var getEventsByEventAccessPathRequest: js.UndefOr[typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest.AsObject] = js.undefined
  var getTransactionsRequest: js.UndefOr[typings.libraCore.getWithProofPbMod.GetTransactionsRequest.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    getAccountStateRequest: typings.libraCore.getWithProofPbMod.GetAccountStateRequest.AsObject = null,
    getAccountTransactionBySequenceNumberRequest: typings.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberRequest.AsObject = null,
    getEventsByEventAccessPathRequest: typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest.AsObject = null,
    getTransactionsRequest: typings.libraCore.getWithProofPbMod.GetTransactionsRequest.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (getAccountStateRequest != null) __obj.updateDynamic("getAccountStateRequest")(getAccountStateRequest.asInstanceOf[js.Any])
    if (getAccountTransactionBySequenceNumberRequest != null) __obj.updateDynamic("getAccountTransactionBySequenceNumberRequest")(getAccountTransactionBySequenceNumberRequest.asInstanceOf[js.Any])
    if (getEventsByEventAccessPathRequest != null) __obj.updateDynamic("getEventsByEventAccessPathRequest")(getEventsByEventAccessPathRequest.asInstanceOf[js.Any])
    if (getTransactionsRequest != null) __obj.updateDynamic("getTransactionsRequest")(getTransactionsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

