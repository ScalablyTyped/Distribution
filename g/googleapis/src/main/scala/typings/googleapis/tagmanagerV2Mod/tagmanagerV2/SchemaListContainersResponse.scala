package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Containers Response.
  */
@js.native
trait SchemaListContainersResponse extends js.Object {
  /**
    * All Containers of a GTM Account.
    */
  var container: js.UndefOr[js.Array[SchemaContainer]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListContainersResponse {
  @scala.inline
  def apply(container: js.Array[SchemaContainer] = null, nextPageToken: String = null): SchemaListContainersResponse = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListContainersResponse]
  }
}

