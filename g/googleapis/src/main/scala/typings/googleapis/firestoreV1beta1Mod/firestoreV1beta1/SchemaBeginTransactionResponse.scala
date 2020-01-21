package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Firestore.BeginTransaction.
  */
@js.native
trait SchemaBeginTransactionResponse extends js.Object {
  /**
    * The transaction that was started.
    */
  var transaction: js.UndefOr[String] = js.native
}

object SchemaBeginTransactionResponse {
  @scala.inline
  def apply(transaction: String = null): SchemaBeginTransactionResponse = {
    val __obj = js.Dynamic.literal()
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBeginTransactionResponse]
  }
}

