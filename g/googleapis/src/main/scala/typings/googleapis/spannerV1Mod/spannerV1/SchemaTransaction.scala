package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A transaction.
  */
@js.native
trait SchemaTransaction extends js.Object {
  
  /**
    * `id` may be used to identify the transaction in subsequent Read,
    * ExecuteSql, Commit, or Rollback calls.  Single-use read-only transactions
    * do not have IDs, because single-use transactions do not support multiple
    * requests.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * For snapshot read-only transactions, the read timestamp chosen for the
    * transaction. Not returned by default: see
    * TransactionOptions.ReadOnly.return_read_timestamp.  A timestamp in
    * RFC3339 UTC \&quot;Zulu\&quot; format, accurate to nanoseconds. Example:
    * `&quot;2014-10-02T15:01:23.045123456Z&quot;`.
    */
  var readTimestamp: js.UndefOr[String] = js.native
}
object SchemaTransaction {
  
  @scala.inline
  def apply(): SchemaTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransaction]
  }
  
  @scala.inline
  implicit class SchemaTransactionOps[Self <: SchemaTransaction] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setReadTimestamp(value: String): Self = this.set("readTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadTimestamp: Self = this.set("readTimestamp", js.undefined)
  }
}
