package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListReleasesResponse extends js.Object {
  /**
    * If there are additional releases remaining beyond the ones in this
    * response, then supply this token in the next
    * [`list`](../sites.versions.files/list) call to continue with the next set
    * of releases.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of hashes of files that still need to be uploaded, if any exist.
    */
  var releases: js.UndefOr[js.Array[SchemaRelease]] = js.native
}

object SchemaListReleasesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, releases: js.Array[SchemaRelease] = null): SchemaListReleasesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (releases != null) __obj.updateDynamic("releases")(releases.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListReleasesResponse]
  }
}

