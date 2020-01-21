package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A summary of perf metrics collected and performance environment info
  */
@js.native
trait SchemaPerfMetricsSummary extends js.Object {
  var appStartTime: js.UndefOr[SchemaAppStartTime] = js.native
  /**
    * A tool results execution ID.
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    * Graphics statistics for the entire run. Statistics are reset at the
    * beginning of the run and collected at the end of the run.
    */
  var graphicsStats: js.UndefOr[SchemaGraphicsStats] = js.native
  /**
    * A tool results history ID.
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * Describes the environment in which the performance metrics were collected
    */
  var perfEnvironment: js.UndefOr[SchemaPerfEnvironment] = js.native
  /**
    * Set of resource collected
    */
  var perfMetrics: js.UndefOr[js.Array[String]] = js.native
  /**
    * The cloud project
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * A tool results step ID.
    */
  var stepId: js.UndefOr[String] = js.native
}

object SchemaPerfMetricsSummary {
  @scala.inline
  def apply(
    appStartTime: SchemaAppStartTime = null,
    executionId: String = null,
    graphicsStats: SchemaGraphicsStats = null,
    historyId: String = null,
    perfEnvironment: SchemaPerfEnvironment = null,
    perfMetrics: js.Array[String] = null,
    projectId: String = null,
    stepId: String = null
  ): SchemaPerfMetricsSummary = {
    val __obj = js.Dynamic.literal()
    if (appStartTime != null) __obj.updateDynamic("appStartTime")(appStartTime.asInstanceOf[js.Any])
    if (executionId != null) __obj.updateDynamic("executionId")(executionId.asInstanceOf[js.Any])
    if (graphicsStats != null) __obj.updateDynamic("graphicsStats")(graphicsStats.asInstanceOf[js.Any])
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (perfEnvironment != null) __obj.updateDynamic("perfEnvironment")(perfEnvironment.asInstanceOf[js.Any])
    if (perfMetrics != null) __obj.updateDynamic("perfMetrics")(perfMetrics.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (stepId != null) __obj.updateDynamic("stepId")(stepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPerfMetricsSummary]
  }
}

