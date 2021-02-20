package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base
  * LinkedContentReference have been changed in this suggestion. For any field
  * set to true, there is a new suggested value.
  */
@js.native
trait SchemaLinkedContentReferenceSuggestionState extends StObject {
  
  /**
    * A mask that indicates which of the fields in sheets_chart_reference have
    * been changed in this suggestion.
    */
  var sheetsChartReferenceSuggestionState: js.UndefOr[SchemaSheetsChartReferenceSuggestionState] = js.native
}
object SchemaLinkedContentReferenceSuggestionState {
  
  @scala.inline
  def apply(): SchemaLinkedContentReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinkedContentReferenceSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaLinkedContentReferenceSuggestionStateMutableBuilder[Self <: SchemaLinkedContentReferenceSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSheetsChartReferenceSuggestionState(value: SchemaSheetsChartReferenceSuggestionState): Self = StObject.set(x, "sheetsChartReferenceSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetsChartReferenceSuggestionStateUndefined: Self = StObject.set(x, "sheetsChartReferenceSuggestionState", js.undefined)
  }
}
