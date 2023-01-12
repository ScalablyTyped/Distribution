package typings.intercomClient.anon

import typings.intercomClient.messageMod.FromToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<intercom-client.intercom-client/Message.CreateMessage> */
trait PartialCreateMessage extends StObject {
  
  var body: js.UndefOr[String] = js.undefined
  
  var from: js.UndefOr[FromToObject] = js.undefined
  
  var message_type: js.UndefOr[String] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[FromToObject] = js.undefined
}
object PartialCreateMessage {
  
  inline def apply(): PartialCreateMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreateMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCreateMessage] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setFrom(value: FromToObject): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setMessage_type(value: String): Self = StObject.set(x, "message_type", value.asInstanceOf[js.Any])
    
    inline def setMessage_typeUndefined: Self = StObject.set(x, "message_type", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTo(value: FromToObject): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
