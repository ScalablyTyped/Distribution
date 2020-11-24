package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates all cells in a range with new data.
  */
@js.native
trait SchemaUpdateCellsRequest extends js.Object {
  
  /**
    * The fields of CellData that should be updated. At least one field must be
    * specified. The root is the CellData; &#39;row.values.&#39; should not be
    * specified. A single `&quot;*&quot;` can be used as short-hand for listing
    * every field.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * The range to write data to.  If the data in rows does not cover the
    * entire requested range, the fields matching those set in fields will be
    * cleared.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  
  /**
    * The data to write.
    */
  var rows: js.UndefOr[js.Array[SchemaRowData]] = js.native
  
  /**
    * The coordinate to start writing data at. Any number of rows and columns
    * (including a different number of columns per row) may be written.
    */
  var start: js.UndefOr[SchemaGridCoordinate] = js.native
}
object SchemaUpdateCellsRequest {
  
  @scala.inline
  def apply(): SchemaUpdateCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateCellsRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateCellsRequestOps[Self <: SchemaUpdateCellsRequest] (val x: Self) extends AnyVal {
    
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
    def setRange(value: SchemaGridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: SchemaRowData*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[SchemaRowData]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setStart(value: SchemaGridCoordinate): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
