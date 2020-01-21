package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the ListVersions method.
  */
@js.native
trait SchemaGoogleCloudMlV1ListVersionsResponse extends js.Object {
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of versions.
    */
  var versions: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Version]] = js.native
}

object SchemaGoogleCloudMlV1ListVersionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, versions: js.Array[SchemaGoogleCloudMlV1Version] = null): SchemaGoogleCloudMlV1ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ListVersionsResponse]
  }
}

