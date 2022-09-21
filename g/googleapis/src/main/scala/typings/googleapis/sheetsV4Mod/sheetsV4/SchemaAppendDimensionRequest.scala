package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppendDimensionRequest extends StObject {
  
  /**
    * Whether rows or columns should be appended.
    */
  var dimension: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of rows or columns to append.
    */
  var length: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The sheet to append rows or columns to.
    */
  var sheetId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAppendDimensionRequest {
  
  inline def apply(): SchemaAppendDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppendDimensionRequest]
  }
  
  extension [Self <: SchemaAppendDimensionRequest](x: Self) {
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionNull: Self = StObject.set(x, "dimension", null)
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthNull: Self = StObject.set(x, "length", null)
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdNull: Self = StObject.set(x, "sheetId", null)
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
