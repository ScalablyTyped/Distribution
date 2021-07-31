package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchRunPivotReportsRequest extends StObject {
  
  /** A property whose events are tracked. This entity must be specified for the batch. The entity within RunPivotReportRequest may either be unspecified or consistent with this entity. */
  var entity: js.UndefOr[Entity] = js.undefined
  
  /** Individual requests. Each request has a separate pivot report response. Each batch request is allowed up to 5 requests. */
  var requests: js.UndefOr[js.Array[RunPivotReportRequest]] = js.undefined
}
object BatchRunPivotReportsRequest {
  
  @scala.inline
  def apply(): BatchRunPivotReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRunPivotReportsRequest]
  }
  
  @scala.inline
  implicit class BatchRunPivotReportsRequestMutableBuilder[Self <: BatchRunPivotReportsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    @scala.inline
    def setRequests(value: js.Array[RunPivotReportRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: RunPivotReportRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
