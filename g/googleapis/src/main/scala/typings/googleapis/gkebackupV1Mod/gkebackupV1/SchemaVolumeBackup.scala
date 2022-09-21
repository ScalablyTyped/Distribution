package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVolumeBackup extends StObject {
  
  /**
    * Output only. The timestamp when the associated underlying volume backup operation completed.
    */
  var completeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when this VolumeBackup resource was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The minimum size of the disk to which this VolumeBackup can be restored.
    */
  var diskSizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a volume backup from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform volume backup updates in order to avoid race conditions.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The format used for the volume backup.
    */
  var format: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The full name of the VolumeBackup resource. Format: `projects/x/locations/x/backupPlans/x/backups/x/volumeBackups/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A reference to the source Kubernetes PVC from which this VolumeBackup was created.
    */
  var sourcePvc: js.UndefOr[SchemaNamespacedName] = js.undefined
  
  /**
    * Output only. The current state of this VolumeBackup.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A human readable message explaining why the VolumeBackup is in its current state.
    */
  var stateMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The aggregate size of the underlying artifacts associated with this VolumeBackup in the backup storage. This may change over time when multiple backups of the same volume share the same backup storage location. In particular, this is likely to increase in size when the immediately preceding backup of the same volume is deleted.
    */
  var storageBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Server generated global unique identifier of [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when this VolumeBackup resource was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A storage system-specific opaque handle to the underlying volume backup.
    */
  var volumeBackupHandle: js.UndefOr[String | Null] = js.undefined
}
object SchemaVolumeBackup {
  
  inline def apply(): SchemaVolumeBackup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolumeBackup]
  }
  
  extension [Self <: SchemaVolumeBackup](x: Self) {
    
    inline def setCompleteTime(value: String): Self = StObject.set(x, "completeTime", value.asInstanceOf[js.Any])
    
    inline def setCompleteTimeNull: Self = StObject.set(x, "completeTime", null)
    
    inline def setCompleteTimeUndefined: Self = StObject.set(x, "completeTime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDiskSizeBytes(value: String): Self = StObject.set(x, "diskSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeBytesNull: Self = StObject.set(x, "diskSizeBytes", null)
    
    inline def setDiskSizeBytesUndefined: Self = StObject.set(x, "diskSizeBytes", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSourcePvc(value: SchemaNamespacedName): Self = StObject.set(x, "sourcePvc", value.asInstanceOf[js.Any])
    
    inline def setSourcePvcUndefined: Self = StObject.set(x, "sourcePvc", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMessage(value: String): Self = StObject.set(x, "stateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageNull: Self = StObject.set(x, "stateMessage", null)
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "stateMessage", js.undefined)
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStorageBytes(value: String): Self = StObject.set(x, "storageBytes", value.asInstanceOf[js.Any])
    
    inline def setStorageBytesNull: Self = StObject.set(x, "storageBytes", null)
    
    inline def setStorageBytesUndefined: Self = StObject.set(x, "storageBytes", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVolumeBackupHandle(value: String): Self = StObject.set(x, "volumeBackupHandle", value.asInstanceOf[js.Any])
    
    inline def setVolumeBackupHandleNull: Self = StObject.set(x, "volumeBackupHandle", null)
    
    inline def setVolumeBackupHandleUndefined: Self = StObject.set(x, "volumeBackupHandle", js.undefined)
  }
}
