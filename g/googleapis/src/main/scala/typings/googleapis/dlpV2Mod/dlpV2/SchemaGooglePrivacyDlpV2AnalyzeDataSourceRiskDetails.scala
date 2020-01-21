package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of a risk analysis operation request.
  */
@js.native
trait SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails extends js.Object {
  var categoricalStatsResult: js.UndefOr[SchemaGooglePrivacyDlpV2CategoricalStatsResult] = js.native
  var deltaPresenceEstimationResult: js.UndefOr[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationResult] = js.native
  var kAnonymityResult: js.UndefOr[SchemaGooglePrivacyDlpV2KAnonymityResult] = js.native
  var kMapEstimationResult: js.UndefOr[SchemaGooglePrivacyDlpV2KMapEstimationResult] = js.native
  var lDiversityResult: js.UndefOr[SchemaGooglePrivacyDlpV2LDiversityResult] = js.native
  var numericalStatsResult: js.UndefOr[SchemaGooglePrivacyDlpV2NumericalStatsResult] = js.native
  /**
    * Privacy metric to compute.
    */
  var requestedPrivacyMetric: js.UndefOr[SchemaGooglePrivacyDlpV2PrivacyMetric] = js.native
  /**
    * Input dataset to compute metrics over.
    */
  var requestedSourceTable: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.native
}

object SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails {
  @scala.inline
  def apply(
    categoricalStatsResult: SchemaGooglePrivacyDlpV2CategoricalStatsResult = null,
    deltaPresenceEstimationResult: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationResult = null,
    kAnonymityResult: SchemaGooglePrivacyDlpV2KAnonymityResult = null,
    kMapEstimationResult: SchemaGooglePrivacyDlpV2KMapEstimationResult = null,
    lDiversityResult: SchemaGooglePrivacyDlpV2LDiversityResult = null,
    numericalStatsResult: SchemaGooglePrivacyDlpV2NumericalStatsResult = null,
    requestedPrivacyMetric: SchemaGooglePrivacyDlpV2PrivacyMetric = null,
    requestedSourceTable: SchemaGooglePrivacyDlpV2BigQueryTable = null
  ): SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails = {
    val __obj = js.Dynamic.literal()
    if (categoricalStatsResult != null) __obj.updateDynamic("categoricalStatsResult")(categoricalStatsResult.asInstanceOf[js.Any])
    if (deltaPresenceEstimationResult != null) __obj.updateDynamic("deltaPresenceEstimationResult")(deltaPresenceEstimationResult.asInstanceOf[js.Any])
    if (kAnonymityResult != null) __obj.updateDynamic("kAnonymityResult")(kAnonymityResult.asInstanceOf[js.Any])
    if (kMapEstimationResult != null) __obj.updateDynamic("kMapEstimationResult")(kMapEstimationResult.asInstanceOf[js.Any])
    if (lDiversityResult != null) __obj.updateDynamic("lDiversityResult")(lDiversityResult.asInstanceOf[js.Any])
    if (numericalStatsResult != null) __obj.updateDynamic("numericalStatsResult")(numericalStatsResult.asInstanceOf[js.Any])
    if (requestedPrivacyMetric != null) __obj.updateDynamic("requestedPrivacyMetric")(requestedPrivacyMetric.asInstanceOf[js.Any])
    if (requestedSourceTable != null) __obj.updateDynamic("requestedSourceTable")(requestedSourceTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails]
  }
}

