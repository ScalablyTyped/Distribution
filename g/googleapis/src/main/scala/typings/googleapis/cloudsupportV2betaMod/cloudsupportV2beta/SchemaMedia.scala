package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMedia extends StObject {
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var algorithm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var bigstoreObjectRef: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var blobRef: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var blobstore2Info: js.UndefOr[SchemaBlobstore2Info] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var compositeMedia: js.UndefOr[js.Array[SchemaCompositeMedia]] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var contentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var contentTypeInfo: js.UndefOr[SchemaContentTypeInfo] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var cosmoBinaryReference: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var crc32cHash: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var diffChecksumsResponse: js.UndefOr[SchemaDiffChecksumsResponse] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var diffDownloadResponse: js.UndefOr[SchemaDiffDownloadResponse] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var diffUploadRequest: js.UndefOr[SchemaDiffUploadRequest] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var diffUploadResponse: js.UndefOr[SchemaDiffUploadResponse] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var diffVersionResponse: js.UndefOr[SchemaDiffVersionResponse] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var downloadParameters: js.UndefOr[SchemaDownloadParameters] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var filename: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var hash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var hashVerified: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var `inline`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var isPotentialRetry: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var length: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var md5Hash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var mediaId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var objectId: js.UndefOr[SchemaObjectId] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var referenceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var sha1Hash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var sha256Hash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var timestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var token: js.UndefOr[String | Null] = js.undefined
}
object SchemaMedia {
  
