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
  def apply(): SchemaTransactionSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransactionSelector]
  }
  @scala.inline
  implicit class SchemaTransactionSelectorOps[Self <: SchemaTransactionSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBegin(value: SchemaTransactionOptions): Self = this.set("begin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setSingleUse(value: SchemaTransactionOptions): Self = this.set("singleUse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleUse: Self = this.set("singleUse", js.undefined)
  }
  
}

