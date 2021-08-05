package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The reply for batch updating a spreadsheet.
  */
trait SchemaBatchUpdateSpreadsheetResponse extends StObject {
  
  /**
    * The reply of the updates.  This maps 1:1 with the updates, although
    * replies to some requests may be empty.
    */
  var replies: js.UndefOr[js.Array[SchemaResponse]] = js.undefined
  
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  
  /**
    * The spreadsheet after updates were applied. This is only set if
    * [BatchUpdateSpreadsheetRequest.include_spreadsheet_in_response] is
    * `true`.
    */
  var updatedSpreadsheet: js.UndefOr[SchemaSpreadsheet] = js.undefined
}
object SchemaBatchUpdateSpreadsheetResponse {
  
  inline def apply(): SchemaBatchUpdateSpreadsheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateSpreadsheetResponse]
  }
  
  extension [Self <: SchemaBatchUpdateSpreadsheetResponse](x: Self) {
    
    inline def setReplies(value: js.Array[SchemaResponse]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    inline def setRepliesVarargs(value: SchemaResponse*): Self = StObject.set(x, "replies", js.Array(value :_*))
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    inline def setUpdatedSpreadsheet(value: SchemaSpreadsheet): Self = StObject.set(x, "updatedSpreadsheet", value.asInstanceOf[js.Any])
    
    inline def setUpdatedSpreadsheetUndefined: Self = StObject.set(x, "updatedSpreadsheet", js.undefined)
  }
}
