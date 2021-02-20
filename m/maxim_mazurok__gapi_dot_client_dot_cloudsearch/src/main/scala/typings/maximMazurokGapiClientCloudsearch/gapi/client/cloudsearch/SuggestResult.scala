package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestResult extends StObject {
  
  /** This is present when the suggestion indicates a person. It contains more information about the person - like their email ID, name etc. */
  var peopleSuggestion: js.UndefOr[PeopleSuggestion] = js.native
  
  /** This field will be present if the suggested query is a word/phrase completion. */
  var querySuggestion: js.UndefOr[js.Any] = js.native
  
  /** The source of the suggestion. */
  var source: js.UndefOr[Source] = js.native
  
  /** The suggested query that will be used for search, when the user clicks on the suggestion */
  var suggestedQuery: js.UndefOr[String] = js.native
}
object SuggestResult {
  
  @scala.inline
  def apply(): SuggestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestResult]
  }
  
  @scala.inline
  implicit class SuggestResultMutableBuilder[Self <: SuggestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeopleSuggestion(value: PeopleSuggestion): Self = StObject.set(x, "peopleSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeopleSuggestionUndefined: Self = StObject.set(x, "peopleSuggestion", js.undefined)
    
    @scala.inline
    def setQuerySuggestion(value: js.Any): Self = StObject.set(x, "querySuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuerySuggestionUndefined: Self = StObject.set(x, "querySuggestion", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSuggestedQuery(value: String): Self = StObject.set(x, "suggestedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedQueryUndefined: Self = StObject.set(x, "suggestedQuery", js.undefined)
  }
}
