package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacVerifyResponse extends StObject {
  
  /** The resource name of the CryptoKeyVersion used for verification. Check this field to verify that the intended resource was used for verification. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The ProtectionLevel of the CryptoKeyVersion used for verification. */
  var protectionLevel: js.UndefOr[String] = js.undefined
  
  /** This field indicates whether or not the verification operation for MacVerifyRequest.mac over MacVerifyRequest.data was successful. */
  var success: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Integrity verification field. A flag indicating whether MacVerifyRequest.data_crc32c was received by KeyManagementService and used for the integrity verification of the data. A
    * false value of this field indicates either that MacVerifyRequest.data_crc32c was left unset or that it was not delivered to KeyManagementService. If you've set
    * MacVerifyRequest.data_crc32c but this field is still false, discard the response and perform a limited number of retries.
    */
  var verifiedDataCrc32c: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Integrity verification field. A flag indicating whether MacVerifyRequest.mac_crc32c was received by KeyManagementService and used for the integrity verification of the data. A false
    * value of this field indicates either that MacVerifyRequest.mac_crc32c was left unset or that it was not delivered to KeyManagementService. If you've set MacVerifyRequest.mac_crc32c
    * but this field is still false, discard the response and perform a limited number of retries.
    */
  var verifiedMacCrc32c: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Integrity verification field. This value is used for the integrity verification of [MacVerifyResponse.success]. If the value of this field contradicts the value of
    * [MacVerifyResponse.success], discard the response and perform a limited number of retries.
    */
  var verifiedSuccessIntegrity: js.UndefOr[Boolean] = js.undefined
}
object MacVerifyResponse {
  
  inline def apply(): MacVerifyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacVerifyResponse]
  }
  
  extension [Self <: MacVerifyResponse](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtectionLevel(value: String): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    inline def setProtectionLevelUndefined: Self = StObject.set(x, "protectionLevel", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setVerifiedDataCrc32c(value: Boolean): Self = StObject.set(x, "verifiedDataCrc32c", value.asInstanceOf[js.Any])
    
    inline def setVerifiedDataCrc32cUndefined: Self = StObject.set(x, "verifiedDataCrc32c", js.undefined)
    
    inline def setVerifiedMacCrc32c(value: Boolean): Self = StObject.set(x, "verifiedMacCrc32c", value.asInstanceOf[js.Any])
    
    inline def setVerifiedMacCrc32cUndefined: Self = StObject.set(x, "verifiedMacCrc32c", js.undefined)
    
    inline def setVerifiedSuccessIntegrity(value: Boolean): Self = StObject.set(x, "verifiedSuccessIntegrity", value.asInstanceOf[js.Any])
    
    inline def setVerifiedSuccessIntegrityUndefined: Self = StObject.set(x, "verifiedSuccessIntegrity", js.undefined)
  }
}
