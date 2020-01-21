package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of changes for a user.
  */
@js.native
trait SchemaChangeList extends js.Object {
  /**
    * The ETag of the list.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The list of changes. If nextPageToken is populated, then this list may be
    * incomplete and an additional page of results should be fetched.
    */
  var items: js.UndefOr[js.Array[SchemaChange]] = js.native
  /**
    * This is always drive#changeList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The current largest change ID.
    */
  var largestChangeId: js.UndefOr[String] = js.native
  /**
    * The starting page token for future changes. This will be present only if
    * the end of the current changes list has been reached.
    */
  var newStartPageToken: js.UndefOr[String] = js.native
  /**
    * A link to the next page of changes.
    */
  var nextLink: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of changes. This will be absent if the
    * end of the changes list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A link back to this list.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaChangeList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[SchemaChange] = null,
    kind: String = null,
    largestChangeId: String = null,
    newStartPageToken: String = null,
    nextLink: String = null,
    nextPageToken: String = null,
    selfLink: String = null
  ): SchemaChangeList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (largestChangeId != null) __obj.updateDynamic("largestChangeId")(largestChangeId.asInstanceOf[js.Any])
    if (newStartPageToken != null) __obj.updateDynamic("newStartPageToken")(newStartPageToken.asInstanceOf[js.Any])
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChangeList]
  }
}

