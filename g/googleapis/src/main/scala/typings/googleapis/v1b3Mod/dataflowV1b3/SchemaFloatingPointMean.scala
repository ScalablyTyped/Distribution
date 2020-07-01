package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a floating point mean metric contribution.
  */
@js.native
trait SchemaFloatingPointMean extends js.Object {
  /**
    * The number of values being aggregated.
    */
  var count: js.UndefOr[SchemaSplitInt64] = js.native
  /**
    * The sum of all values being aggregated.
    */
  var sum: js.UndefOr[Double] = js.native
}

object SchemaFloatingPointMean {
  @scala.inline
  def apply(count: SchemaSplitInt64 = null, sum: js.UndefOr[Double] = js.undefined): SchemaFloatingPointMean = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(sum)) __obj.updateDynamic("sum")(sum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFloatingPointMean]
  }
}

