package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEmailTemplate extends StObject {
  
  /**
    * Email body.
    */
  var body: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Email body format.
    */
  var format: js.UndefOr[String | Null] = js.undefined
  
  /**
    * From address of the email.
    */
  var from: js.UndefOr[String | Null] = js.undefined
  
  /**
    * From display name.
    */
  var fromDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reply-to address.
    */
  var replyTo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subject of the email.
    */
  var subject: js.UndefOr[String | Null] = js.undefined
}
object SchemaEmailTemplate {
  
  inline def apply(): SchemaEmailTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmailTemplate]
  }
  
  extension [Self <: SchemaEmailTemplate](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromDisplayName(value: String): Self = StObject.set(x, "fromDisplayName", value.asInstanceOf[js.Any])
    
    inline def setFromDisplayNameNull: Self = StObject.set(x, "fromDisplayName", null)
    
    inline def setFromDisplayNameUndefined: Self = StObject.set(x, "fromDisplayName", js.undefined)
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
    
    inline def setReplyToNull: Self = StObject.set(x, "replyTo", null)
    
    inline def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
