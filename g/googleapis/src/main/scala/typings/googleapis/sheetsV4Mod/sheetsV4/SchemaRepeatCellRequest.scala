package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates all cells in the range to the values in the given Cell object. Only
  * the fields listed in the fields field are updated; others are unchanged. If
  * writing a cell with a formula, the formula&#39;s ranges will automatically
  * increment for each field in the range. For example, if writing a cell with
  * formula `=A1` into range B2:C4, B2 would be `=A1`, B3 would be `=A2`, B4
  * would be `=A3`, C2 would be `=B1`, C3 would be `=B2`, C4 would be `=B3`. To
  * keep the formula&#39;s ranges static, use the `$` indicator. For example,
  * use the formula `=$A$1` to prevent both the row and the column from
  * incrementing.
  */
@js.native
trait SchemaRepeatCellRequest extends js.Object {
  
  /**
    * The data to write.
    */
  var cell: js.UndefOr[SchemaCellData] = js.native
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `cell` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * The range to repeat the cell in.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
}
object SchemaRepeatCellRequest {
  
  @scala.inline
  def apply(): SchemaRepeatCellRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepeatCellRequest]
  }
  
  @scala.inline
  implicit class SchemaRepeatCellRequestOps[Self <: SchemaRepeatCellRequest] (val x: Self) extends AnyVal {
    
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
    def setCell(value: SchemaCellData): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaGridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
