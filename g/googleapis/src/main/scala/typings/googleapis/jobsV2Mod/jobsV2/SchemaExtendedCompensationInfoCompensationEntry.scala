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
  def apply(): SchemaExtendedCompensationInfoCompensationEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationInfoCompensationEntry]
  }
  @scala.inline
  implicit class SchemaExtendedCompensationInfoCompensationEntryOps[Self <: SchemaExtendedCompensationInfoCompensationEntry] (val x: Self) extends AnyVal {
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
    def setAmount(value: SchemaExtendedCompensationInfoDecimal): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExpectedUnitsPerYear(value: SchemaExtendedCompensationInfoDecimal): Self = this.set("expectedUnitsPerYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedUnitsPerYear: Self = this.set("expectedUnitsPerYear", js.undefined)
    @scala.inline
    def setRange(value: SchemaExtendedCompensationInfoCompensationRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setUnspecified(value: Boolean): Self = this.set("unspecified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnspecified: Self = this.set("unspecified", js.undefined)
  }
  
}

