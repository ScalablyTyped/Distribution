package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreTableRequest extends js.Object {
  
  /** Name of the backup from which to restore. Values are of the form `projects//instances//clusters//backups/`. */
  var backup: js.UndefOr[String] = js.native
  
  /**
    * Required. The id of the table to create and restore to. This table must not already exist. The `table_id` appended to `parent` forms the full table name of the form
    * `projects//instances//tables/`.
    */
  var tableId: js.UndefOr[String] = js.native
}
object RestoreTableRequest {
  
  @scala.inline
  def apply(): RestoreTableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableRequest]
  }
  
  @scala.inline
  implicit class RestoreTableRequestOps[Self <: RestoreTableRequest] (val x: Self) extends AnyVal {
    
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
    def setTableId(value: String): Self = this.set("tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableId: Self = this.set("tableId", js.undefined)
  }
}
