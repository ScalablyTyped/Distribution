package typings.mapboxMapboxSdk.uploadsMod

import typings.mapboxMapboxSdk.AnonMapId
import typings.mapboxMapboxSdk.AnonReverse
import typings.mapboxMapboxSdk.AnonUploadId
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadsService extends js.Object {
  /**
    * Create an upload.
    * @param config
    */
  def createUpload(config: AnonMapId): MapiRequest
  /**
    * Create S3 credentials.
    */
  def createUploadCredentials(): MapiRequest
  /**
    * Delete an upload.
    * @param config
    */
  // implicit any
  def deleteUpload(config: AnonUploadId): js.Any
  /**
    * Get an upload's status.
    * @param config
    */
  // implicit any
  def getUpload(config: AnonUploadId): js.Any
  /**
    * List the statuses of all recent uploads.
    * @param config
    */
  def listUploads(config: AnonReverse): MapiRequest
}

object UploadsService {
  @scala.inline
  def apply(
    createUpload: AnonMapId => MapiRequest,
    createUploadCredentials: () => MapiRequest,
    deleteUpload: AnonUploadId => js.Any,
    getUpload: AnonUploadId => js.Any,
    listUploads: AnonReverse => MapiRequest
  ): UploadsService = {
    val __obj = js.Dynamic.literal(createUpload = js.Any.fromFunction1(createUpload), createUploadCredentials = js.Any.fromFunction0(createUploadCredentials), deleteUpload = js.Any.fromFunction1(deleteUpload), getUpload = js.Any.fromFunction1(getUpload), listUploads = js.Any.fromFunction1(listUploads))
    __obj.asInstanceOf[UploadsService]
  }
}

