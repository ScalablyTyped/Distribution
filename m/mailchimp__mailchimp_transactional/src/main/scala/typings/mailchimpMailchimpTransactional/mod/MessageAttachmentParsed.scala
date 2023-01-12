package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageAttachmentParsed
  extends StObject
     with MessageAttachment {
  
  /** if this is set to true, the attachment is not pure-text, and the content will be base64 encoded */
  var binary: Boolean
}
object MessageAttachmentParsed {
  
  inline def apply(binary: Boolean, content: String, name: String, `type`: String): MessageAttachmentParsed = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttachmentParsed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageAttachmentParsed] (val x: Self) extends AnyVal {
    
    inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
  }
}
