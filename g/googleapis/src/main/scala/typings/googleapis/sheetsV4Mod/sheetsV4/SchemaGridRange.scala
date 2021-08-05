package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A range on a sheet. All indexes are zero-based. Indexes are half open, e.g
  * the start index is inclusive and the end index is exclusive --
  * [start_index, end_index). Missing indexes indicate the range is unbounded
  * on that side.  For example, if `&quot;Sheet1&quot;` is sheet ID 0, then:
  * `Sheet1!A1:A1 == sheet_id: 0,                   start_row_index: 0,
  * end_row_index: 1,                   start_column_index: 0,
  * end_column_index: 1`    `Sheet1!A3:B4 == sheet_id: 0, start_row_index: 2,
  * end_row_index: 4,                   start_column_index: 0,
  * end_column_index: 2`    `Sheet1!A:B == sheet_id: 0, start_column_index: 0,
  * end_column_index: 2`    `Sheet1!A5:B == sheet_id: 0, start_row_index: 4,
  * start_column_index: 0, end_column_index: 2`    `Sheet1 == sheet_id:0`  The
  * start index must always be less than or equal to the end index. If the
  * start index equals the end index, then the range is empty. Empty ranges are
  * typically not meaningful and are usually rendered in the UI as `#REF!`.
  */
trait SchemaGridRange extends StObject {
  
  /**
    * The end column (exclusive) of the range, or not set if unbounded.
    */
  var endColumnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The end row (exclusive) of the range, or not set if unbounded.
    */
  var endRowIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The sheet this range is on.
    */
  var sheetId: js.UndefOr[Double] = js.undefined
  
  /**
    * The start column (inclusive) of the range, or not set if unbounded.
    */
  var startColumnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The start row (inclusive) of the range, or not set if unbounded.
    */
  var startRowIndex: js.UndefOr[Double] = js.undefined
}
object SchemaGridRange {
  
  inline def apply(): SchemaGridRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGridRange]
  }
  
  extension [Self <: SchemaGridRange](x: Self) {
    
    inline def setEndColumnIndex(value: Double): Self = StObject.set(x, "endColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setEndColumnIndexUndefined: Self = StObject.set(x, "endColumnIndex", js.undefined)
    
    inline def setEndRowIndex(value: Double): Self = StObject.set(x, "endRowIndex", value.asInstanceOf[js.Any])
    
    inline def setEndRowIndexUndefined: Self = StObject.set(x, "endRowIndex", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
    
    inline def setStartColumnIndex(value: Double): Self = StObject.set(x, "startColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setStartColumnIndexUndefined: Self = StObject.set(x, "startColumnIndex", js.undefined)
    
    inline def setStartRowIndex(value: Double): Self = StObject.set(x, "startRowIndex", value.asInstanceOf[js.Any])
    
    inline def setStartRowIndexUndefined: Self = StObject.set(x, "startRowIndex", js.undefined)
  }
}
