package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConferenceRequestStatus extends js.Object {
  
  /**
    * The current status of the conference create request. Read-only.
    * The possible values are:
    * - "pending": the conference create request is still being processed.
    * - "success": the conference create request succeeded, the entry points are populated.
    * - "failure": the conference create request failed, there are no entry points.
    */
  var statusCode: js.UndefOr[String] = js.native
}
object ConferenceRequestStatus {
  
  @scala.inline
  def apply(): ConferenceRequestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceRequestStatus]
  }
  
  @scala.inline
  implicit class ConferenceRequestStatusOps[Self <: ConferenceRequestStatus] (val x: Self) extends AnyVal {
    
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
    def setStatusCode(value: String): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
}
