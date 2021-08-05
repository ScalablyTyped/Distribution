package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response when clearing a range of values in a spreadsheet.
  */
trait SchemaClearValuesResponse extends StObject {
  
  /**
    * The range (in A1 notation) that was cleared. (If the request was for an
    * unbounded range or a ranger larger  than the bounds of the sheet, this
    * will be the actual range  that was cleared, bounded to the sheet&#39;s
    * limits.)
    */
  var clearedRange: js.UndefOr[String] = js.undefined
  
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.undefined
}
object SchemaClearValuesResponse {
  
  inline def apply(): SchemaClearValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClearValuesResponse]
  }
  
  extension [Self <: SchemaClearValuesResponse](x: Self) {
    
    inline def setClearedRange(value: String): Self = StObject.set(x, "clearedRange", value.asInstanceOf[js.Any])
    
    inline def setClearedRangeUndefined: Self = StObject.set(x, "clearedRange", js.undefined)
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
  }
}
