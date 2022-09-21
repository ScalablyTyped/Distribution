package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSqlInstancesStartExternalSyncRequest extends StObject {
  
  /**
    * MySQL-specific settings for start external sync.
    */
  var mysqlSyncConfig: js.UndefOr[SchemaMySqlSyncConfig] = js.undefined
  
  /**
    * Whether to skip the verification step (VESS).
    */
  var skipVerification: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * External sync mode.
    */
  var syncMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaSqlInstancesStartExternalSyncRequest {
  
  inline def apply(): SchemaSqlInstancesStartExternalSyncRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlInstancesStartExternalSyncRequest]
  }
  
  extension [Self <: SchemaSqlInstancesStartExternalSyncRequest](x: Self) {
    
    inline def setMysqlSyncConfig(value: SchemaMySqlSyncConfig): Self = StObject.set(x, "mysqlSyncConfig", value.asInstanceOf[js.Any])
    
    inline def setMysqlSyncConfigUndefined: Self = StObject.set(x, "mysqlSyncConfig", js.undefined)
    
    inline def setSkipVerification(value: Boolean): Self = StObject.set(x, "skipVerification", value.asInstanceOf[js.Any])
    
    inline def setSkipVerificationNull: Self = StObject.set(x, "skipVerification", null)
    
    inline def setSkipVerificationUndefined: Self = StObject.set(x, "skipVerification", js.undefined)
    
    inline def setSyncMode(value: String): Self = StObject.set(x, "syncMode", value.asInstanceOf[js.Any])
    
    inline def setSyncModeNull: Self = StObject.set(x, "syncMode", null)
    
    inline def setSyncModeUndefined: Self = StObject.set(x, "syncMode", js.undefined)
  }
}
