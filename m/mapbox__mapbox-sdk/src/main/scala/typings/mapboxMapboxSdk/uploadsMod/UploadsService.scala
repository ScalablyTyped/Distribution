package typings.mapboxMapboxSdk.uploadsMod

import typings.mapboxMapboxSdk.anon.MapId
import typings.mapboxMapboxSdk.anon.Reverse
import typings.mapboxMapboxSdk.anon.UploadId
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadsService extends js.Object {
  /**
    * Create an upload.
    * @param config
    */
  def createUpload(config: MapId): MapiRequest = js.native
  /**
    * Create S3 credentials.
    */
  def createUploadCredentials(): MapiRequest = js.native
  /**
    * Delete an upload.
    * @param config
    */
  // implicit any
  def deleteUpload(config: UploadId): js.Any = js.native
  /**
    * Get an upload's status.
    * @param config
    */
  // implicit any
  def getUpload(config: UploadId): js.Any = js.native
  /**
    * List the statuses of all recent uploads.
    * @param config
    */
  def listUploads(config: Reverse): MapiRequest = js.native
}

object UploadsService {
  @scala.inline
  def apply(
    createUpload: MapId => MapiRequest,
    createUploadCredentials: () => MapiRequest,
    deleteUpload: UploadId => js.Any,
    getUpload: UploadId => js.Any,
    listUploads: Reverse => MapiRequest
  ): UploadsService = {
    val __obj = js.Dynamic.literal(createUpload = js.Any.fromFunction1(createUpload), createUploadCredentials = js.Any.fromFunction0(createUploadCredentials), deleteUpload = js.Any.fromFunction1(deleteUpload), getUpload = js.Any.fromFunction1(getUpload), listUploads = js.Any.fromFunction1(listUploads))
    __obj.asInstanceOf[UploadsService]
  }
  @scala.inline
  implicit class UploadsServiceOps[Self <: UploadsService] (val x: Self) extends AnyVal {
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
    def setCreateUpload(value: MapId => MapiRequest): Self = this.set("createUpload", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateUploadCredentials(value: () => MapiRequest): Self = this.set("createUploadCredentials", js.Any.fromFunction0(value))
    @scala.inline
    def setDeleteUpload(value: UploadId => js.Any): Self = this.set("deleteUpload", js.Any.fromFunction1(value))
    @scala.inline
    def setGetUpload(value: UploadId => js.Any): Self = this.set("getUpload", js.Any.fromFunction1(value))
    @scala.inline
    def setListUploads(value: Reverse => MapiRequest): Self = this.set("listUploads", js.Any.fromFunction1(value))
  }
  
}

