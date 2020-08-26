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
  def apply(): SchemaCompensationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationInfo]
  }
  @scala.inline
  implicit class SchemaCompensationInfoOps[Self <: SchemaCompensationInfo] (val x: Self) extends AnyVal {
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
    def setAmount(value: SchemaMoney): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setAnnualizedBaseCompensationRange(value: SchemaCompensationRange): Self = this.set("annualizedBaseCompensationRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnualizedBaseCompensationRange: Self = this.set("annualizedBaseCompensationRange", js.undefined)
    @scala.inline
    def setAnnualizedTotalCompensationRange(value: SchemaCompensationRange): Self = this.set("annualizedTotalCompensationRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnualizedTotalCompensationRange: Self = this.set("annualizedTotalCompensationRange", js.undefined)
    @scala.inline
    def setEntriesVarargs(value: SchemaCompensationEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[SchemaCompensationEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    @scala.inline
    def setMax(value: SchemaMoney): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: SchemaMoney): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

