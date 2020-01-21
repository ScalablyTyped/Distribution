package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListDeidentifyTemplates.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse extends js.Object {
  /**
    * List of deidentify templates, up to page_size in
    * ListDeidentifyTemplatesRequest.
    */
  var deidentifyTemplates: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2DeidentifyTemplate]] = js.native
  /**
    * If the next page is available then the next page token to be used in
    * following ListDeidentifyTemplates request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse {
  @scala.inline
  def apply(
    deidentifyTemplates: js.Array[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = null,
    nextPageToken: String = null
  ): SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    if (deidentifyTemplates != null) __obj.updateDynamic("deidentifyTemplates")(deidentifyTemplates.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse]
  }
}

