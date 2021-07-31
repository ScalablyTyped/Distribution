package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Dataflow service&#39;s idea of the current state of a WorkItem being
  * processed by a worker.
  */
trait SchemaWorkItemServiceState extends StObject {
  
  /**
    * Other data returned by the service, specific to the particular worker
    * harness.
    */
  var harnessData: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Time at which the current lease will expire.
    */
  var leaseExpireTime: js.UndefOr[String] = js.undefined
  
  /**
    * The short ids that workers should use in subsequent metric updates.
    * Workers should strive to use short ids whenever possible, but it is ok to
    * request the short_id again if a worker lost track of it (e.g. if the
    * worker is recovering from a crash). NOTE: it is possible that the
    * response may have short ids for a subset of the metrics.
    */
  var metricShortId: js.UndefOr[js.Array[SchemaMetricShortId]] = js.undefined
  
  /**
    * The index value to use for the next report sent by the worker. Note: If
    * the report call fails for whatever reason, the worker should reuse this
    * index for subsequent report attempts.
    */
  var nextReportIndex: js.UndefOr[String] = js.undefined
  
  /**
    * New recommended reporting interval.
    */
  var reportStatusInterval: js.UndefOr[String] = js.undefined
  
  /**
    * The progress point in the WorkItem where the Dataflow service suggests
    * that the worker truncate the task.
    */
  var splitRequest: js.UndefOr[SchemaApproximateSplitRequest] = js.undefined
  
  /**
    * DEPRECATED in favor of split_request.
    */
  var suggestedStopPoint: js.UndefOr[SchemaApproximateProgress] = js.undefined
  
  /**
    * Obsolete, always empty.
    */
  var suggestedStopPosition: js.UndefOr[SchemaPosition] = js.undefined
}
object SchemaWorkItemServiceState {
  
  @scala.inline
  def apply(): SchemaWorkItemServiceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkItemServiceState]
  }
  
  @scala.inline
  implicit class SchemaWorkItemServiceStateMutableBuilder[Self <: SchemaWorkItemServiceState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHarnessData(value: StringDictionary[js.Any]): Self = StObject.set(x, "harnessData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHarnessDataUndefined: Self = StObject.set(x, "harnessData", js.undefined)
    
    @scala.inline
    def setLeaseExpireTime(value: String): Self = StObject.set(x, "leaseExpireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaseExpireTimeUndefined: Self = StObject.set(x, "leaseExpireTime", js.undefined)
    
    @scala.inline
    def setMetricShortId(value: js.Array[SchemaMetricShortId]): Self = StObject.set(x, "metricShortId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricShortIdUndefined: Self = StObject.set(x, "metricShortId", js.undefined)
    
    @scala.inline
    def setMetricShortIdVarargs(value: SchemaMetricShortId*): Self = StObject.set(x, "metricShortId", js.Array(value :_*))
    
    @scala.inline
    def setNextReportIndex(value: String): Self = StObject.set(x, "nextReportIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextReportIndexUndefined: Self = StObject.set(x, "nextReportIndex", js.undefined)
    
    @scala.inline
    def setReportStatusInterval(value: String): Self = StObject.set(x, "reportStatusInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportStatusIntervalUndefined: Self = StObject.set(x, "reportStatusInterval", js.undefined)
    
    @scala.inline
    def setSplitRequest(value: SchemaApproximateSplitRequest): Self = StObject.set(x, "splitRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitRequestUndefined: Self = StObject.set(x, "splitRequest", js.undefined)
    
    @scala.inline
    def setSuggestedStopPoint(value: SchemaApproximateProgress): Self = StObject.set(x, "suggestedStopPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedStopPointUndefined: Self = StObject.set(x, "suggestedStopPoint", js.undefined)
    
    @scala.inline
    def setSuggestedStopPosition(value: SchemaPosition): Self = StObject.set(x, "suggestedStopPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedStopPositionUndefined: Self = StObject.set(x, "suggestedStopPosition", js.undefined)
  }
}
