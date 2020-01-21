package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.BeginTransaction.
  */
@js.native
trait SchemaBeginTransactionRequest extends js.Object {
  /**
    * Options for a new transaction.
    */
  var transactionOptions: js.UndefOr[SchemaTransactionOptions] = js.native
}

object SchemaBeginTransactionRequest {
  @scala.inline
  def apply(transactionOptions: SchemaTransactionOptions = null): SchemaBeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    if (transactionOptions != null) __obj.updateDynamic("transactionOptions")(transactionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBeginTransactionRequest]
  }
}

