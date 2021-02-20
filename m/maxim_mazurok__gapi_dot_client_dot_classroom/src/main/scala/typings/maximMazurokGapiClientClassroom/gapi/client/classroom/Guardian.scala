package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Guardian extends StObject {
  
  /** Identifier for the guardian. */
  var guardianId: js.UndefOr[String] = js.native
  
  /** User profile for the guardian. */
  var guardianProfile: js.UndefOr[UserProfile] = js.native
  
  /** The email address to which the initial guardian invitation was sent. This field is only visible to domain administrators. */
  var invitedEmailAddress: js.UndefOr[String] = js.native
  
  /** Identifier for the student to whom the guardian relationship applies. */
  var studentId: js.UndefOr[String] = js.native
}
object Guardian {
  
  @scala.inline
  def apply(): Guardian = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Guardian]
  }
  
  @scala.inline
  implicit class GuardianMutableBuilder[Self <: Guardian] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuardianId(value: String): Self = StObject.set(x, "guardianId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuardianIdUndefined: Self = StObject.set(x, "guardianId", js.undefined)
    
    @scala.inline
    def setGuardianProfile(value: UserProfile): Self = StObject.set(x, "guardianProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuardianProfileUndefined: Self = StObject.set(x, "guardianProfile", js.undefined)
    
    @scala.inline
    def setInvitedEmailAddress(value: String): Self = StObject.set(x, "invitedEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedEmailAddressUndefined: Self = StObject.set(x, "invitedEmailAddress", js.undefined)
    
    @scala.inline
    def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
  }
}
