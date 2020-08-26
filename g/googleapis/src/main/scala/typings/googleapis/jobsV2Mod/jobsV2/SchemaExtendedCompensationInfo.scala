package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Use CompensationInfo.  Describes job compensation.
  */
@js.native
trait SchemaExtendedCompensationInfo extends js.Object {
  /**
    * Output only.  Annualized base compensation range.
    */
  var annualizedBaseCompensationRange: js.UndefOr[SchemaExtendedCompensationInfoCompensationRange] = js.native
  /**
    * Output only.  Indicates annualized base compensation range cannot be
    * derived, due to the job&#39;s base compensation entry cannot be
    * annualized. See CompensationEntry for explanation on annualization and
    * base compensation entry.
    */
  var annualizedBaseCompensationUnspecified: js.UndefOr[Boolean] = js.native
  /**
    * Output only.  Annualized total compensation range.
    */
  var annualizedTotalCompensationRange: js.UndefOr[SchemaExtendedCompensationInfoCompensationRange] = js.native
  /**
    * Output only.  Indicates annualized total compensation range cannot be
    * derived, due to the job&#39;s all CompensationEntry cannot be annualized.
    * See CompensationEntry for explanation on annualization and base
    * compensation entry.
    */
  var annualizedTotalCompensationUnspecified: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  A 3-letter [ISO
    * 4217](https://www.iso.org/iso-4217-currency-codes.html) currency code.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * Optional.  Job compensation information.  At most one entry can be of
    * type ExtendedCompensationInfo.CompensationType.BASE, which is referred as
    * ** base compensation entry ** for the job.
    */
  var entries: js.UndefOr[js.Array[SchemaExtendedCompensationInfoCompensationEntry]] = js.native
}

object SchemaExtendedCompensationInfo {
  @scala.inline
  def apply(): SchemaExtendedCompensationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationInfo]
  }
  @scala.inline
  implicit class SchemaExtendedCompensationInfoOps[Self <: SchemaExtendedCompensationInfo] (val x: Self) extends AnyVal {
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
    def setAnnualizedBaseCompensationRange(value: SchemaExtendedCompensationInfoCompensationRange): Self = this.set("annualizedBaseCompensationRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnualizedBaseCompensationRange: Self = this.set("annualizedBaseCompensationRange", js.undefined)
    @scala.inline
    def setAnnualizedBaseCompensationUnspecified(value: Boolean): Self = this.set("annualizedBaseCompensationUnspecified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnualizedBaseCompensationUnspecified: Self = this.set("annualizedBaseCompensationUnspecified", js.undefined)
    @scala.inline
    def setAnnualizedTotalCompensationRange(value: SchemaExtendedCompensationInfoCompensationRange): Self = this.set("annualizedTotalCompensationRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnualizedTotalCompensationRange: Self = this.set("annualizedTotalCompensationRange", js.undefined)
    @scala.inline
    def setAnnualizedTotalCompensationUnspecified(value: Boolean): Self = this.set("annualizedTotalCompensationUnspecified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnualizedTotalCompensationUnspecified: Self = this.set("annualizedTotalCompensationUnspecified", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setEntriesVarargs(value: SchemaExtendedCompensationInfoCompensationEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[SchemaExtendedCompensationInfoCompensationEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
  }
  
}

