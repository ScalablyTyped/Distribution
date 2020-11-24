package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInappproductsListResponse extends js.Object {
  
  var inappproduct: js.UndefOr[js.Array[SchemaInAppProduct]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#inappproductsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.native
  
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.native
}
object SchemaInappproductsListResponse {
  
  @scala.inline
  def apply(): SchemaInappproductsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInappproductsListResponse]
  }
  
  @scala.inline
  implicit class SchemaInappproductsListResponseOps[Self <: SchemaInappproductsListResponse] (val x: Self) extends AnyVal {
    
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
    def setInappproductVarargs(value: SchemaInAppProduct*): Self = this.set("inappproduct", js.Array(value :_*))
    
    @scala.inline
    def setInappproduct(value: js.Array[SchemaInAppProduct]): Self = this.set("inappproduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInappproduct: Self = this.set("inappproduct", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPageInfo(value: SchemaPageInfo): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageInfo: Self = this.set("pageInfo", js.undefined)
    
    @scala.inline
    def setTokenPagination(value: SchemaTokenPagination): Self = this.set("tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenPagination: Self = this.set("tokenPagination", js.undefined)
  }
}
