package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleOperations extends StObject {
  
  /** The list of emails which correspond to the users directly affected by the incident. */
  var affectedUserEmails: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. Application-specific data for an incident, provided when the Google Workspace application which reported the incident cannot be completely restored to a valid state. */
  var attachmentData: js.UndefOr[Attachment] = js.undefined
  
  /** A detailed, freeform incident description. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Customer domain for email template personalization. */
  var domain: js.UndefOr[String] = js.undefined
  
  /** A header to display above the incident message. Typically used to attach a localized notice on the timeline for followup comms translations. */
  var header: js.UndefOr[String] = js.undefined
  
  /** A one-line incident description. */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleOperations {
  
  inline def apply(): GoogleOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleOperations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleOperations] (val x: Self) extends AnyVal {
    
    inline def setAffectedUserEmails(value: js.Array[String]): Self = StObject.set(x, "affectedUserEmails", value.asInstanceOf[js.Any])
    
    inline def setAffectedUserEmailsUndefined: Self = StObject.set(x, "affectedUserEmails", js.undefined)
    
    inline def setAffectedUserEmailsVarargs(value: String*): Self = StObject.set(x, "affectedUserEmails", js.Array(value*))
    
    inline def setAttachmentData(value: Attachment): Self = StObject.set(x, "attachmentData", value.asInstanceOf[js.Any])
    
    inline def setAttachmentDataUndefined: Self = StObject.set(x, "attachmentData", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
