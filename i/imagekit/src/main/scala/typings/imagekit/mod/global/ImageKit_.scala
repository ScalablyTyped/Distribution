package typings.imagekit.mod.global

import typings.imagekit.anon.Expire
import typings.imagekit.anon.PrivateKey
import typings.imagekit.mod.global.ImageKit.BulkDeleteFilesError
import typings.imagekit.mod.global.ImageKit.BulkDeleteFilesResponse
import typings.imagekit.mod.global.ImageKit.Callback
import typings.imagekit.mod.global.ImageKit.FileDetailsOptions
import typings.imagekit.mod.global.ImageKit.FileDetailsResponse
import typings.imagekit.mod.global.ImageKit.FileMetadataResponse
import typings.imagekit.mod.global.ImageKit.ListFileOptions
import typings.imagekit.mod.global.ImageKit.ListFileResponse
import typings.imagekit.mod.global.ImageKit.PurgeCacheResponse
import typings.imagekit.mod.global.ImageKit.PurgeCacheStatusResponse
import typings.imagekit.mod.global.ImageKit.UploadOptions
import typings.imagekit.mod.global.ImageKit.UploadResponse
import typings.imagekit.mod.global.ImageKit.UrlOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ImageKit")
@js.native
class ImageKit_ protected () extends js.Object {
  def this(options: PrivateKey) = this()
  
  /**
    * Deletes multiple files from the media library.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/delete-files-bulk}
    *
    * @param fileIds Each value should be a unique fileId of the uploaded file. fileId is returned in list files API and upload API
    */
  def bulkDeleteFiles(fileIds: js.Array[String]): js.Promise[BulkDeleteFilesResponse] = js.native
  /**
    * Deletes multiple files from the media library.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/delete-files-bulk}
    *
    * @param fileIds Each value should be a unique fileId of the uploaded file. fileId is returned in list files API and upload API
    * @param callback
    */
  def bulkDeleteFiles(fileIds: js.Array[String], callback: Callback[BulkDeleteFilesResponse, BulkDeleteFilesError]): Unit = js.native
  
  /**
    * You can programmatically delete uploaded files in media library using delete file API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/delete-file}
    *
    * @param fileId The unique fileId of the uploaded file. fileId is returned in list files API and upload API
    */
  def deleteFile(fileId: String): js.Promise[Unit] = js.native
  /**
    * You can programmatically delete uploaded files in media library using delete file API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/delete-file}
    *
    * @param fileId The unique fileId of the uploaded file. fileId is returned in list files API and upload API
    * @param callback
    */
  def deleteFile(fileId: String, callback: Callback[Unit, Error]): Unit = js.native
  
  /**
    * Authentication parameter generation
    *
    * @see {@link https://github.com/imagekit-developer/imagekit-nodejs#authentication-parameter-generation}
    *
    * @param token
    * @param expire
    */
  def getAuthenticationParameters(): Expire = js.native
  def getAuthenticationParameters(token: js.UndefOr[scala.Nothing], expire: Double): Expire = js.native
  def getAuthenticationParameters(token: String): Expire = js.native
  def getAuthenticationParameters(token: String, expire: Double): Expire = js.native
  
  /**
    * Get the file details such as tags, customCoordinates, and isPrivate properties using get file detail API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/get-file-details}
    *
    * @param fileId
    */
  def getFileDetails(fileId: String): js.Promise[FileDetailsResponse] = js.native
  /**
    * Get the file details such as tags, customCoordinates, and isPrivate properties using get file detail API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/get-file-details}
    *
    * @param fileId
    * @param callback
    */
  def getFileDetails(fileId: String, callback: Callback[FileDetailsResponse, Error]): Unit = js.native
  
  /**
    * Get image exif, pHash and other metadata for uploaded files in ImageKit.io media library using this API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/metadata-api/get-image-metadata-for-uploaded-media-files}
    *
    * @param fileId The unique fileId of the uploaded file. fileId is returned in list files API and upload API.
    */
  def getFileMetadata(fileId: String): js.Promise[FileMetadataResponse] = js.native
  /**
    * Get image exif, pHash and other metadata for uploaded files in ImageKit.io media library using this API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/metadata-api/get-image-metadata-for-uploaded-media-files}
    *
    * @param fileId The unique fileId of the uploaded file. fileId is returned in list files API and upload API.
    * @param callback
    */
  def getFileMetadata(fileId: String, callback: Callback[FileMetadataResponse, Error]): Unit = js.native
  
