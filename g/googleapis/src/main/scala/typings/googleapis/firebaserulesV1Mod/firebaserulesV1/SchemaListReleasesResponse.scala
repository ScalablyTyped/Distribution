package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for FirebaseRulesService.ListReleases.
  */
@js.native
trait SchemaListReleasesResponse extends js.Object {
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of `Release` instances.
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

