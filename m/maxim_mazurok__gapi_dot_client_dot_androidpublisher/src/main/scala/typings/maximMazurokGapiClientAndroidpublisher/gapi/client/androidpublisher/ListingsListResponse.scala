package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListingsListResponse extends StObject {
  
  /** The kind of this response ("androidpublisher#listingsListResponse"). */
  var kind: js.UndefOr[String] = js.undefined
  
  /** All localized listings. */
  var listings: js.UndefOr[js.Array[Listing]] = js.undefined
}
object ListingsListResponse {
  
  inline def apply(): ListingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListingsListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListingsListResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setListings(value: js.Array[Listing]): Self = StObject.set(x, "listings", value.asInstanceOf[js.Any])
    
    inline def setListingsUndefined: Self = StObject.set(x, "listings", js.undefined)
    
    inline def setListingsVarargs(value: Listing*): Self = StObject.set(x, "listings", js.Array(value*))
  }
}
