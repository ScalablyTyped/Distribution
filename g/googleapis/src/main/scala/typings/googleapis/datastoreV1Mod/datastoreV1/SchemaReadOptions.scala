package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options shared by read requests.
  */
@js.native
trait SchemaReadOptions extends js.Object {
  /**
    * The non-transactional read consistency to use. Cannot be set to `STRONG`
    * for global queries.
    */
  var readConsistency: js.UndefOr[String] = js.native
  /**
    * The identifier of the transaction in which to read. A transaction
    * identifier is returned by a call to Datastore.BeginTransaction.
    */
  var transaction: js.UndefOr[String] = js.native
}

object SchemaReadOptions {
  @scala.inline
  def apply(readConsistency: String = null, transaction: String = null): SchemaReadOptions = {
    val __obj = js.Dynamic.literal()
    if (readConsistency != null) __obj.updateDynamic("readConsistency")(readConsistency.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReadOptions]
  }
}

