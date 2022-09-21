package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRetentionPolicy extends StObject {
  
  /**
    * Minimum age for Backups created via this BackupPlan (in days). This field MUST be an integer value between 0-90 (inclusive). A Backup created under this BackupPlan will NOT be deletable until it reaches Backup's (create_time + backup_delete_lock_days). Updating this field of a BackupPlan does NOT affect existing Backups under it. Backups created AFTER a successful update will inherit the new value. Default: 0 (no delete blocking)
    */
  var backupDeleteLockDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The default maximum age of a Backup created via this BackupPlan. This field MUST be an integer value \>= 0 and <= 365. If specified, a Backup created under this BackupPlan will be automatically deleted after its age reaches (create_time + backup_retain_days). If not specified, Backups created under this BackupPlan will NOT be subject to automatic deletion. Updating this field does NOT affect existing Backups under it. Backups created AFTER a successful update will automatically pick up the new value. NOTE: backup_retain_days must be \>= backup_delete_lock_days. If cron_schedule is defined, then this must be <= 360 * the creation interval. Default: 0 (no automatic deletion)
    */
  var backupRetainDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * This flag denotes whether the retention policy of this BackupPlan is locked. If set to True, no further update is allowed on this policy, including the `locked` field itself. Default: False
    */
  var locked: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaRetentionPolicy {
  
  inline def apply(): SchemaRetentionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRetentionPolicy]
  }
  
  extension [Self <: SchemaRetentionPolicy](x: Self) {
    
    inline def setBackupDeleteLockDays(value: Double): Self = StObject.set(x, "backupDeleteLockDays", value.asInstanceOf[js.Any])
    
    inline def setBackupDeleteLockDaysNull: Self = StObject.set(x, "backupDeleteLockDays", null)
    
    inline def setBackupDeleteLockDaysUndefined: Self = StObject.set(x, "backupDeleteLockDays", js.undefined)
    
    inline def setBackupRetainDays(value: Double): Self = StObject.set(x, "backupRetainDays", value.asInstanceOf[js.Any])
    
    inline def setBackupRetainDaysNull: Self = StObject.set(x, "backupRetainDays", null)
    
    inline def setBackupRetainDaysUndefined: Self = StObject.set(x, "backupRetainDays", js.undefined)
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedNull: Self = StObject.set(x, "locked", null)
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
  }
}
