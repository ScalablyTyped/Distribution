package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response when clearing a range of values selected with DataFilters in a
  * spreadsheet.
  */
@js.native
trait SchemaBatchClearValuesByDataFilterResponse extends StObject {
  
  /**
    * The ranges that were cleared, in A1 notation. (If the requests were for
    * an unbounded range or a ranger larger  than the bounds of the sheet, this
    * will be the actual ranges  that were cleared, bounded to the sheet&#39;s
    * limits.)
    */
  var clearedRanges: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
}
object SchemaBatchClearValuesByDataFilterResponse {
  
  @scala.inline
  def apply(): SchemaBatchClearValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchClearValuesByDataFilterResponse]
  }
  
  @scala.inline
  implicit class SchemaBatchClearValuesByDataFilterResponseMutableBuilder[Self <: SchemaBatchClearValuesByDataFilterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearedRanges(value: js.Array[String]): Self = StObject.set(x, "clearedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearedRangesUndefined: Self = StObject.set(x, "clearedRanges", js.undefined)
    
    @scala.inline
    def setClearedRangesVarargs(value: String*): Self = StObject.set(x, "clearedRanges", js.Array(value :_*))
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
  }
}
