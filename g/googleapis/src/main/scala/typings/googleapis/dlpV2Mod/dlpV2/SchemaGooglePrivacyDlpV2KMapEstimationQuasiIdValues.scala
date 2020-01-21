package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tuple of values for the quasi-identifier columns.
  */
@js.native
trait SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues extends js.Object {
  /**
    * The estimated anonymity for these quasi-identifier values.
    */
  var estimatedAnonymity: js.UndefOr[String] = js.native
  /**
    * The quasi-identifier values.
    */
  var quasiIdsValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.native
}

object SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues {
  @scala.inline
  def apply(estimatedAnonymity: String = null, quasiIdsValues: js.Array[SchemaGooglePrivacyDlpV2Value] = null): SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues = {
    val __obj = js.Dynamic.literal()
    if (estimatedAnonymity != null) __obj.updateDynamic("estimatedAnonymity")(estimatedAnonymity.asInstanceOf[js.Any])
    if (quasiIdsValues != null) __obj.updateDynamic("quasiIdsValues")(quasiIdsValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues]
  }
}

