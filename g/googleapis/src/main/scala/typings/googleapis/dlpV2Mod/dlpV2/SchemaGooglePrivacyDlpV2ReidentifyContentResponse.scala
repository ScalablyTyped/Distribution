package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results of re-identifying a item.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ReidentifyContentResponse extends js.Object {
  /**
    * The re-identified item.
    */
  var item: js.UndefOr[SchemaGooglePrivacyDlpV2ContentItem] = js.native
  /**
    * An overview of the changes that were made to the `item`.
    */
  var overview: js.UndefOr[SchemaGooglePrivacyDlpV2TransformationOverview] = js.native
}

object SchemaGooglePrivacyDlpV2ReidentifyContentResponse {
  @scala.inline
  def apply(
    item: SchemaGooglePrivacyDlpV2ContentItem = null,
    overview: SchemaGooglePrivacyDlpV2TransformationOverview = null
  ): SchemaGooglePrivacyDlpV2ReidentifyContentResponse = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ReidentifyContentResponse]
  }
}

