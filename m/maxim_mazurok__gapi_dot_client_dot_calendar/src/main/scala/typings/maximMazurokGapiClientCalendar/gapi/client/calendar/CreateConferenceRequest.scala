package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConferenceRequest extends js.Object {
  
  /** The conference solution, such as Hangouts or Google Meet. */
  var conferenceSolutionKey: js.UndefOr[ConferenceSolutionKey] = js.native
  
  /**
    * The client-generated unique ID for this request.
    * Clients should regenerate this ID for every new request. If an ID provided is the same as for the previous request, the request is ignored.
    */
  var requestId: js.UndefOr[String] = js.native
  
  /** The status of the conference create request. */
  var status: js.UndefOr[ConferenceRequestStatus] = js.native
}
object CreateConferenceRequest {
  
  @scala.inline
  def apply(): CreateConferenceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConferenceRequest]
  }
  
  @scala.inline
  implicit class CreateConferenceRequestOps[Self <: CreateConferenceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConferenceSolutionKey(value: ConferenceSolutionKey): Self = this.set("conferenceSolutionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConferenceSolutionKey: Self = this.set("conferenceSolutionKey", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    
    @scala.inline
    def setStatus(value: ConferenceRequestStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
