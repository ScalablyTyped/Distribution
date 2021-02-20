package typings.intercomClient.anon

import typings.intercomClient.messageMod.FromToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<intercom-client.intercom-client/Message.CreateMessage> */
@js.native
trait PartialCreateMessage extends StObject {
  
  var body: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[FromToObject] = js.native
  
  var message_type: js.UndefOr[String] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var to: js.UndefOr[FromToObject] = js.native
}
object PartialCreateMessage {
  
  @scala.inline
  def apply(): PartialCreateMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreateMessage]
  }
  
  @scala.inline
  implicit class PartialCreateMessageMutableBuilder[Self <: PartialCreateMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setFrom(value: FromToObject): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setMessage_type(value: String): Self = StObject.set(x, "message_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_typeUndefined: Self = StObject.set(x, "message_type", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTo(value: FromToObject): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
