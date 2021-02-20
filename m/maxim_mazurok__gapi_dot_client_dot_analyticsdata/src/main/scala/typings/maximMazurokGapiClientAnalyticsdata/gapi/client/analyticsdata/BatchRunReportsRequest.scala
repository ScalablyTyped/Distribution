package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchRunReportsRequest extends StObject {
  
  /** A property whose events are tracked. This entity must be specified for the batch. The entity within RunReportRequest may either be unspecified or consistent with this entity. */
  var entity: js.UndefOr[Entity] = js.native
  
  /** Individual requests. Each request has a separate report response. Each batch request is allowed up to 5 requests. */
  var requests: js.UndefOr[js.Array[RunReportRequest]] = js.native
}
object BatchRunReportsRequest {
  
  @scala.inline
  def apply(): BatchRunReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRunReportsRequest]
  }
  
  @scala.inline
  implicit class BatchRunReportsRequestMutableBuilder[Self <: BatchRunReportsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    @scala.inline
    def setRequests(value: js.Array[RunReportRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: RunReportRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
