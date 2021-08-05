package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Read and StreamingRead.
  */
trait SchemaReadRequest extends StObject {
  
  /**
    * The columns of table to be returned for each row matching this request.
    */
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If non-empty, the name of an index on table. This index is used instead
    * of the table primary key when interpreting key_set and sorting result
    * rows. See key_set for further information.
    */
  var index: js.UndefOr[String] = js.undefined
  
  /**
    * Required. `key_set` identifies the rows to be yielded. `key_set` names
    * the primary keys of the rows in table to be yielded, unless index is
    * present. If index is present, then key_set instead names index keys in
    * index.  If the partition_token field is empty, rows are yielded in table
    * primary key order (if index is empty) or index key order (if index is
    * non-empty).  If the partition_token field is not empty, rows will be
    * yielded in an unspecified order.  It is not an error for the `key_set` to
    * name rows that do not exist in the database. Read yields nothing for
    * nonexistent rows.
    */
  var keySet: js.UndefOr[SchemaKeySet] = js.undefined
  
  /**
    * If greater than zero, only the first `limit` rows are yielded. If `limit`
    * is zero, the default is no limit. A limit cannot be specified if
    * `partition_token` is set.
    */
  var limit: js.UndefOr[String] = js.undefined
  
  /**
    * If present, results will be restricted to the specified partition
    * previously created using PartitionRead().    There must be an exact match
    * for the values of fields common to this message and the
    * PartitionReadRequest message used to create this partition_token.
    */
  var partitionToken: js.UndefOr[String] = js.undefined
  
  /**
    * If this request is resuming a previously interrupted read, `resume_token`
    * should be copied from the last PartialResultSet yielded before the
    * interruption. Doing this enables the new read to resume where the last
    * read left off. The rest of the request parameters must exactly match the
    * request that yielded this token.
    */
  var resumeToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the table in the database to be read.
    */
  var table: js.UndefOr[String] = js.undefined
  
  /**
    * The transaction to use. If none is provided, the default is a temporary
    * read-only transaction with strong concurrency.
    */
  var transaction: js.UndefOr[SchemaTransactionSelector] = js.undefined
}
object SchemaReadRequest {
  
  inline def apply(): SchemaReadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadRequest]
  }
  
  extension [Self <: SchemaReadRequest](x: Self) {
    
    inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKeySet(value: SchemaKeySet): Self = StObject.set(x, "keySet", value.asInstanceOf[js.Any])
    
    inline def setKeySetUndefined: Self = StObject.set(x, "keySet", js.undefined)
    
    inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setPartitionToken(value: String): Self = StObject.set(x, "partitionToken", value.asInstanceOf[js.Any])
    
    inline def setPartitionTokenUndefined: Self = StObject.set(x, "partitionToken", js.undefined)
    
    inline def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setTransaction(value: SchemaTransactionSelector): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
