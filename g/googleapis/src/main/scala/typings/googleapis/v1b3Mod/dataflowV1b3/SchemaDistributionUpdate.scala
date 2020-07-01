package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metric value representing a distribution.
  */
@js.native
trait SchemaDistributionUpdate extends js.Object {
  /**
    * The count of the number of elements present in the distribution.
    */
  var count: js.UndefOr[SchemaSplitInt64] = js.native
  /**
    * (Optional) Histogram of value counts for the distribution.
    */
  var histogram: js.UndefOr[SchemaHistogram] = js.native
  /**
    * The maximum value present in the distribution.
    */
  var max: js.UndefOr[SchemaSplitInt64] = js.native
  /**
    * The minimum value present in the distribution.
    */
  var min: js.UndefOr[SchemaSplitInt64] = js.native
  /**
    * Use an int64 since we&#39;d prefer the added precision. If overflow is a
    * common problem we can detect it and use an additional int64 or a double.
    */
  var sum: js.UndefOr[SchemaSplitInt64] = js.native
  /**
    * Use a double since the sum of squares is likely to overflow int64.
    */
  var sumOfSquares: js.UndefOr[Double] = js.native
}

object SchemaDistributionUpdate {
  @scala.inline
  def apply(
    count: SchemaSplitInt64 = null,
    histogram: SchemaHistogram = null,
    max: SchemaSplitInt64 = null,
    min: SchemaSplitInt64 = null,
    sum: SchemaSplitInt64 = null,
    sumOfSquares: js.UndefOr[Double] = js.undefined
  ): SchemaDistributionUpdate = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (histogram != null) __obj.updateDynamic("histogram")(histogram.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(sum.asInstanceOf[js.Any])
    if (!js.isUndefined(sumOfSquares)) __obj.updateDynamic("sumOfSquares")(sumOfSquares.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDistributionUpdate]
  }
}

