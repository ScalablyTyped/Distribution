package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dimension filter specifies the filtering options on a dimension.
  */
@js.native
trait SchemaSegmentDimensionFilter extends js.Object {
  /**
    * Should the match be case sensitive, ignored for `IN_LIST` operator.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * Name of the dimension for which the filter is being applied.
    */
  var dimensionName: js.UndefOr[String] = js.native
  /**
    * The list of expressions, only the first element is used for all operators
    */
  var expressions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Maximum comparison values for `BETWEEN` match type.
    */
  var maxComparisonValue: js.UndefOr[String] = js.native
  /**
    * Minimum comparison values for `BETWEEN` match type.
    */
  var minComparisonValue: js.UndefOr[String] = js.native
  /**
    * The operator to use to match the dimension with the expressions.
    */
  var operator: js.UndefOr[String] = js.native
}

object SchemaSegmentDimensionFilter {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    dimensionName: String = null,
    expressions: js.Array[String] = null,
    maxComparisonValue: String = null,
    minComparisonValue: String = null,
    operator: String = null
  ): SchemaSegmentDimensionFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName.asInstanceOf[js.Any])
    if (expressions != null) __obj.updateDynamic("expressions")(expressions.asInstanceOf[js.Any])
    if (maxComparisonValue != null) __obj.updateDynamic("maxComparisonValue")(maxComparisonValue.asInstanceOf[js.Any])
    if (minComparisonValue != null) __obj.updateDynamic("minComparisonValue")(minComparisonValue.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSegmentDimensionFilter]
  }
}

