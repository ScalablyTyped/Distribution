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
  
  @scala.inline
  def apply(): ListingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListingsListResponse]
  }
  
  @scala.inline
  implicit class ListingsListResponseMutableBuilder[Self <: ListingsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setListings(value: js.Array[Listing]): Self = StObject.set(x, "listings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListingsUndefined: Self = StObject.set(x, "listings", js.undefined)
    
    @scala.inline
    def setListingsVarargs(value: Listing*): Self = StObject.set(x, "listings", js.Array(value :_*))
  }
}
