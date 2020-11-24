package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contents of each border row in a table.
  */
@js.native
trait SchemaTableBorderRow extends js.Object {
  
  /**
    * Properties of each border cell. When a border&#39;s adjacent table cells
    * are merged, it is not included in the response.
    */
  var tableBorderCells: js.UndefOr[js.Array[SchemaTableBorderCell]] = js.native
}
object SchemaTableBorderRow {
  
  @scala.inline
  def apply(): SchemaTableBorderRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableBorderRow]
  }
  
  @scala.inline
  implicit class SchemaTableBorderRowOps[Self <: SchemaTableBorderRow] (val x: Self) extends AnyVal {
    
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
    def setTableBorderCellsVarargs(value: SchemaTableBorderCell*): Self = this.set("tableBorderCells", js.Array(value :_*))
    
    @scala.inline
    def setTableBorderCells(value: js.Array[SchemaTableBorderCell]): Self = this.set("tableBorderCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBorderCells: Self = this.set("tableBorderCells", js.undefined)
  }
}
