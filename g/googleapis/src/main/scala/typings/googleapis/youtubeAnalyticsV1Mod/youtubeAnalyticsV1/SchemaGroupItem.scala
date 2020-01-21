package typings.googleapis.youtubeAnalyticsV1Mod.youtubeAnalyticsV1

import typings.googleapis.AnonIdKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGroupItem extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var groupId: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var resource: js.UndefOr[AnonIdKind] = js.native
}

object SchemaGroupItem {
  @scala.inline
  def apply(
    etag: String = null,
    groupId: String = null,
    id: String = null,
    kind: String = null,
    resource: AnonIdKind = null
  ): SchemaGroupItem = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGroupItem]
  }
}

