package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
trait SchemaGdataMedia extends StObject {
  
  /**
    * gdata
    */
  var algorithm: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var bigstoreObjectRef: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var blobRef: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var blobstore2Info: js.UndefOr[SchemaGdataBlobstore2Info] = js.undefined
  
  /**
    * gdata
    */
  var compositeMedia: js.UndefOr[js.Array[SchemaGdataCompositeMedia]] = js.undefined
  
  /**
    * gdata
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var contentTypeInfo: js.UndefOr[SchemaGdataContentTypeInfo] = js.undefined
  
  /**
    * gdata
    */
  var cosmoBinaryReference: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var crc32cHash: js.UndefOr[Double] = js.undefined
  
  /**
    * gdata
    */
  var diffChecksumsResponse: js.UndefOr[SchemaGdataDiffChecksumsResponse] = js.undefined
  
  /**
    * gdata
    */
  var diffDownloadResponse: js.UndefOr[SchemaGdataDiffDownloadResponse] = js.undefined
  
  /**
    * gdata
    */
  var diffUploadRequest: js.UndefOr[SchemaGdataDiffUploadRequest] = js.undefined
  
  /**
    * gdata
    */
  var diffUploadResponse: js.UndefOr[SchemaGdataDiffUploadResponse] = js.undefined
  
  /**
    * gdata
    */
  var diffVersionResponse: js.UndefOr[SchemaGdataDiffVersionResponse] = js.undefined
  
  /**
    * gdata
    */
  var downloadParameters: js.UndefOr[SchemaGdataDownloadParameters] = js.undefined
  
  /**
    * gdata
    */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var hash: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var hashVerified: js.UndefOr[Boolean] = js.undefined
  
  /**
    * gdata
    */
  var `inline`: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var isPotentialRetry: js.UndefOr[Boolean] = js.undefined
  
  /**
    * gdata
    */
  var length: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var md5Hash: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var mediaId: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var objectId: js.UndefOr[SchemaGdataObjectId] = js.undefined
  
