package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchClearValuesByDataFilterResponse extends StObject {
  
  /**
    * The ranges that were cleared, in [A1 notation](/sheets/api/guides/concepts#cell). If the requests are for an unbounded range or a ranger larger than the bounds of the sheet, this is the actual ranges that were cleared, bounded to the sheet's limits.
    */
  var clearedRanges: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String | Null] = js.undefined
}
object SchemaBatchClearValuesByDataFilterResponse {
  
  inline def apply(): SchemaBatchClearValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchClearValuesByDataFilterResponse]
  }
  
  extension [Self <: SchemaBatchClearValuesByDataFilterResponse](x: Self) {
    
    inline def setClearedRanges(value: js.Array[String]): Self = StObject.set(x, "clearedRanges", value.asInstanceOf[js.Any])
    
    inline def setClearedRangesNull: Self = StObject.set(x, "clearedRanges", null)
    
    inline def setClearedRangesUndefined: Self = StObject.set(x, "clearedRanges", js.undefined)
    
    inline def setClearedRangesVarargs(value: String*): Self = StObject.set(x, "clearedRanges", js.Array(value*))
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdNull: Self = StObject.set(x, "spreadsheetId", null)
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
  }
}
