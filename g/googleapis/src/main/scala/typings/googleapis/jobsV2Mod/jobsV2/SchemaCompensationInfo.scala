package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Job compensation details.
  */
@js.native
trait SchemaCompensationInfo extends js.Object {
  /**
    * Deprecated. Use entries instead.  Optional.  The amount of compensation
    * or pay for the job. As an alternative, compensation_amount_min and
    * compensation_amount_max may be used to define a range of compensation.
    */
  var amount: js.UndefOr[SchemaMoney] = js.native
  /**
    * Output only.  Annualized base compensation range. Computed as base
    * compensation entry&#39;s CompensationEntry.compensation times
    * CompensationEntry.expected_units_per_year.  See CompensationEntry for
    * explanation on compensation annualization.
    */
  var annualizedBaseCompensationRange: js.UndefOr[SchemaCompensationRange] = js.native
  /**
    * Output only.  Annualized total compensation range. Computed as all
    * compensation entries&#39; CompensationEntry.compensation times
    * CompensationEntry.expected_units_per_year.  See CompensationEntry for
    * explanation on compensation annualization.
    */
  var annualizedTotalCompensationRange: js.UndefOr[SchemaCompensationRange] = js.native
  /**
    * Optional.  Job compensation information.  At most one entry can be of
    * type CompensationInfo.CompensationType.BASE, which is referred as ** base
    * compensation entry ** for the job.
    */
  var entries: js.UndefOr[js.Array[SchemaCompensationEntry]] = js.native
  /**
    * Deprecated. Use entries instead.  Optional.  An upper bound on a range
    * for compensation or pay for the job. The currency type is specified in
    * compensation_amount.
    */
  var max: js.UndefOr[SchemaMoney] = js.native
  /**
    * Deprecated. Use entries instead.  Optional.  A lower bound on a range for
    * compensation or pay for the job. The currency type is specified in
    * compensation_amount.
    */
  var min: js.UndefOr[SchemaMoney] = js.native
  /**
    * Deprecated. Use entries instead.  Optional.  Type of job compensation.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaCompensationInfo {
  @scala.inline
  def apply(
    amount: SchemaMoney = null,
    annualizedBaseCompensationRange: SchemaCompensationRange = null,
    annualizedTotalCompensationRange: SchemaCompensationRange = null,
    entries: js.Array[SchemaCompensationEntry] = null,
    max: SchemaMoney = null,
    min: SchemaMoney = null,
    `type`: String = null
  ): SchemaCompensationInfo = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (annualizedBaseCompensationRange != null) __obj.updateDynamic("annualizedBaseCompensationRange")(annualizedBaseCompensationRange.asInstanceOf[js.Any])
    if (annualizedTotalCompensationRange != null) __obj.updateDynamic("annualizedTotalCompensationRange")(annualizedTotalCompensationRange.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompensationInfo]
  }
}

