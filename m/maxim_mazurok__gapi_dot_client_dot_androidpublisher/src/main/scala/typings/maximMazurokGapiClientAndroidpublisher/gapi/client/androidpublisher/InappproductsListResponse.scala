package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InappproductsListResponse extends js.Object {
  
  /** All in-app products. */
  var inappproduct: js.UndefOr[js.Array[InAppProduct]] = js.native
  
  /** The kind of this response ("androidpublisher#inappproductsListResponse"). */
  var kind: js.UndefOr[String] = js.native
  
  /** Information about the current page. */
  var pageInfo: js.UndefOr[PageInfo] = js.native
  
  /** Pagination token, to handle a number of products that is over one page. */
  var tokenPagination: js.UndefOr[TokenPagination] = js.native
}
object InappproductsListResponse {
  
  @scala.inline
  def apply(): InappproductsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InappproductsListResponse]
  }
  
  @scala.inline
  implicit class InappproductsListResponseOps[Self <: InappproductsListResponse] (val x: Self) extends AnyVal {
    
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
    def setInappproductVarargs(value: InAppProduct*): Self = this.set("inappproduct", js.Array(value :_*))
    
    @scala.inline
    def setInappproduct(value: js.Array[InAppProduct]): Self = this.set("inappproduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInappproduct: Self = this.set("inappproduct", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPageInfo(value: PageInfo): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageInfo: Self = this.set("pageInfo", js.undefined)
    
    @scala.inline
    def setTokenPagination(value: TokenPagination): Self = this.set("tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenPagination: Self = this.set("tokenPagination", js.undefined)
  }
}
