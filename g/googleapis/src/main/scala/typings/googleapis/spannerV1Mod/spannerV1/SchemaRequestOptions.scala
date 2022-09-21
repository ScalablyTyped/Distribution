package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequestOptions extends StObject {
  
  /**
    * Priority for the request.
    */
  var priority: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A per-request tag which can be applied to queries or reads, used for statistics collection. Both request_tag and transaction_tag can be specified for a read or query that belongs to a transaction. This field is ignored for requests where it's not applicable (e.g. CommitRequest). Legal characters for `request_tag` values are all printable characters (ASCII 32 - 126) and the length of a request_tag is limited to 50 characters. Values that exceed this limit are truncated. Any leading underscore (_) characters will be removed from the string.
    */
  var requestTag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A tag used for statistics collection about this transaction. Both request_tag and transaction_tag can be specified for a read or query that belongs to a transaction. The value of transaction_tag should be the same for all requests belonging to the same transaction. If this request doesn't belong to any transaction, transaction_tag will be ignored. Legal characters for `transaction_tag` values are all printable characters (ASCII 32 - 126) and the length of a transaction_tag is limited to 50 characters. Values that exceed this limit are truncated. Any leading underscore (_) characters will be removed from the string.
    */
  var transactionTag: js.UndefOr[String | Null] = js.undefined
}
object SchemaRequestOptions {
  
  inline def apply(): SchemaRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestOptions]
  }
  
  extension [Self <: SchemaRequestOptions](x: Self) {
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRequestTag(value: String): Self = StObject.set(x, "requestTag", value.asInstanceOf[js.Any])
    
    inline def setRequestTagNull: Self = StObject.set(x, "requestTag", null)
    
    inline def setRequestTagUndefined: Self = StObject.set(x, "requestTag", js.undefined)
    
    inline def setTransactionTag(value: String): Self = StObject.set(x, "transactionTag", value.asInstanceOf[js.Any])
    
    inline def setTransactionTagNull: Self = StObject.set(x, "transactionTag", null)
    
    inline def setTransactionTagUndefined: Self = StObject.set(x, "transactionTag", js.undefined)
  }
}
