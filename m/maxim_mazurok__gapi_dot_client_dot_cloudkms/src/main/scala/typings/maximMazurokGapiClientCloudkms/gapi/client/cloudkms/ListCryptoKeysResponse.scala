package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCryptoKeysResponse extends StObject {
  
  /** The list of CryptoKeys. */
  var cryptoKeys: js.UndefOr[js.Array[CryptoKey]] = js.native
  
  /** A token to retrieve next page of results. Pass this value in ListCryptoKeysRequest.page_token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The total number of CryptoKeys that matched the query. */
  var totalSize: js.UndefOr[Double] = js.native
}
object ListCryptoKeysResponse {
  
  @scala.inline
  def apply(): ListCryptoKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCryptoKeysResponse]
  }
  
  @scala.inline
  implicit class ListCryptoKeysResponseMutableBuilder[Self <: ListCryptoKeysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCryptoKeys(value: js.Array[CryptoKey]): Self = StObject.set(x, "cryptoKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoKeysUndefined: Self = StObject.set(x, "cryptoKeys", js.undefined)
    
    @scala.inline
    def setCryptoKeysVarargs(value: CryptoKey*): Self = StObject.set(x, "cryptoKeys", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
