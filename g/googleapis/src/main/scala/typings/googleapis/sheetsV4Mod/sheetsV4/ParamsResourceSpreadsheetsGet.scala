package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSpreadsheetsGet
  extends StObject
     with StandardParameters {
  
  /**
    * True if grid data should be returned. This parameter is ignored if a field mask was set in the request.
    */
  var includeGridData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ranges to retrieve from the spreadsheet.
    */
  var ranges: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The spreadsheet to request.
    */
  var spreadsheetId: js.UndefOr[String] = js.undefined
}
object ParamsResourceSpreadsheetsGet {
  
  inline def apply(): ParamsResourceSpreadsheetsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpreadsheetsGet]
  }
  
  extension [Self <: ParamsResourceSpreadsheetsGet](x: Self) {
    
    inline def setIncludeGridData(value: Boolean): Self = StObject.set(x, "includeGridData", value.asInstanceOf[js.Any])
    
    inline def setIncludeGridDataUndefined: Self = StObject.set(x, "includeGridData", js.undefined)
    
    inline def setRanges(value: js.Array[String]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: String*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
  }
}
