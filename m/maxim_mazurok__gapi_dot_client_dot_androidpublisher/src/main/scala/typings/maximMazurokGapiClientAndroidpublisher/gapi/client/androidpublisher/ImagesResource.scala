package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.Fields
import typings.maximMazurokGapiClientAndroidpublisher.anon.ImageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagesResource extends StObject {
  
  /** Deletes the image (specified by id) from the edit. */
  def delete(): Request[Unit] = js.native
  def delete(request: Fields): Request[Unit] = js.native
  
  /** Deletes all images for the specified language and image type. Returns an empty response if no images are found. */
  def deleteall(): Request[ImagesDeleteAllResponse] = js.native
  def deleteall(request: ImageType): Request[ImagesDeleteAllResponse] = js.native
  
  /** Lists all images. The response may be empty. */
  def list(): Request[ImagesListResponse] = js.native
  def list(request: ImageType): Request[ImagesListResponse] = js.native
  
  /** Uploads an image of the specified language and image type, and adds to the edit. */
  def upload(): Request[ImagesUploadResponse] = js.native
  def upload(request: ImageType): Request[ImagesUploadResponse] = js.native
}
