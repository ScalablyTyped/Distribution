package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GuardianInvitation extends js.Object {
  
  /** The time that this invitation was created. Read-only. */
  var creationTime: js.UndefOr[String] = js.native
  
  /** Unique identifier for this invitation. Read-only. */
  var invitationId: js.UndefOr[String] = js.native
  
  /** Email address that the invitation was sent to. This field is only visible to domain administrators. */
  var invitedEmailAddress: js.UndefOr[String] = js.native
  
  /** The state that this invitation is in. */
  var state: js.UndefOr[String] = js.native
  
  /** ID of the student (in standard format) */
  var studentId: js.UndefOr[String] = js.native
}
object GuardianInvitation {
  
  @scala.inline
  def apply(): GuardianInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuardianInvitation]
  }
  
  @scala.inline
  implicit class GuardianInvitationOps[Self <: GuardianInvitation] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setInvitationId(value: String): Self = this.set("invitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitationId: Self = this.set("invitationId", js.undefined)
    
    @scala.inline
    def setInvitedEmailAddress(value: String): Self = this.set("invitedEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitedEmailAddress: Self = this.set("invitedEmailAddress", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStudentId(value: String): Self = this.set("studentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStudentId: Self = this.set("studentId", js.undefined)
  }
}
