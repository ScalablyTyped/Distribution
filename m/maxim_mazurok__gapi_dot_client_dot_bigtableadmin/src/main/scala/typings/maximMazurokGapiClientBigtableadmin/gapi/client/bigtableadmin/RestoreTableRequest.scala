package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreTableRequest extends StObject {
  
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
  implicit class RestoreTableRequestMutableBuilder[Self <: RestoreTableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackup(value: String): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
