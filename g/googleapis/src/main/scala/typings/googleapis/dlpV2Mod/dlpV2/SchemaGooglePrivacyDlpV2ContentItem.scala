package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container structure for the content to inspect.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ContentItem extends js.Object {
  /**
    * Content data to inspect or redact. Replaces `type` and `data`.
    */
  var byteItem: js.UndefOr[SchemaGooglePrivacyDlpV2ByteContentItem] = js.native
  /**
    * Structured content for inspection. See
    * https://cloud.google.com/dlp/docs/inspecting-text#inspecting_a_table to
    * learn more.
    */
  var table: js.UndefOr[SchemaGooglePrivacyDlpV2Table] = js.native
  /**
    * String data to inspect or redact.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2ContentItem {
  @scala.inline
  def apply(
    byteItem: SchemaGooglePrivacyDlpV2ByteContentItem = null,
    table: SchemaGooglePrivacyDlpV2Table = null,
    value: String = null
  ): SchemaGooglePrivacyDlpV2ContentItem = {
    val __obj = js.Dynamic.literal()
    if (byteItem != null) __obj.updateDynamic("byteItem")(byteItem.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ContentItem]
  }
}

