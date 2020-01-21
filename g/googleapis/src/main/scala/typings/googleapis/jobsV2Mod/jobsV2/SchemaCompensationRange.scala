package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compensation range.
  */
@js.native
trait SchemaCompensationRange extends js.Object {
  /**
    * Optional.  The maximum amount of compensation. If left empty, the value
    * is set to a maximal compensation value and the currency code is set to
    * match the currency code of min_compensation.
    */
  var max: js.UndefOr[SchemaMoney] = js.native
  /**
    * Optional.  The minimum amount of compensation. If left empty, the value
    * is set to zero and the currency code is set to match the currency code of
    * max_compensation.
    */
  var min: js.UndefOr[SchemaMoney] = js.native
}

object SchemaCompensationRange {
  @scala.inline
  def apply(max: SchemaMoney = null, min: SchemaMoney = null): SchemaCompensationRange = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompensationRange]
  }
}

