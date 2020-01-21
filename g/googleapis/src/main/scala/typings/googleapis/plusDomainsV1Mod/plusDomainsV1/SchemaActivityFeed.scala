package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaActivityFeed extends js.Object {
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID of this collection of activities. Deprecated.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The activities in this page of results.
    */
  var items: js.UndefOr[js.Array[SchemaActivity]] = js.native
  /**
    * Identifies this resource as a collection of activities. Value:
    * &quot;plus#activityFeed&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Link to the next page of activities.
    */
  var nextLink: js.UndefOr[String] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Link to this activity resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The title of this collection of activities, which is a truncated portion
    * of the content.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The time at which this collection of activities was last updated.
    * Formatted as an RFC 3339 timestamp.
    */
  var updated: js.UndefOr[String] = js.native
}

object SchemaActivityFeed {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    items: js.Array[SchemaActivity] = null,
    kind: String = null,
    nextLink: String = null,
    nextPageToken: String = null,
    selfLink: String = null,
    title: String = null,
    updated: String = null
  ): SchemaActivityFeed = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActivityFeed]
  }
}

