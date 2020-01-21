package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVideoAbuseReportSecondaryReason extends js.Object {
  /**
    * The ID of this abuse report secondary reason.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The localized label for this abuse report secondary reason.
    */
  var label: js.UndefOr[String] = js.native
}

object SchemaVideoAbuseReportSecondaryReason {
  @scala.inline
  def apply(id: String = null, label: String = null): SchemaVideoAbuseReportSecondaryReason = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoAbuseReportSecondaryReason]
  }
}

