package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSqlInstancesVerifyExternalSyncSettingsRequest extends StObject {
  
  /**
    * Optional. MySQL-specific settings for start external sync.
    */
  var mysqlSyncConfig: js.UndefOr[SchemaMySqlSyncConfig] = js.undefined
  
  /**
    * External sync mode
    */
  var syncMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Flag to enable verifying connection only
    */
  var verifyConnectionOnly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Flag to verify settings required by replication setup only
    */
  var verifyReplicationOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSqlInstancesVerifyExternalSyncSettingsRequest {
  
  inline def apply(): SchemaSqlInstancesVerifyExternalSyncSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlInstancesVerifyExternalSyncSettingsRequest]
  }
  
  extension [Self <: SchemaSqlInstancesVerifyExternalSyncSettingsRequest](x: Self) {
    
    inline def setMysqlSyncConfig(value: SchemaMySqlSyncConfig): Self = StObject.set(x, "mysqlSyncConfig", value.asInstanceOf[js.Any])
    
    inline def setMysqlSyncConfigUndefined: Self = StObject.set(x, "mysqlSyncConfig", js.undefined)
    
    inline def setSyncMode(value: String): Self = StObject.set(x, "syncMode", value.asInstanceOf[js.Any])
    
    inline def setSyncModeNull: Self = StObject.set(x, "syncMode", null)
    
    inline def setSyncModeUndefined: Self = StObject.set(x, "syncMode", js.undefined)
    
    inline def setVerifyConnectionOnly(value: Boolean): Self = StObject.set(x, "verifyConnectionOnly", value.asInstanceOf[js.Any])
    
    inline def setVerifyConnectionOnlyNull: Self = StObject.set(x, "verifyConnectionOnly", null)
    
    inline def setVerifyConnectionOnlyUndefined: Self = StObject.set(x, "verifyConnectionOnly", js.undefined)
    
    inline def setVerifyReplicationOnly(value: Boolean): Self = StObject.set(x, "verifyReplicationOnly", value.asInstanceOf[js.Any])
    
    inline def setVerifyReplicationOnlyNull: Self = StObject.set(x, "verifyReplicationOnly", null)
    
    inline def setVerifyReplicationOnlyUndefined: Self = StObject.set(x, "verifyReplicationOnly", js.undefined)
  }
}
