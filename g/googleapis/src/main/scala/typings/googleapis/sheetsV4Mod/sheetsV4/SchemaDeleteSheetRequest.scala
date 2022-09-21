package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteSheetRequest extends StObject {
  
  /**
    * The ID of the sheet to delete. If the sheet is of DATA_SOURCE type, the associated DataSource is also deleted.
    */
  var sheetId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDeleteSheetRequest {
  
  inline def apply(): SchemaDeleteSheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteSheetRequest]
  }
  
  extension [Self <: SchemaDeleteSheetRequest](x: Self) {
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdNull: Self = StObject.set(x, "sheetId", null)
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
