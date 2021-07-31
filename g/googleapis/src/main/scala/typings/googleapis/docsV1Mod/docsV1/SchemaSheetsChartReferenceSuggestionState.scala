package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base SheetsChartReference
  * have been changed in this suggestion. For any field set to true, there is a
  * new suggested value.
  */
trait SchemaSheetsChartReferenceSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to chart_id.
    */
  var chartIdSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to spreadsheet_id.
    */
  var spreadsheetIdSuggested: js.UndefOr[Boolean] = js.undefined
}
object SchemaSheetsChartReferenceSuggestionState {
  
  @scala.inline
  def apply(): SchemaSheetsChartReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSheetsChartReferenceSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaSheetsChartReferenceSuggestionStateMutableBuilder[Self <: SchemaSheetsChartReferenceSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartIdSuggested(value: Boolean): Self = StObject.set(x, "chartIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartIdSuggestedUndefined: Self = StObject.set(x, "chartIdSuggested", js.undefined)
    
    @scala.inline
    def setSpreadsheetIdSuggested(value: Boolean): Self = StObject.set(x, "spreadsheetIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdSuggestedUndefined: Self = StObject.set(x, "spreadsheetIdSuggested", js.undefined)
  }
}
