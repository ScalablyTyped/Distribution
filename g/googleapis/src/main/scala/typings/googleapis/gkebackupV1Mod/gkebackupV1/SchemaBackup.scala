package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackup extends StObject {
  
  /**
    * Output only. If True, all namespaces were included in the Backup.
    */
  var allNamespaces: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Information about the GKE cluster from which this Backup was created.
    */
  var clusterMetadata: js.UndefOr[SchemaClusterMetadata] = js.undefined
  
  /**
    * Output only. Completion time of the Backup
    */
  var completeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The size of the config backup in bytes.
    */
  var configBackupSizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether or not the Backup contains Kubernetes Secrets. Controlled by the parent BackupPlan's include_secrets value.
    */
  var containsSecrets: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Whether or not the Backup contains volume data. Controlled by the parent BackupPlan's include_volume_data value.
    */
  var containsVolumeData: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The timestamp when this Backup resource was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum age for this Backup (in days). If this field is set to a non-zero value, the Backup will be "locked" against deletion (either manual or automatic deletion) for the number of days provided (measured from the creation time of the Backup). MUST be an integer value between 0-90 (inclusive). Defaults to parent BackupPlan's backup_delete_lock_days setting and may only be increased (either at creation time or in a subsequent update).
    */
  var deleteLockDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The time at which an existing delete lock will expire for this backup (calculated from create_time + delete_lock_days).
    */
  var deleteLockExpireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User specified descriptive string for this Backup.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The customer managed encryption key that was used to encrypt the Backup's artifacts. Inherited from the parent BackupPlan's encryption_key value.
    */
  var encryptionKey: js.UndefOr[SchemaEncryptionKey] = js.undefined
  
  /**
    * Output only. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a backup from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform backup updates in order to avoid race conditions: An `etag` is returned in the response to `GetBackup`, and systems are expected to put that etag in the request to `UpdateBackup` or `DeleteBackup` to ensure that their change will be applied to the same version of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A set of custom labels supplied by user.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. This flag indicates whether this Backup resource was created manually by a user or via a schedule in the BackupPlan. A value of True means that the Backup was created manually.
    */
  var manual: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The fully qualified name of the Backup. `projects/x/locations/x/backupPlans/x/backups/x`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The total number of Kubernetes Pods contained in the Backup.
    */
  var podCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The total number of Kubernetes resources included in the Backup.
    */
  var resourceCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The age (in days) after which this Backup will be automatically deleted. Must be an integer value \>= 0: - If 0, no automatic deletion will occur for this Backup. - If not 0, this must be \>= delete_lock_days and <= 365. Once a Backup is created, this value may only be increased. Defaults to the parent BackupPlan's backup_retain_days value.
    */
  var retainDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The time at which this Backup will be automatically deleted (calculated from create_time + retain_days).
    */
  var retainExpireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. If set, the list of ProtectedApplications whose resources were included in the Backup.
    */
  var selectedApplications: js.UndefOr[SchemaNamespacedNames] = js.undefined
  
  /**
    * Output only. If set, the list of namespaces that were included in the Backup.
    */
  var selectedNamespaces: js.UndefOr[SchemaNamespaces] = js.undefined
  
  /**
    * Output only. The total size of the Backup in bytes = config backup size + sum(volume backup sizes)
    */
  var sizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Current state of the Backup
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Human-readable description of why the backup is in the current `state`.
    */
  var stateReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Server generated global unique identifier of [UUID4](https://en.wikipedia.org/wiki/Universally_unique_identifier)
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when this Backup resource was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The total number of volume backups contained in the Backup.
    */
  var volumeCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBackup {
  
  inline def apply(): SchemaBackup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackup]
  }
  
  extension [Self <: SchemaBackup](x: Self) {
    
    inline def setAllNamespaces(value: Boolean): Self = StObject.set(x, "allNamespaces", value.asInstanceOf[js.Any])
    
    inline def setAllNamespacesNull: Self = StObject.set(x, "allNamespaces", null)
    
    inline def setAllNamespacesUndefined: Self = StObject.set(x, "allNamespaces", js.undefined)
    
    inline def setClusterMetadata(value: SchemaClusterMetadata): Self = StObject.set(x, "clusterMetadata", value.asInstanceOf[js.Any])
    
    inline def setClusterMetadataUndefined: Self = StObject.set(x, "clusterMetadata", js.undefined)
    
    inline def setCompleteTime(value: String): Self = StObject.set(x, "completeTime", value.asInstanceOf[js.Any])
    
    inline def setCompleteTimeNull: Self = StObject.set(x, "completeTime", null)
    
    inline def setCompleteTimeUndefined: Self = StObject.set(x, "completeTime", js.undefined)
    
    inline def setConfigBackupSizeBytes(value: String): Self = StObject.set(x, "configBackupSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setConfigBackupSizeBytesNull: Self = StObject.set(x, "configBackupSizeBytes", null)
    
    inline def setConfigBackupSizeBytesUndefined: Self = StObject.set(x, "configBackupSizeBytes", js.undefined)
    
    inline def setContainsSecrets(value: Boolean): Self = StObject.set(x, "containsSecrets", value.asInstanceOf[js.Any])
    
    inline def setContainsSecretsNull: Self = StObject.set(x, "containsSecrets", null)
    
    inline def setContainsSecretsUndefined: Self = StObject.set(x, "containsSecrets", js.undefined)
    
    inline def setContainsVolumeData(value: Boolean): Self = StObject.set(x, "containsVolumeData", value.asInstanceOf[js.Any])
    
    inline def setContainsVolumeDataNull: Self = StObject.set(x, "containsVolumeData", null)
    
    inline def setContainsVolumeDataUndefined: Self = StObject.set(x, "containsVolumeData", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeleteLockDays(value: Double): Self = StObject.set(x, "deleteLockDays", value.asInstanceOf[js.Any])
    
    inline def setDeleteLockDaysNull: Self = StObject.set(x, "deleteLockDays", null)
    
    inline def setDeleteLockDaysUndefined: Self = StObject.set(x, "deleteLockDays", js.undefined)
    
    inline def setDeleteLockExpireTime(value: String): Self = StObject.set(x, "deleteLockExpireTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteLockExpireTimeNull: Self = StObject.set(x, "deleteLockExpireTime", null)
    
    inline def setDeleteLockExpireTimeUndefined: Self = StObject.set(x, "deleteLockExpireTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncryptionKey(value: SchemaEncryptionKey): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setManual(value: Boolean): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
    
    inline def setManualNull: Self = StObject.set(x, "manual", null)
    
    inline def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPodCount(value: Double): Self = StObject.set(x, "podCount", value.asInstanceOf[js.Any])
    
    inline def setPodCountNull: Self = StObject.set(x, "podCount", null)
    
    inline def setPodCountUndefined: Self = StObject.set(x, "podCount", js.undefined)
    
    inline def setResourceCount(value: Double): Self = StObject.set(x, "resourceCount", value.asInstanceOf[js.Any])
    
    inline def setResourceCountNull: Self = StObject.set(x, "resourceCount", null)
    
    inline def setResourceCountUndefined: Self = StObject.set(x, "resourceCount", js.undefined)
    
    inline def setRetainDays(value: Double): Self = StObject.set(x, "retainDays", value.asInstanceOf[js.Any])
    
    inline def setRetainDaysNull: Self = StObject.set(x, "retainDays", null)
    
    inline def setRetainDaysUndefined: Self = StObject.set(x, "retainDays", js.undefined)
    
    inline def setRetainExpireTime(value: String): Self = StObject.set(x, "retainExpireTime", value.asInstanceOf[js.Any])
    
    inline def setRetainExpireTimeNull: Self = StObject.set(x, "retainExpireTime", null)
    
    inline def setRetainExpireTimeUndefined: Self = StObject.set(x, "retainExpireTime", js.undefined)
    
    inline def setSelectedApplications(value: SchemaNamespacedNames): Self = StObject.set(x, "selectedApplications", value.asInstanceOf[js.Any])
    
    inline def setSelectedApplicationsUndefined: Self = StObject.set(x, "selectedApplications", js.undefined)
    
    inline def setSelectedNamespaces(value: SchemaNamespaces): Self = StObject.set(x, "selectedNamespaces", value.asInstanceOf[js.Any])
    
    inline def setSelectedNamespacesUndefined: Self = StObject.set(x, "selectedNamespaces", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesNull: Self = StObject.set(x, "sizeBytes", null)
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
    
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
    
    inline def setVolumeCount(value: Double): Self = StObject.set(x, "volumeCount", value.asInstanceOf[js.Any])
    
    inline def setVolumeCountNull: Self = StObject.set(x, "volumeCount", null)
    
    inline def setVolumeCountUndefined: Self = StObject.set(x, "volumeCount", js.undefined)
  }
}
