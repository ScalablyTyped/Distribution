package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A coordinate in a sheet. All indexes are zero-based.
  */
@js.native
trait SchemaGridCoordinate extends js.Object {
  
  /**
    * The column index of the coordinate.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /**
    * The row index of the coordinate.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  
  /**
    * The sheet this coordinate is on.
    */
  var sheetId: js.UndefOr[Double] = js.native
}
object SchemaGridCoordinate {
  
  @scala.inline
  def apply(): SchemaGridCoordinate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGridCoordinate]
  }
  
  @scala.inline
  implicit class SchemaGridCoordinateOps[Self <: SchemaGridCoordinate] (val x: Self) extends AnyVal {
    
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
  }
}
