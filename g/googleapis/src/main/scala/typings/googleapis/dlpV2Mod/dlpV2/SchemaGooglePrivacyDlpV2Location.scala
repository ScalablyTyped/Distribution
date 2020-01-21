package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the location of the finding.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Location extends js.Object {
  /**
    * Zero-based byte offsets delimiting the finding. These are relative to the
    * finding&#39;s containing element. Note that when the content is not
    * textual, this references the UTF-8 encoded textual representation of the
    * content. Omitted if content is an image.
    */
  var byteRange: js.UndefOr[SchemaGooglePrivacyDlpV2Range] = js.native
  /**
    * Unicode character offsets delimiting the finding. These are relative to
    * the finding&#39;s containing element. Provided when the content is text.
    */
  var codepointRange: js.UndefOr[SchemaGooglePrivacyDlpV2Range] = js.native
  /**
    * List of nested objects pointing to the precise location of the finding
    * within the file or record.
    */
  var contentLocations: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2ContentLocation]] = js.native
}

object SchemaGooglePrivacyDlpV2Location {
  @scala.inline
  def apply(
    byteRange: SchemaGooglePrivacyDlpV2Range = null,
    codepointRange: SchemaGooglePrivacyDlpV2Range = null,
    contentLocations: js.Array[SchemaGooglePrivacyDlpV2ContentLocation] = null
  ): SchemaGooglePrivacyDlpV2Location = {
    val __obj = js.Dynamic.literal()
    if (byteRange != null) __obj.updateDynamic("byteRange")(byteRange.asInstanceOf[js.Any])
    if (codepointRange != null) __obj.updateDynamic("codepointRange")(codepointRange.asInstanceOf[js.Any])
    if (contentLocations != null) __obj.updateDynamic("contentLocations")(contentLocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Location]
  }
}

