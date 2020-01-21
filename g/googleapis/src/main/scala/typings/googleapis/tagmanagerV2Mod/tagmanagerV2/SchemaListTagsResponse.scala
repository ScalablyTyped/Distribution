package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Tags Response.
  */
@js.native
trait SchemaListTagsResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * All GTM Tags of a GTM Container.
    */
  var tag: js.UndefOr[js.Array[SchemaTag]] = js.native
}

object SchemaListTagsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, tag: js.Array[SchemaTag] = null): SchemaListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTagsResponse]
  }
}

