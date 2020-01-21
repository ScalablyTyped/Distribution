package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Dataflow service&#39;s idea of the current state of a WorkItem being
  * processed by a worker.
  */
@js.native
trait SchemaWorkItemServiceState extends js.Object {
  /**
    * Other data returned by the service, specific to the particular worker
    * harness.
    */
  var harnessData: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Time at which the current lease will expire.
    */
  var leaseExpireTime: js.UndefOr[String] = js.native
  /**
    * The short ids that workers should use in subsequent metric updates.
    * Workers should strive to use short ids whenever possible, but it is ok to
    * request the short_id again if a worker lost track of it (e.g. if the
    * worker is recovering from a crash). NOTE: it is possible that the
    * response may have short ids for a subset of the metrics.
    */
  var metricShortId: js.UndefOr[js.Array[SchemaMetricShortId]] = js.native
  /**
    * The index value to use for the next report sent by the worker. Note: If
    * the report call fails for whatever reason, the worker should reuse this
    * index for subsequent report attempts.
    */
  var nextReportIndex: js.UndefOr[String] = js.native
  /**
    * New recommended reporting interval.
    */
  var reportStatusInterval: js.UndefOr[String] = js.native
  /**
    * The progress point in the WorkItem where the Dataflow service suggests
    * that the worker truncate the task.
    */
  var splitRequest: js.UndefOr[SchemaApproximateSplitRequest] = js.native
  /**
    * DEPRECATED in favor of split_request.
    */
  var suggestedStopPoint: js.UndefOr[SchemaApproximateProgress] = js.native
  /**
    * Obsolete, always empty.
    */
  var suggestedStopPosition: js.UndefOr[SchemaPosition] = js.native
}

object SchemaWorkItemServiceState {
  @scala.inline
  def apply(
    harnessData: StringDictionary[js.Any] = null,
    leaseExpireTime: String = null,
    metricShortId: js.Array[SchemaMetricShortId] = null,
    nextReportIndex: String = null,
    reportStatusInterval: String = null,
    splitRequest: SchemaApproximateSplitRequest = null,
    suggestedStopPoint: SchemaApproximateProgress = null,
    suggestedStopPosition: SchemaPosition = null
  ): SchemaWorkItemServiceState = {
    val __obj = js.Dynamic.literal()
    if (harnessData != null) __obj.updateDynamic("harnessData")(harnessData.asInstanceOf[js.Any])
    if (leaseExpireTime != null) __obj.updateDynamic("leaseExpireTime")(leaseExpireTime.asInstanceOf[js.Any])
    if (metricShortId != null) __obj.updateDynamic("metricShortId")(metricShortId.asInstanceOf[js.Any])
    if (nextReportIndex != null) __obj.updateDynamic("nextReportIndex")(nextReportIndex.asInstanceOf[js.Any])
    if (reportStatusInterval != null) __obj.updateDynamic("reportStatusInterval")(reportStatusInterval.asInstanceOf[js.Any])
    if (splitRequest != null) __obj.updateDynamic("splitRequest")(splitRequest.asInstanceOf[js.Any])
    if (suggestedStopPoint != null) __obj.updateDynamic("suggestedStopPoint")(suggestedStopPoint.asInstanceOf[js.Any])
    if (suggestedStopPosition != null) __obj.updateDynamic("suggestedStopPosition")(suggestedStopPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWorkItemServiceState]
  }
}

