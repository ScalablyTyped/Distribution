package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message is used to select the transaction in which a Read or
  * ExecuteSql call runs.  See TransactionOptions for more information about
  * transactions.
  */
@js.native
trait SchemaTransactionSelector extends js.Object {
  /**
    * Begin a new transaction and execute this read or SQL query in it. The
    * transaction ID of the new transaction is returned in
    * ResultSetMetadata.transaction, which is a Transaction.
    */
  var begin: js.UndefOr[SchemaTransactionOptions] = js.native
  /**
    * Execute the read or SQL query in a previously-started transaction.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Execute the read or SQL query in a temporary transaction. This is the
    * most efficient way to execute a transaction that consists of a single SQL
    * query.
    */
  var singleUse: js.UndefOr[SchemaTransactionOptions] = js.native
}

object SchemaTransactionSelector {
  @scala.inline
  def apply(
    begin: SchemaTransactionOptions = null,
    id: String = null,
    singleUse: SchemaTransactionOptions = null
  ): SchemaTransactionSelector = {
    val __obj = js.Dynamic.literal()
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (singleUse != null) __obj.updateDynamic("singleUse")(singleUse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTransactionSelector]
  }
}

