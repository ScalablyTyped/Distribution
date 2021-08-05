package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An incident reported by Google Operations for a G Suite application.
  */
trait SchemaGoogleOperations extends StObject {
  
  /**
    * The list of emails which correspond to the users directly affected by the
    * incident.
    */
  var affectedUserEmails: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. Application-specific data for an incident, provided when the G
    * Suite application which reported the incident cannot be completely
    * restored to a valid state.
    */
  var attachmentData: js.UndefOr[SchemaAttachment] = js.undefined
  
  /**
    * A detailed, freeform incident description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A one-line incident description.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaGoogleOperations {
  
  inline def apply(): SchemaGoogleOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleOperations]
  }
  
  extension [Self <: SchemaGoogleOperations](x: Self) {
    
    inline def setAffectedUserEmails(value: js.Array[String]): Self = StObject.set(x, "affectedUserEmails", value.asInstanceOf[js.Any])
    
    inline def setAffectedUserEmailsUndefined: Self = StObject.set(x, "affectedUserEmails", js.undefined)
    
    inline def setAffectedUserEmailsVarargs(value: String*): Self = StObject.set(x, "affectedUserEmails", js.Array(value :_*))
    
    inline def setAttachmentData(value: SchemaAttachment): Self = StObject.set(x, "attachmentData", value.asInstanceOf[js.Any])
    
    inline def setAttachmentDataUndefined: Self = StObject.set(x, "attachmentData", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
