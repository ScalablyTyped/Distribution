package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A coordinate in a sheet. All indexes are zero-based.
  */
trait SchemaGridCoordinate extends StObject {
  
  /**
    * The column index of the coordinate.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The row index of the coordinate.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The sheet this coordinate is on.
    */
  var sheetId: js.UndefOr[Double] = js.undefined
}
object SchemaGridCoordinate {
  
  @scala.inline
  def apply(): SchemaGridCoordinate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGridCoordinate]
  }
  
  @scala.inline
  implicit class SchemaGridCoordinateMutableBuilder[Self <: SchemaGridCoordinate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
