package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLinkedContentReferenceSuggestionState extends StObject {
  
  /**
    * A mask that indicates which of the fields in sheets_chart_reference have been changed in this suggestion.
    */
  var sheetsChartReferenceSuggestionState: js.UndefOr[SchemaSheetsChartReferenceSuggestionState] = js.undefined
}
object SchemaLinkedContentReferenceSuggestionState {
  
  inline def apply(): SchemaLinkedContentReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinkedContentReferenceSuggestionState]
  }
  
  extension [Self <: SchemaLinkedContentReferenceSuggestionState](x: Self) {
    
    inline def setSheetsChartReferenceSuggestionState(value: SchemaSheetsChartReferenceSuggestionState): Self = StObject.set(x, "sheetsChartReferenceSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setSheetsChartReferenceSuggestionStateUndefined: Self = StObject.set(x, "sheetsChartReferenceSuggestionState", js.undefined)
  }
}
