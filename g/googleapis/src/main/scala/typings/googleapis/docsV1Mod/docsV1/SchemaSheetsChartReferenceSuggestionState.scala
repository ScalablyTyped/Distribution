package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSheetsChartReferenceSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to chart_id.
    */
  var chartIdSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to spreadsheet_id.
    */
  var spreadsheetIdSuggested: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSheetsChartReferenceSuggestionState {
  
  inline def apply(): SchemaSheetsChartReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSheetsChartReferenceSuggestionState]
  }
  
  extension [Self <: SchemaSheetsChartReferenceSuggestionState](x: Self) {
    
    inline def setChartIdSuggested(value: Boolean): Self = StObject.set(x, "chartIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setChartIdSuggestedNull: Self = StObject.set(x, "chartIdSuggested", null)
    
    inline def setChartIdSuggestedUndefined: Self = StObject.set(x, "chartIdSuggested", js.undefined)
    
    inline def setSpreadsheetIdSuggested(value: Boolean): Self = StObject.set(x, "spreadsheetIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdSuggestedNull: Self = StObject.set(x, "spreadsheetIdSuggested", null)
    
    inline def setSpreadsheetIdSuggestedUndefined: Self = StObject.set(x, "spreadsheetIdSuggested", js.undefined)
  }
}
