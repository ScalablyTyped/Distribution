package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductsListResponse extends js.Object {
  
  /** General pagination information. */
  var pageInfo: js.UndefOr[PageInfo] = js.native
  
  /** Information about a product (e.g. an app) in the Google Play store, for display to an enterprise admin. */
  var product: js.UndefOr[js.Array[Product]] = js.native
  
  /** Pagination information for token pagination. */
  var tokenPagination: js.UndefOr[TokenPagination] = js.native
}
object ProductsListResponse {
  
  @scala.inline
  def apply(): ProductsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductsListResponse]
  }
  
  @scala.inline
  implicit class ProductsListResponseOps[Self <: ProductsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPageInfo(value: PageInfo): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageInfo: Self = this.set("pageInfo", js.undefined)
    
    @scala.inline
    def setProductVarargs(value: Product*): Self = this.set("product", js.Array(value :_*))
    
    @scala.inline
    def setProduct(value: js.Array[Product]): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setTokenPagination(value: TokenPagination): Self = this.set("tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenPagination: Self = this.set("tokenPagination", js.undefined)
  }
}
