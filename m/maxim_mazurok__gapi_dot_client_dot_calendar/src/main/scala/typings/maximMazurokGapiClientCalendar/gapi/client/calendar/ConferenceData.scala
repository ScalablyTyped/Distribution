package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConferenceData extends StObject {
  
  /**
    * The ID of the conference.
    * Can be used by developers to keep track of conferences, should not be displayed to users.
    * The ID value is formed differently for each conference solution type:
    * - eventHangout: ID is not set. (This conference type is deprecated.)
    * - eventNamedHangout: ID is the name of the Hangout. (This conference type is deprecated.)
    * - hangoutsMeet: ID is the 10-letter meeting code, for example aaa-bbbb-ccc.
    * - addOn: ID is defined by the third-party provider.  Optional.
    */
  var conferenceId: js.UndefOr[String] = js.undefined
  
  /**
    * The conference solution, such as Google Meet.
    * Unset for a conference with a failed create request.
    * Either conferenceSolution and at least one entryPoint, or createRequest is required.
    */
  var conferenceSolution: js.UndefOr[ConferenceSolution] = js.undefined
  
  /**
    * A request to generate a new conference and attach it to the event. The data is generated asynchronously. To see whether the data is present check the status field.
    * Either conferenceSolution and at least one entryPoint, or createRequest is required.
    */
  var createRequest: js.UndefOr[CreateConferenceRequest] = js.undefined
  
  /**
    * Information about individual conference entry points, such as URLs or phone numbers.
    * All of them must belong to the same conference.
    * Either conferenceSolution and at least one entryPoint, or createRequest is required.
    */
  var entryPoints: js.UndefOr[js.Array[EntryPoint]] = js.undefined
  
  /** Additional notes (such as instructions from the domain administrator, legal notices) to display to the user. Can contain HTML. The maximum length is 2048 characters. Optional. */
  var notes: js.UndefOr[String] = js.undefined
  
  /** Additional properties related to a conference. An example would be a solution-specific setting for enabling video streaming. */
  var parameters: js.UndefOr[ConferenceParameters] = js.undefined
  
  /**
    * The signature of the conference data.
    * Generated on server side.
    * Unset for a conference with a failed create request.
    * Optional for a conference with a pending create request.
    */
  var signature: js.UndefOr[String] = js.undefined
}
object ConferenceData {
  
  inline def apply(): ConferenceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceData]
  }
  
  extension [Self <: ConferenceData](x: Self) {
    
    inline def setConferenceId(value: String): Self = StObject.set(x, "conferenceId", value.asInstanceOf[js.Any])
    
    inline def setConferenceIdUndefined: Self = StObject.set(x, "conferenceId", js.undefined)
    
    inline def setConferenceSolution(value: ConferenceSolution): Self = StObject.set(x, "conferenceSolution", value.asInstanceOf[js.Any])
    
    inline def setConferenceSolutionUndefined: Self = StObject.set(x, "conferenceSolution", js.undefined)
    
    inline def setCreateRequest(value: CreateConferenceRequest): Self = StObject.set(x, "createRequest", value.asInstanceOf[js.Any])
    
    inline def setCreateRequestUndefined: Self = StObject.set(x, "createRequest", js.undefined)
    
    inline def setEntryPoints(value: js.Array[EntryPoint]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
    
    inline def setEntryPointsUndefined: Self = StObject.set(x, "entryPoints", js.undefined)
    
    inline def setEntryPointsVarargs(value: EntryPoint*): Self = StObject.set(x, "entryPoints", js.Array(value*))
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setParameters(value: ConferenceParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
