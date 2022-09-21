package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkItemDetails extends StObject {
  
  /**
    * Attempt ID of this work item
    */
  var attemptId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * End time of this work item attempt. If the work item is completed, this is the actual end time of the work item. Otherwise, it is the predicted end time.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metrics for this work item.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetricUpdate]] = js.undefined
  
  /**
    * Progress of this work item.
    */
  var progress: js.UndefOr[SchemaProgressTimeseries] = js.undefined
  
  /**
    * Start time of this work item attempt.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * State of this work item.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about straggler detections for this work item.
    */
  var stragglerInfo: js.UndefOr[SchemaStragglerInfo] = js.undefined
  
  /**
    * Name of this work item.
    */
  var taskId: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkItemDetails {
  
  inline def apply(): SchemaWorkItemDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkItemDetails]
  }
  
  extension [Self <: SchemaWorkItemDetails](x: Self) {
    
    inline def setAttemptId(value: String): Self = StObject.set(x, "attemptId", value.asInstanceOf[js.Any])
    
    inline def setAttemptIdNull: Self = StObject.set(x, "attemptId", null)
    
    inline def setAttemptIdUndefined: Self = StObject.set(x, "attemptId", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMetrics(value: js.Array[SchemaMetricUpdate]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaMetricUpdate*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setProgress(value: SchemaProgressTimeseries): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStragglerInfo(value: SchemaStragglerInfo): Self = StObject.set(x, "stragglerInfo", value.asInstanceOf[js.Any])
    
    inline def setStragglerInfoUndefined: Self = StObject.set(x, "stragglerInfo", js.undefined)
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdNull: Self = StObject.set(x, "taskId", null)
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
