package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results containing indexed information for a document.
  */
@js.native
trait SchemaSearchResult extends js.Object {
  /**
    * If source is clustered, provide list of clustered results. There will
    * only be one level of clustered results. If current source is not enabled
    * for clustering, this field will be empty.
    */
  var clusteredResults: js.UndefOr[js.Array[SchemaSearchResult]] = js.native
  /**
    * Debugging information about this search result.
    */
  var debugInfo: js.UndefOr[SchemaResultDebugInfo] = js.native
  /**
    * Metadata of the search result.
    */
  var metadata: js.UndefOr[SchemaMetadata] = js.native
  /**
    * The concatenation of all snippets (summaries) available for this result.
    */
  var snippet: js.UndefOr[SchemaSnippet] = js.native
  /**
    * Title of the search result.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The URL of the search result. The URL contains a Google redirect to the
    * actual item.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaSearchResult {
  @scala.inline
  def apply(
    clusteredResults: js.Array[SchemaSearchResult] = null,
    debugInfo: SchemaResultDebugInfo = null,
    metadata: SchemaMetadata = null,
    snippet: SchemaSnippet = null,
    title: String = null,
    url: String = null
  ): SchemaSearchResult = {
    val __obj = js.Dynamic.literal()
    if (clusteredResults != null) __obj.updateDynamic("clusteredResults")(clusteredResults.asInstanceOf[js.Any])
    if (debugInfo != null) __obj.updateDynamic("debugInfo")(debugInfo.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchResult]
  }
}

