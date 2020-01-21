package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to update the metadata of photos. Updating the pixels of photos is
  * not supported.
  */
@js.native
trait SchemaBatchUpdatePhotosRequest extends js.Object {
  /**
    * Required. List of UpdatePhotoRequests.
    */
  var updatePhotoRequests: js.UndefOr[js.Array[SchemaUpdatePhotoRequest]] = js.native
}

object SchemaBatchUpdatePhotosRequest {
  @scala.inline
  def apply(updatePhotoRequests: js.Array[SchemaUpdatePhotoRequest] = null): SchemaBatchUpdatePhotosRequest = {
    val __obj = js.Dynamic.literal()
    if (updatePhotoRequests != null) __obj.updateDynamic("updatePhotoRequests")(updatePhotoRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchUpdatePhotosRequest]
  }
}

