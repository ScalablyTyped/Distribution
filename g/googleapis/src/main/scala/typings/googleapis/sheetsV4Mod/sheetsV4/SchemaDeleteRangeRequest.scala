package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes a range of cells, shifting other cells into the deleted area.
  */
trait SchemaDeleteRangeRequest extends StObject {
  
  /**
    * The range of cells to delete.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
  
  /**
    * The dimension from which deleted cells will be replaced with. If ROWS,
    * existing cells will be shifted upward to replace the deleted cells. If
    * COLUMNS, existing cells will be shifted left to replace the deleted
    * cells.
    */
  var shiftDimension: js.UndefOr[String] = js.undefined
}
object SchemaDeleteRangeRequest {
  
  @scala.inline
  def apply(): SchemaDeleteRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteRangeRequestMutableBuilder[Self <: SchemaDeleteRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setShiftDimension(value: String): Self = StObject.set(x, "shiftDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftDimensionUndefined: Self = StObject.set(x, "shiftDimension", js.undefined)
  }
}
