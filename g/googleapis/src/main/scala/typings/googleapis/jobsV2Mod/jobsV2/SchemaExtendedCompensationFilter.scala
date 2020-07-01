package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Always use CompensationFilter.  Input only.  Filter on job
  * compensation type and amount.
  */
@js.native
trait SchemaExtendedCompensationFilter extends js.Object {
  /**
    * Optional.  Compensation range.
    */
  var compensationRange: js.UndefOr[SchemaExtendedCompensationInfoCompensationRange] = js.native
  /**
    * Required.  Specify desired `base compensation entry&#39;s`
    * ExtendedCompensationInfo.CompensationUnit.
    */
  var compensationUnits: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  Specify currency in 3-letter [ISO
    * 4217](https://www.iso.org/iso-4217-currency-codes.html) format. If
    * unspecified, jobs are returned regardless of currency.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * Optional.  Whether to include jobs whose compensation range is
    * unspecified.
    */
  var includeJobWithUnspecifiedCompensationRange: js.UndefOr[Boolean] = js.native
  /**
    * Required.  Type of filter.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaExtendedCompensationFilter {
  @scala.inline
  def apply(
    compensationRange: SchemaExtendedCompensationInfoCompensationRange = null,
    compensationUnits: js.Array[String] = null,
    currency: String = null,
    includeJobWithUnspecifiedCompensationRange: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): SchemaExtendedCompensationFilter = {
    val __obj = js.Dynamic.literal()
    if (compensationRange != null) __obj.updateDynamic("compensationRange")(compensationRange.asInstanceOf[js.Any])
    if (compensationUnits != null) __obj.updateDynamic("compensationUnits")(compensationUnits.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (!js.isUndefined(includeJobWithUnspecifiedCompensationRange)) __obj.updateDynamic("includeJobWithUnspecifiedCompensationRange")(includeJobWithUnspecifiedCompensationRange.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExtendedCompensationFilter]
  }
}

