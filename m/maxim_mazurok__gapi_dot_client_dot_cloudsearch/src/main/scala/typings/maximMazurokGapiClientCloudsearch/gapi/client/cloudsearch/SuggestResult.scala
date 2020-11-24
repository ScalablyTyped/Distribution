package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestResult extends js.Object {
  
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
  implicit class SuggestResultOps[Self <: SuggestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPeopleSuggestion(value: PeopleSuggestion): Self = this.set("peopleSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeopleSuggestion: Self = this.set("peopleSuggestion", js.undefined)
    
    @scala.inline
    def setQuerySuggestion(value: js.Any): Self = this.set("querySuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuerySuggestion: Self = this.set("querySuggestion", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSuggestedQuery(value: String): Self = this.set("suggestedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedQuery: Self = this.set("suggestedQuery", js.undefined)
  }
}
