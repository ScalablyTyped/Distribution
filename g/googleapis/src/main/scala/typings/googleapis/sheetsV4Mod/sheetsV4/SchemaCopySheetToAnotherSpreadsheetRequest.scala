package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request to copy a sheet across spreadsheets.
  */
trait SchemaCopySheetToAnotherSpreadsheetRequest extends StObject {
  
  /**
    * The ID of the spreadsheet to copy the sheet to.
    */
  var destinationSpreadsheetId: js.UndefOr[String] = js.undefined
}
object SchemaCopySheetToAnotherSpreadsheetRequest {
  
  inline def apply(): SchemaCopySheetToAnotherSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCopySheetToAnotherSpreadsheetRequest]
  }
  
  extension [Self <: SchemaCopySheetToAnotherSpreadsheetRequest](x: Self) {
    
    inline def setDestinationSpreadsheetId(value: String): Self = StObject.set(x, "destinationSpreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setDestinationSpreadsheetIdUndefined: Self = StObject.set(x, "destinationSpreadsheetId", js.undefined)
  }
}
