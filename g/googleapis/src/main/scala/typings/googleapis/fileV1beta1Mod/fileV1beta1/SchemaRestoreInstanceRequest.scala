package typings.googleapis.fileV1beta1Mod.fileV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestoreInstanceRequest extends StObject {
  
  /**
    * Required. Name of the file share in the Filestore instance that the snapshot is being restored to.
    */
  var fileShare: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the backup, in the format `projects/{project_id\}/locations/{location_id\}/backups/{backup_id\}`.
    */
  var sourceBackup: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the snapshot, in the format `projects/{project_id\}/locations/{location_id\}/snapshots/{snapshot_id\}`.
    */
  var sourceSnapshot: js.UndefOr[String | Null] = js.undefined
}
object SchemaRestoreInstanceRequest {
  
  inline def apply(): SchemaRestoreInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestoreInstanceRequest]
  }
  
  extension [Self <: SchemaRestoreInstanceRequest](x: Self) {
    
    inline def setFileShare(value: String): Self = StObject.set(x, "fileShare", value.asInstanceOf[js.Any])
    
    inline def setFileShareNull: Self = StObject.set(x, "fileShare", null)
    
    inline def setFileShareUndefined: Self = StObject.set(x, "fileShare", js.undefined)
    
    inline def setSourceBackup(value: String): Self = StObject.set(x, "sourceBackup", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupNull: Self = StObject.set(x, "sourceBackup", null)
    
    inline def setSourceBackupUndefined: Self = StObject.set(x, "sourceBackup", js.undefined)
    
    inline def setSourceSnapshot(value: String): Self = StObject.set(x, "sourceSnapshot", value.asInstanceOf[js.Any])
    
    inline def setSourceSnapshotNull: Self = StObject.set(x, "sourceSnapshot", null)
    
    inline def setSourceSnapshotUndefined: Self = StObject.set(x, "sourceSnapshot", js.undefined)
  }
}
