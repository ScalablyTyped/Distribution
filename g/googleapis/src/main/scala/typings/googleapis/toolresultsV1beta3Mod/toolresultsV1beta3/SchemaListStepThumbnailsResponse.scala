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
  def apply(): SchemaListStepThumbnailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListStepThumbnailsResponse]
  }
  @scala.inline
  implicit class SchemaListStepThumbnailsResponseOps[Self <: SchemaListStepThumbnailsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setThumbnailsVarargs(value: SchemaImage*): Self = this.set("thumbnails", js.Array(value :_*))
    @scala.inline
    def setThumbnails(value: js.Array[SchemaImage]): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
  }
  
}

