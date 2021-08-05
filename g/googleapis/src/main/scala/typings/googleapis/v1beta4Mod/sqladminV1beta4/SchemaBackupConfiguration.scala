package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance backup configuration.
  */
trait SchemaBackupConfiguration extends StObject {
  
  /**
    * Whether binary log is enabled. If backup configuration is disabled,
    * binary log must be disabled as well.
    */
  var binaryLogEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this configuration is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This is always sql#backupConfiguration.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var replicationLogArchivingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Start time for the daily backup configuration in UTC timezone in the 24
    * hour format - HH:MM.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object SchemaBackupConfiguration {
  
  inline def apply(): SchemaBackupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackupConfiguration]
  }
  
  extension [Self <: SchemaBackupConfiguration](x: Self) {
    
    inline def setBinaryLogEnabled(value: Boolean): Self = StObject.set(x, "binaryLogEnabled", value.asInstanceOf[js.Any])
    
    inline def setBinaryLogEnabledUndefined: Self = StObject.set(x, "binaryLogEnabled", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setReplicationLogArchivingEnabled(value: Boolean): Self = StObject.set(x, "replicationLogArchivingEnabled", value.asInstanceOf[js.Any])
    
    inline def setReplicationLogArchivingEnabledUndefined: Self = StObject.set(x, "replicationLogArchivingEnabled", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
