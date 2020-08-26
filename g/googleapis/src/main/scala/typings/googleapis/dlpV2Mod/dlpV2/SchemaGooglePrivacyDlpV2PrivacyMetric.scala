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
  def apply(): SchemaGooglePrivacyDlpV2PrivacyMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PrivacyMetric]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2PrivacyMetricOps[Self <: SchemaGooglePrivacyDlpV2PrivacyMetric] (val x: Self) extends AnyVal {
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
    def setCategoricalStatsConfig(value: SchemaGooglePrivacyDlpV2CategoricalStatsConfig): Self = this.set("categoricalStatsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoricalStatsConfig: Self = this.set("categoricalStatsConfig", js.undefined)
    @scala.inline
    def setDeltaPresenceEstimationConfig(value: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig): Self = this.set("deltaPresenceEstimationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaPresenceEstimationConfig: Self = this.set("deltaPresenceEstimationConfig", js.undefined)
    @scala.inline
    def setKAnonymityConfig(value: SchemaGooglePrivacyDlpV2KAnonymityConfig): Self = this.set("kAnonymityConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKAnonymityConfig: Self = this.set("kAnonymityConfig", js.undefined)
    @scala.inline
    def setKMapEstimationConfig(value: SchemaGooglePrivacyDlpV2KMapEstimationConfig): Self = this.set("kMapEstimationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMapEstimationConfig: Self = this.set("kMapEstimationConfig", js.undefined)
    @scala.inline
    def setLDiversityConfig(value: SchemaGooglePrivacyDlpV2LDiversityConfig): Self = this.set("lDiversityConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLDiversityConfig: Self = this.set("lDiversityConfig", js.undefined)
    @scala.inline
    def setNumericalStatsConfig(value: SchemaGooglePrivacyDlpV2NumericalStatsConfig): Self = this.set("numericalStatsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericalStatsConfig: Self = this.set("numericalStatsConfig", js.undefined)
  }
  
}

