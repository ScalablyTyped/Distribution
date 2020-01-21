package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response containing the thumbnails in a step.
  */
@js.native
trait SchemaListStepThumbnailsResponse extends js.Object {
  /**
    * A continuation token to resume the query at the next item.  If set,
    * indicates that there are more thumbnails to read, by calling list again
    * with this value in the page_token field.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of image data.  Images are returned in a deterministic order; they
    * are ordered by these factors, in order of importance: * First, by their
    * associated test case. Images without a test case are considered greater
    * than images with one. * Second, by their creation time. Images without a
    * creation time are greater than images with one. * Third, by the order in
    * which they were added to the step (by calls to CreateStep or UpdateStep).
    */
  var thumbnails: js.UndefOr[js.Array[SchemaImage]] = js.native
}

object SchemaListStepThumbnailsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, thumbnails: js.Array[SchemaImage] = null): SchemaListStepThumbnailsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListStepThumbnailsResponse]
  }
}

