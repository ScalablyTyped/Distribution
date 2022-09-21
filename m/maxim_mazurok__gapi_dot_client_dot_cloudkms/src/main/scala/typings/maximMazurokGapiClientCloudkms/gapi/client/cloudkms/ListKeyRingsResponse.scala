package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeyRingsResponse extends StObject {
  
  /** The list of KeyRings. */
  var keyRings: js.UndefOr[js.Array[KeyRing]] = js.undefined
  
  /** A token to retrieve next page of results. Pass this value in ListKeyRingsRequest.page_token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The total number of KeyRings that matched the query. */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object ListKeyRingsResponse {
  
  inline def apply(): ListKeyRingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyRingsResponse]
  }
  
  extension [Self <: ListKeyRingsResponse](x: Self) {
    
    inline def setKeyRings(value: js.Array[KeyRing]): Self = StObject.set(x, "keyRings", value.asInstanceOf[js.Any])
    
    inline def setKeyRingsUndefined: Self = StObject.set(x, "keyRings", js.undefined)
    
    inline def setKeyRingsVarargs(value: KeyRing*): Self = StObject.set(x, "keyRings", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
