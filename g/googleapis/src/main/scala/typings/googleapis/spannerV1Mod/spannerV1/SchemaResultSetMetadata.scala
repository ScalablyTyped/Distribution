package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a ResultSet or PartialResultSet.
  */
@js.native
trait SchemaResultSetMetadata extends js.Object {
  /**
    * Indicates the field names and types for the rows in the result set.  For
    * example, a SQL query like `&quot;SELECT UserId, UserName FROM
    * Users&quot;` could return a `row_type` value like: &quot;fields&quot;: [
    * { &quot;name&quot;: &quot;UserId&quot;, &quot;type&quot;: {
    * &quot;code&quot;: &quot;INT64&quot; } },       { &quot;name&quot;:
    * &quot;UserName&quot;, &quot;type&quot;: { &quot;code&quot;:
    * &quot;STRING&quot; } },     ]
    */
  var rowType: js.UndefOr[SchemaStructType] = js.native
  /**
    * If the read or SQL query began a transaction as a side-effect, the
    * information about the new transaction is yielded here.
    */
  var transaction: js.UndefOr[SchemaTransaction] = js.native
}

object SchemaResultSetMetadata {
  @scala.inline
  def apply(): SchemaResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultSetMetadata]
  }
  @scala.inline
  implicit class SchemaResultSetMetadataOps[Self <: SchemaResultSetMetadata] (val x: Self) extends AnyVal {
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
    def setRowType(value: SchemaStructType): Self = this.set("rowType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowType: Self = this.set("rowType", js.undefined)
    @scala.inline
    def setTransaction(value: SchemaTransaction): Self = this.set("transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
  
}

