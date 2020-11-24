package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreInfo extends js.Object {
  
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
  implicit class RestoreInfoOps[Self <: RestoreInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackupInfo(value: BackupInfo): Self = this.set("backupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupInfo: Self = this.set("backupInfo", js.undefined)
    
    @scala.inline
    def setSourceType(value: String): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
  }
}
