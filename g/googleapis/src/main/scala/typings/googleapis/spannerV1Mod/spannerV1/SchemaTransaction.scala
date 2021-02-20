package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A transaction.
  */
@js.native
trait SchemaTransaction extends StObject {
  
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
  implicit class SchemaTransactionMutableBuilder[Self <: SchemaTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setReadTimestamp(value: String): Self = StObject.set(x, "readTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimestampUndefined: Self = StObject.set(x, "readTimestamp", js.undefined)
  }
}
