package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransaction extends StObject {
  
  /**
    * `id` may be used to identify the transaction in subsequent Read, ExecuteSql, Commit, or Rollback calls. Single-use read-only transactions do not have IDs, because single-use transactions do not support multiple requests.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For snapshot read-only transactions, the read timestamp chosen for the transaction. Not returned by default: see TransactionOptions.ReadOnly.return_read_timestamp. A timestamp in RFC3339 UTC \"Zulu\" format, accurate to nanoseconds. Example: `"2014-10-02T15:01:23.045123456Z"`.
    */
  var readTimestamp: js.UndefOr[String | Null] = js.undefined
}
object SchemaTransaction {
  
  inline def apply(): SchemaTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransaction]
  }
  
  extension [Self <: SchemaTransaction](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setReadTimestamp(value: String): Self = StObject.set(x, "readTimestamp", value.asInstanceOf[js.Any])
    
    inline def setReadTimestampNull: Self = StObject.set(x, "readTimestamp", null)
    
    inline def setReadTimestampUndefined: Self = StObject.set(x, "readTimestamp", js.undefined)
  }
}
