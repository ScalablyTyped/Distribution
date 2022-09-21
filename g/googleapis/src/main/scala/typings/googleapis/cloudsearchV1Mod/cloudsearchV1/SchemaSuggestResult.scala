package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSuggestResult extends StObject {
  
  /**
    * This is present when the suggestion indicates a person. It contains more information about the person - like their email ID, name etc.
    */
  var peopleSuggestion: js.UndefOr[SchemaPeopleSuggestion] = js.undefined
  
  /**
    * This field will be present if the suggested query is a word/phrase completion.
    */
  var querySuggestion: js.UndefOr[SchemaQuerySuggestion] = js.undefined
  
  /**
    * The source of the suggestion.
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
  
  /**
    * The suggested query that will be used for search, when the user clicks on the suggestion
    */
  var suggestedQuery: js.UndefOr[String | Null] = js.undefined
}
object SchemaSuggestResult {
  
  inline def apply(): SchemaSuggestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestResult]
  }
  
  extension [Self <: SchemaSuggestResult](x: Self) {
    
    inline def setPeopleSuggestion(value: SchemaPeopleSuggestion): Self = StObject.set(x, "peopleSuggestion", value.asInstanceOf[js.Any])
    
    inline def setPeopleSuggestionUndefined: Self = StObject.set(x, "peopleSuggestion", js.undefined)
    
    inline def setQuerySuggestion(value: SchemaQuerySuggestion): Self = StObject.set(x, "querySuggestion", value.asInstanceOf[js.Any])
    
    inline def setQuerySuggestionUndefined: Self = StObject.set(x, "querySuggestion", js.undefined)
    
    inline def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSuggestedQuery(value: String): Self = StObject.set(x, "suggestedQuery", value.asInstanceOf[js.Any])
    
    inline def setSuggestedQueryNull: Self = StObject.set(x, "suggestedQuery", null)
    
    inline def setSuggestedQueryUndefined: Self = StObject.set(x, "suggestedQuery", js.undefined)
  }
}
