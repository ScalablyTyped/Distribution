package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVoidedPurchasesListResponse extends StObject {
  
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.undefined
  
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.undefined
  
  var voidedPurchases: js.UndefOr[js.Array[SchemaVoidedPurchase]] = js.undefined
}
object SchemaVoidedPurchasesListResponse {
  
  @scala.inline
  def apply(): SchemaVoidedPurchasesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoidedPurchasesListResponse]
  }
  
  @scala.inline
  implicit class SchemaVoidedPurchasesListResponseMutableBuilder[Self <: SchemaVoidedPurchasesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageInfo(value: SchemaPageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    @scala.inline
    def setTokenPagination(value: SchemaTokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
    
    @scala.inline
    def setVoidedPurchases(value: js.Array[SchemaVoidedPurchase]): Self = StObject.set(x, "voidedPurchases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoidedPurchasesUndefined: Self = StObject.set(x, "voidedPurchases", js.undefined)
    
    @scala.inline
    def setVoidedPurchasesVarargs(value: SchemaVoidedPurchase*): Self = StObject.set(x, "voidedPurchases", js.Array(value :_*))
  }
}
