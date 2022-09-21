package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGridRange extends StObject {
  
  /**
    * The end column (exclusive) of the range, or not set if unbounded.
    */
  var endColumnIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The end row (exclusive) of the range, or not set if unbounded.
    */
  var endRowIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The sheet this range is on.
    */
  var sheetId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The start column (inclusive) of the range, or not set if unbounded.
    */
  var startColumnIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The start row (inclusive) of the range, or not set if unbounded.
    */
  var startRowIndex: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGridRange {
  
  inline def apply(): SchemaGridRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGridRange]
  }
  
  extension [Self <: SchemaGridRange](x: Self) {
    
    inline def setEndColumnIndex(value: Double): Self = StObject.set(x, "endColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setEndColumnIndexNull: Self = StObject.set(x, "endColumnIndex", null)
    
    inline def setEndColumnIndexUndefined: Self = StObject.set(x, "endColumnIndex", js.undefined)
    
    inline def setEndRowIndex(value: Double): Self = StObject.set(x, "endRowIndex", value.asInstanceOf[js.Any])
    
    inline def setEndRowIndexNull: Self = StObject.set(x, "endRowIndex", null)
    
    inline def setEndRowIndexUndefined: Self = StObject.set(x, "endRowIndex", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdNull: Self = StObject.set(x, "sheetId", null)
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
    
    inline def setStartColumnIndex(value: Double): Self = StObject.set(x, "startColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setStartColumnIndexNull: Self = StObject.set(x, "startColumnIndex", null)
    
    inline def setStartColumnIndexUndefined: Self = StObject.set(x, "startColumnIndex", js.undefined)
    
    inline def setStartRowIndex(value: Double): Self = StObject.set(x, "startRowIndex", value.asInstanceOf[js.Any])
    
    inline def setStartRowIndexNull: Self = StObject.set(x, "startRowIndex", null)
    
    inline def setStartRowIndexUndefined: Self = StObject.set(x, "startRowIndex", js.undefined)
  }
}
