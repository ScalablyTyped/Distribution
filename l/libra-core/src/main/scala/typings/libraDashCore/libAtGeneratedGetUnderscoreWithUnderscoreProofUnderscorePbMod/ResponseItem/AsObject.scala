package typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.ResponseItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var getAccountStateResponse: js.UndefOr[
    typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetAccountStateResponse.AsObject
  ] = js.undefined
  var getAccountTransactionBySequenceNumberResponse: js.UndefOr[
    typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetAccountTransactionBySequenceNumberResponse.AsObject
  ] = js.undefined
  var getEventsByEventAccessPathResponse: js.UndefOr[
    typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetEventsByEventAccessPathResponse.AsObject
  ] = js.undefined
  var getTransactionsResponse: js.UndefOr[
    typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetTransactionsResponse.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    getAccountStateResponse: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetAccountStateResponse.AsObject = null,
    getAccountTransactionBySequenceNumberResponse: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetAccountTransactionBySequenceNumberResponse.AsObject = null,
    getEventsByEventAccessPathResponse: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetEventsByEventAccessPathResponse.AsObject = null,
    getTransactionsResponse: typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetTransactionsResponse.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (getAccountStateResponse != null) __obj.updateDynamic("getAccountStateResponse")(getAccountStateResponse)
    if (getAccountTransactionBySequenceNumberResponse != null) __obj.updateDynamic("getAccountTransactionBySequenceNumberResponse")(getAccountTransactionBySequenceNumberResponse)
    if (getEventsByEventAccessPathResponse != null) __obj.updateDynamic("getEventsByEventAccessPathResponse")(getEventsByEventAccessPathResponse)
    if (getTransactionsResponse != null) __obj.updateDynamic("getTransactionsResponse")(getTransactionsResponse)
    __obj.asInstanceOf[AsObject]
  }
}

