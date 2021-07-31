package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response when retrieving more than one range of values in a
  * spreadsheet.
  */
trait SchemaBatchGetValuesResponse extends StObject {
  
  /**
    * The ID of the spreadsheet the data was retrieved from.
    */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  
  /**
    * The requested values. The order of the ValueRanges is the same as the
    * order of the requested ranges.
    */
  var valueRanges: js.UndefOr[js.Array[SchemaValueRange]] = js.undefined
}
object SchemaBatchGetValuesResponse {
  
  @scala.inline
  def apply(): SchemaBatchGetValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetValuesResponse]
  }
  
  @scala.inline
  implicit class SchemaBatchGetValuesResponseMutableBuilder[Self <: SchemaBatchGetValuesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    @scala.inline
    def setValueRanges(value: js.Array[SchemaValueRange]): Self = StObject.set(x, "valueRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangesUndefined: Self = StObject.set(x, "valueRanges", js.undefined)
    
    @scala.inline
    def setValueRangesVarargs(value: SchemaValueRange*): Self = StObject.set(x, "valueRanges", js.Array(value :_*))
  }
}
