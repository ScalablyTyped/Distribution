package typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.RequestItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var getAccountStateRequest: js.UndefOr[
    typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetAccountStateRequest.AsObject
  ] = js.undefined
  var getAccountTransactionBySequenceNumberRequest: js.UndefOr[
    typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetAccountTransactionBySequenceNumberRequest.AsObject
  ] = js.undefined
  var getEventsByEventAccessPathRequest: js.UndefOr[
    typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetEventsByEventAccessPathRequest.AsObject
  ] = js.undefined
  var getTransactionsRequest: js.UndefOr[
    typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetTransactionsRequest.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    getAccountStateRequest: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetAccountStateRequest.AsObject = null,
    getAccountTransactionBySequenceNumberRequest: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetAccountTransactionBySequenceNumberRequest.AsObject = null,
    getEventsByEventAccessPathRequest: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetEventsByEventAccessPathRequest.AsObject = null,
    getTransactionsRequest: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetTransactionsRequest.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (getAccountStateRequest != null) __obj.updateDynamic("getAccountStateRequest")(getAccountStateRequest.asInstanceOf[js.Any])
    if (getAccountTransactionBySequenceNumberRequest != null) __obj.updateDynamic("getAccountTransactionBySequenceNumberRequest")(getAccountTransactionBySequenceNumberRequest.asInstanceOf[js.Any])
    if (getEventsByEventAccessPathRequest != null) __obj.updateDynamic("getEventsByEventAccessPathRequest")(getEventsByEventAccessPathRequest.asInstanceOf[js.Any])
    if (getTransactionsRequest != null) __obj.updateDynamic("getTransactionsRequest")(getTransactionsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

