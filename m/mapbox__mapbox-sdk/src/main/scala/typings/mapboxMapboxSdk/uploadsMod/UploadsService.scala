package typings.mapboxMapboxSdk.uploadsMod

import typings.mapboxMapboxSdk.anon.MapId
import typings.mapboxMapboxSdk.anon.Reverse
import typings.mapboxMapboxSdk.anon.UploadId
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadsService extends js.Object {
  /**
    * Create an upload.
    * @param config
    */
  def createUpload(config: MapId): MapiRequest
  /**
    * Create S3 credentials.
    */
  def createUploadCredentials(): MapiRequest
  /**
    * Delete an upload.
    * @param config
    */
  // implicit any
  def deleteUpload(config: UploadId): js.Any
  /**
    * Get an upload's status.
    * @param config
    */
  // implicit any
  def getUpload(config: UploadId): js.Any
  /**
    * List the statuses of all recent uploads.
    * @param config
    */
  def listUploads(config: Reverse): MapiRequest
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
}

