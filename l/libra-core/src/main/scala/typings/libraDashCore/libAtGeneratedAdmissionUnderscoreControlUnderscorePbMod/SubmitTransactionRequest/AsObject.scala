package typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.SubmitTransactionRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var signedTxn: js.UndefOr[
    typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    signedTxn: typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (signedTxn != null) __obj.updateDynamic("signedTxn")(signedTxn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

