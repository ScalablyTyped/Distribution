package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreTableMetadata extends js.Object {
  
  var backupInfo: js.UndefOr[BackupInfo] = js.native
  
  /** Name of the table being created and restored to. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If exists, the name of the long-running operation that will be used to track the post-restore optimization process to optimize the performance of the restored table. The metadata
    * type of the long-running operation is OptimizeRestoreTableMetadata. The response type is Empty. This long-running operation may be automatically created by the system if applicable
    * after the RestoreTable long-running operation completes successfully. This operation may not be created if the table is already optimized or the restore was not successful.
    */
  var optimizeTableOperationName: js.UndefOr[String] = js.native
  
  /** The progress of the RestoreTable operation. */
  var progress: js.UndefOr[OperationProgress] = js.native
  
  /** The type of the restore source. */
  var sourceType: js.UndefOr[String] = js.native
}
object RestoreTableMetadata {
  
  @scala.inline
  def apply(): RestoreTableMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableMetadata]
  }
  
  @scala.inline
  implicit class RestoreTableMetadataOps[Self <: RestoreTableMetadata] (val x: Self) extends AnyVal {
    
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
    def setBackupInfo(value: BackupInfo): Self = this.set("backupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupInfo: Self = this.set("backupInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOptimizeTableOperationName(value: String): Self = this.set("optimizeTableOperationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizeTableOperationName: Self = this.set("optimizeTableOperationName", js.undefined)
    
    @scala.inline
    def setProgress(value: OperationProgress): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setSourceType(value: String): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
  }
}
