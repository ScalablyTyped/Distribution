package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Firestore.Rollback.
  */
@js.native
trait SchemaRollbackRequest extends js.Object {
  /**
    * The transaction to roll back.
    */
  var transaction: js.UndefOr[String] = js.native
}

object SchemaRollbackRequest {
  @scala.inline
  def apply(transaction: String = null): SchemaRollbackRequest = {
    val __obj = js.Dynamic.literal()
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRollbackRequest]
  }
}

