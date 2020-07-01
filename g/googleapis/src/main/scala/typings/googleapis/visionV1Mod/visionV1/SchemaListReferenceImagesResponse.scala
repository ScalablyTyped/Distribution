package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `ListReferenceImages` method.
  */
@js.native
trait SchemaListReferenceImagesResponse extends js.Object {
  /**
    * The next_page_token returned from a previous List request, if any.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The maximum number of items to return. Default 10, maximum 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The list of reference images.
    */
  var referenceImages: js.UndefOr[js.Array[SchemaReferenceImage]] = js.native
}

object SchemaListReferenceImagesResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    referenceImages: js.Array[SchemaReferenceImage] = null
  ): SchemaListReferenceImagesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (referenceImages != null) __obj.updateDynamic("referenceImages")(referenceImages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListReferenceImagesResponse]
  }
}

