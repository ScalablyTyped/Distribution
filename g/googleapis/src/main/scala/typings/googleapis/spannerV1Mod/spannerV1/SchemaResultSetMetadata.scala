package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata about a ResultSet or PartialResultSet.
  */
trait SchemaResultSetMetadata extends StObject {
  
  /**
    * Indicates the field names and types for the rows in the result set.  For
    * example, a SQL query like `&quot;SELECT UserId, UserName FROM
    * Users&quot;` could return a `row_type` value like: &quot;fields&quot;: [
    * { &quot;name&quot;: &quot;UserId&quot;, &quot;type&quot;: {
    * &quot;code&quot;: &quot;INT64&quot; } },       { &quot;name&quot;:
    * &quot;UserName&quot;, &quot;type&quot;: { &quot;code&quot;:
    * &quot;STRING&quot; } },     ]
    */
  var rowType: js.UndefOr[SchemaStructType] = js.undefined
  
  /**
    * If the read or SQL query began a transaction as a side-effect, the
    * information about the new transaction is yielded here.
    */
  var transaction: js.UndefOr[SchemaTransaction] = js.undefined
}
object SchemaResultSetMetadata {
  
  @scala.inline
  def apply(): SchemaResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultSetMetadata]
  }
  
  @scala.inline
  implicit class SchemaResultSetMetadataMutableBuilder[Self <: SchemaResultSetMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowType(value: SchemaStructType): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
    
    @scala.inline
    def setTransaction(value: SchemaTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
