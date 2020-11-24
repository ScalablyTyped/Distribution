package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobConfigurationTableCopy extends js.Object {
  
  /**
    * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table.
    * CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append
    * actions occur as one atomic update upon job completion.
    */
  var createDisposition: js.UndefOr[String] = js.native
  
  /** Custom encryption configuration (e.g., Cloud KMS keys). */
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  
  /** [Optional] The time when the destination table expires. Expired tables will be deleted and their storage reclaimed. */
  var destinationExpirationTime: js.UndefOr[js.Any] = js.native
  
  /** [Required] The destination table */
  var destinationTable: js.UndefOr[TableReference] = js.native
  
  /** [Optional] Supported operation types in table copy job. */
  var operationType: js.UndefOr[String] = js.native
  
  /** [Pick one] Source table to copy. */
  var sourceTable: js.UndefOr[TableReference] = js.native
  
  /** [Pick one] Source tables to copy. */
  var sourceTables: js.UndefOr[js.Array[TableReference]] = js.native
  
  /**
    * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery
    * overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a
    * 'duplicate' error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully.
    * Creation, truncation and append actions occur as one atomic update upon job completion.
    */
  var writeDisposition: js.UndefOr[String] = js.native
}
object JobConfigurationTableCopy {
  
  @scala.inline
  def apply(): JobConfigurationTableCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationTableCopy]
  }
  
  @scala.inline
  implicit class JobConfigurationTableCopyOps[Self <: JobConfigurationTableCopy] (val x: Self) extends AnyVal {
    
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
    def setCreateDisposition(value: String): Self = this.set("createDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDisposition: Self = this.set("createDisposition", js.undefined)
    
    @scala.inline
    def setDestinationEncryptionConfiguration(value: EncryptionConfiguration): Self = this.set("destinationEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationEncryptionConfiguration: Self = this.set("destinationEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setDestinationExpirationTime(value: js.Any): Self = this.set("destinationExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationExpirationTime: Self = this.set("destinationExpirationTime", js.undefined)
    
    @scala.inline
    def setDestinationTable(value: TableReference): Self = this.set("destinationTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationTable: Self = this.set("destinationTable", js.undefined)
    
    @scala.inline
    def setOperationType(value: String): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setSourceTable(value: TableReference): Self = this.set("sourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTable: Self = this.set("sourceTable", js.undefined)
    
    @scala.inline
    def setSourceTablesVarargs(value: TableReference*): Self = this.set("sourceTables", js.Array(value :_*))
    
    @scala.inline
    def setSourceTables(value: js.Array[TableReference]): Self = this.set("sourceTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTables: Self = this.set("sourceTables", js.undefined)
    
    @scala.inline
    def setWriteDisposition(value: String): Self = this.set("writeDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteDisposition: Self = this.set("writeDisposition", js.undefined)
  }
}
