package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for BeginTransaction.
  */
@js.native
trait SchemaBeginTransactionRequest extends js.Object {
  /**
    * Required. Options for the new transaction.
    */
  var options: js.UndefOr[SchemaTransactionOptions] = js.native
}

object SchemaBeginTransactionRequest {
  @scala.inline
  def apply(options: SchemaTransactionOptions = null): SchemaBeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBeginTransactionRequest]
  }
}

