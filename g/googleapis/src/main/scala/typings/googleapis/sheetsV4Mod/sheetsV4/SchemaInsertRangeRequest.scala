package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Inserts cells into a range, shifting the existing cells over or down.
  */
trait SchemaInsertRangeRequest extends StObject {
  
  /**
    * The range to insert new cells into.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
  
  /**
    * The dimension which will be shifted when inserting cells. If ROWS,
    * existing cells will be shifted down. If COLUMNS, existing cells will be
    * shifted right.
    */
  var shiftDimension: js.UndefOr[String] = js.undefined
}
object SchemaInsertRangeRequest {
  
  @scala.inline
  def apply(): SchemaInsertRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaInsertRangeRequestMutableBuilder[Self <: SchemaInsertRangeRequest] (val x: Self) extends AnyVal {
    
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
