package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupInfo extends js.Object {
  
  /** Output only. Name of the backup. */
  var backup: js.UndefOr[String] = js.native
  
  /** Output only. This time that the backup was finished. Row data in the backup will be no newer than this timestamp. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Output only. Name of the table the backup was created from. */
  var sourceTable: js.UndefOr[String] = js.native
  
  /** Output only. The time that the backup was started. Row data in the backup will be no older than this timestamp. */
  var startTime: js.UndefOr[String] = js.native
}
object BackupInfo {
  
  @scala.inline
  def apply(): BackupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupInfo]
  }
  
  @scala.inline
  implicit class BackupInfoOps[Self <: BackupInfo] (val x: Self) extends AnyVal {
    
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
    def setBackup(value: String): Self = this.set("backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackup: Self = this.set("backup", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setSourceTable(value: String): Self = this.set("sourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTable: Self = this.set("sourceTable", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
