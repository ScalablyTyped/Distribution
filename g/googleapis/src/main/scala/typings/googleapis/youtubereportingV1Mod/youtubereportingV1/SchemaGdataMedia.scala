package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaGdataMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataMedia]
  }
  
  @scala.inline
  implicit class SchemaGdataMediaOps[Self <: SchemaGdataMedia] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setBigstoreObjectRef(value: String): Self = this.set("bigstoreObjectRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigstoreObjectRef: Self = this.set("bigstoreObjectRef", js.undefined)
    
    @scala.inline
    def setBlobRef(value: String): Self = this.set("blobRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlobRef: Self = this.set("blobRef", js.undefined)
    
    @scala.inline
    def setBlobstore2Info(value: SchemaGdataBlobstore2Info): Self = this.set("blobstore2Info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlobstore2Info: Self = this.set("blobstore2Info", js.undefined)
    
    @scala.inline
    def setCompositeMediaVarargs(value: SchemaGdataCompositeMedia*): Self = this.set("compositeMedia", js.Array(value :_*))
    
    @scala.inline
    def setCompositeMedia(value: js.Array[SchemaGdataCompositeMedia]): Self = this.set("compositeMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompositeMedia: Self = this.set("compositeMedia", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setContentTypeInfo(value: SchemaGdataContentTypeInfo): Self = this.set("contentTypeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentTypeInfo: Self = this.set("contentTypeInfo", js.undefined)
    
    @scala.inline
    def setCosmoBinaryReference(value: String): Self = this.set("cosmoBinaryReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCosmoBinaryReference: Self = this.set("cosmoBinaryReference", js.undefined)
    
    @scala.inline
    def setCrc32cHash(value: Double): Self = this.set("crc32cHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrc32cHash: Self = this.set("crc32cHash", js.undefined)
    
    @scala.inline
    def setDiffChecksumsResponse(value: SchemaGdataDiffChecksumsResponse): Self = this.set("diffChecksumsResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffChecksumsResponse: Self = this.set("diffChecksumsResponse", js.undefined)
    
    @scala.inline
    def setDiffDownloadResponse(value: SchemaGdataDiffDownloadResponse): Self = this.set("diffDownloadResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffDownloadResponse: Self = this.set("diffDownloadResponse", js.undefined)
    
    @scala.inline
    def setDiffUploadRequest(value: SchemaGdataDiffUploadRequest): Self = this.set("diffUploadRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffUploadRequest: Self = this.set("diffUploadRequest", js.undefined)
    
    @scala.inline
    def setDiffUploadResponse(value: SchemaGdataDiffUploadResponse): Self = this.set("diffUploadResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffUploadResponse: Self = this.set("diffUploadResponse", js.undefined)
    
    @scala.inline
    def setDiffVersionResponse(value: SchemaGdataDiffVersionResponse): Self = this.set("diffVersionResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffVersionResponse: Self = this.set("diffVersionResponse", js.undefined)
    
    @scala.inline
    def setDownloadParameters(value: SchemaGdataDownloadParameters): Self = this.set("downloadParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadParameters: Self = this.set("downloadParameters", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setHashVerified(value: Boolean): Self = this.set("hashVerified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashVerified: Self = this.set("hashVerified", js.undefined)
    
    @scala.inline
    def setInline(value: String): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setIsPotentialRetry(value: Boolean): Self = this.set("isPotentialRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPotentialRetry: Self = this.set("isPotentialRetry", js.undefined)
    
    @scala.inline
    def setLength(value: String): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setMd5Hash(value: String): Self = this.set("md5Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5Hash: Self = this.set("md5Hash", js.undefined)
    
    @scala.inline
    def setMediaId(value: String): Self = this.set("mediaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaId: Self = this.set("mediaId", js.undefined)
    
    @scala.inline
    def setObjectId(value: SchemaGdataObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setReferenceType(value: String): Self = this.set("referenceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceType: Self = this.set("referenceType", js.undefined)
    
    @scala.inline
    def setSha1Hash(value: String): Self = this.set("sha1Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha1Hash: Self = this.set("sha1Hash", js.undefined)
    
    @scala.inline
    def setSha256Hash(value: String): Self = this.set("sha256Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha256Hash: Self = this.set("sha256Hash", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
