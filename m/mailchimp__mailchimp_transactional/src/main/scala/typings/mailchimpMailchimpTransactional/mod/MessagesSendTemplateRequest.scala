package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesSendTemplateRequest
  extends StObject
     with MessagesSendRequest {
  
  /**
    * An array of template content to send. Each item in the array should
    * be a struct with two keys - name: the name of the content block to
    * set the content for, and content: the actual content to put into the
    * block
    */
  var template_content: js.Array[TemplateContent]
  
  /**
    * The immutable name or slug of a template that exists in the user's
    * account. For backwards-compatibility, the template name may also be
    * used but the immutable slug is preferred.
    */
  var template_name: String
}
object MessagesSendTemplateRequest {
  
  inline def apply(message: MessagesMessage, template_content: js.Array[TemplateContent], template_name: String): MessagesSendTemplateRequest = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], template_content = template_content.asInstanceOf[js.Any], template_name = template_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesSendTemplateRequest]
  }
  
  extension [Self <: MessagesSendTemplateRequest](x: Self) {
    
    inline def setTemplate_content(value: js.Array[TemplateContent]): Self = StObject.set(x, "template_content", value.asInstanceOf[js.Any])
    
    inline def setTemplate_contentVarargs(value: TemplateContent*): Self = StObject.set(x, "template_content", js.Array(value*))
    
    inline def setTemplate_name(value: String): Self = StObject.set(x, "template_name", value.asInstanceOf[js.Any])
  }
}
