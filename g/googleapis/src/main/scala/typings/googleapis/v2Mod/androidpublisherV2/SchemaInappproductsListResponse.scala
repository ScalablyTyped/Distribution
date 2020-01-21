package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    inappproduct: js.Array[SchemaInAppProduct] = null,
    kind: String = null,
    pageInfo: SchemaPageInfo = null,
    tokenPagination: SchemaTokenPagination = null
  ): SchemaInappproductsListResponse = {
    val __obj = js.Dynamic.literal()
    if (inappproduct != null) __obj.updateDynamic("inappproduct")(inappproduct.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInappproductsListResponse]
  }
}

