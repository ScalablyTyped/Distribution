package typings.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing sources.
  */
@js.native
trait SchemaListSourcesResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Sources belonging to the requested parent.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.native
}

object SchemaListSourcesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, sources: js.Array[SchemaSource] = null): SchemaListSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListSourcesResponse]
  }
}

