package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
@js.native
trait SchemaGdataMedia extends StObject {
  
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
  implicit class SchemaGdataMediaMutableBuilder[Self <: SchemaGdataMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setBigstoreObjectRef(value: String): Self = StObject.set(x, "bigstoreObjectRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigstoreObjectRefUndefined: Self = StObject.set(x, "bigstoreObjectRef", js.undefined)
    
    @scala.inline
    def setBlobRef(value: String): Self = StObject.set(x, "blobRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobRefUndefined: Self = StObject.set(x, "blobRef", js.undefined)
    
    @scala.inline
    def setBlobstore2Info(value: SchemaGdataBlobstore2Info): Self = StObject.set(x, "blobstore2Info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobstore2InfoUndefined: Self = StObject.set(x, "blobstore2Info", js.undefined)
    
    @scala.inline
    def setCompositeMedia(value: js.Array[SchemaGdataCompositeMedia]): Self = StObject.set(x, "compositeMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeMediaUndefined: Self = StObject.set(x, "compositeMedia", js.undefined)
    
    @scala.inline
    def setCompositeMediaVarargs(value: SchemaGdataCompositeMedia*): Self = StObject.set(x, "compositeMedia", js.Array(value :_*))
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeInfo(value: SchemaGdataContentTypeInfo): Self = StObject.set(x, "contentTypeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeInfoUndefined: Self = StObject.set(x, "contentTypeInfo", js.undefined)
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setCosmoBinaryReference(value: String): Self = StObject.set(x, "cosmoBinaryReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCosmoBinaryReferenceUndefined: Self = StObject.set(x, "cosmoBinaryReference", js.undefined)
    
    @scala.inline
    def setCrc32cHash(value: Double): Self = StObject.set(x, "crc32cHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrc32cHashUndefined: Self = StObject.set(x, "crc32cHash", js.undefined)
    
    @scala.inline
    def setDiffChecksumsResponse(value: SchemaGdataDiffChecksumsResponse): Self = StObject.set(x, "diffChecksumsResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiffChecksumsResponseUndefined: Self = StObject.set(x, "diffChecksumsResponse", js.undefined)
    
    @scala.inline
    def setDiffDownloadResponse(value: SchemaGdataDiffDownloadResponse): Self = StObject.set(x, "diffDownloadResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiffDownloadResponseUndefined: Self = StObject.set(x, "diffDownloadResponse", js.undefined)
    
    @scala.inline
    def setDiffUploadRequest(value: SchemaGdataDiffUploadRequest): Self = StObject.set(x, "diffUploadRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiffUploadRequestUndefined: Self = StObject.set(x, "diffUploadRequest", js.undefined)
    
    @scala.inline
    def setDiffUploadResponse(value: SchemaGdataDiffUploadResponse): Self = StObject.set(x, "diffUploadResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiffUploadResponseUndefined: Self = StObject.set(x, "diffUploadResponse", js.undefined)
    
    @scala.inline
    def setDiffVersionResponse(value: SchemaGdataDiffVersionResponse): Self = StObject.set(x, "diffVersionResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiffVersionResponseUndefined: Self = StObject.set(x, "diffVersionResponse", js.undefined)
    
    @scala.inline
    def setDownloadParameters(value: SchemaGdataDownloadParameters): Self = StObject.set(x, "downloadParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadParametersUndefined: Self = StObject.set(x, "downloadParameters", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setHashVerified(value: Boolean): Self = StObject.set(x, "hashVerified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashVerifiedUndefined: Self = StObject.set(x, "hashVerified", js.undefined)
    
    @scala.inline
    def setInline(value: String): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setIsPotentialRetry(value: Boolean): Self = StObject.set(x, "isPotentialRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPotentialRetryUndefined: Self = StObject.set(x, "isPotentialRetry", js.undefined)
    
    @scala.inline
    def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    
    @scala.inline
    def setMediaId(value: String): Self = StObject.set(x, "mediaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaIdUndefined: Self = StObject.set(x, "mediaId", js.undefined)
    
    @scala.inline
    def setObjectId(value: SchemaGdataObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setReferenceType(value: String): Self = StObject.set(x, "referenceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceTypeUndefined: Self = StObject.set(x, "referenceType", js.undefined)
    
    @scala.inline
    def setSha1Hash(value: String): Self = StObject.set(x, "sha1Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1HashUndefined: Self = StObject.set(x, "sha1Hash", js.undefined)
    
    @scala.inline
    def setSha256Hash(value: String): Self = StObject.set(x, "sha256Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256HashUndefined: Self = StObject.set(x, "sha256Hash", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
