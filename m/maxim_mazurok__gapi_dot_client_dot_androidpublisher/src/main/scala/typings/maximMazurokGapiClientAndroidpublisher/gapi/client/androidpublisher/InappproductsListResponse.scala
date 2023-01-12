package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InappproductsListResponse extends StObject {
  
  /** All in-app products. */
  var inappproduct: js.UndefOr[js.Array[InAppProduct]] = js.undefined
  
  /** The kind of this response ("androidpublisher#inappproductsListResponse"). */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Deprecated and unset. */
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  
  /** Pagination token, to handle a number of products that is over one page. */
  var tokenPagination: js.UndefOr[TokenPagination] = js.undefined
}
object InappproductsListResponse {
  
  inline def apply(): InappproductsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InappproductsListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InappproductsListResponse] (val x: Self) extends AnyVal {
    
    inline def setInappproduct(value: js.Array[InAppProduct]): Self = StObject.set(x, "inappproduct", value.asInstanceOf[js.Any])
    
    inline def setInappproductUndefined: Self = StObject.set(x, "inappproduct", js.undefined)
    
    inline def setInappproductVarargs(value: InAppProduct*): Self = StObject.set(x, "inappproduct", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    inline def setTokenPagination(value: TokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
  }
}
