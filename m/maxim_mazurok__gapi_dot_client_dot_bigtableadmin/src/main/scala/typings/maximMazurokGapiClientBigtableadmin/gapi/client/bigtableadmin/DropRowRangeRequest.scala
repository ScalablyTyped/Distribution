package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropRowRangeRequest extends js.Object {
  
  /** Delete all rows in the table. Setting this to false is a no-op. */
  var deleteAllDataFromTable: js.UndefOr[Boolean] = js.native
  
  /** Delete all rows that start with this row key prefix. Prefix cannot be zero length. */
  var rowKeyPrefix: js.UndefOr[String] = js.native
}
object DropRowRangeRequest {
  
  @scala.inline
  def apply(): DropRowRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropRowRangeRequest]
  }
  
  @scala.inline
  implicit class DropRowRangeRequestOps[Self <: DropRowRangeRequest] (val x: Self) extends AnyVal {
    
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
    def setDeleteAllDataFromTable(value: Boolean): Self = this.set("deleteAllDataFromTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteAllDataFromTable: Self = this.set("deleteAllDataFromTable", js.undefined)
    
    @scala.inline
    def setRowKeyPrefix(value: String): Self = this.set("rowKeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowKeyPrefix: Self = this.set("rowKeyPrefix", js.undefined)
  }
}
