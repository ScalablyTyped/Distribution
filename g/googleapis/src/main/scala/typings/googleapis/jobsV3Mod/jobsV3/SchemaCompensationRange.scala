package typings.googleapis.jobsV3Mod.jobsV3

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
  var maxCompensation: js.UndefOr[SchemaMoney] = js.native
  /**
    * Optional.  The minimum amount of compensation. If left empty, the value
    * is set to zero and the currency code is set to match the currency code of
    * max_compensation.
    */
  var minCompensation: js.UndefOr[SchemaMoney] = js.native
}

object SchemaCompensationRange {
  @scala.inline
  def apply(maxCompensation: SchemaMoney = null, minCompensation: SchemaMoney = null): SchemaCompensationRange = {
    val __obj = js.Dynamic.literal()
    if (maxCompensation != null) __obj.updateDynamic("maxCompensation")(maxCompensation.asInstanceOf[js.Any])
    if (minCompensation != null) __obj.updateDynamic("minCompensation")(minCompensation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompensationRange]
  }
}

