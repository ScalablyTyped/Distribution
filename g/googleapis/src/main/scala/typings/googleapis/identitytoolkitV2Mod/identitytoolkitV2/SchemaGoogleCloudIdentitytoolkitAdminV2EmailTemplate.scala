package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2EmailTemplate extends StObject {
  
  /**
    * Email body
    */
  var body: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Email body format
    */
  var bodyFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether the body or subject of the email is customized.
    */
  var customized: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Reply-to address
    */
  var replyTo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sender display name
    */
  var senderDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Local part of From address
    */
  var senderLocalPart: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subject of the email
    */
  var subject: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2EmailTemplate {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2EmailTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2EmailTemplate]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2EmailTemplate](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyFormat(value: String): Self = StObject.set(x, "bodyFormat", value.asInstanceOf[js.Any])
    
    inline def setBodyFormatNull: Self = StObject.set(x, "bodyFormat", null)
    
    inline def setBodyFormatUndefined: Self = StObject.set(x, "bodyFormat", js.undefined)
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCustomized(value: Boolean): Self = StObject.set(x, "customized", value.asInstanceOf[js.Any])
    
    inline def setCustomizedNull: Self = StObject.set(x, "customized", null)
    
    inline def setCustomizedUndefined: Self = StObject.set(x, "customized", js.undefined)
    
    inline def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
    
    inline def setReplyToNull: Self = StObject.set(x, "replyTo", null)
    
    inline def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
    
    inline def setSenderDisplayName(value: String): Self = StObject.set(x, "senderDisplayName", value.asInstanceOf[js.Any])
    
    inline def setSenderDisplayNameNull: Self = StObject.set(x, "senderDisplayName", null)
    
    inline def setSenderDisplayNameUndefined: Self = StObject.set(x, "senderDisplayName", js.undefined)
    
    inline def setSenderLocalPart(value: String): Self = StObject.set(x, "senderLocalPart", value.asInstanceOf[js.Any])
    
    inline def setSenderLocalPartNull: Self = StObject.set(x, "senderLocalPart", null)
    
    inline def setSenderLocalPartUndefined: Self = StObject.set(x, "senderLocalPart", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
