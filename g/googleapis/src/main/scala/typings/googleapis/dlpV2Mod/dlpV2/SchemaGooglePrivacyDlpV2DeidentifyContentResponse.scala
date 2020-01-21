package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results of de-identifying a ContentItem.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DeidentifyContentResponse extends js.Object {
  /**
    * The de-identified item.
    */
  var item: js.UndefOr[SchemaGooglePrivacyDlpV2ContentItem] = js.native
  /**
    * An overview of the changes that were made on the `item`.
    */
  var overview: js.UndefOr[SchemaGooglePrivacyDlpV2TransformationOverview] = js.native
}

object SchemaGooglePrivacyDlpV2DeidentifyContentResponse {
  @scala.inline
  def apply(
    item: SchemaGooglePrivacyDlpV2ContentItem = null,
    overview: SchemaGooglePrivacyDlpV2TransformationOverview = null
  ): SchemaGooglePrivacyDlpV2DeidentifyContentResponse = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeidentifyContentResponse]
  }
}

