package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Rollback.
  */
@js.native
trait SchemaRollbackRequest extends js.Object {
  /**
    * Required. The transaction to roll back.
    */
  var transactionId: js.UndefOr[String] = js.native
}

object SchemaRollbackRequest {
  @scala.inline
  def apply(transactionId: String = null): SchemaRollbackRequest = {
    val __obj = js.Dynamic.literal()
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRollbackRequest]
  }
}

