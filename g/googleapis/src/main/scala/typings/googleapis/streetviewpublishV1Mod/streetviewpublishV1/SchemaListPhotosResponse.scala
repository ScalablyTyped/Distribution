package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to list all photos that belong to a user.
  */
@js.native
trait SchemaListPhotosResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of photos. The pageSize field in the request determines the number
    * of items returned.
    */
  var photos: js.UndefOr[js.Array[SchemaPhoto]] = js.native
}

object SchemaListPhotosResponse {
  @scala.inline
  def apply(nextPageToken: String = null, photos: js.Array[SchemaPhoto] = null): SchemaListPhotosResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListPhotosResponse]
  }
}

