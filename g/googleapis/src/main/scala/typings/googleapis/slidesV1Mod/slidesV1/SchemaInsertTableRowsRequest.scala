package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Inserts rows into a table.
  */
trait SchemaInsertTableRowsRequest extends StObject {
  
  /**
    * The reference table cell location from which rows will be inserted.  A
    * new row will be inserted above (or below) the row where the reference
    * cell is. If the reference cell is a merged cell, a new row will be
    * inserted above (or below) the merged cell.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.undefined
  
  /**
    * Whether to insert new rows below the reference cell location.  - `True`:
    * insert below the cell. - `False`: insert above the cell.
    */
  var insertBelow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of rows to be inserted. Maximum 20 per request.
    */
  var number: js.UndefOr[Double] = js.undefined
  
  /**
    * The table to insert rows into.
    */
  var tableObjectId: js.UndefOr[String] = js.undefined
}
object SchemaInsertTableRowsRequest {
  
  inline def apply(): SchemaInsertTableRowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertTableRowsRequest]
  }
  
  extension [Self <: SchemaInsertTableRowsRequest](x: Self) {
    
    inline def setCellLocation(value: SchemaTableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
    
    inline def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
    
    inline def setInsertBelow(value: Boolean): Self = StObject.set(x, "insertBelow", value.asInstanceOf[js.Any])
    
    inline def setInsertBelowUndefined: Self = StObject.set(x, "insertBelow", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setTableObjectId(value: String): Self = StObject.set(x, "tableObjectId", value.asInstanceOf[js.Any])
    
    inline def setTableObjectIdUndefined: Self = StObject.set(x, "tableObjectId", js.undefined)
  }
}
