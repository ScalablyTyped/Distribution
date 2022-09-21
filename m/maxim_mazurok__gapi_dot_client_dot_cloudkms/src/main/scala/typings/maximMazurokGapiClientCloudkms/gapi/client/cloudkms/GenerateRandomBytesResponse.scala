package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateRandomBytesResponse extends StObject {
  
  /** The generated data. */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * Integrity verification field. A CRC32C checksum of the returned GenerateRandomBytesResponse.data. An integrity check of GenerateRandomBytesResponse.data can be performed by
    * computing the CRC32C checksum of GenerateRandomBytesResponse.data and comparing your results to this field. Discard the response in case of non-matching checksum values, and perform
    * a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
    * compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support
    * this type.
    */
  var dataCrc32c: js.UndefOr[String] = js.undefined
}
object GenerateRandomBytesResponse {
  
  inline def apply(): GenerateRandomBytesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateRandomBytesResponse]
  }
  
  extension [Self <: GenerateRandomBytesResponse](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataCrc32c(value: String): Self = StObject.set(x, "dataCrc32c", value.asInstanceOf[js.Any])
    
    inline def setDataCrc32cUndefined: Self = StObject.set(x, "dataCrc32c", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
