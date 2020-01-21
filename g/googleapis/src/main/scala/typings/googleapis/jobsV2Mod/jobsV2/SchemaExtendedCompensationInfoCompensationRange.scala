package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. See CompensationInfo.  Compensation range.
  */
@js.native
trait SchemaExtendedCompensationInfoCompensationRange extends js.Object {
  /**
    * Required.  Maximum value.
    */
  var max: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.native
  /**
    * Required.  Minimum value.
    */
  var min: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.native
}

object SchemaExtendedCompensationInfoCompensationRange {
  @scala.inline
  def apply(
    max: SchemaExtendedCompensationInfoDecimal = null,
    min: SchemaExtendedCompensationInfoDecimal = null
  ): SchemaExtendedCompensationInfoCompensationRange = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExtendedCompensationInfoCompensationRange]
  }
}

