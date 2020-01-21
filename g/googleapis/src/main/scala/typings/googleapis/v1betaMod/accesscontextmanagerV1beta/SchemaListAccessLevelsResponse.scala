package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to `ListAccessLevelsRequest`.
  */
@js.native
trait SchemaListAccessLevelsResponse extends js.Object {
  /**
    * List of the Access Level instances.
    */
  var accessLevels: js.UndefOr[js.Array[SchemaAccessLevel]] = js.native
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAccessLevelsResponse {
  @scala.inline
  def apply(accessLevels: js.Array[SchemaAccessLevel] = null, nextPageToken: String = null): SchemaListAccessLevelsResponse = {
    val __obj = js.Dynamic.literal()
    if (accessLevels != null) __obj.updateDynamic("accessLevels")(accessLevels.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAccessLevelsResponse]
  }
}

