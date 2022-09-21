package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPartitionReadRequest extends StObject {
  
  /**
    * The columns of table to be returned for each row matching this request.
    */
  var columns: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * If non-empty, the name of an index on table. This index is used instead of the table primary key when interpreting key_set and sorting result rows. See key_set for further information.
    */
  var index: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. `key_set` identifies the rows to be yielded. `key_set` names the primary keys of the rows in table to be yielded, unless index is present. If index is present, then key_set instead names index keys in index. It is not an error for the `key_set` to name rows that do not exist in the database. Read yields nothing for nonexistent rows.
    */
  var keySet: js.UndefOr[SchemaKeySet] = js.undefined
  
  /**
    * Additional options that affect how many partitions are created.
    */
  var partitionOptions: js.UndefOr[SchemaPartitionOptions] = js.undefined
  
  /**
    * Required. The name of the table in the database to be read.
    */
  var table: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Read only snapshot transactions are supported, read/write and single use transactions are not.
    */
  var transaction: js.UndefOr[SchemaTransactionSelector] = js.undefined
}
object SchemaPartitionReadRequest {
  
  inline def apply(): SchemaPartitionReadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartitionReadRequest]
  }
  
  extension [Self <: SchemaPartitionReadRequest](x: Self) {
    
    inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKeySet(value: SchemaKeySet): Self = StObject.set(x, "keySet", value.asInstanceOf[js.Any])
    
    inline def setKeySetUndefined: Self = StObject.set(x, "keySet", js.undefined)
    
    inline def setPartitionOptions(value: SchemaPartitionOptions): Self = StObject.set(x, "partitionOptions", value.asInstanceOf[js.Any])
    
    inline def setPartitionOptionsUndefined: Self = StObject.set(x, "partitionOptions", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableNull: Self = StObject.set(x, "table", null)
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setTransaction(value: SchemaTransactionSelector): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
