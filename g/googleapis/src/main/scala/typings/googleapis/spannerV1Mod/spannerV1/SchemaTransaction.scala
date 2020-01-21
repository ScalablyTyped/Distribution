package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(id: String = null, readTimestamp: String = null): SchemaTransaction = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (readTimestamp != null) __obj.updateDynamic("readTimestamp")(readTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTransaction]
  }
}

