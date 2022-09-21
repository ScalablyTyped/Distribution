package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDimensionRange extends StObject {
  
  /**
    * The dimension of the span.
    */
  var dimension: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The end (exclusive) of the span, or not set if unbounded.
    */
  var endIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The sheet this span is on.
    */
  var sheetId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The start (inclusive) of the span, or not set if unbounded.
    */
  var startIndex: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDimensionRange {
  
  inline def apply(): SchemaDimensionRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionRange]
  }
  
  extension [Self <: SchemaDimensionRange](x: Self) {
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionNull: Self = StObject.set(x, "dimension", null)
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexNull: Self = StObject.set(x, "endIndex", null)
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdNull: Self = StObject.set(x, "sheetId", null)
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexNull: Self = StObject.set(x, "startIndex", null)
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
