package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupInfo extends StObject {
  
  /** Output only. Name of the backup. */
  var backup: js.UndefOr[String] = js.undefined
  
  /** Output only. This time that the backup was finished. Row data in the backup will be no newer than this timestamp. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Name of the table the backup was created from. */
  var sourceTable: js.UndefOr[String] = js.undefined
  
  /** Output only. The time that the backup was started. Row data in the backup will be no older than this timestamp. */
  var startTime: js.UndefOr[String] = js.undefined
}
object BackupInfo {
  
  @scala.inline
  def apply(): BackupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupInfo]
  }
  
  @scala.inline
  implicit class BackupInfoMutableBuilder[Self <: BackupInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackup(value: String): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setSourceTable(value: String): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