  inline def apply(): SchemaMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMedia]
  }
  
  extension [Self <: SchemaMedia](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNull: Self = StObject.set(x, "algorithm", null)
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setBigstoreObjectRef(value: String): Self = StObject.set(x, "bigstoreObjectRef", value.asInstanceOf[js.Any])
    
    inline def setBigstoreObjectRefNull: Self = StObject.set(x, "bigstoreObjectRef", null)
    
    inline def setBigstoreObjectRefUndefined: Self = StObject.set(x, "bigstoreObjectRef", js.undefined)
    
    inline def setBlobRef(value: String): Self = StObject.set(x, "blobRef", value.asInstanceOf[js.Any])
    
    inline def setBlobRefNull: Self = StObject.set(x, "blobRef", null)
    
    inline def setBlobRefUndefined: Self = StObject.set(x, "blobRef", js.undefined)
    
    inline def setBlobstore2Info(value: SchemaBlobstore2Info): Self = StObject.set(x, "blobstore2Info", value.asInstanceOf[js.Any])
    
    inline def setBlobstore2InfoUndefined: Self = StObject.set(x, "blobstore2Info", js.undefined)
    
    inline def setCompositeMedia(value: js.Array[SchemaCompositeMedia]): Self = StObject.set(x, "compositeMedia", value.asInstanceOf[js.Any])
    
    inline def setCompositeMediaUndefined: Self = StObject.set(x, "compositeMedia", js.undefined)
    
    inline def setCompositeMediaVarargs(value: SchemaCompositeMedia*): Self = StObject.set(x, "compositeMedia", js.Array(value*))
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeInfo(value: SchemaContentTypeInfo): Self = StObject.set(x, "contentTypeInfo", value.asInstanceOf[js.Any])
    
    inline def setContentTypeInfoUndefined: Self = StObject.set(x, "contentTypeInfo", js.undefined)
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCosmoBinaryReference(value: String): Self = StObject.set(x, "cosmoBinaryReference", value.asInstanceOf[js.Any])
    
    inline def setCosmoBinaryReferenceNull: Self = StObject.set(x, "cosmoBinaryReference", null)
    
    inline def setCosmoBinaryReferenceUndefined: Self = StObject.set(x, "cosmoBinaryReference", js.undefined)
    
    inline def setCrc32cHash(value: Double): Self = StObject.set(x, "crc32cHash", value.asInstanceOf[js.Any])
    
    inline def setCrc32cHashNull: Self = StObject.set(x, "crc32cHash", null)
    
    inline def setCrc32cHashUndefined: Self = StObject.set(x, "crc32cHash", js.undefined)
    
    inline def setDiffChecksumsResponse(value: SchemaDiffChecksumsResponse): Self = StObject.set(x, "diffChecksumsResponse", value.asInstanceOf[js.Any])
    
    inline def setDiffChecksumsResponseUndefined: Self = StObject.set(x, "diffChecksumsResponse", js.undefined)
    
    inline def setDiffDownloadResponse(value: SchemaDiffDownloadResponse): Self = StObject.set(x, "diffDownloadResponse", value.asInstanceOf[js.Any])
    
    inline def setDiffDownloadResponseUndefined: Self = StObject.set(x, "diffDownloadResponse", js.undefined)
    
    inline def setDiffUploadRequest(value: SchemaDiffUploadRequest): Self = StObject.set(x, "diffUploadRequest", value.asInstanceOf[js.Any])
    
    inline def setDiffUploadRequestUndefined: Self = StObject.set(x, "diffUploadRequest", js.undefined)
    
    inline def setDiffUploadResponse(value: SchemaDiffUploadResponse): Self = StObject.set(x, "diffUploadResponse", value.asInstanceOf[js.Any])
    
    inline def setDiffUploadResponseUndefined: Self = StObject.set(x, "diffUploadResponse", js.undefined)
    
    inline def setDiffVersionResponse(value: SchemaDiffVersionResponse): Self = StObject.set(x, "diffVersionResponse", value.asInstanceOf[js.Any])
    
    inline def setDiffVersionResponseUndefined: Self = StObject.set(x, "diffVersionResponse", js.undefined)
    
    inline def setDownloadParameters(value: SchemaDownloadParameters): Self = StObject.set(x, "downloadParameters", value.asInstanceOf[js.Any])
    
    inline def setDownloadParametersUndefined: Self = StObject.set(x, "downloadParameters", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameNull: Self = StObject.set(x, "filename", null)
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashNull: Self = StObject.set(x, "hash", null)
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setHashVerified(value: Boolean): Self = StObject.set(x, "hashVerified", value.asInstanceOf[js.Any])
    
    inline def setHashVerifiedNull: Self = StObject.set(x, "hashVerified", null)
    
    inline def setHashVerifiedUndefined: Self = StObject.set(x, "hashVerified", js.undefined)
    
    inline def setInline(value: String): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineNull: Self = StObject.set(x, "inline", null)
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setIsPotentialRetry(value: Boolean): Self = StObject.set(x, "isPotentialRetry", value.asInstanceOf[js.Any])
    
    inline def setIsPotentialRetryNull: Self = StObject.set(x, "isPotentialRetry", null)
    
    inline def setIsPotentialRetryUndefined: Self = StObject.set(x, "isPotentialRetry", js.undefined)
    
    inline def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthNull: Self = StObject.set(x, "length", null)
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
    
    inline def setMd5HashNull: Self = StObject.set(x, "md5Hash", null)
    
    inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    
    inline def setMediaId(value: String): Self = StObject.set(x, "mediaId", value.asInstanceOf[js.Any])
    
    inline def setMediaIdNull: Self = StObject.set(x, "mediaId", null)
    
    inline def setMediaIdUndefined: Self = StObject.set(x, "mediaId", js.undefined)
    
    inline def setObjectId(value: SchemaObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setReferenceType(value: String): Self = StObject.set(x, "referenceType", value.asInstanceOf[js.Any])
    
    inline def setReferenceTypeNull: Self = StObject.set(x, "referenceType", null)
    
    inline def setReferenceTypeUndefined: Self = StObject.set(x, "referenceType", js.undefined)
    
    inline def setSha1Hash(value: String): Self = StObject.set(x, "sha1Hash", value.asInstanceOf[js.Any])
    
    inline def setSha1HashNull: Self = StObject.set(x, "sha1Hash", null)
    
    inline def setSha1HashUndefined: Self = StObject.set(x, "sha1Hash", js.undefined)
    
    inline def setSha256Hash(value: String): Self = StObject.set(x, "sha256Hash", value.asInstanceOf[js.Any])
    
    inline def setSha256HashNull: Self = StObject.set(x, "sha256Hash", null)
    
    inline def setSha256HashUndefined: Self = StObject.set(x, "sha256Hash", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
