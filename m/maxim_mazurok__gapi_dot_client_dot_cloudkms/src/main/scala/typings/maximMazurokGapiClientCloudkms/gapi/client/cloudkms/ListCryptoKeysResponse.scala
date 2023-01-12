package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCryptoKeysResponse extends StObject {
  
  /** The list of CryptoKeys. */
  var cryptoKeys: js.UndefOr[js.Array[CryptoKey]] = js.undefined
  
  /** A token to retrieve next page of results. Pass this value in ListCryptoKeysRequest.page_token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The total number of CryptoKeys that matched the query. */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object ListCryptoKeysResponse {
  
  inline def apply(): ListCryptoKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCryptoKeysResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCryptoKeysResponse] (val x: Self) extends AnyVal {
    
    inline def setCryptoKeys(value: js.Array[CryptoKey]): Self = StObject.set(x, "cryptoKeys", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeysUndefined: Self = StObject.set(x, "cryptoKeys", js.undefined)
    
    inline def setCryptoKeysVarargs(value: CryptoKey*): Self = StObject.set(x, "cryptoKeys", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
