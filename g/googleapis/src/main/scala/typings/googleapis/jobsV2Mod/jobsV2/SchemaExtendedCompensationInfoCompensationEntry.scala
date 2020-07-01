package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. See CompensationInfo.  A compensation entry that represents one
  * component of compensation, such as base pay, bonus, or other compensation
  * type.  Annualization: One compensation entry can be annualized if - it
  * contains valid amount or range. - and its expected_units_per_year is set or
  * can be derived. Its annualized range is determined as (amount or range)
  * times expected_units_per_year.
  */
@js.native
trait SchemaExtendedCompensationInfoCompensationEntry extends js.Object {
  /**
    * Optional.  Monetary amount.
    */
  var amount: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.native
  /**
    * Optional.  Compensation description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional.  Expected number of units paid each year. If not specified,
    * when Job.employment_types is FULLTIME, a default value is inferred based
    * on unit. Default values: - HOURLY: 2080 - DAILY: 260 - WEEKLY: 52 -
    * MONTHLY: 12 - ANNUAL: 1
    */
  var expectedUnitsPerYear: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.native
  /**
    * Optional.  Compensation range.
    */
  var range: js.UndefOr[SchemaExtendedCompensationInfoCompensationRange] = js.native
  /**
    * Required.  Compensation type.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Optional.  Frequency of the specified amount.  Default is
    * CompensationUnit.OTHER_COMPENSATION_UNIT.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * Optional.  Indicates compensation amount and range are unset.
    */
  var unspecified: js.UndefOr[Boolean] = js.native
}

object SchemaExtendedCompensationInfoCompensationEntry {
  @scala.inline
  def apply(
    amount: SchemaExtendedCompensationInfoDecimal = null,
    description: String = null,
    expectedUnitsPerYear: SchemaExtendedCompensationInfoDecimal = null,
    range: SchemaExtendedCompensationInfoCompensationRange = null,
    `type`: String = null,
    unit: String = null,
    unspecified: js.UndefOr[Boolean] = js.undefined
  ): SchemaExtendedCompensationInfoCompensationEntry = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expectedUnitsPerYear != null) __obj.updateDynamic("expectedUnitsPerYear")(expectedUnitsPerYear.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(unspecified)) __obj.updateDynamic("unspecified")(unspecified.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExtendedCompensationInfoCompensationEntry]
  }
}

