package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of timeline items. This is the response from the server to GET
  * requests on the timeline collection.
  */
@js.native
trait SchemaTimelineListResponse extends js.Object {
  /**
    * Items in the timeline.
    */
  var items: js.UndefOr[js.Array[SchemaTimelineItem]] = js.native
  /**
    * The type of resource. This is always mirror#timeline.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The next page token. Provide this as the pageToken parameter in the
    * request to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaTimelineListResponse {
  @scala.inline
  def apply(items: js.Array[SchemaTimelineItem] = null, kind: String = null, nextPageToken: String = null): SchemaTimelineListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTimelineListResponse]
  }
}

