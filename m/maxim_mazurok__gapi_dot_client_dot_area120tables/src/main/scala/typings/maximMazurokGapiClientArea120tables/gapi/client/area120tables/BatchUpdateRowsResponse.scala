package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateRowsResponse extends js.Object {
  
  /** The updated rows. */
  var rows: js.UndefOr[js.Array[Row]] = js.native
}
object BatchUpdateRowsResponse {
  
  @scala.inline
  def apply(): BatchUpdateRowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateRowsResponse]
  }
  
  @scala.inline
  implicit class BatchUpdateRowsResponseOps[Self <: BatchUpdateRowsResponse] (val x: Self) extends AnyVal {
    
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
    def setRowsVarargs(value: Row*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[Row]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
}
