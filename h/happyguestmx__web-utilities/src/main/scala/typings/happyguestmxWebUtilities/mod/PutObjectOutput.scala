package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectOutput extends StObject {
  
  var BucketKeyEnabled: js.UndefOr[Boolean] = js.undefined
  
  var ChecksumCRC32: js.UndefOr[String] = js.undefined
  
  var ChecksumCRC32C: js.UndefOr[String] = js.undefined
  
  var ChecksumSHA1: js.UndefOr[String] = js.undefined
  
  var ChecksumSHA256: js.UndefOr[String] = js.undefined
  
  var ETag: js.UndefOr[String] = js.undefined
  
  var Expiration: js.UndefOr[String] = js.undefined
  
  var RequestCharged: js.UndefOr[String] = js.undefined
  
  var SSECustomerAlgorithm: js.UndefOr[String] = js.undefined
  
  var SSECustomerKeyMD5: js.UndefOr[String] = js.undefined
  
  var SSEKMSEncryptionContext: js.UndefOr[String] = js.undefined
  
  var SSEKMSKeyId: js.UndefOr[String] = js.undefined
  
  var ServerSideEncryption: js.UndefOr[String] = js.undefined
  
  var VersionId: js.UndefOr[String] = js.undefined
}
object PutObjectOutput {
  
  inline def apply(): PutObjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectOutput]
  }
  
  extension [Self <: PutObjectOutput](x: Self) {
    
    inline def setBucketKeyEnabled(value: Boolean): Self = StObject.set(x, "BucketKeyEnabled", value.asInstanceOf[js.Any])
    
    inline def setBucketKeyEnabledUndefined: Self = StObject.set(x, "BucketKeyEnabled", js.undefined)
    
    inline def setChecksumCRC32(value: String): Self = StObject.set(x, "ChecksumCRC32", value.asInstanceOf[js.Any])
    
    inline def setChecksumCRC32C(value: String): Self = StObject.set(x, "ChecksumCRC32C", value.asInstanceOf[js.Any])
    
    inline def setChecksumCRC32CUndefined: Self = StObject.set(x, "ChecksumCRC32C", js.undefined)
    
    inline def setChecksumCRC32Undefined: Self = StObject.set(x, "ChecksumCRC32", js.undefined)
    
    inline def setChecksumSHA1(value: String): Self = StObject.set(x, "ChecksumSHA1", value.asInstanceOf[js.Any])
    
    inline def setChecksumSHA1Undefined: Self = StObject.set(x, "ChecksumSHA1", js.undefined)
    
    inline def setChecksumSHA256(value: String): Self = StObject.set(x, "ChecksumSHA256", value.asInstanceOf[js.Any])
    
    inline def setChecksumSHA256Undefined: Self = StObject.set(x, "ChecksumSHA256", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setExpiration(value: String): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    inline def setRequestCharged(value: String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    
    inline def setSSECustomerAlgorithm(value: String): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
    
    inline def setSSECustomerKeyMD5(value: String): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
    
    inline def setSSEKMSEncryptionContext(value: String): Self = StObject.set(x, "SSEKMSEncryptionContext", value.asInstanceOf[js.Any])
    
    inline def setSSEKMSEncryptionContextUndefined: Self = StObject.set(x, "SSEKMSEncryptionContext", js.undefined)
    
    inline def setSSEKMSKeyId(value: String): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
    
    inline def setServerSideEncryption(value: String): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
    
    inline def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
