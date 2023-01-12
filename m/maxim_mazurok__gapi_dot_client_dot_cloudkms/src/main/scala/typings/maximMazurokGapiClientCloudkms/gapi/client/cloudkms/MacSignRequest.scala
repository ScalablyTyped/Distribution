package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacSignRequest extends StObject {
  
  /** Required. The data to sign. The MAC tag is computed over this data field based on the specific algorithm. */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. An optional CRC32C checksum of the MacSignRequest.data. If specified, KeyManagementService will verify the integrity of the received MacSignRequest.data using this
    * checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your client should verify that CRC32C(MacSignRequest.data)
    * is equal to MacSignRequest.data_crc32c, and if so, perform a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note:
    * This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely
    * downconverted to uint32 in languages that support this type.
    */
  var dataCrc32c: js.UndefOr[String] = js.undefined
}
object MacSignRequest {
  
  inline def apply(): MacSignRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacSignRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MacSignRequest] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataCrc32c(value: String): Self = StObject.set(x, "dataCrc32c", value.asInstanceOf[js.Any])
    
    inline def setDataCrc32cUndefined: Self = StObject.set(x, "dataCrc32c", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
