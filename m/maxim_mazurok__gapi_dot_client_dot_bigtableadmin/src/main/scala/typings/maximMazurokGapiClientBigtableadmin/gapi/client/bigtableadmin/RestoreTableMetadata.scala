package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableMetadata extends StObject {
  
  var backupInfo: js.UndefOr[BackupInfo] = js.undefined
  
  /** Name of the table being created and restored to. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * If exists, the name of the long-running operation that will be used to track the post-restore optimization process to optimize the performance of the restored table. The metadata
    * type of the long-running operation is OptimizeRestoreTableMetadata. The response type is Empty. This long-running operation may be automatically created by the system if applicable
    * after the RestoreTable long-running operation completes successfully. This operation may not be created if the table is already optimized or the restore was not successful.
    */
  var optimizeTableOperationName: js.UndefOr[String] = js.undefined
  
  /** The progress of the RestoreTable operation. */
  var progress: js.UndefOr[OperationProgress] = js.undefined
  
  /** The type of the restore source. */
  var sourceType: js.UndefOr[String] = js.undefined
}
object RestoreTableMetadata {
  
  @scala.inline
  def apply(): RestoreTableMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableMetadata]
  }
  
  @scala.inline
  implicit class RestoreTableMetadataMutableBuilder[Self <: RestoreTableMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupInfo(value: BackupInfo): Self = StObject.set(x, "backupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupInfoUndefined: Self = StObject.set(x, "backupInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptimizeTableOperationName(value: String): Self = StObject.set(x, "optimizeTableOperationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeTableOperationNameUndefined: Self = StObject.set(x, "optimizeTableOperationName", js.undefined)
    
    @scala.inline
    def setProgress(value: OperationProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
  }
}
