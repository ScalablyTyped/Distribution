package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One suggestion result.
  */
@js.native
trait SchemaSuggestResult extends js.Object {
  var peopleSuggestion: js.UndefOr[SchemaPeopleSuggestion] = js.native
  var querySuggestion: js.UndefOr[SchemaQuerySuggestion] = js.native
  /**
    * The source of the suggestion.
    */
  var source: js.UndefOr[SchemaSource] = js.native
  /**
    * The suggested query that will be used for search, when the user clicks on
    * the suggestion
    */
  var suggestedQuery: js.UndefOr[String] = js.native
}

object SchemaSuggestResult {
  @scala.inline
  def apply(): SchemaSuggestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestResult]
  }
  @scala.inline
  implicit class SchemaSuggestResultOps[Self <: SchemaSuggestResult] (val x: Self) extends AnyVal {
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
    def setPeopleSuggestion(value: SchemaPeopleSuggestion): Self = this.set("peopleSuggestion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeopleSuggestion: Self = this.set("peopleSuggestion", js.undefined)
    @scala.inline
    def setQuerySuggestion(value: SchemaQuerySuggestion): Self = this.set("querySuggestion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuerySuggestion: Self = this.set("querySuggestion", js.undefined)
    @scala.inline
    def setSource(value: SchemaSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSuggestedQuery(value: String): Self = this.set("suggestedQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedQuery: Self = this.set("suggestedQuery", js.undefined)
  }
  
}

