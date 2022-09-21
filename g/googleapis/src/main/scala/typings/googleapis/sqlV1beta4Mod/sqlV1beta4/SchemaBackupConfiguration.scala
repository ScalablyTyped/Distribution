package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackupConfiguration extends StObject {
  
  /**
    * (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must be disabled as well.
    */
  var binaryLogEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether this configuration is enabled.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This is always *sql#backupConfiguration*.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Location of the backup
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var pointInTimeRecoveryEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var replicationLogArchivingEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Start time for the daily backup configuration in UTC timezone in the 24 hour format - *HH:MM*.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackupConfiguration {
  
  inline def apply(): SchemaBackupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackupConfiguration]
  }
  
  extension [Self <: SchemaBackupConfiguration](x: Self) {
    
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
  }
}