  /**
    * Get the status of submitted purge request.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/purge-cache-status}
    *
    * @param cacheRequestId The requestId returned in response of purge cache API.
    */
  def getPurgeCacheStatus(cacheRequestId: String): js.Promise[PurgeCacheStatusResponse] = js.native
  /**
    * Get the status of submitted purge request.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/purge-cache-status}
    *
    * @param cacheRequestId The requestId returned in response of purge cache API.
    * @param callback
    */
  def getPurgeCacheStatus(cacheRequestId: String, callback: Callback[PurgeCacheStatusResponse, Error]): Unit = js.native
  
  /**
    * This API can list all the uploaded files in your ImageKit.io media library.
    * For searching and filtering, you can use query parameters as described below.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/list-and-search-files}
    *
    * @param listFilesOptions
    */
  def listFiles(listFilesOptions: ListFileOptions): js.Promise[ListFileResponse] = js.native
  /**
    * This API can list all the uploaded files in your ImageKit.io media library.
    * For searching and filtering, you can use query parameters as described below.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/list-and-search-files}
    *
    * @param listFilesOptions
    * @param callback
    */
  def listFiles(listFilesOptions: ListFileOptions, callback: Callback[ListFileResponse, Error]): Unit = js.native
  
  /**
    * Perceptual Hash (pHash)
    * Distance between two pHash values can be calculated using utility function
    *
    * @see {@link https://docs.imagekit.io/api-reference/metadata-api#perceptual-hash-phash}
    *
    * @param hashA
    * @param hashB
    */
  def pHashDistance(hashA: String, hashB: String): Double = js.native
  
  /**
    * This will purge CDN and ImageKit.io internal cache.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/purge-cache}
    *
    * @param fullUrl The exact URL of the file to be purged. For example - https://ik.imageki.io/your_imagekit_id/rest-of-the-file-path.jpg
    */
  def purgeCache(fullUrl: String): js.Promise[PurgeCacheResponse] = js.native
  /**
    * This will purge CDN and ImageKit.io internal cache.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/purge-cache}
    *
    * @param fullUrl The exact URL of the file to be purged. For example - https://ik.imageki.io/your_imagekit_id/rest-of-the-file-path.jpg
    * @param callback
    */
  def purgeCache(fullUrl: String, callback: Callback[PurgeCacheResponse, Error]): Unit = js.native
  
  /**
    * Update file details such as tags and customCoordinates attribute using update file detail API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/update-file-details}
    *
    * @param fileId The unique fileId of the uploaded file. fileId is returned in list files API and upload API.
    * @param optionsFileDetails
    */
  def updateFileDetails(fileId: String, optionsFileDetails: FileDetailsOptions): js.Promise[FileDetailsResponse] = js.native
  /**
    * Update file details such as tags and customCoordinates attribute using update file detail API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/update-file-details}
    *
    * @param fileId The unique fileId of the uploaded file. fileId is returned in list files API and upload API.
    * @param optionsFileDetails
    * @param callback
    */
  def updateFileDetails(
    fileId: String,
    optionsFileDetails: FileDetailsOptions,
    callback: Callback[FileDetailsResponse, Error]
  ): Unit = js.native
  
  /**
    * You can upload files to ImageKit.io media library from your server-side using private API key authentication.
    *
    * File size limit
    * The maximum upload file size is limited to 25MB.
    *
    * @see {@link https://docs.imagekit.io/api-reference/upload-file-api/server-side-file-upload}
    *
    * @param uploadOptions
    */
  def upload(uploadOptions: UploadOptions): js.Promise[UploadResponse] = js.native
  /**
    * You can upload files to ImageKit.io media library from your server-side using private API key authentication.
    *
    * File size limit
    * The maximum upload file size is limited to 25MB.
    *
    * @see {@link https://docs.imagekit.io/api-reference/upload-file-api/server-side-file-upload}
    *
    * @param uploadOptions
    * @param callback
    */
  def upload(uploadOptions: UploadOptions, callback: Callback[UploadResponse, Error]): Unit = js.native
  
  /**
    * You can add multiple origins in the same ImageKit.io account.
    * URL endpoints allow you to configure which origins are accessible through your account and set their preference order as well.
    *
    * @see {@link https://github.com/imagekit-developer/imagekit-nodejs#url-generation}
    * @see {@link https://docs.imagekit.io/integration/url-endpoints}
    *
    * @param urlOptions
    */
  def url(urlOptions: UrlOptions): String = js.native
}
