package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A videoAbuseReportReason resource identifies a reason that a video could be
  * reported as abusive. Video abuse report reasons are used with
  * video.ReportAbuse.
  */
@js.native
trait SchemaVideoAbuseReportReason extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID of this abuse report reason.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#videoAbuseReportReason&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the abuse report reason.
    */
  var snippet: js.UndefOr[SchemaVideoAbuseReportReasonSnippet] = js.native
}

object SchemaVideoAbuseReportReason {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: SchemaVideoAbuseReportReasonSnippet = null
  ): SchemaVideoAbuseReportReason = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoAbuseReportReason]
  }
}

