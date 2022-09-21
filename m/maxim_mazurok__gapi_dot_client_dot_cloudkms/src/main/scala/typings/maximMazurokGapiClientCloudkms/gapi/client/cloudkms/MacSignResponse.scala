package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacSignResponse extends StObject {
  
  /** The created signature. */
  var mac: js.UndefOr[String] = js.undefined
  
  /**
    * Integrity verification field. A CRC32C checksum of the returned MacSignResponse.mac. An integrity check of MacSignResponse.mac can be performed by computing the CRC32C checksum of
    * MacSignResponse.mac and comparing your results to this field. Discard the response in case of non-matching checksum values, and perform a limited number of retries. A persistent
    * mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it
    * is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type.
    */
  var macCrc32c: js.UndefOr[String] = js.undefined
  
  /** The resource name of the CryptoKeyVersion used for signing. Check this field to verify that the intended resource was used for signing. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The ProtectionLevel of the CryptoKeyVersion used for signing. */
  var protectionLevel: js.UndefOr[String] = js.undefined
  
  /**
    * Integrity verification field. A flag indicating whether MacSignRequest.data_crc32c was received by KeyManagementService and used for the integrity verification of the data. A false
    * value of this field indicates either that MacSignRequest.data_crc32c was left unset or that it was not delivered to KeyManagementService. If you've set MacSignRequest.data_crc32c
    * but this field is still false, discard the response and perform a limited number of retries.
    */
  var verifiedDataCrc32c: js.UndefOr[Boolean] = js.undefined
}
object MacSignResponse {
  
  inline def apply(): MacSignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacSignResponse]
  }
  
  extension [Self <: MacSignResponse](x: Self) {
    
    inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setMacCrc32c(value: String): Self = StObject.set(x, "macCrc32c", value.asInstanceOf[js.Any])
    
    inline def setMacCrc32cUndefined: Self = StObject.set(x, "macCrc32c", js.undefined)
    
    inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtectionLevel(value: String): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    inline def setProtectionLevelUndefined: Self = StObject.set(x, "protectionLevel", js.undefined)
    
    inline def setVerifiedDataCrc32c(value: Boolean): Self = StObject.set(x, "verifiedDataCrc32c", value.asInstanceOf[js.Any])
    
    inline def setVerifiedDataCrc32cUndefined: Self = StObject.set(x, "verifiedDataCrc32c", js.undefined)
  }
}
