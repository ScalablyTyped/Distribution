package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List container versions response.
  */
@js.native
trait SchemaListContainerVersionsResponse extends js.Object {
  /**
    * All container version headers of a GTM Container.
    */
  var containerVersionHeader: js.UndefOr[js.Array[SchemaContainerVersionHeader]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListContainerVersionsResponse {
  @scala.inline
  def apply(
    containerVersionHeader: js.Array[SchemaContainerVersionHeader] = null,
    nextPageToken: String = null
  ): SchemaListContainerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (containerVersionHeader != null) __obj.updateDynamic("containerVersionHeader")(containerVersionHeader.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListContainerVersionsResponse]
  }
}

