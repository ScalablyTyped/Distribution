package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRowRequest extends js.Object {
  
  /** Required. The parent table where this row will be created. Format: tables/{table} */
  var parent: js.UndefOr[String] = js.native
  
  /** Required. The row to create. */
  var row: js.UndefOr[Row] = js.native
  
  /** Optional. Column key to use for values in the row. Defaults to user entered name. */
  var view: js.UndefOr[String] = js.native
}
object CreateRowRequest {
  
  @scala.inline
  def apply(): CreateRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRowRequest]
  }
  
  @scala.inline
  implicit class CreateRowRequestOps[Self <: CreateRowRequest] (val x: Self) extends AnyVal {
    
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
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setRow(value: Row): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