  /**
    * gdata
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var referenceType: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var sha1Hash: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var sha256Hash: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var timestamp: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var token: js.UndefOr[String] = js.undefined
}
object SchemaGdataMedia {
  
  inline def apply(): SchemaGdataMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataMedia]
  }
  
  extension [Self <: SchemaGdataMedia](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setBigstoreObjectRef(value: String): Self = StObject.set(x, "bigstoreObjectRef", value.asInstanceOf[js.Any])
    
    inline def setBigstoreObjectRefUndefined: Self = StObject.set(x, "bigstoreObjectRef", js.undefined)
    
    inline def setBlobRef(value: String): Self = StObject.set(x, "blobRef", value.asInstanceOf[js.Any])
    
    inline def setBlobRefUndefined: Self = StObject.set(x, "blobRef", js.undefined)
    
    inline def setBlobstore2Info(value: SchemaGdataBlobstore2Info): Self = StObject.set(x, "blobstore2Info", value.asInstanceOf[js.Any])
    
    inline def setBlobstore2InfoUndefined: Self = StObject.set(x, "blobstore2Info", js.undefined)
    
    inline def setCompositeMedia(value: js.Array[SchemaGdataCompositeMedia]): Self = StObject.set(x, "compositeMedia", value.asInstanceOf[js.Any])
    
    inline def setCompositeMediaUndefined: Self = StObject.set(x, "compositeMedia", js.undefined)
    
    inline def setCompositeMediaVarargs(value: SchemaGdataCompositeMedia*): Self = StObject.set(x, "compositeMedia", js.Array(value :_*))
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeInfo(value: SchemaGdataContentTypeInfo): Self = StObject.set(x, "contentTypeInfo", value.asInstanceOf[js.Any])
    
    inline def setContentTypeInfoUndefined: Self = StObject.set(x, "contentTypeInfo", js.undefined)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCosmoBinaryReference(value: String): Self = StObject.set(x, "cosmoBinaryReference", value.asInstanceOf[js.Any])
    
    inline def setCosmoBinaryReferenceUndefined: Self = StObject.set(x, "cosmoBinaryReference", js.undefined)
    
    inline def setCrc32cHash(value: Double): Self = StObject.set(x, "crc32cHash", value.asInstanceOf[js.Any])
    
    inline def setCrc32cHashUndefined: Self = StObject.set(x, "crc32cHash", js.undefined)
    
    inline def setDiffChecksumsResponse(value: SchemaGdataDiffChecksumsResponse): Self = StObject.set(x, "diffChecksumsResponse", value.asInstanceOf[js.Any])
    
    inline def setDiffChecksumsResponseUndefined: Self = StObject.set(x, "diffChecksumsResponse", js.undefined)
    
    inline def setDiffDownloadResponse(value: SchemaGdataDiffDownloadResponse): Self = StObject.set(x, "diffDownloadResponse", value.asInstanceOf[js.Any])
    
    inline def setDiffDownloadResponseUndefined: Self = StObject.set(x, "diffDownloadResponse", js.undefined)
    
    inline def setDiffUploadRequest(value: SchemaGdataDiffUploadRequest): Self = StObject.set(x, "diffUploadRequest", value.asInstanceOf[js.Any])
    
    inline def setDiffUploadRequestUndefined: Self = StObject.set(x, "diffUploadRequest", js.undefined)
    
    inline def setDiffUploadResponse(value: SchemaGdataDiffUploadResponse): Self = StObject.set(x, "diffUploadResponse", value.asInstanceOf[js.Any])
    
    inline def setDiffUploadResponseUndefined: Self = StObject.set(x, "diffUploadResponse", js.undefined)
    
    inline def setDiffVersionResponse(value: SchemaGdataDiffVersionResponse): Self = StObject.set(x, "diffVersionResponse", value.asInstanceOf[js.Any])
    
    inline def setDiffVersionResponseUndefined: Self = StObject.set(x, "diffVersionResponse", js.undefined)
    
    inline def setDownloadParameters(value: SchemaGdataDownloadParameters): Self = StObject.set(x, "downloadParameters", value.asInstanceOf[js.Any])
    
    inline def setDownloadParametersUndefined: Self = StObject.set(x, "downloadParameters", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setHashVerified(value: Boolean): Self = StObject.set(x, "hashVerified", value.asInstanceOf[js.Any])
    
    inline def setHashVerifiedUndefined: Self = StObject.set(x, "hashVerified", js.undefined)
    
    inline def setInline(value: String): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setIsPotentialRetry(value: Boolean): Self = StObject.set(x, "isPotentialRetry", value.asInstanceOf[js.Any])
    
    inline def setIsPotentialRetryUndefined: Self = StObject.set(x, "isPotentialRetry", js.undefined)
    
    inline def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
    
    inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    
    inline def setMediaId(value: String): Self = StObject.set(x, "mediaId", value.asInstanceOf[js.Any])
    
    inline def setMediaIdUndefined: Self = StObject.set(x, "mediaId", js.undefined)
    
    inline def setObjectId(value: SchemaGdataObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setReferenceType(value: String): Self = StObject.set(x, "referenceType", value.asInstanceOf[js.Any])
    
    inline def setReferenceTypeUndefined: Self = StObject.set(x, "referenceType", js.undefined)
    
    inline def setSha1Hash(value: String): Self = StObject.set(x, "sha1Hash", value.asInstanceOf[js.Any])
    
    inline def setSha1HashUndefined: Self = StObject.set(x, "sha1Hash", js.undefined)
    
    inline def setSha256Hash(value: String): Self = StObject.set(x, "sha256Hash", value.asInstanceOf[js.Any])
    
    inline def setSha256HashUndefined: Self = StObject.set(x, "sha256Hash", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
