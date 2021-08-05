package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobConfigurationTableCopy extends StObject {
  
  /**
    * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table.
    * CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append
    * actions occur as one atomic update upon job completion.
    */
  var createDisposition: js.UndefOr[String] = js.undefined
  
  /** Custom encryption configuration (e.g., Cloud KMS keys). */
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  
  /** [Optional] The time when the destination table expires. Expired tables will be deleted and their storage reclaimed. */
  var destinationExpirationTime: js.UndefOr[js.Any] = js.undefined
  
  /** [Required] The destination table */
  var destinationTable: js.UndefOr[TableReference] = js.undefined
  
  /** [Optional] Supported operation types in table copy job. */
  var operationType: js.UndefOr[String] = js.undefined
  
  /** [Pick one] Source table to copy. */
  var sourceTable: js.UndefOr[TableReference] = js.undefined
  
  /** [Pick one] Source tables to copy. */
  var sourceTables: js.UndefOr[js.Array[TableReference]] = js.undefined
  
  /**
    * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery
    * overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a
    * 'duplicate' error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully.
    * Creation, truncation and append actions occur as one atomic update upon job completion.
    */
  var writeDisposition: js.UndefOr[String] = js.undefined
}
object JobConfigurationTableCopy {
  
  inline def apply(): JobConfigurationTableCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationTableCopy]
  }
  
  extension [Self <: JobConfigurationTableCopy](x: Self) {
    
    inline def setCreateDisposition(value: String): Self = StObject.set(x, "createDisposition", value.asInstanceOf[js.Any])
    
    inline def setCreateDispositionUndefined: Self = StObject.set(x, "createDisposition", js.undefined)
    
    inline def setDestinationEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "destinationEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDestinationEncryptionConfigurationUndefined: Self = StObject.set(x, "destinationEncryptionConfiguration", js.undefined)
    
    inline def setDestinationExpirationTime(value: js.Any): Self = StObject.set(x, "destinationExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setDestinationExpirationTimeUndefined: Self = StObject.set(x, "destinationExpirationTime", js.undefined)
    
    inline def setDestinationTable(value: TableReference): Self = StObject.set(x, "destinationTable", value.asInstanceOf[js.Any])
    
    inline def setDestinationTableUndefined: Self = StObject.set(x, "destinationTable", js.undefined)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setSourceTable(value: TableReference): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
    
    inline def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
    
    inline def setSourceTables(value: js.Array[TableReference]): Self = StObject.set(x, "sourceTables", value.asInstanceOf[js.Any])
    
    inline def setSourceTablesUndefined: Self = StObject.set(x, "sourceTables", js.undefined)
    
    inline def setSourceTablesVarargs(value: TableReference*): Self = StObject.set(x, "sourceTables", js.Array(value :_*))
    
    inline def setWriteDisposition(value: String): Self = StObject.set(x, "writeDisposition", value.asInstanceOf[js.Any])
    
    inline def setWriteDispositionUndefined: Self = StObject.set(x, "writeDisposition", js.undefined)
  }
}
