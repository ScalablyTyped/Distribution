package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response containing a partial list of manifests and a page token used to
  * build the next request if the request has been truncated.
  */
@js.native
trait SchemaManifestsListResponse extends js.Object {
  /**
    * Output only. Manifests contained in this list response.
    */
  var manifests: js.UndefOr[js.Array[SchemaManifest]] = js.native
  /**
    * Output only. A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaManifestsListResponse {
  @scala.inline
  def apply(manifests: js.Array[SchemaManifest] = null, nextPageToken: String = null): SchemaManifestsListResponse = {
    val __obj = js.Dynamic.literal()
    if (manifests != null) __obj.updateDynamic("manifests")(manifests.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManifestsListResponse]
  }
}

