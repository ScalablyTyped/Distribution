package typings.googleapis.youtubeAnalyticsV1Mod.youtubeAnalyticsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A paginated list of grouList resources returned in response to a
  * youtubeAnalytics.groupApi.list request.
  */
@js.native
trait SchemaGroupItemListResponse extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[SchemaGroupItem]] = js.native
  var kind: js.UndefOr[String] = js.native
}

object SchemaGroupItemListResponse {
  @scala.inline
  def apply(etag: String = null, items: js.Array[SchemaGroupItem] = null, kind: String = null): SchemaGroupItemListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGroupItemListResponse]
  }
}

