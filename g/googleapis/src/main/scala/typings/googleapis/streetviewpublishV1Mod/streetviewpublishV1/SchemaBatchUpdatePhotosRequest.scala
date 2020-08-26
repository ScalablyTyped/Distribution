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
  def apply(): SchemaBatchUpdatePhotosRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdatePhotosRequest]
  }
  @scala.inline
  implicit class SchemaBatchUpdatePhotosRequestOps[Self <: SchemaBatchUpdatePhotosRequest] (val x: Self) extends AnyVal {
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
    def setUpdatePhotoRequestsVarargs(value: SchemaUpdatePhotoRequest*): Self = this.set("updatePhotoRequests", js.Array(value :_*))
    @scala.inline
    def setUpdatePhotoRequests(value: js.Array[SchemaUpdatePhotoRequest]): Self = this.set("updatePhotoRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatePhotoRequests: Self = this.set("updatePhotoRequests", js.undefined)
  }
  
}

