package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreInfo extends StObject {
  
  /** Information about the backup used to restore the table. The backup may no longer exist. */
  var backupInfo: js.UndefOr[BackupInfo] = js.native
  
  /** The type of the restore source. */
  var sourceType: js.UndefOr[String] = js.native
}
object RestoreInfo {
  
  @scala.inline
  def apply(): RestoreInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreInfo]
  }
  
  @scala.inline
  implicit class RestoreInfoMutableBuilder[Self <: RestoreInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupInfo(value: BackupInfo): Self = StObject.set(x, "backupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupInfoUndefined: Self = StObject.set(x, "backupInfo", js.undefined)
    
    @scala.inline
    def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
  }
}
