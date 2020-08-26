package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reidentifiability metric. This corresponds to a risk model similar to what
  * is called &quot;journalist risk&quot; in the literature, except the attack
  * dataset is statistically modeled instead of being perfectly known. This can
  * be done using publicly available data (like the US Census), or using a
  * custom statistical model (indicated as one or several BigQuery tables), or
  * by extrapolating from the distribution of values in the input dataset. A
  * column with a semantic tag attached.
  */
@js.native
trait SchemaGooglePrivacyDlpV2KMapEstimationConfig extends js.Object {
  /**
    * Several auxiliary tables can be used in the analysis. Each custom_tag
    * used to tag a quasi-identifiers column must appear in exactly one column
    * of one auxiliary table.
    */
  var auxiliaryTables: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2AuxiliaryTable]] = js.native
  /**
    * Fields considered to be quasi-identifiers. No two columns can have the
    * same tag. [required]
    */
  var quasiIds: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2TaggedField]] = js.native
  /**
    * ISO 3166-1 alpha-2 region code to use in the statistical modeling.
    * Required if no column is tagged with a region-specific InfoType (like
    * US_ZIP_5) or a region code.
    */
  var regionCode: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2KMapEstimationConfig {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KMapEstimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KMapEstimationConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KMapEstimationConfigOps[Self <: SchemaGooglePrivacyDlpV2KMapEstimationConfig] (val x: Self) extends AnyVal {
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
    def setAuxiliaryTablesVarargs(value: SchemaGooglePrivacyDlpV2AuxiliaryTable*): Self = this.set("auxiliaryTables", js.Array(value :_*))
    @scala.inline
    def setAuxiliaryTables(value: js.Array[SchemaGooglePrivacyDlpV2AuxiliaryTable]): Self = this.set("auxiliaryTables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuxiliaryTables: Self = this.set("auxiliaryTables", js.undefined)
    @scala.inline
    def setQuasiIdsVarargs(value: SchemaGooglePrivacyDlpV2TaggedField*): Self = this.set("quasiIds", js.Array(value :_*))
    @scala.inline
    def setQuasiIds(value: js.Array[SchemaGooglePrivacyDlpV2TaggedField]): Self = this.set("quasiIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuasiIds: Self = this.set("quasiIds", js.undefined)
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
  }
  
}

