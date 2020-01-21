package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a video category, such as its localized title.
  */
@js.native
trait SchemaVideoAbuseReportReasonSnippet extends js.Object {
  /**
    * The localized label belonging to this abuse report reason.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The secondary reasons associated with this reason, if any are available.
    * (There might be 0 or more.)
    */
  var secondaryReasons: js.UndefOr[js.Array[SchemaVideoAbuseReportSecondaryReason]] = js.native
}

object SchemaVideoAbuseReportReasonSnippet {
  @scala.inline
  def apply(label: String = null, secondaryReasons: js.Array[SchemaVideoAbuseReportSecondaryReason] = null): SchemaVideoAbuseReportReasonSnippet = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (secondaryReasons != null) __obj.updateDynamic("secondaryReasons")(secondaryReasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoAbuseReportReasonSnippet]
  }
}

