package typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionToCommit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var accountStatesList: js.Array[
    typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.AccountState.AsObject
  ]
  var eventsList: js.Array[typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod.Event.AsObject]
  var gasUsed: String
  var signedTxn: js.UndefOr[
    typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    accountStatesList: js.Array[
      typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.AccountState.AsObject
    ],
    eventsList: js.Array[typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod.Event.AsObject],
    gasUsed: String,
    signedTxn: typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(accountStatesList = accountStatesList.asInstanceOf[js.Any], eventsList = eventsList.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any])
    if (signedTxn != null) __obj.updateDynamic("signedTxn")(signedTxn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

