package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuardianInvitation extends StObject {
  
  /** The time that this invitation was created. Read-only. */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /** Unique identifier for this invitation. Read-only. */
  var invitationId: js.UndefOr[String] = js.undefined
  
  /** Email address that the invitation was sent to. This field is only visible to domain administrators. */
  var invitedEmailAddress: js.UndefOr[String] = js.undefined
  
  /** The state that this invitation is in. */
  var state: js.UndefOr[String] = js.undefined
  
  /** ID of the student (in standard format) */
  var studentId: js.UndefOr[String] = js.undefined
}
object GuardianInvitation {
  
  inline def apply(): GuardianInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuardianInvitation]
  }
  
  extension [Self <: GuardianInvitation](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setInvitationId(value: String): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    inline def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
    
    inline def setInvitedEmailAddress(value: String): Self = StObject.set(x, "invitedEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setInvitedEmailAddressUndefined: Self = StObject.set(x, "invitedEmailAddress", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
    
    inline def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
  }
}
