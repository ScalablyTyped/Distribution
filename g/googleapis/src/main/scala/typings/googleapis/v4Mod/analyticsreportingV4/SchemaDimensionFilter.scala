package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dimension filter specifies the filtering options on a dimension.
  */
@js.native
trait SchemaDimensionFilter extends js.Object {
  /**
    * Should the match be case sensitive? Default is false.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * The dimension to filter on. A DimensionFilter must contain a dimension.
    */
  var dimensionName: js.UndefOr[String] = js.native
  /**
    * Strings or regular expression to match against. Only the first value of
    * the list is used for comparison unless the operator is `IN_LIST`. If
    * `IN_LIST` operator, then the entire list is used to filter the dimensions
    * as explained in the description of the `IN_LIST` operator.
    */
  var expressions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Logical `NOT` operator. If this boolean is set to true, then the matching
    * dimension values will be excluded in the report. The default is false.
    */
  var not: js.UndefOr[Boolean] = js.native
  /**
    * How to match the dimension to the expression. The default is REGEXP.
    */
  var operator: js.UndefOr[String] = js.native
}

object SchemaDimensionFilter {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    dimensionName: String = null,
    expressions: js.Array[String] = null,
    not: js.UndefOr[Boolean] = js.undefined,
    operator: String = null
  ): SchemaDimensionFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName.asInstanceOf[js.Any])
    if (expressions != null) __obj.updateDynamic("expressions")(expressions.asInstanceOf[js.Any])
    if (!js.isUndefined(not)) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDimensionFilter]
  }
}

