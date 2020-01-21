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
  def apply(
    pageInfo: SchemaPageInfo = null,
    tokenPagination: SchemaTokenPagination = null,
    voidedPurchases: js.Array[SchemaVoidedPurchase] = null
  ): SchemaVoidedPurchasesListResponse = {
    val __obj = js.Dynamic.literal()
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    if (voidedPurchases != null) __obj.updateDynamic("voidedPurchases")(voidedPurchases.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVoidedPurchasesListResponse]
  }
}

