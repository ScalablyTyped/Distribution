package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVoidedPurchasesListResponse extends js.Object {
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.native
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.native
  var voidedPurchases: js.UndefOr[js.Array[SchemaVoidedPurchase]] = js.native
}

object SchemaVoidedPurchasesListResponse {
  @scala.inline
  def apply(): SchemaVoidedPurchasesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoidedPurchasesListResponse]
  }
  @scala.inline
  implicit class SchemaVoidedPurchasesListResponseOps[Self <: SchemaVoidedPurchasesListResponse] (val x: Self) extends AnyVal {
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
    def setPageInfo(value: SchemaPageInfo): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageInfo: Self = this.set("pageInfo", js.undefined)
    @scala.inline
    def setTokenPagination(value: SchemaTokenPagination): Self = this.set("tokenPagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenPagination: Self = this.set("tokenPagination", js.undefined)
    @scala.inline
    def setVoidedPurchasesVarargs(value: SchemaVoidedPurchase*): Self = this.set("voidedPurchases", js.Array(value :_*))
    @scala.inline
    def setVoidedPurchases(value: js.Array[SchemaVoidedPurchase]): Self = this.set("voidedPurchases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoidedPurchases: Self = this.set("voidedPurchases", js.undefined)
  }
  
}

