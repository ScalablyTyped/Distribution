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
  def apply(
    auxiliaryTables: js.Array[SchemaGooglePrivacyDlpV2StatisticalTable] = null,
    quasiIds: js.Array[SchemaGooglePrivacyDlpV2QuasiId] = null,
    regionCode: String = null
  ): SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig = {
    val __obj = js.Dynamic.literal()
    if (auxiliaryTables != null) __obj.updateDynamic("auxiliaryTables")(auxiliaryTables.asInstanceOf[js.Any])
    if (quasiIds != null) __obj.updateDynamic("quasiIds")(quasiIds.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig]
  }
}

