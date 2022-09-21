package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestore extends StObject {
  
  /**
    * Required. Immutable. A reference to the Backup used as the source from which this Restore will restore. Note that this Backup must be a sub-resource of the RestorePlan's backup_plan. Format: `projects/x/locations/x/backupPlans/x/backups/x`.
    */
  var backup: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The target cluster into which this Restore will restore data. Valid formats: - `projects/x/locations/x/clusters/x` - `projects/x/zones/x/clusters/x` Inherited from parent RestorePlan's cluster value.
    */
  var cluster: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp of when the restore operation completed.
    */
  var completeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when this Restore resource was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User specified descriptive string for this Restore.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a restore from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform restore updates in order to avoid race conditions: An `etag` is returned in the response to `GetRestore`, and systems are expected to put that etag in the request to `UpdateRestore` or `DeleteRestore` to ensure that their change will be applied to the same version of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A set of custom labels supplied by user.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The full name of the Restore resource. Format: `projects/x/locations/x/restorePlans/x/restores/x`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Number of resources excluded during the restore execution.
    */
  var resourcesExcludedCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Number of resources that failed to be restored during the restore execution.
    */
  var resourcesFailedCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Number of resources restored during the restore execution.
    */
  var resourcesRestoredCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Configuration of the Restore. Inherited from parent RestorePlan's restore_config.
    */
  var restoreConfig: js.UndefOr[SchemaRestoreConfig] = js.undefined
  
  /**
    * Output only. The current state of the Restore.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Human-readable description of why the Restore is in its current state.
    */
  var stateReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Server generated global unique identifier of [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when this Restore resource was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Number of volumes restored during the restore execution.
    */
  var volumesRestoredCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRestore {
  
  inline def apply(): SchemaRestore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestore]
  }
  
  extension [Self <: SchemaRestore](x: Self) {
    
    inline def setBackup(value: String): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setBackupNull: Self = StObject.set(x, "backup", null)
    
    inline def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterNull: Self = StObject.set(x, "cluster", null)
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setCompleteTime(value: String): Self = StObject.set(x, "completeTime", value.asInstanceOf[js.Any])
    
    inline def setCompleteTimeNull: Self = StObject.set(x, "completeTime", null)
    
    inline def setCompleteTimeUndefined: Self = StObject.set(x, "completeTime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourcesExcludedCount(value: Double): Self = StObject.set(x, "resourcesExcludedCount", value.asInstanceOf[js.Any])
    
    inline def setResourcesExcludedCountNull: Self = StObject.set(x, "resourcesExcludedCount", null)
    
    inline def setResourcesExcludedCountUndefined: Self = StObject.set(x, "resourcesExcludedCount", js.undefined)
    
    inline def setResourcesFailedCount(value: Double): Self = StObject.set(x, "resourcesFailedCount", value.asInstanceOf[js.Any])
    
    inline def setResourcesFailedCountNull: Self = StObject.set(x, "resourcesFailedCount", null)
    
    inline def setResourcesFailedCountUndefined: Self = StObject.set(x, "resourcesFailedCount", js.undefined)
    
    inline def setResourcesRestoredCount(value: Double): Self = StObject.set(x, "resourcesRestoredCount", value.asInstanceOf[js.Any])
    
    inline def setResourcesRestoredCountNull: Self = StObject.set(x, "resourcesRestoredCount", null)
    
    inline def setResourcesRestoredCountUndefined: Self = StObject.set(x, "resourcesRestoredCount", js.undefined)
    
    inline def setRestoreConfig(value: SchemaRestoreConfig): Self = StObject.set(x, "restoreConfig", value.asInstanceOf[js.Any])
    
    inline def setRestoreConfigUndefined: Self = StObject.set(x, "restoreConfig", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateReason(value: String): Self = StObject.set(x, "stateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonNull: Self = StObject.set(x, "stateReason", null)
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "stateReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVolumesRestoredCount(value: Double): Self = StObject.set(x, "volumesRestoredCount", value.asInstanceOf[js.Any])
    
    inline def setVolumesRestoredCountNull: Self = StObject.set(x, "volumesRestoredCount", null)
    
    inline def setVolumesRestoredCountUndefined: Self = StObject.set(x, "volumesRestoredCount", js.undefined)
  }
}
