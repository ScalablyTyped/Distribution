package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Privacy metric to compute for reidentification risk analysis.
  */
@js.native
trait SchemaGooglePrivacyDlpV2PrivacyMetric extends js.Object {
  var categoricalStatsConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CategoricalStatsConfig] = js.native
  var deltaPresenceEstimationConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig] = js.native
  var kAnonymityConfig: js.UndefOr[SchemaGooglePrivacyDlpV2KAnonymityConfig] = js.native
  var kMapEstimationConfig: js.UndefOr[SchemaGooglePrivacyDlpV2KMapEstimationConfig] = js.native
  var lDiversityConfig: js.UndefOr[SchemaGooglePrivacyDlpV2LDiversityConfig] = js.native
  var numericalStatsConfig: js.UndefOr[SchemaGooglePrivacyDlpV2NumericalStatsConfig] = js.native
}

object SchemaGooglePrivacyDlpV2PrivacyMetric {
  @scala.inline
  def apply(
    categoricalStatsConfig: SchemaGooglePrivacyDlpV2CategoricalStatsConfig = null,
    deltaPresenceEstimationConfig: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig = null,
    kAnonymityConfig: SchemaGooglePrivacyDlpV2KAnonymityConfig = null,
    kMapEstimationConfig: SchemaGooglePrivacyDlpV2KMapEstimationConfig = null,
    lDiversityConfig: SchemaGooglePrivacyDlpV2LDiversityConfig = null,
    numericalStatsConfig: SchemaGooglePrivacyDlpV2NumericalStatsConfig = null
  ): SchemaGooglePrivacyDlpV2PrivacyMetric = {
    val __obj = js.Dynamic.literal()
    if (categoricalStatsConfig != null) __obj.updateDynamic("categoricalStatsConfig")(categoricalStatsConfig.asInstanceOf[js.Any])
    if (deltaPresenceEstimationConfig != null) __obj.updateDynamic("deltaPresenceEstimationConfig")(deltaPresenceEstimationConfig.asInstanceOf[js.Any])
    if (kAnonymityConfig != null) __obj.updateDynamic("kAnonymityConfig")(kAnonymityConfig.asInstanceOf[js.Any])
    if (kMapEstimationConfig != null) __obj.updateDynamic("kMapEstimationConfig")(kMapEstimationConfig.asInstanceOf[js.Any])
    if (lDiversityConfig != null) __obj.updateDynamic("lDiversityConfig")(lDiversityConfig.asInstanceOf[js.Any])
    if (numericalStatsConfig != null) __obj.updateDynamic("numericalStatsConfig")(numericalStatsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PrivacyMetric]
  }
}

