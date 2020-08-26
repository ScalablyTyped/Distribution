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
  def apply(): SchemaPhotoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhotoResponse]
  }
  @scala.inline
  implicit class SchemaPhotoResponseOps[Self <: SchemaPhotoResponse] (val x: Self) extends AnyVal {
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
    def setPhoto(value: SchemaPhoto): Self = this.set("photo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    @scala.inline
    def setStatus(value: SchemaStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

