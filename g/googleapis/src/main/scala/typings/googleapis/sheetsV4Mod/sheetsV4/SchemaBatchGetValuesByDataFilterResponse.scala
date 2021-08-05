package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response when retrieving more than one range of values in a spreadsheet
  * selected by DataFilters.
  */
trait SchemaBatchGetValuesByDataFilterResponse extends StObject {
  
  /**
    * The ID of the spreadsheet the data was retrieved from.
    */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  
  /**
    * The requested values with the list of data filters that matched them.
    */
  var valueRanges: js.UndefOr[js.Array[SchemaMatchedValueRange]] = js.undefined
}
object SchemaBatchGetValuesByDataFilterResponse {
  
  inline def apply(): SchemaBatchGetValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetValuesByDataFilterResponse]
  }
  
  extension [Self <: SchemaBatchGetValuesByDataFilterResponse](x: Self) {
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    inline def setValueRanges(value: js.Array[SchemaMatchedValueRange]): Self = StObject.set(x, "valueRanges", value.asInstanceOf[js.Any])
    
    inline def setValueRangesUndefined: Self = StObject.set(x, "valueRanges", js.undefined)
    
    inline def setValueRangesVarargs(value: SchemaMatchedValueRange*): Self = StObject.set(x, "valueRanges", js.Array(value :_*))
  }
}
