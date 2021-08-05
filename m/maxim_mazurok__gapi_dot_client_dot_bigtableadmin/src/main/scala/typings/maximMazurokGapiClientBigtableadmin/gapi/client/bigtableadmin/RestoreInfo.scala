package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreInfo extends StObject {
  
  /** Information about the backup used to restore the table. The backup may no longer exist. */
  var backupInfo: js.UndefOr[BackupInfo] = js.undefined
  
  /** The type of the restore source. */
  var sourceType: js.UndefOr[String] = js.undefined
}
object RestoreInfo {
  
  inline def apply(): RestoreInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreInfo]
  }
  
  extension [Self <: RestoreInfo](x: Self) {
    
    inline def setBackupInfo(value: BackupInfo): Self = StObject.set(x, "backupInfo", value.asInstanceOf[js.Any])
    
    inline def setBackupInfoUndefined: Self = StObject.set(x, "backupInfo", js.undefined)
    
    inline def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
  }
}
