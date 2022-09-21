package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestoreDatabaseMetadata extends StObject {
  
  /**
    * Information about the backup used to restore the database.
    */
  var backupInfo: js.UndefOr[SchemaBackupInfo] = js.undefined
  
  /**
    * The time at which cancellation of this operation was received. Operations.CancelOperation starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
    */
  var cancelTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the database being created and restored to.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If exists, the name of the long-running operation that will be used to track the post-restore optimization process to optimize the performance of the restored database, and remove the dependency on the restore source. The name is of the form `projects//instances//databases//operations/` where the is the name of database being created and restored to. The metadata type of the long-running operation is OptimizeRestoredDatabaseMetadata. This long-running operation will be automatically created by the system after the RestoreDatabase long-running operation completes successfully. This operation will not be created if the restore was not successful.
    */
  var optimizeDatabaseOperationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The progress of the RestoreDatabase operation.
    */
  var progress: js.UndefOr[SchemaOperationProgress] = js.undefined
  
  /**
    * The type of the restore source.
    */
  var sourceType: js.UndefOr[String | Null] = js.undefined
}
object SchemaRestoreDatabaseMetadata {
  
  inline def apply(): SchemaRestoreDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestoreDatabaseMetadata]
  }
  
  extension [Self <: SchemaRestoreDatabaseMetadata](x: Self) {
    
    inline def setBackupInfo(value: SchemaBackupInfo): Self = StObject.set(x, "backupInfo", value.asInstanceOf[js.Any])
    
    inline def setBackupInfoUndefined: Self = StObject.set(x, "backupInfo", js.undefined)
    
    inline def setCancelTime(value: String): Self = StObject.set(x, "cancelTime", value.asInstanceOf[js.Any])
    
    inline def setCancelTimeNull: Self = StObject.set(x, "cancelTime", null)
    
    inline def setCancelTimeUndefined: Self = StObject.set(x, "cancelTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptimizeDatabaseOperationName(value: String): Self = StObject.set(x, "optimizeDatabaseOperationName", value.asInstanceOf[js.Any])
    
    inline def setOptimizeDatabaseOperationNameNull: Self = StObject.set(x, "optimizeDatabaseOperationName", null)
    
    inline def setOptimizeDatabaseOperationNameUndefined: Self = StObject.set(x, "optimizeDatabaseOperationName", js.undefined)
    
    inline def setProgress(value: SchemaOperationProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeNull: Self = StObject.set(x, "sourceType", null)
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
  }
}
