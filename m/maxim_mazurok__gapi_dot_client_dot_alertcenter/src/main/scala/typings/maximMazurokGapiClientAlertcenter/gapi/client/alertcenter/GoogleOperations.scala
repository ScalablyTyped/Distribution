package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleOperations extends StObject {
  
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
  implicit class GoogleOperationsMutableBuilder[Self <: GoogleOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffectedUserEmails(value: js.Array[String]): Self = StObject.set(x, "affectedUserEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffectedUserEmailsUndefined: Self = StObject.set(x, "affectedUserEmails", js.undefined)
    
    @scala.inline
    def setAffectedUserEmailsVarargs(value: String*): Self = StObject.set(x, "affectedUserEmails", js.Array(value :_*))
    
    @scala.inline
    def setAttachmentData(value: Attachment): Self = StObject.set(x, "attachmentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentDataUndefined: Self = StObject.set(x, "attachmentData", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
