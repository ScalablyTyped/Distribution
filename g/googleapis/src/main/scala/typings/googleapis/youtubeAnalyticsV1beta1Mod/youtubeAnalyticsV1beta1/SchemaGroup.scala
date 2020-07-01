package typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1

import typings.googleapis.anon.ItemCount
import typings.googleapis.anon.PublishedAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGroup extends js.Object {
  var contentDetails: js.UndefOr[ItemCount] = js.native
  var etag: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var snippet: js.UndefOr[PublishedAt] = js.native
}

object SchemaGroup {
  @scala.inline
  def apply(
    contentDetails: ItemCount = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: PublishedAt = null
  ): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGroup]
  }
}

