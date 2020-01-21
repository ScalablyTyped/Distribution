package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Firestore.Commit.
  */
@js.native
trait SchemaCommitRequest extends js.Object {
  /**
    * If set, applies all writes in this transaction, and commits it.
    */
  var transaction: js.UndefOr[String] = js.native
  /**
    * The writes to apply.  Always executed atomically and in order.
    */
  var writes: js.UndefOr[js.Array[SchemaWrite]] = js.native
}

object SchemaCommitRequest {
  @scala.inline
  def apply(transaction: String = null, writes: js.Array[SchemaWrite] = null): SchemaCommitRequest = {
    val __obj = js.Dynamic.literal()
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (writes != null) __obj.updateDynamic("writes")(writes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCommitRequest]
  }
}

