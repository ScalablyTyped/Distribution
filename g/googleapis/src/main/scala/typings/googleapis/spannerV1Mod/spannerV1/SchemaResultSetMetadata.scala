package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResultSetMetadata extends StObject {
  
  /**
    * Indicates the field names and types for the rows in the result set. For example, a SQL query like `"SELECT UserId, UserName FROM Users"` could return a `row_type` value like: "fields": [ { "name": "UserId", "type": { "code": "INT64" \} \}, { "name": "UserName", "type": { "code": "STRING" \} \}, ]
    */
  var rowType: js.UndefOr[SchemaStructType] = js.undefined
  
  /**
    * If the read or SQL query began a transaction as a side-effect, the information about the new transaction is yielded here.
    */
  var transaction: js.UndefOr[SchemaTransaction] = js.undefined
}
object SchemaResultSetMetadata {
  
  inline def apply(): SchemaResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultSetMetadata]
  }
  
  extension [Self <: SchemaResultSetMetadata](x: Self) {
    
    inline def setRowType(value: SchemaStructType): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
    
    inline def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
    
    inline def setTransaction(value: SchemaTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
