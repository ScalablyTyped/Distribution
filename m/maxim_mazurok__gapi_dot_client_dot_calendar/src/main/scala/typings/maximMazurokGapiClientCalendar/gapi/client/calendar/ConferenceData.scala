package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConferenceData extends js.Object {
  
  /**
    * The ID of the conference.
    * Can be used by developers to keep track of conferences, should not be displayed to users.
    * Values for solution types:
    * - "eventHangout": unset.
    * - "eventNamedHangout": the name of the Hangout.
    * - "hangoutsMeet": the 10-letter meeting code, for example "aaa-bbbb-ccc".
    * - "addOn": defined by 3P conference provider.  Optional.
    */
  var conferenceId: js.UndefOr[String] = js.native
  
  /**
    * The conference solution, such as Hangouts or Google Meet.
    * Unset for a conference with a failed create request.
    * Either conferenceSolution and at least one entryPoint, or createRequest is required.
    */
  var conferenceSolution: js.UndefOr[ConferenceSolution] = js.native
  
  /**
    * A request to generate a new conference and attach it to the event. The data is generated asynchronously. To see whether the data is present check the status field.
    * Either conferenceSolution and at least one entryPoint, or createRequest is required.
    */
  var createRequest: js.UndefOr[CreateConferenceRequest] = js.native
  
  /**
    * Information about individual conference entry points, such as URLs or phone numbers.
    * All of them must belong to the same conference.
    * Either conferenceSolution and at least one entryPoint, or createRequest is required.
    */
  var entryPoints: js.UndefOr[js.Array[EntryPoint]] = js.native
  
  /** Additional notes (such as instructions from the domain administrator, legal notices) to display to the user. Can contain HTML. The maximum length is 2048 characters. Optional. */
  var notes: js.UndefOr[String] = js.native
  
  /** Additional properties related to a conference. An example would be a solution-specific setting for enabling video streaming. */
  var parameters: js.UndefOr[ConferenceParameters] = js.native
  
  /**
    * The signature of the conference data.
    * Generated on server side. Must be preserved while copying the conference data between events, otherwise the conference data will not be copied.
    * Unset for a conference with a failed create request.
    * Optional for a conference with a pending create request.
    */
  var signature: js.UndefOr[String] = js.native
}
object ConferenceData {
  
  @scala.inline
  def apply(): ConferenceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceData]
  }
  
  @scala.inline
  implicit class ConferenceDataOps[Self <: ConferenceData] (val x: Self) extends AnyVal {
    
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
    def setConferenceId(value: String): Self = this.set("conferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConferenceId: Self = this.set("conferenceId", js.undefined)
    
    @scala.inline
    def setConferenceSolution(value: ConferenceSolution): Self = this.set("conferenceSolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConferenceSolution: Self = this.set("conferenceSolution", js.undefined)
    
    @scala.inline
    def setCreateRequest(value: CreateConferenceRequest): Self = this.set("createRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateRequest: Self = this.set("createRequest", js.undefined)
    
    @scala.inline
    def setEntryPointsVarargs(value: EntryPoint*): Self = this.set("entryPoints", js.Array(value :_*))
    
    @scala.inline
    def setEntryPoints(value: js.Array[EntryPoint]): Self = this.set("entryPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryPoints: Self = this.set("entryPoints", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setParameters(value: ConferenceParameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
  }
}
