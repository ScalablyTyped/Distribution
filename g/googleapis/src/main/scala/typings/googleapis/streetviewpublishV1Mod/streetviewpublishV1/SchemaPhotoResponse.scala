package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response payload for a single Photo in batch operations including
  * BatchGetPhotos and BatchUpdatePhotos.
  */
@js.native
trait SchemaPhotoResponse extends js.Object {
  /**
    * The Photo resource, if the request was successful.
    */
  var photo: js.UndefOr[SchemaPhoto] = js.native
  /**
    * The status for the operation to get or update a single photo in the batch
    * request.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}

object SchemaPhotoResponse {
  @scala.inline
  def apply(photo: SchemaPhoto = null, status: SchemaStatus = null): SchemaPhotoResponse = {
    val __obj = js.Dynamic.literal()
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPhotoResponse]
  }
}

