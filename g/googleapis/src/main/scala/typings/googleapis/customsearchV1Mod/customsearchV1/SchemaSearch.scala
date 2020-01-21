package typings.googleapis.customsearchV1Mod.customsearchV1

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.AnonCorrectedQuery
import typings.googleapis.AnonFormattedSearchTime
import typings.googleapis.AnonTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSearch extends js.Object {
  var context: js.UndefOr[SchemaContext] = js.native
  var items: js.UndefOr[js.Array[SchemaResult]] = js.native
  var kind: js.UndefOr[String] = js.native
  var promotions: js.UndefOr[js.Array[SchemaPromotion]] = js.native
  var queries: js.UndefOr[StringDictionary[js.Array[SchemaQuery]]] = js.native
  var searchInformation: js.UndefOr[AnonFormattedSearchTime] = js.native
  var spelling: js.UndefOr[AnonCorrectedQuery] = js.native
  var url: js.UndefOr[AnonTemplate] = js.native
}

object SchemaSearch {
  @scala.inline
  def apply(
    context: SchemaContext = null,
    items: js.Array[SchemaResult] = null,
    kind: String = null,
    promotions: js.Array[SchemaPromotion] = null,
    queries: StringDictionary[js.Array[SchemaQuery]] = null,
    searchInformation: AnonFormattedSearchTime = null,
    spelling: AnonCorrectedQuery = null,
    url: AnonTemplate = null
  ): SchemaSearch = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (promotions != null) __obj.updateDynamic("promotions")(promotions.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (searchInformation != null) __obj.updateDynamic("searchInformation")(searchInformation.asInstanceOf[js.Any])
    if (spelling != null) __obj.updateDynamic("spelling")(spelling.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearch]
  }
}

