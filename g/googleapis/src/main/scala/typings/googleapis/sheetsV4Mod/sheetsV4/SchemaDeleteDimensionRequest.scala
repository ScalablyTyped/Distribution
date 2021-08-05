package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes the dimensions from the sheet.
  */
trait SchemaDeleteDimensionRequest extends StObject {
  
  /**
    * The dimensions to delete from the sheet.
    */
  var range: js.UndefOr[SchemaDimensionRange] = js.undefined
}
object SchemaDeleteDimensionRequest {
  
  inline def apply(): SchemaDeleteDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDimensionRequest]
  }
  
  extension [Self <: SchemaDeleteDimensionRequest](x: Self) {
    
    inline def setRange(value: SchemaDimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
