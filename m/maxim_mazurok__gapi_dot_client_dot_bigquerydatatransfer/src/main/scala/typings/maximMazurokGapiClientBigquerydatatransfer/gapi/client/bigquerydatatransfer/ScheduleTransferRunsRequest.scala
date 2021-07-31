package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleTransferRunsRequest extends StObject {
  
  /** Required. End time of the range of transfer runs. For example, `"2017-05-30T00:00:00+00:00"`. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Required. Start time of the range of transfer runs. For example, `"2017-05-25T00:00:00+00:00"`. */
  var startTime: js.UndefOr[String] = js.undefined
}
object ScheduleTransferRunsRequest {
  
  @scala.inline
  def apply(): ScheduleTransferRunsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleTransferRunsRequest]
  }
  
  @scala.inline
  implicit class ScheduleTransferRunsRequestMutableBuilder[Self <: ScheduleTransferRunsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
