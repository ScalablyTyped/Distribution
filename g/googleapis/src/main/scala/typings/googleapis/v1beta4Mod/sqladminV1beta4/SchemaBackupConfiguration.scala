package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackupConfiguration extends StObject {
  
  /**
    * Backup retention settings.
    */
  var backupRetentionSettings: js.UndefOr[SchemaBackupRetentionSettings] = js.undefined
  
  /**
    * (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must be disabled as well.
    */
  var binaryLogEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether this configuration is enabled.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This is always `sql#backupConfiguration`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Location of the backup
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Postgres only) Whether point in time recovery is enabled.
    */
  var pointInTimeRecoveryEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var replicationLogArchivingEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Start time for the daily backup configuration in UTC timezone in the 24 hour format - `HH:MM`.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of days of transaction logs we retain for point in time restore, from 1-7.
    */
  var transactionLogRetentionDays: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBackupConfiguration {
  
  inline def apply(): SchemaBackupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackupConfiguration]
  }
  
  extension [Self <: SchemaBackupConfiguration](x: Self) {
    
    inline def setBackupRetentionSettings(value: SchemaBackupRetentionSettings): Self = StObject.set(x, "backupRetentionSettings", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionSettingsUndefined: Self = StObject.set(x, "backupRetentionSettings", js.undefined)
    
    inline def setBinaryLogEnabled(value: Boolean): Self = StObject.set(x, "binaryLogEnabled", value.asInstanceOf[js.Any])
    
    inline def setBinaryLogEnabledNull: Self = StObject.set(x, "binaryLogEnabled", null)
    
    inline def setBinaryLogEnabledUndefined: Self = StObject.set(x, "binaryLogEnabled", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPointInTimeRecoveryEnabled(value: Boolean): Self = StObject.set(x, "pointInTimeRecoveryEnabled", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeRecoveryEnabledNull: Self = StObject.set(x, "pointInTimeRecoveryEnabled", null)
    
    inline def setPointInTimeRecoveryEnabledUndefined: Self = StObject.set(x, "pointInTimeRecoveryEnabled", js.undefined)
    
    inline def setReplicationLogArchivingEnabled(value: Boolean): Self = StObject.set(x, "replicationLogArchivingEnabled", value.asInstanceOf[js.Any])
    
    inline def setReplicationLogArchivingEnabledNull: Self = StObject.set(x, "replicationLogArchivingEnabled", null)
    
    inline def setReplicationLogArchivingEnabledUndefined: Self = StObject.set(x, "replicationLogArchivingEnabled", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTransactionLogRetentionDays(value: Double): Self = StObject.set(x, "transactionLogRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setTransactionLogRetentionDaysNull: Self = StObject.set(x, "transactionLogRetentionDays", null)
    
    inline def setTransactionLogRetentionDaysUndefined: Self = StObject.set(x, "transactionLogRetentionDays", js.undefined)
  }
}
