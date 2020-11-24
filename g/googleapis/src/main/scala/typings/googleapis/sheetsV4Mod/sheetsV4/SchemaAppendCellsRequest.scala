package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds new cells after the last row with data in a sheet, inserting new rows
  * into the sheet if necessary.
  */
@js.native
trait SchemaAppendCellsRequest extends js.Object {
  
  /**
    * The fields of CellData that should be updated. At least one field must be
    * specified. The root is the CellData; &#39;row.values.&#39; should not be
    * specified. A single `&quot;*&quot;` can be used as short-hand for listing
    * every field.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * The data to append.
    */
  var rows: js.UndefOr[js.Array[SchemaRowData]] = js.native
  
  /**
    * The sheet ID to append the data to.
    */
  var sheetId: js.UndefOr[Double] = js.native
}
object SchemaAppendCellsRequest {
  
  @scala.inline
  def apply(): SchemaAppendCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppendCellsRequest]
  }
  
  @scala.inline
  implicit class SchemaAppendCellsRequestOps[Self <: SchemaAppendCellsRequest] (val x: Self) extends AnyVal {
    
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: SchemaRowData*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[SchemaRowData]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
  }
}
