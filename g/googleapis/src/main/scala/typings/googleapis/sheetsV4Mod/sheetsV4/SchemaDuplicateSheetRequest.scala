package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Duplicates the contents of a sheet.
  */
trait SchemaDuplicateSheetRequest extends StObject {
  
  /**
    * The zero-based index where the new sheet should be inserted. The index of
    * all sheets after this are incremented.
    */
  var insertSheetIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * If set, the ID of the new sheet. If not set, an ID is chosen. If set, the
    * ID must not conflict with any existing sheet ID. If set, it must be
    * non-negative.
    */
  var newSheetId: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the new sheet.  If empty, a new name is chosen for you.
    */
  var newSheetName: js.UndefOr[String] = js.undefined
  
  /**
    * The sheet to duplicate.
    */
  var sourceSheetId: js.UndefOr[Double] = js.undefined
}
object SchemaDuplicateSheetRequest {
  
  inline def apply(): SchemaDuplicateSheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDuplicateSheetRequest]
  }
  
  extension [Self <: SchemaDuplicateSheetRequest](x: Self) {
    
    inline def setInsertSheetIndex(value: Double): Self = StObject.set(x, "insertSheetIndex", value.asInstanceOf[js.Any])
    
    inline def setInsertSheetIndexUndefined: Self = StObject.set(x, "insertSheetIndex", js.undefined)
    
    inline def setNewSheetId(value: Double): Self = StObject.set(x, "newSheetId", value.asInstanceOf[js.Any])
    
    inline def setNewSheetIdUndefined: Self = StObject.set(x, "newSheetId", js.undefined)
    
    inline def setNewSheetName(value: String): Self = StObject.set(x, "newSheetName", value.asInstanceOf[js.Any])
    
    inline def setNewSheetNameUndefined: Self = StObject.set(x, "newSheetName", js.undefined)
    
    inline def setSourceSheetId(value: Double): Self = StObject.set(x, "sourceSheetId", value.asInstanceOf[js.Any])
    
    inline def setSourceSheetIdUndefined: Self = StObject.set(x, "sourceSheetId", js.undefined)
  }
}
