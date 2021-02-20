package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response when retrieving more than one range of values in a spreadsheet
  * selected by DataFilters.
  */
@js.native
trait SchemaBatchGetValuesByDataFilterResponse extends StObject {
  
  /**
    * The ID of the spreadsheet the data was retrieved from.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  
  /**
    * The requested values with the list of data filters that matched them.
    */
  var valueRanges: js.UndefOr[js.Array[SchemaMatchedValueRange]] = js.native
}
object SchemaBatchGetValuesByDataFilterResponse {
  
  @scala.inline
  def apply(): SchemaBatchGetValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetValuesByDataFilterResponse]
  }
  
  @scala.inline
  implicit class SchemaBatchGetValuesByDataFilterResponseMutableBuilder[Self <: SchemaBatchGetValuesByDataFilterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    @scala.inline
    def setValueRanges(value: js.Array[SchemaMatchedValueRange]): Self = StObject.set(x, "valueRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangesUndefined: Self = StObject.set(x, "valueRanges", js.undefined)
    
    @scala.inline
    def setValueRangesVarargs(value: SchemaMatchedValueRange*): Self = StObject.set(x, "valueRanges", js.Array(value :_*))
  }
}
