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
  def apply(): SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsOps[Self <: SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategoricalStatsResult(value: SchemaGooglePrivacyDlpV2CategoricalStatsResult): Self = this.set("categoricalStatsResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoricalStatsResult: Self = this.set("categoricalStatsResult", js.undefined)
    @scala.inline
    def setDeltaPresenceEstimationResult(value: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationResult): Self = this.set("deltaPresenceEstimationResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaPresenceEstimationResult: Self = this.set("deltaPresenceEstimationResult", js.undefined)
    @scala.inline
    def setKAnonymityResult(value: SchemaGooglePrivacyDlpV2KAnonymityResult): Self = this.set("kAnonymityResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKAnonymityResult: Self = this.set("kAnonymityResult", js.undefined)
    @scala.inline
    def setKMapEstimationResult(value: SchemaGooglePrivacyDlpV2KMapEstimationResult): Self = this.set("kMapEstimationResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMapEstimationResult: Self = this.set("kMapEstimationResult", js.undefined)
    @scala.inline
    def setLDiversityResult(value: SchemaGooglePrivacyDlpV2LDiversityResult): Self = this.set("lDiversityResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLDiversityResult: Self = this.set("lDiversityResult", js.undefined)
    @scala.inline
    def setNumericalStatsResult(value: SchemaGooglePrivacyDlpV2NumericalStatsResult): Self = this.set("numericalStatsResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericalStatsResult: Self = this.set("numericalStatsResult", js.undefined)
    @scala.inline
    def setRequestedPrivacyMetric(value: SchemaGooglePrivacyDlpV2PrivacyMetric): Self = this.set("requestedPrivacyMetric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedPrivacyMetric: Self = this.set("requestedPrivacyMetric", js.undefined)
    @scala.inline
    def setRequestedSourceTable(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = this.set("requestedSourceTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedSourceTable: Self = this.set("requestedSourceTable", js.undefined)
  }
  
}

