package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackupPlan extends StObject {
  
  /**
    * Defines the configuration of Backups created via this BackupPlan.
    */
  var backupConfig: js.UndefOr[SchemaBackupConfig] = js.undefined
  
  /**
    * Defines a schedule for automatic Backup creation via this BackupPlan.
    */
  var backupSchedule: js.UndefOr[SchemaSchedule] = js.undefined
  
  /**
    * Required. Immutable. The source cluster from which Backups will be created via this BackupPlan. Valid formats: - `projects/x/locations/x/clusters/x` - `projects/x/zones/x/clusters/x`
    */
  var cluster: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when this BackupPlan resource was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This flag indicates whether this BackupPlan has been deactivated. Setting this field to True locks the BackupPlan such that no further updates will be allowed (except deletes), including the deactivated field itself. It also prevents any new Backups from being created via this BackupPlan (including scheduled Backups). Default: False
    */
  var deactivated: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * User specified descriptive string for this BackupPlan.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a backup plan from overwriting each other. It is strongly suggested that systems make use of the 'etag' in the read-modify-write cycle to perform BackupPlan updates in order to avoid race conditions: An `etag` is returned in the response to `GetBackupPlan`, and systems are expected to put that etag in the request to `UpdateBackupPlan` or `DeleteBackupPlan` to ensure that their change will be applied to the same version of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A set of custom labels supplied by user.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The full name of the BackupPlan resource. Format: `projects/x/locations/x/backupPlans/x`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The number of Kubernetes Pods backed up in the last successful Backup created via this BackupPlan.
    */
  var protectedPodCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * RetentionPolicy governs lifecycle of Backups created under this plan.
    */
  var retentionPolicy: js.UndefOr[SchemaRetentionPolicy] = js.undefined
  
  /**
    * Output only. Server generated global unique identifier of [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when this BackupPlan resource was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackupPlan {
  
  inline def apply(): SchemaBackupPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackupPlan]
  }
  
  extension [Self <: SchemaBackupPlan](x: Self) {
    
    inline def setBackupConfig(value: SchemaBackupConfig): Self = StObject.set(x, "backupConfig", value.asInstanceOf[js.Any])
    
    inline def setBackupConfigUndefined: Self = StObject.set(x, "backupConfig", js.undefined)
    
    inline def setBackupSchedule(value: SchemaSchedule): Self = StObject.set(x, "backupSchedule", value.asInstanceOf[js.Any])
    
    inline def setBackupScheduleUndefined: Self = StObject.set(x, "backupSchedule", js.undefined)
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterNull: Self = StObject.set(x, "cluster", null)
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeactivated(value: Boolean): Self = StObject.set(x, "deactivated", value.asInstanceOf[js.Any])
    
    inline def setDeactivatedNull: Self = StObject.set(x, "deactivated", null)
    
    inline def setDeactivatedUndefined: Self = StObject.set(x, "deactivated", js.undefined)
    
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
    
    inline def setProtectedPodCount(value: Double): Self = StObject.set(x, "protectedPodCount", value.asInstanceOf[js.Any])
    
    inline def setProtectedPodCountNull: Self = StObject.set(x, "protectedPodCount", null)
    
    inline def setProtectedPodCountUndefined: Self = StObject.set(x, "protectedPodCount", js.undefined)
    
    inline def setRetentionPolicy(value: SchemaRetentionPolicy): Self = StObject.set(x, "retentionPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetentionPolicyUndefined: Self = StObject.set(x, "retentionPolicy", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
