package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * δ-presence metric, used to estimate how likely it is for an attacker to
  * figure out that one given individual appears in a de-identified dataset.
  * Similarly to the k-map metric, we cannot compute δ-presence exactly without
  * knowing the attack dataset, so we use a statistical model instead.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig extends js.Object {
  /**
    * Several auxiliary tables can be used in the analysis. Each custom_tag
    * used to tag a quasi-identifiers field must appear in exactly one field of
    * one auxiliary table.
    */
  var auxiliaryTables: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2StatisticalTable]] = js.native
  /**
    * Fields considered to be quasi-identifiers. No two fields can have the
    * same tag. [required]
    */
  var quasiIds: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2QuasiId]] = js.native
  /**
    * ISO 3166-1 alpha-2 region code to use in the statistical modeling.
    * Required if no column is tagged with a region-specific InfoType (like
    * US_ZIP_5) or a region code.
    */
  var regionCode: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfigOps[Self <: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig] (val x: Self) extends AnyVal {
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
    def setAuxiliaryTablesVarargs(value: SchemaGooglePrivacyDlpV2StatisticalTable*): Self = this.set("auxiliaryTables", js.Array(value :_*))
    @scala.inline
    def setAuxiliaryTables(value: js.Array[SchemaGooglePrivacyDlpV2StatisticalTable]): Self = this.set("auxiliaryTables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuxiliaryTables: Self = this.set("auxiliaryTables", js.undefined)
    @scala.inline
    def setQuasiIdsVarargs(value: SchemaGooglePrivacyDlpV2QuasiId*): Self = this.set("quasiIds", js.Array(value :_*))
    @scala.inline
    def setQuasiIds(value: js.Array[SchemaGooglePrivacyDlpV2QuasiId]): Self = this.set("quasiIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuasiIds: Self = this.set("quasiIds", js.undefined)
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
  }
  
}

