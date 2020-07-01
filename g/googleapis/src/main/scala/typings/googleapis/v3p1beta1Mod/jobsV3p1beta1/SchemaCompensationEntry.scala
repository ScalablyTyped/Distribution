package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A compensation entry that represents one component of compensation, such as
  * base pay, bonus, or other compensation type.  Annualization: One
  * compensation entry can be annualized if - it contains valid amount or
  * range. - and its expected_units_per_year is set or can be derived. Its
  * annualized range is determined as (amount or range) times
  * expected_units_per_year.
  */
@js.native
trait SchemaCompensationEntry extends js.Object {
  /**
    * Optional.  Compensation amount.
    */
  var amount: js.UndefOr[SchemaMoney] = js.native
  /**
    * Optional.  Compensation description.  For example, could indicate equity
    * terms or provide additional context to an estimated bonus.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional.  Expected number of units paid each year. If not specified,
    * when Job.employment_types is FULLTIME, a default value is inferred based
    * on unit. Default values: - HOURLY: 2080 - DAILY: 260 - WEEKLY: 52 -
    * MONTHLY: 12 - ANNUAL: 1
    */
  var expectedUnitsPerYear: js.UndefOr[Double] = js.native
  /**
    * Optional.  Compensation range.
    */
  var range: js.UndefOr[SchemaCompensationRange] = js.native
  /**
    * Optional.  Compensation type.  Default is
    * CompensationUnit.OTHER_COMPENSATION_TYPE.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Optional.  Frequency of the specified amount.  Default is
    * CompensationUnit.OTHER_COMPENSATION_UNIT.
    */
  var unit: js.UndefOr[String] = js.native
}

object SchemaCompensationEntry {
  @scala.inline
  def apply(
    amount: SchemaMoney = null,
    description: String = null,
    expectedUnitsPerYear: js.UndefOr[Double] = js.undefined,
    range: SchemaCompensationRange = null,
    `type`: String = null,
    unit: String = null
  ): SchemaCompensationEntry = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(expectedUnitsPerYear)) __obj.updateDynamic("expectedUnitsPerYear")(expectedUnitsPerYear.get.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompensationEntry]
  }
}

