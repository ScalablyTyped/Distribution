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
  def apply(
    peopleSuggestion: SchemaPeopleSuggestion = null,
    querySuggestion: SchemaQuerySuggestion = null,
    source: SchemaSource = null,
    suggestedQuery: String = null
  ): SchemaSuggestResult = {
    val __obj = js.Dynamic.literal()
    if (peopleSuggestion != null) __obj.updateDynamic("peopleSuggestion")(peopleSuggestion.asInstanceOf[js.Any])
    if (querySuggestion != null) __obj.updateDynamic("querySuggestion")(querySuggestion.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (suggestedQuery != null) __obj.updateDynamic("suggestedQuery")(suggestedQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSuggestResult]
  }
}

