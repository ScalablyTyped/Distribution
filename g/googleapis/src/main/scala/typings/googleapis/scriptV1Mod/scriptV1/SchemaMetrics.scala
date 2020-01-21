package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource containing usage stats for a given script, based on the supplied
  * filter and mask present in the request.
  */
@js.native
trait SchemaMetrics extends js.Object {
  /**
    * Number of active users.
    */
  var activeUsers: js.UndefOr[js.Array[SchemaMetricsValue]] = js.native
  /**
    * Number of failed executions.
    */
  var failedExecutions: js.UndefOr[js.Array[SchemaMetricsValue]] = js.native
  /**
    * Number of total executions.
    */
  var totalExecutions: js.UndefOr[js.Array[SchemaMetricsValue]] = js.native
}

object SchemaMetrics {
  @scala.inline
  def apply(
    activeUsers: js.Array[SchemaMetricsValue] = null,
    failedExecutions: js.Array[SchemaMetricsValue] = null,
    totalExecutions: js.Array[SchemaMetricsValue] = null
  ): SchemaMetrics = {
    val __obj = js.Dynamic.literal()
    if (activeUsers != null) __obj.updateDynamic("activeUsers")(activeUsers.asInstanceOf[js.Any])
    if (failedExecutions != null) __obj.updateDynamic("failedExecutions")(failedExecutions.asInstanceOf[js.Any])
    if (totalExecutions != null) __obj.updateDynamic("totalExecutions")(totalExecutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetrics]
  }
}

