package typings.atMapboxMapboxDashSdk.servicesUploadsMod

import typings.atMapboxMapboxDashSdk.Anon_MapId
import typings.atMapboxMapboxDashSdk.Anon_Reverse
import typings.atMapboxMapboxDashSdk.Anon_UploadId
import typings.atMapboxMapboxDashSdk.libClassesMapiDashRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadsService extends js.Object {
  /**
    * Create an upload.
    * @param config
    */
  def createUpload(config: Anon_MapId): MapiRequest
  /**
    * Create S3 credentials.
    */
  def createUploadCredentials(): MapiRequest
  /**
    * Delete an upload.
    * @param config
    */
  // implicit any
  def deleteUpload(config: Anon_UploadId): js.Any
  /**
    * Get an upload's status.
    * @param config
    */
  // implicit any
  def getUpload(config: Anon_UploadId): js.Any
  /**
    * List the statuses of all recent uploads.
    * @param config
    */
  def listUploads(config: Anon_Reverse): MapiRequest
}

object UploadsService {
  @scala.inline
  def apply(
    createUpload: Anon_MapId => MapiRequest,
    createUploadCredentials: () => MapiRequest,
    deleteUpload: Anon_UploadId => js.Any,
    getUpload: Anon_UploadId => js.Any,
    listUploads: Anon_Reverse => MapiRequest
  ): UploadsService = {
    val __obj = js.Dynamic.literal(createUpload = js.Any.fromFunction1(createUpload), createUploadCredentials = js.Any.fromFunction0(createUploadCredentials), deleteUpload = js.Any.fromFunction1(deleteUpload), getUpload = js.Any.fromFunction1(getUpload), listUploads = js.Any.fromFunction1(listUploads))
  
    __obj.asInstanceOf[UploadsService]
  }
}

