package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCopyBackupMetadata extends StObject {
  
  /**
    * The time at which cancellation of CopyBackup operation was received. Operations.CancelOperation starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
    */
  var cancelTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the backup being created through the copy operation. Values are of the form `projects//instances//backups/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The progress of the CopyBackup operation.
    */
  var progress: js.UndefOr[SchemaOperationProgress] = js.undefined
  
  /**
    * The name of the source backup that is being copied. Values are of the form `projects//instances//backups/`.
    */
  var sourceBackup: js.UndefOr[String | Null] = js.undefined
}
object SchemaCopyBackupMetadata {
  
  inline def apply(): SchemaCopyBackupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCopyBackupMetadata]
  }
  
  extension [Self <: SchemaCopyBackupMetadata](x: Self) {
    
    inline def setCancelTime(value: String): Self = StObject.set(x, "cancelTime", value.asInstanceOf[js.Any])
    
    inline def setCancelTimeNull: Self = StObject.set(x, "cancelTime", null)
    
    inline def setCancelTimeUndefined: Self = StObject.set(x, "cancelTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProgress(value: SchemaOperationProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setSourceBackup(value: String): Self = StObject.set(x, "sourceBackup", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupNull: Self = StObject.set(x, "sourceBackup", null)
    
    inline def setSourceBackupUndefined: Self = StObject.set(x, "sourceBackup", js.undefined)
  }
}
