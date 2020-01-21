package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structured content to inspect. Up to 50,000 `Value`s per request allowed.
  * See https://cloud.google.com/dlp/docs/inspecting-text#inspecting_a_table to
  * learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Table extends js.Object {
  var headers: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.native
  var rows: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Row]] = js.native
}

object SchemaGooglePrivacyDlpV2Table {
  @scala.inline
  def apply(
    headers: js.Array[SchemaGooglePrivacyDlpV2FieldId] = null,
    rows: js.Array[SchemaGooglePrivacyDlpV2Row] = null
  ): SchemaGooglePrivacyDlpV2Table = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Table]
  }
}

