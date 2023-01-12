package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageAttachment extends StObject {
  
  /** the content of the attachment as a base64 encoded string */
  var content: String
  
  /** the file name of the attachment */
  var name: String
  
  /** the MIME type of the attachment */
  var `type`: String
}
object MessageAttachment {
  
  inline def apply(content: String, name: String, `type`: String): MessageAttachment = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageAttachment] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
