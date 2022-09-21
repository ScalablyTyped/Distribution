package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableRange extends StObject {
  
  /**
    * The column span of the table range.
    */
  var columnSpan: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The row span of the table range.
    */
  var rowSpan: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The cell location where the table range starts.
    */
  var tableCellLocation: js.UndefOr[SchemaTableCellLocation] = js.undefined
}
object SchemaTableRange {
  
  inline def apply(): SchemaTableRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRange]
  }
  
  extension [Self <: SchemaTableRange](x: Self) {
    
    inline def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
    
    inline def setColumnSpanNull: Self = StObject.set(x, "columnSpan", null)
    
    inline def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanNull: Self = StObject.set(x, "rowSpan", null)
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setTableCellLocation(value: SchemaTableCellLocation): Self = StObject.set(x, "tableCellLocation", value.asInstanceOf[js.Any])
    
    inline def setTableCellLocationUndefined: Self = StObject.set(x, "tableCellLocation", js.undefined)
  }
}
