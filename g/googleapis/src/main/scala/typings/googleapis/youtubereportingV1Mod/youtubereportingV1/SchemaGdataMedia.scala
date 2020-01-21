package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataMedia extends js.Object {
  /**
    * gdata
    */
  var algorithm: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var bigstoreObjectRef: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var blobRef: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var blobstore2Info: js.UndefOr[SchemaGdataBlobstore2Info] = js.native
  /**
    * gdata
    */
  var compositeMedia: js.UndefOr[js.Array[SchemaGdataCompositeMedia]] = js.native
  /**
    * gdata
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var contentTypeInfo: js.UndefOr[SchemaGdataContentTypeInfo] = js.native
  /**
    * gdata
    */
  var cosmoBinaryReference: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var crc32cHash: js.UndefOr[Double] = js.native
  /**
    * gdata
    */
  var diffChecksumsResponse: js.UndefOr[SchemaGdataDiffChecksumsResponse] = js.native
  /**
    * gdata
    */
  var diffDownloadResponse: js.UndefOr[SchemaGdataDiffDownloadResponse] = js.native
  /**
    * gdata
    */
  var diffUploadRequest: js.UndefOr[SchemaGdataDiffUploadRequest] = js.native
  /**
    * gdata
    */
  var diffUploadResponse: js.UndefOr[SchemaGdataDiffUploadResponse] = js.native
  /**
    * gdata
    */
  var diffVersionResponse: js.UndefOr[SchemaGdataDiffVersionResponse] = js.native
  /**
    * gdata
    */
  var downloadParameters: js.UndefOr[SchemaGdataDownloadParameters] = js.native
  /**
    * gdata
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var hashVerified: js.UndefOr[Boolean] = js.native
  /**
    * gdata
    */
  var `inline`: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var isPotentialRetry: js.UndefOr[Boolean] = js.native
  /**
    * gdata
    */
  var length: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var md5Hash: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var mediaId: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var objectId: js.UndefOr[SchemaGdataObjectId] = js.native
  /**
    * gdata
    */
  var path: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var referenceType: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var sha1Hash: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var sha256Hash: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var token: js.UndefOr[String] = js.native
}

object SchemaGdataMedia {
  @scala.inline
  def apply(
    algorithm: String = null,
    bigstoreObjectRef: String = null,
    blobRef: String = null,
    blobstore2Info: SchemaGdataBlobstore2Info = null,
    compositeMedia: js.Array[SchemaGdataCompositeMedia] = null,
    contentType: String = null,
    contentTypeInfo: SchemaGdataContentTypeInfo = null,
    cosmoBinaryReference: String = null,
    crc32cHash: Int | Double = null,
    diffChecksumsResponse: SchemaGdataDiffChecksumsResponse = null,
    diffDownloadResponse: SchemaGdataDiffDownloadResponse = null,
    diffUploadRequest: SchemaGdataDiffUploadRequest = null,
    diffUploadResponse: SchemaGdataDiffUploadResponse = null,
    diffVersionResponse: SchemaGdataDiffVersionResponse = null,
    downloadParameters: SchemaGdataDownloadParameters = null,
    filename: String = null,
    hash: String = null,
    hashVerified: js.UndefOr[Boolean] = js.undefined,
    `inline`: String = null,
    isPotentialRetry: js.UndefOr[Boolean] = js.undefined,
    length: String = null,
    md5Hash: String = null,
    mediaId: String = null,
    objectId: SchemaGdataObjectId = null,
    path: String = null,
    referenceType: String = null,
    sha1Hash: String = null,
    sha256Hash: String = null,
    timestamp: String = null,
    token: String = null
  ): SchemaGdataMedia = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (bigstoreObjectRef != null) __obj.updateDynamic("bigstoreObjectRef")(bigstoreObjectRef.asInstanceOf[js.Any])
    if (blobRef != null) __obj.updateDynamic("blobRef")(blobRef.asInstanceOf[js.Any])
    if (blobstore2Info != null) __obj.updateDynamic("blobstore2Info")(blobstore2Info.asInstanceOf[js.Any])
    if (compositeMedia != null) __obj.updateDynamic("compositeMedia")(compositeMedia.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (contentTypeInfo != null) __obj.updateDynamic("contentTypeInfo")(contentTypeInfo.asInstanceOf[js.Any])
    if (cosmoBinaryReference != null) __obj.updateDynamic("cosmoBinaryReference")(cosmoBinaryReference.asInstanceOf[js.Any])
    if (crc32cHash != null) __obj.updateDynamic("crc32cHash")(crc32cHash.asInstanceOf[js.Any])
    if (diffChecksumsResponse != null) __obj.updateDynamic("diffChecksumsResponse")(diffChecksumsResponse.asInstanceOf[js.Any])
    if (diffDownloadResponse != null) __obj.updateDynamic("diffDownloadResponse")(diffDownloadResponse.asInstanceOf[js.Any])
    if (diffUploadRequest != null) __obj.updateDynamic("diffUploadRequest")(diffUploadRequest.asInstanceOf[js.Any])
    if (diffUploadResponse != null) __obj.updateDynamic("diffUploadResponse")(diffUploadResponse.asInstanceOf[js.Any])
    if (diffVersionResponse != null) __obj.updateDynamic("diffVersionResponse")(diffVersionResponse.asInstanceOf[js.Any])
    if (downloadParameters != null) __obj.updateDynamic("downloadParameters")(downloadParameters.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(hashVerified)) __obj.updateDynamic("hashVerified")(hashVerified.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(isPotentialRetry)) __obj.updateDynamic("isPotentialRetry")(isPotentialRetry.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (md5Hash != null) __obj.updateDynamic("md5Hash")(md5Hash.asInstanceOf[js.Any])
    if (mediaId != null) __obj.updateDynamic("mediaId")(mediaId.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (referenceType != null) __obj.updateDynamic("referenceType")(referenceType.asInstanceOf[js.Any])
    if (sha1Hash != null) __obj.updateDynamic("sha1Hash")(sha1Hash.asInstanceOf[js.Any])
    if (sha256Hash != null) __obj.updateDynamic("sha256Hash")(sha256Hash.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGdataMedia]
  }
}

