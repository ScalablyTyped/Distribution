package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A search result contains information about a YouTube video, channel, or
  * playlist that matches the search parameters specified in an API request.
  * While a search result points to a uniquely identifiable resource, like a
  * video, it does not have its own persistent data.
  */
@js.native
trait SchemaSearchResult extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The id object contains information that can be used to uniquely identify
    * the resource that matches the search request.
    */
  var id: js.UndefOr[SchemaResourceId] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#searchResult&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about a search result, such as
    * its title or description. For example, if the search result is a video,
    * then the title will be the video&#39;s title and the description will be
    * the video&#39;s description.
    */
  var snippet: js.UndefOr[SchemaSearchResultSnippet] = js.native
}

object SchemaSearchResult {
  @scala.inline
  def apply(
    etag: String = null,
    id: SchemaResourceId = null,
    kind: String = null,
    snippet: SchemaSearchResultSnippet = null
  ): SchemaSearchResult = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchResult]
  }
}

