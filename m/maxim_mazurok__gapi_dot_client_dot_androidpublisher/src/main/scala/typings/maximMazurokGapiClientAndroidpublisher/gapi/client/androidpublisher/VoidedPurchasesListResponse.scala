package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoidedPurchasesListResponse extends StObject {
  
  /** General pagination information. */
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  
  /** Pagination information for token pagination. */
  var tokenPagination: js.UndefOr[TokenPagination] = js.undefined
  
  var voidedPurchases: js.UndefOr[js.Array[VoidedPurchase]] = js.undefined
}
object VoidedPurchasesListResponse {
  
  inline def apply(): VoidedPurchasesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoidedPurchasesListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoidedPurchasesListResponse] (val x: Self) extends AnyVal {
    
    inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    inline def setTokenPagination(value: TokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
    
    inline def setVoidedPurchases(value: js.Array[VoidedPurchase]): Self = StObject.set(x, "voidedPurchases", value.asInstanceOf[js.Any])
    
    inline def setVoidedPurchasesUndefined: Self = StObject.set(x, "voidedPurchases", js.undefined)
    
    inline def setVoidedPurchasesVarargs(value: VoidedPurchase*): Self = StObject.set(x, "voidedPurchases", js.Array(value*))
  }
}
