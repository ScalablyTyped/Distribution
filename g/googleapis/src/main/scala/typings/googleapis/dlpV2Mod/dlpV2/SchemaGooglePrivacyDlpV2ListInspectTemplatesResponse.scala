package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListInspectTemplates.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse extends js.Object {
  /**
    * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
    */
  var inspectTemplates: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InspectTemplate]] = js.native
  /**
    * If the next page is available then the next page token to be used in
    * following ListInspectTemplates request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse {
  @scala.inline
  def apply(
    inspectTemplates: js.Array[SchemaGooglePrivacyDlpV2InspectTemplate] = null,
    nextPageToken: String = null
  ): SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    if (inspectTemplates != null) __obj.updateDynamic("inspectTemplates")(inspectTemplates.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse]
  }
}

