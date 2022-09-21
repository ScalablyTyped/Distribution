package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSpreadsheetsSheetsCopyto
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCopySheetToAnotherSpreadsheetRequest] = js.undefined
  
  /**
    * The ID of the sheet to copy.
    */
  var sheetId: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the spreadsheet containing the sheet to copy.
    */
  var spreadsheetId: js.UndefOr[String] = js.undefined
}
object ParamsResourceSpreadsheetsSheetsCopyto {
  
  inline def apply(): ParamsResourceSpreadsheetsSheetsCopyto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpreadsheetsSheetsCopyto]
  }
  
  extension [Self <: ParamsResourceSpreadsheetsSheetsCopyto](x: Self) {
    
    inline def setRequestBody(value: SchemaCopySheetToAnotherSpreadsheetRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
  }
}
