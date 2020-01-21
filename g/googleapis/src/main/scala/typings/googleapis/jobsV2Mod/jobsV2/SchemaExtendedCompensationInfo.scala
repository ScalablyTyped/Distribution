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
  def apply(
    annualizedBaseCompensationRange: SchemaExtendedCompensationInfoCompensationRange = null,
    annualizedBaseCompensationUnspecified: js.UndefOr[Boolean] = js.undefined,
    annualizedTotalCompensationRange: SchemaExtendedCompensationInfoCompensationRange = null,
    annualizedTotalCompensationUnspecified: js.UndefOr[Boolean] = js.undefined,
    currency: String = null,
    entries: js.Array[SchemaExtendedCompensationInfoCompensationEntry] = null
  ): SchemaExtendedCompensationInfo = {
    val __obj = js.Dynamic.literal()
    if (annualizedBaseCompensationRange != null) __obj.updateDynamic("annualizedBaseCompensationRange")(annualizedBaseCompensationRange.asInstanceOf[js.Any])
    if (!js.isUndefined(annualizedBaseCompensationUnspecified)) __obj.updateDynamic("annualizedBaseCompensationUnspecified")(annualizedBaseCompensationUnspecified.asInstanceOf[js.Any])
    if (annualizedTotalCompensationRange != null) __obj.updateDynamic("annualizedTotalCompensationRange")(annualizedTotalCompensationRange.asInstanceOf[js.Any])
    if (!js.isUndefined(annualizedTotalCompensationUnspecified)) __obj.updateDynamic("annualizedTotalCompensationUnspecified")(annualizedTotalCompensationUnspecified.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExtendedCompensationInfo]
  }
}

