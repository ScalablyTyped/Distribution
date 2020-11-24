package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleOperations extends js.Object {
  
  /** The list of emails which correspond to the users directly affected by the incident. */
  var affectedUserEmails: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. Application-specific data for an incident, provided when the G Suite application which reported the incident cannot be completely restored to a valid state. */
  var attachmentData: js.UndefOr[Attachment] = js.native
  
  /** A detailed, freeform incident description. */
  var description: js.UndefOr[String] = js.native
  
  /** A one-line incident description. */
  var title: js.UndefOr[String] = js.native
}
object GoogleOperations {
  
  @scala.inline
  def apply(): GoogleOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleOperations]
  }
  
  @scala.inline
  implicit class GoogleOperationsOps[Self <: GoogleOperations] (val x: Self) extends AnyVal {
    
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
    def setAffectedUserEmailsVarargs(value: String*): Self = this.set("affectedUserEmails", js.Array(value :_*))
    
    @scala.inline
    def setAffectedUserEmails(value: js.Array[String]): Self = this.set("affectedUserEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffectedUserEmails: Self = this.set("affectedUserEmails", js.undefined)
    
    @scala.inline
    def setAttachmentData(value: Attachment): Self = this.set("attachmentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentData: Self = this.set("attachmentData", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
