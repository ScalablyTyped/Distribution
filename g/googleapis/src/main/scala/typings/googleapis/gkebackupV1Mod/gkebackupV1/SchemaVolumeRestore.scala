package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVolumeRestore extends StObject {
  
  /**
    * Output only. The timestamp when the associated underlying volume restoration completed.
    */
  var completeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when this VolumeRestore resource was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a volume restore from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform volume restore updates in order to avoid race conditions.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Full name of the VolumeRestore resource. Format: `projects/x/locations/x/restorePlans/x/restores/x/volumeRestores/x`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of this VolumeRestore.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A human readable message explaining why the VolumeRestore is in its current state.
    */
  var stateMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The reference to the target Kubernetes PVC to be restored.
    */
  var targetPvc: js.UndefOr[SchemaNamespacedName] = js.undefined
  
  /**
    * Output only. Server generated global unique identifier of [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when this VolumeRestore resource was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The full name of the VolumeBackup from which the volume will be restored. Format: `projects/x/locations/x/backupPlans/x/backups/x/volumeBackups/x`.
    */
  var volumeBackup: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A storage system-specific opaque handler to the underlying volume created for the target PVC from the volume backup.
    */
  var volumeHandle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type of volume provisioned
    */
  var volumeType: js.UndefOr[String | Null] = js.undefined
}
object SchemaVolumeRestore {
  
  inline def apply(): SchemaVolumeRestore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolumeRestore]
  }
  
  extension [Self <: SchemaVolumeRestore](x: Self) {
    
    inline def setCompleteTime(value: String): Self = StObject.set(x, "completeTime", value.asInstanceOf[js.Any])
    
    inline def setCompleteTimeNull: Self = StObject.set(x, "completeTime", null)
    
    inline def setCompleteTimeUndefined: Self = StObject.set(x, "completeTime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMessage(value: String): Self = StObject.set(x, "stateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageNull: Self = StObject.set(x, "stateMessage", null)
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "stateMessage", js.undefined)
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTargetPvc(value: SchemaNamespacedName): Self = StObject.set(x, "targetPvc", value.asInstanceOf[js.Any])
    
    inline def setTargetPvcUndefined: Self = StObject.set(x, "targetPvc", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVolumeBackup(value: String): Self = StObject.set(x, "volumeBackup", value.asInstanceOf[js.Any])
    
    inline def setVolumeBackupNull: Self = StObject.set(x, "volumeBackup", null)
    
    inline def setVolumeBackupUndefined: Self = StObject.set(x, "volumeBackup", js.undefined)
    
    inline def setVolumeHandle(value: String): Self = StObject.set(x, "volumeHandle", value.asInstanceOf[js.Any])
    
    inline def setVolumeHandleNull: Self = StObject.set(x, "volumeHandle", null)
    
    inline def setVolumeHandleUndefined: Self = StObject.set(x, "volumeHandle", js.undefined)
    
    inline def setVolumeType(value: String): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeNull: Self = StObject.set(x, "volumeType", null)
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "volumeType", js.undefined)
  }
}
