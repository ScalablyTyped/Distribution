package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metric filter to be used in a segment filter clause.
  */
@js.native
trait SchemaSegmentMetricFilter extends js.Object {
  /**
    * The value to compare against. If the operator is `BETWEEN`, this value is
    * treated as minimum comparison value.
    */
  var comparisonValue: js.UndefOr[String] = js.native
  /**
    * Max comparison value is only used for `BETWEEN` operator.
    */
  var maxComparisonValue: js.UndefOr[String] = js.native
  /**
    * The metric that will be filtered on. A `metricFilter` must contain a
    * metric name.
    */
  var metricName: js.UndefOr[String] = js.native
  /**
    * Specifies is the operation to perform to compare the metric. The default
    * is `EQUAL`.
    */
  var operator: js.UndefOr[String] = js.native
  /**
    * Scope for a metric defines the level at which that metric is defined. The
    * specified metric scope must be equal to or greater than its primary scope
    * as defined in the data model. The primary scope is defined by if the
    * segment is selecting users or sessions.
    */
  var scope: js.UndefOr[String] = js.native
}

object SchemaSegmentMetricFilter {
  @scala.inline
  def apply(
    comparisonValue: String = null,
    maxComparisonValue: String = null,
    metricName: String = null,
    operator: String = null,
    scope: String = null
  ): SchemaSegmentMetricFilter = {
    val __obj = js.Dynamic.literal()
    if (comparisonValue != null) __obj.updateDynamic("comparisonValue")(comparisonValue.asInstanceOf[js.Any])
    if (maxComparisonValue != null) __obj.updateDynamic("maxComparisonValue")(maxComparisonValue.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSegmentMetricFilter]
  }
}

