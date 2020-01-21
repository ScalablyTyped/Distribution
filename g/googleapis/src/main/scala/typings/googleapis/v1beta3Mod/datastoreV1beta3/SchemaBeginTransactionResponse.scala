package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Datastore.BeginTransaction.
  */
@js.native
trait SchemaBeginTransactionResponse extends js.Object {
  /**
    * The transaction identifier (always present).
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

