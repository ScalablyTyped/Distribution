package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRow extends js.Object {
  
  /**
    * The list of cells that constitute the row. Must have the same length as
    * columnHeaders for two-dimensional tables, a length of 1 for
    * one-dimensional tables. Required.
    */
  var cells: js.UndefOr[js.Array[SchemaValue]] = js.native
}
object SchemaRow {
  
  @scala.inline
  def apply(): SchemaRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRow]
  }
  
  @scala.inline
  implicit class SchemaRowOps[Self <: SchemaRow] (val x: Self) extends AnyVal {
    
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
    def setCellsVarargs(value: SchemaValue*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[SchemaValue]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
  }
}
