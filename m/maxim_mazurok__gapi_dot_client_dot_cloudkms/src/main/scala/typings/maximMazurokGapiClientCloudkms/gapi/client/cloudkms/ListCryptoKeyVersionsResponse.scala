package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCryptoKeyVersionsResponse extends StObject {
  
  /** The list of CryptoKeyVersions. */
  var cryptoKeyVersions: js.UndefOr[js.Array[CryptoKeyVersion]] = js.undefined
  
  /** A token to retrieve next page of results. Pass this value in ListCryptoKeyVersionsRequest.page_token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The total number of CryptoKeyVersions that matched the query. */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object ListCryptoKeyVersionsResponse {
  
  inline def apply(): ListCryptoKeyVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCryptoKeyVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCryptoKeyVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setCryptoKeyVersions(value: js.Array[CryptoKeyVersion]): Self = StObject.set(x, "cryptoKeyVersions", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyVersionsUndefined: Self = StObject.set(x, "cryptoKeyVersions", js.undefined)
    
    inline def setCryptoKeyVersionsVarargs(value: CryptoKeyVersion*): Self = StObject.set(x, "cryptoKeyVersions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
